<#function filterMethodName name>
    <#return name?replace("Instant", "java.time.Instant")>
</#function>

<#function getGetterSimpleTypeName methods name default>
    <#list methods as method>
        <#if method.name == name>
            <#return filterMethodName(method.returnTypeDesc.simpleTypeName)>
        </#if>
    </#list>
    <#return filterMethodName(default)>
</#function>

<#function getGetterValueTypeName methods name default>
    <#list methods as method>
        <#if method.name == name>
            <#return filterMethodName(method.returnTypeDesc.valueTypeDesc.simpleTypeName)>
        </#if>
    </#list>
    <#return filterMethodName(default)>
</#function>

<#function isDefined typeName>
    <#switch typeName>
        <#case "Unit">
            <#return true>
        <#case "Char">
            <#return true>
        <#case "Short">
            <#return true>
        <#case "Int">
            <#return true>
        <#case "Long">
            <#return true>
        <#case "Double">
            <#return true>
        <#case "Float">
            <#return true>
        <#case "Boolean">
            <#return true>
        <#case "String">
            <#return true>
        <#default >
            <#return false>
    </#switch>
</#function>


<#macro mapToJava simpleTypeName methods prefix field>
    <#local fieldName=field.name?replace("type", "`type`")>
    <#local typeName=getGetterSimpleTypeName(methods, field.name, field.fieldTypeDesc.simpleTypeName)>
    <#switch typeName>
        <#case "Char">
            ${prefix}.map(_.charValue).foreach(v => result.${fieldName}(v)) // ${field.fieldTypeDesc.fullTypeName}
            <#break >
        <#case "Short">
            ${prefix}.map(_.shortValue).foreach(v => result.${fieldName}(v)) // ${field.fieldTypeDesc.fullTypeName}
            <#break >
        <#case "Int">
            ${prefix}.map(_.intValue).foreach(v => result.${fieldName}(v)) // ${field.fieldTypeDesc.fullTypeName}
            <#break >
        <#case "Long">
            ${prefix}.map(_.longValue).foreach(v => result.${fieldName}(v)) // ${field.fieldTypeDesc.fullTypeName}
            <#break >
        <#case "Float">
            ${prefix}.map(_.floatValue).foreach(v => result.${fieldName}(v)) // ${field.fieldTypeDesc.fullTypeName}
            <#break >
        <#case "Double">
            ${prefix}.map(_.doubleValue).foreach(v => result.${fieldName}(v)) // ${field.fieldTypeDesc.fullTypeName}
            <#break >
        <#case "Boolean">
            ${prefix}.map(_.booleanValue).foreach(v => result.${fieldName}(v)) // ${field.fieldTypeDesc.fullTypeName}
            <#break >
        <#case "String">
            ${prefix}.filter(_.nonEmpty).foreach(v => result.${fieldName}(v)) // ${field.fieldTypeDesc.fullTypeName}
            <#break >
        <#case "Array">
            ${prefix}.filter(_.nonEmpty).foreach(v => result.${fieldName}(v)) // ${field.fieldTypeDesc.fullTypeName}
            <#break >
        <#case "Seq">
            <#local valueTypeName=getGetterValueTypeName(methods, field.name, field.fieldTypeDesc.valueTypeDesc.simpleTypeName)>
            <#if valueTypeName == "SdkBytes">
                ${prefix}.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._; result.${fieldName}(v.asJava) } // ${field.fieldTypeDesc.fullTypeName}
                <#break >
            <#elseif valueTypeName == "Map">
                <#local mapValueTypeName=field.fieldTypeDesc.valueTypeDesc.valueTypeDesc.simpleTypeName>
                <#if isDefined(mapValueTypeName)>
                    ${prefix}.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._<#if simpleTypeName != valueTypeName>, ${mapValueTypeName}Ops._</#if>; result.${fieldName}(v.map(_.mapValues(_.toJava).asJava).asJava) } // ${field.fieldTypeDesc.fullTypeName}
                    <#break >
                <#elseif valueTypeName == "Seq">
                    ${prefix}.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._, <#if simpleTypeName != valueTypeName>${field.fieldTypeDesc.valueTypeDesc.valueTypeDesc.valueTypeDesc.simpleTypeName}Ops._</#if>; result.${fieldName}(v.map(_.mapValues(_.map(_.toJava).asJava).asJava).asJava) } // ${field.fieldTypeDesc.fullTypeName}
                    <#break >
                </#if>
            <#elseif valueTypeName == "Seq">
                <#local seqValueTypeName=field.fieldTypeDesc.valueTypeDesc.valueTypeDesc.simpleTypeName>
                ${prefix}.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._<#if simpleTypeName != seqValueTypeName>, ${seqValueTypeName}Ops._</#if>; result.${fieldName}(v.map(_.map(_.toJava).asJava).asJava) } // ${field.fieldTypeDesc.fullTypeName}
                <#break >
            <#elseif isDefined(valueTypeName) && valueTypeName != "String">
                ${prefix}.filter(_.nonEmpty).map(_.map(_.asInstanceOf[java.lang.${valueTypeName}])).foreach{ v => import scala.collection.JavaConverters._; result.${fieldName}(v.asJava) } // ${field.fieldTypeDesc.fullTypeName}
                <#break >
            <#elseif isDefined(valueTypeName)>
                ${prefix}.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._; result.${fieldName}(v.asJava) } // ${field.fieldTypeDesc.fullTypeName}
                <#break >
            <#else>
                ${prefix}.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._<#if simpleTypeName != valueTypeName>, ${valueTypeName}Ops._</#if>; result.${fieldName}(v.map(_.toJava).asJava) } // ${field.fieldTypeDesc.fullTypeName}
                <#break >
            </#if>
        <#case "Map">
            <#assign valueTypeName=getGetterValueTypeName(methods, field.name, field.fieldTypeDesc.valueTypeDesc.simpleTypeName)>
            <#if isDefined(valueTypeName)>
                ${prefix}.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.${valueTypeName}])).foreach{ v => import scala.collection.JavaConverters._; result.${fieldName}(v.asJava) } // ${field.fieldTypeDesc.fullTypeName}
                <#break >
            <#elseif valueTypeName == "Map">
                <#local mapValueTypeName=field.fieldTypeDesc.valueTypeDesc.valueTypeDesc.simpleTypeName>
                ${prefix}.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._<#if simpleTypeName != mapValueTypeName>, ${mapValueTypeName}Ops._</#if>; result.${fieldName}(v.map(_.mapValues(_.toJava).asJava).asJava) } // ${field.fieldTypeDesc.fullTypeName}
                <#break >
            <#elseif valueTypeName == "Seq">
                <#local seqValueTypeName=field.fieldTypeDesc.valueTypeDesc.valueTypeDesc.simpleTypeName>
                ${prefix}.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._<#if simpleTypeName != seqValueTypeName>, ${seqValueTypeName}Ops._</#if>; result.${fieldName}(v.mapValues(_.map(_.toJava).asJava).asJava) } // ${field.fieldTypeDesc.fullTypeName}
                <#break >
            <#else>
                ${prefix}.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._<#if simpleTypeName != valueTypeName>, ${valueTypeName}Ops._</#if>; result.${fieldName}(v.mapValues(_.toJava).asJava) } // ${field.fieldTypeDesc.fullTypeName}
                <#break >
            </#if>
        <#case "SdkBytes">
            ${prefix}.foreach(v => result.${fieldName}(v)) // ${field.fieldTypeDesc.fullTypeName}
            <#break >
        <#case "java.time.Instant">
            ${prefix}.foreach(v => result.${fieldName}(v)) // ${field.fieldTypeDesc.fullTypeName}
            <#break >
        <#default>
            ${prefix}.foreach{ v => import ${typeName}Ops._; result.${fieldName}(v.toJava) } // ${field.fieldTypeDesc.fullTypeName}
    </#switch>
</#macro>

<#macro mapToScala simpleTypeName methods field>
    <#local fieldName=field.name?replace("type", "`type`")>
    <#local typeName=getGetterSimpleTypeName(methods, field.name, field.fieldTypeDesc.simpleTypeName)>
    <#switch typeName>
        <#case "Char">
            .with${field.name?cap_first}(Option(self.${fieldName}).map(_.charValue)) // ${field.fieldTypeDesc.fullTypeName}
            <#break >
        <#case "Int">
            .with${field.name?cap_first}(Option(self.${fieldName}).map(_.intValue)) // ${field.fieldTypeDesc.fullTypeName}
            <#break >
        <#case "Long">
            .with${field.name?cap_first}(Option(self.${fieldName}).map(_.longValue)) // ${field.fieldTypeDesc.fullTypeName}
            <#break >
        <#case "Float">
            .with${field.name?cap_first}(Option(self.${fieldName}).map(_.floatValue)) // ${field.fieldTypeDesc.fullTypeName}
            <#break >
        <#case "Double">
            .with${field.name?cap_first}(Option(self.${fieldName}).map(_.doubleValue)) // ${field.fieldTypeDesc.fullTypeName}
            <#break >
        <#case "Boolean">
            .with${field.name?cap_first}(Option(self.${fieldName}).map(_.booleanValue)) // ${field.fieldTypeDesc.fullTypeName}
            <#break >
        <#case "String">
        <#case "Array">
            .with${field.name?cap_first}(Option(self.${fieldName})) // ${field.fieldTypeDesc.fullTypeName}
            <#break >
        <#case "Seq">
            <#local valueTypeName=getGetterValueTypeName(methods, field.name, field.fieldTypeDesc.valueTypeDesc.simpleTypeName)>
            <#if valueTypeName == "SdkBytes">
                .with${field.name?cap_first}(Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._; v.asScala}) // ${field.fieldTypeDesc.fullTypeName}
            <#elseif valueTypeName == "Map">
                <#local mapValueTypeName=field.fieldTypeDesc.valueTypeDesc.valueTypeDesc.simpleTypeName>
                .with${field.name?cap_first}(Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._<#if simpleTypeName != mapValueTypeName>, ${mapValueTypeName}Ops._</#if>; v.asScala.map(_.asScala.toMap.mapValues(_.toScala))}) // ${field.fieldTypeDesc.fullTypeName}
            <#elseif isDefined(valueTypeName) && valueTypeName != "String">
                .with${field.name?cap_first}(Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._; v.asScala.map(_.${valueTypeName?uncap_first}Value())}) // ${field.fieldTypeDesc.fullTypeName}
            <#elseif valueTypeName == "String">
                .with${field.name?cap_first}(Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._; v.asScala}) // ${field.fieldTypeDesc.fullTypeName}
            <#else>
                .with${field.name?cap_first}(Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._<#if simpleTypeName != valueTypeName>, ${valueTypeName}Ops._</#if>; v.asScala.map(_.toScala)}) // ${field.fieldTypeDesc.fullTypeName}
            </#if>
            <#break >
        <#case "Map">
            <#local valueTypeName=getGetterValueTypeName(methods, field.name, field.fieldTypeDesc.valueTypeDesc.simpleTypeName)>
            <#if valueTypeName == "SdkBytes">
                .with${field.name?cap_first}(Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._; v.asScala }) // ${field.fieldTypeDesc.fullTypeName}
            <#elseif valueTypeName == "Seq">
                <#local seqValueTypeName=field.fieldTypeDesc.valueTypeDesc.valueTypeDesc.simpleTypeName>
                <#if seqValueTypeName=="Map">
                    <#local mapValueTypeName=field.fieldTypeDesc.valueTypeDesc.valueTypeDesc.valueTypeDesc.simpleTypeName>
                    .with${field.name?cap_first}(Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._<#if simpleTypeName != mapValueTypeName>, ${mapValueTypeName}Ops._</#if>; v.asScala.toMap.mapValues(_.asScala.map(_.asScala.toMap.mapValues(_.toScala))) }) // ${field.fieldTypeDesc.fullTypeName}
                <#else>
                    .with${field.name?cap_first}(Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._<#if simpleTypeName != seqValueTypeName>, ${seqValueTypeName}Ops._</#if>; v.asScala.toMap.mapValues(_.asScala.map(_.toScala)) }) // ${field.fieldTypeDesc.fullTypeName}
                </#if>
            <#elseif isDefined(valueTypeName) && valueTypeName != "String">
                .with${field.name?cap_first}(Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._; v.asScala.toMap.mapValues(_.${valueTypeName?uncap_first}Value())}) // ${field.fieldTypeDesc.fullTypeName}
            <#elseif valueTypeName == "String">
                .with${field.name?cap_first}(Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._; v.asScala.toMap}) // ${field.fieldTypeDesc.fullTypeName}
            <#else>
                .with${field.name?cap_first}(Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._<#if simpleTypeName != valueTypeName>, ${valueTypeName}Ops._</#if>; v.asScala.toMap.mapValues(_.toScala) }) // ${field.fieldTypeDesc.fullTypeName}
            </#if>
            <#break >
        <#case "SdkBytes">
            .with${field.name?cap_first}(Option(self.${fieldName})) // ${field.fieldTypeDesc.fullTypeName}
            <#break >
        <#case "java.time.Instant">
            .with${field.name?cap_first}(Option(self.${fieldName})) // ${field.fieldTypeDesc.fullTypeName}
            <#break >
        <#default >
            .with${field.name?cap_first}(Option(self.${fieldName}).map{ v => import ${typeName}Ops._; v.toScala}) // ${field.fieldTypeDesc.fullTypeName}
    </#switch>
</#macro>
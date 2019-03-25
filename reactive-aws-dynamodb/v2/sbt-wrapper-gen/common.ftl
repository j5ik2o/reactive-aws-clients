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

<#function getGetterValueTypeLevelCount methods name>
    <#list methods as method>
        <#if method.name == name>
            <#return method.returnTypeDesc.valueTypeDesc.typeLevelCount>
        </#if>
    </#list>
    <#return 0>
</#function>

<#function isCollection typeName>
    <#switch typeName>
        <#case "Map">
        <#case "Seq">
        <#case "Array">
            <#return true>
    </#switch>
    <#return false>
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
    <#assign fieldName=field.name?replace("type", "`type`")>
    <#assign typeName=getGetterSimpleTypeName(methods, field.name, field.fieldTypeDesc.simpleTypeName)>
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
            <#assign valueTypeName=getGetterValueTypeName(methods, field.name, field.fieldTypeDesc.valueTypeDesc.simpleTypeName)>
            <#if valueTypeName == "SdkBytes">
                ${prefix}.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._; result.${fieldName}(v.map(software.amazon.awssdk.core.SdkBytes.fromByteArray).asJava) } // ${field.fieldTypeDesc.fullTypeName}
                <#break >
            <#elseif valueTypeName == "Map">
                <#assign mapValueTypeName=field.fieldTypeDesc.valueTypeDesc.valueTypeDesc.simpleTypeName>
                <#if isDefined(mapValueTypeName)>
                    <#if simpleTypeName != valueTypeName>
                        ${prefix}.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._, ${field.fieldTypeDesc.valueTypeDesc.valueTypeDesc.simpleTypeName}Ops._; result.${fieldName}(v.map(_.mapValues(_.toJava).asJava).asJava) } // ${field.fieldTypeDesc.fullTypeName}
                        <#break >
                    <#else>
                        ${prefix}.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._; result.${fieldName}(v.map(_.mapValues(_.toJava).asJava).asJava) } // ${field.fieldTypeDesc.fullTypeName}
                        <#break >
                    </#if>
                <#elseif valueTypeName == "Seq">
                    <#if simpleTypeName != valueTypeName>
                        ${prefix}.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._, ${field.fieldTypeDesc.valueTypeDesc.valueTypeDesc.valueTypeDesc.simpleTypeName}Ops._; result.${fieldName}(v.map(_.mapValues(_.map(_.toJava).asJava).asJava).asJava) } // ${field.fieldTypeDesc.fullTypeName}
                        <#break >
                    <#else>
                        ${prefix}.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._; result.${fieldName}(v.map(_.mapValues(_.map(_.toJava).asJava).asJava).asJava) } // ${field.fieldTypeDesc.fullTypeName}
                        <#break >
                    </#if>
                </#if>
            <#elseif valueTypeName == "Seq">
                <#assign seqValueTypeName=field.fieldTypeDesc.valueTypeDesc.valueTypeDesc.simpleTypeName>
                <#if simpleTypeName != seqValueTypeName>
                    ${prefix}.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._, ${seqValueTypeName}Ops._; result.${fieldName}(v.map(_.map(_.toJava).asJava).asJava) } // ${field.fieldTypeDesc.fullTypeName}
                    <#break >
                <#else>
                    ${prefix}.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._; result.${fieldName}(v.map(_.map(_.toJava).asJava).asJava) } // ${field.fieldTypeDesc.fullTypeName}
                    <#break >
                </#if>
            <#elseif isDefined(valueTypeName) && valueTypeName != "String">
                ${prefix}.filter(_.nonEmpty).map(_.map(_.asInstanceOf[java.lang.${valueTypeName}])).foreach{ v => import scala.collection.JavaConverters._; result.${fieldName}(v.asJava) } // ${field.fieldTypeDesc.fullTypeName}
                <#break >
            <#elseif isDefined(valueTypeName)>
                ${prefix}.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._; result.${fieldName}(v.asJava) } // ${field.fieldTypeDesc.fullTypeName}
                <#break >
            <#else>
                <#if simpleTypeName != valueTypeName>
                    ${prefix}.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._, ${valueTypeName}Ops._; result.${fieldName}(v.map(_.toJava).asJava) } // ${field.fieldTypeDesc.fullTypeName}
                <#else>
                    ${prefix}.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._; result.${fieldName}(v.map(_.toJava).asJava) } // ${field.fieldTypeDesc.fullTypeName}
                </#if>
                <#break >
            </#if>
        <#case "Map">
            <#assign valueTypeName=getGetterValueTypeName(methods, field.name, field.fieldTypeDesc.valueTypeDesc.simpleTypeName)>
            <#if isDefined(valueTypeName)>
                ${prefix}.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.${valueTypeName}])).foreach{ v => import scala.collection.JavaConverters._; result.${fieldName}(v.asJava) } // ${field.fieldTypeDesc.fullTypeName}
                <#break >
            <#elseif valueTypeName == "Map">
                <#assign mapValueTypeName=field.fieldTypeDesc.valueTypeDesc.valueTypeDesc.simpleTypeName>
                <#if simpleTypeName != mapValueTypeName>
                    ${prefix}.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._, ${mapValueTypeName}Ops._; result.${fieldName}(v.map(_.mapValues(_.toJava).asJava).asJava) } // ${field.fieldTypeDesc.fullTypeName}
                    <#break >
                <#else>
                    ${prefix}.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._; result.${fieldName}(v.map(_.mapValues(_.toJava).asJava).asJava) } // ${field.fieldTypeDesc.fullTypeName}
                    <#break >
                </#if>
            <#elseif valueTypeName == "Seq">
                <#assign seqValueTypeName=field.fieldTypeDesc.valueTypeDesc.valueTypeDesc.simpleTypeName>
                <#if simpleTypeName != seqValueTypeName>
                    ${prefix}.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._, ${seqValueTypeName}Ops._; result.${fieldName}(v.mapValues(_.map(_.toJava).asJava).asJava) } // ${field.fieldTypeDesc.fullTypeName}
                <#else>
                    ${prefix}.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._; result.${fieldName}(v.mapValues(_.map(_.toJava).asJava).asJava) } // ${field.fieldTypeDesc.fullTypeName}
                </#if>
                <#break >
            <#else>
                <#if simpleTypeName != valueTypeName>
                    ${prefix}.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._, ${valueTypeName}Ops._; result.${fieldName}(v.mapValues(_.toJava).asJava) } // ${field.fieldTypeDesc.fullTypeName}
                <#else>
                    ${prefix}.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._; result.${fieldName}(v.mapValues(_.toJava).asJava) } // ${field.fieldTypeDesc.fullTypeName}
                </#if>
                <#break >
            </#if>
        <#case "SdkBytes">
            ${prefix}.filter(_.nonEmpty).foreach(v => result.${fieldName}(software.amazon.awssdk.core.SdkBytes.fromByteArray(v))) // ${field.fieldTypeDesc.fullTypeName}
            <#break >
        <#case "java.time.Instant">
            ${prefix}.foreach(v => result.${fieldName}(v)) // ${field.fieldTypeDesc.fullTypeName}
            <#break >
        <#default>
            ${prefix}.foreach{ v => import ${typeName}Ops._; result.${fieldName}(v.toJava) } // ${field.fieldTypeDesc.fullTypeName}
    </#switch>
</#macro>

<#macro mapToScala simpleTypeName methods field>
    <#assign fieldName=field.name?replace("type", "`type`")>
    <#assign typeName=getGetterSimpleTypeName(methods, field.name, field.fieldTypeDesc.simpleTypeName)>
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
            <#assign valueTypeName=getGetterValueTypeName(methods, field.name, field.fieldTypeDesc.valueTypeDesc.simpleTypeName)>
            <#if valueTypeName == "SdkBytes">
                .with${field.name?cap_first}(Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._; v.asScala.map(_.asByteArray())}) // ${field.fieldTypeDesc.fullTypeName}
            <#elseif valueTypeName == "Map">
                <#assign mapValueTypeName=field.fieldTypeDesc.valueTypeDesc.valueTypeDesc.simpleTypeName>
                <#if simpleTypeName != mapValueTypeName>
                    .with${field.name?cap_first}(Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._, ${mapValueTypeName}Ops._; v.asScala.map(_.asScala.toMap.mapValues(_.toScala))}) // ${field.fieldTypeDesc.fullTypeName}
                <#else>
                    .with${field.name?cap_first}(Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._; v.asScala.map(_.asScala.toMap.mapValues(_.toScala))}) // ${field.fieldTypeDesc.fullTypeName}
                </#if>
            <#elseif isDefined(valueTypeName) && valueTypeName != "String">
                .with${field.name?cap_first}(Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._; v.asScala.map(_.${valueTypeName?uncap_first}Value())}) // ${field.fieldTypeDesc.fullTypeName}
            <#elseif valueTypeName == "String">
                .with${field.name?cap_first}(Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._; v.asScala}) // ${field.fieldTypeDesc.fullTypeName}
            <#else>
                <#if simpleTypeName != valueTypeName>
                    .with${field.name?cap_first}(Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._, ${valueTypeName}Ops._; v.asScala.map(_.toScala)}) // ${field.fieldTypeDesc.fullTypeName}
                <#else>
                    .with${field.name?cap_first}(Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._; v.asScala.map(_.toScala)}) // ${field.fieldTypeDesc.fullTypeName}
                </#if>
            </#if>
            <#break >
        <#case "Map">
            <#assign valueTypeName=getGetterValueTypeName(methods, field.name, field.fieldTypeDesc.valueTypeDesc.simpleTypeName)>
            <#if valueTypeName == "SdkBytes">
                .with${field.name?cap_first}(Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._; v.asScala.mapValues(_.asByteArray())}) // ${field.fieldTypeDesc.fullTypeName}
            <#elseif valueTypeName == "Seq">
                <#assign seqValueTypeName=field.fieldTypeDesc.valueTypeDesc.valueTypeDesc.simpleTypeName>
                <#if seqValueTypeName=="Map">
                    <#assign mapValueTypeName=field.fieldTypeDesc.valueTypeDesc.valueTypeDesc.valueTypeDesc.simpleTypeName>
                    <#if simpleTypeName != mapValueTypeName>
                        .with${field.name?cap_first}(Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._, ${mapValueTypeName}Ops._; v.asScala.toMap.mapValues(_.asScala.map(_.asScala.toMap.mapValues(_.toScala))) }) // ${field.fieldTypeDesc.fullTypeName}
                    <#else>
                        .with${field.name?cap_first}(Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._; v.asScala.toMap.mapValues(_.asScala.map(_.asScala.toMap.mapValues(_.toScala))) }) // ${field.fieldTypeDesc.fullTypeName}
                    </#if>
                <#else>
                    <#if simpleTypeName != seqValueTypeName>
                        .with${field.name?cap_first}(Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._, ${seqValueTypeName}Ops._; v.asScala.toMap.mapValues(_.asScala.map(_.toScala)) }) // ${field.fieldTypeDesc.fullTypeName}
                    <#else>
                        .with${field.name?cap_first}(Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._; v.asScala.toMap.mapValues(_.asScala.map(_.toScala)) }) // ${field.fieldTypeDesc.fullTypeName}
                    </#if>
                </#if>
            <#elseif isDefined(valueTypeName) && valueTypeName != "String">
                .with${field.name?cap_first}(Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._; v.asScala.toMap.mapValues(_.${valueTypeName?uncap_first}Value())}) // ${field.fieldTypeDesc.fullTypeName}
            <#elseif valueTypeName == "String">
                .with${field.name?cap_first}(Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._; v.asScala.toMap}) // ${field.fieldTypeDesc.fullTypeName}
            <#else>
                <#if simpleTypeName != valueTypeName>
                    .with${field.name?cap_first}(Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._, ${valueTypeName}Ops._; v.asScala.toMap.mapValues(_.toScala) }) // ${field.fieldTypeDesc.fullTypeName}
                <#else>
                    .with${field.name?cap_first}(Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._; v.asScala.toMap.mapValues(_.toScala) }) // ${field.fieldTypeDesc.fullTypeName}
                </#if>
            </#if>
            <#break >
        <#case "SdkBytes">
            .with${field.name?cap_first}(Option(self.${fieldName}).map(_.asByteArray())) // ${field.fieldTypeDesc.fullTypeName}
            <#break >
        <#case "java.time.Instant">
            .with${field.name?cap_first}(Option(self.${fieldName})) // ${field.fieldTypeDesc.fullTypeName}
            <#break >
        <#default >
            .with${field.name?cap_first}(Option(self.${fieldName}).map{ v => import ${typeName}Ops._; v.toScala}) // ${field.fieldTypeDesc.fullTypeName}
    </#switch>
</#macro>

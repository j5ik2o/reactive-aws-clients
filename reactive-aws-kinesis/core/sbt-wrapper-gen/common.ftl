<#function filterMethodName name>
    <#return name?replace("SdkBytes", "software.amazon.awssdk.core.SdkBytes")?replace("Instant", "java.time.Instant")>
</#function>

<#function getGetterSimpleTypeName methods name default>
    <#list methods as method>
        <#if method.name == name>
            <#return filterMethodName(method.returnTypeDesc.simpleTypeName)>
        </#if>
    </#list>
    <#return filterMethodName(default)>
</#function>

<#function getGetterFullTypeName name default>
    <#list methods as method>
        <#if method.name == name>
            <#return filterMethodName(method.returnTypeDesc.fullTypeName)>
        </#if>
    </#list>
    <#return filterMethodName(default)>
</#function>

<#function getGetterKeyTypeName methods name default>
    <#list methods as method>
        <#if method.name == name>
            <#return filterMethodName(method.returnTypeDesc.keyTypeDesc.simpleTypeName)>
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



<#macro enrichSetterAsScala simpleTypeName methods field>
    <#local fieldName=field.name?replace("type", "`type`")>
    <#local typeName=getGetterSimpleTypeName(methods, field.name, field.fieldTypeDesc.simpleTypeName)>
    <#switch typeName>
        <#case "Seq">
            final def with${field.name?cap_first}AsScala(value: Option[${getGetterFullTypeName(field.name, field.fieldTypeDesc.fullTypeName)}]): ${simpleTypeName}.Builder = {
            <#local valueTypeName=getGetterValueTypeName(methods, field.name, field.fieldTypeDesc.valueTypeDesc.simpleTypeName)>
            <#if valueTypeName == "SdkBytes">
                value.filter(_.nonEmpty).fold(self){ v => import scala.collection.JavaConverters._; self.${fieldName}(v.asJava) } // ${field.fieldTypeDesc.fullTypeName}
            <#elseif valueTypeName == "Map">
                <#local mapValueTypeName=field.fieldTypeDesc.valueTypeDesc.valueTypeDesc.simpleTypeName>
                <#if mapValueTypeName == "Seq">
                    value.filter(_.nonEmpty).fold(self){ v => import scala.collection.JavaConverters._; self.${fieldName}(v.map(_.mapValues(_.asJava).asJava).asJava) } // ${field.fieldTypeDesc.fullTypeName}
                <#else>
                    value.filter(_.nonEmpty).fold(self){ v => import scala.collection.JavaConverters._; self.${fieldName}(v.map(_.asJava).asJava) } // ${field.fieldTypeDesc.fullTypeName}
                </#if>
            <#elseif valueTypeName == "Seq">
                <#local seqValueTypeName=field.fieldTypeDesc.valueTypeDesc.valueTypeDesc.simpleTypeName>
                value.filter(_.nonEmpty).fold(self){ v => import scala.collection.JavaConverters._; self.${fieldName}(v.map(_.asJava).asJava) } // ${field.fieldTypeDesc.fullTypeName}
            <#elseif isDefined(valueTypeName) && valueTypeName != "String">
                value.filter(_.nonEmpty).map(_.map(_.asInstanceOf[java.lang.${valueTypeName}])).fold(self){ v => import scala.collection.JavaConverters._; self.${fieldName}(v.asJava) } // ${field.fieldTypeDesc.fullTypeName}
            <#elseif isDefined(valueTypeName)>
                value.filter(_.nonEmpty).fold(self){ v => import scala.collection.JavaConverters._; self.${fieldName}(v.asJava) } // ${field.fieldTypeDesc.fullTypeName}
            <#else>
                value.filter(_.nonEmpty).fold(self){ v => import scala.collection.JavaConverters._; self.${fieldName}(v.asJava) } // ${field.fieldTypeDesc.fullTypeName}
            </#if>
            }
            <#break >
        <#case "Map">
            final def with${field.name?cap_first}AsScala(value: Option[${getGetterFullTypeName(field.name, field.fieldTypeDesc.fullTypeName)}]): ${simpleTypeName}.Builder = {
            <#assign valueTypeName=getGetterValueTypeName(methods, field.name, field.fieldTypeDesc.valueTypeDesc.simpleTypeName)>
            <#if isDefined(valueTypeName)>
                value.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.${valueTypeName}])).fold(self){ v => import scala.collection.JavaConverters._; self.${fieldName}(v.asJava) } // ${field.fieldTypeDesc.fullTypeName}
            <#elseif valueTypeName == "Map">
                <#local mapValueTypeName=field.fieldTypeDesc.valueTypeDesc.valueTypeDesc.simpleTypeName>
                value.filter(_.nonEmpty).fold(self){ v => import scala.collection.JavaConverters._; self.${fieldName}(v.map(_.asJava).asJava) } // ${field.fieldTypeDesc.fullTypeName}
            <#elseif valueTypeName == "Seq">
                <#local seqValueTypeName=field.fieldTypeDesc.valueTypeDesc.valueTypeDesc.simpleTypeName>
                <#if seqValueTypeName == "Map">
                    value.filter(_.nonEmpty).fold(self){ v => import scala.collection.JavaConverters._; self.${fieldName}(v.mapValues(_.map(_.asJava).asJava).asJava) } // ${field.fieldTypeDesc.fullTypeName}
                <#else>
                    value.filter(_.nonEmpty).fold(self){ v => import scala.collection.JavaConverters._; self.${fieldName}(v.mapValues(_.asJava).asJava) } // ${field.fieldTypeDesc.fullTypeName}
                </#if>
            <#else>
                value.filter(_.nonEmpty).fold(self){ v => import scala.collection.JavaConverters._; self.${fieldName}(v.asJava) } // ${field.fieldTypeDesc.fullTypeName}
            </#if>
            }
            <#break >
        <#default >
            final def with${field.name?cap_first}AsScala(value: Option[${getGetterFullTypeName(field.name, field.fieldTypeDesc.fullTypeName)}]): ${simpleTypeName}.Builder = {
            value.fold(self){ v => self.${fieldName}(v) }
            } // ${field.fieldTypeDesc.fullTypeName}
            <#break >
    </#switch>
</#macro>

<#macro enrichGetterAsScala simpleTypeName methods field>
    <#local fieldName=field.name?replace("type", "`type`")>
    <#local typeName=getGetterSimpleTypeName(methods, field.name, field.fieldTypeDesc.simpleTypeName)>
    <#switch typeName>
        <#case "Seq">
            <#local valueTypeName=getGetterValueTypeName(methods, field.name, field.fieldTypeDesc.valueTypeDesc.simpleTypeName)>
            <#if valueTypeName == "SdkBytes">
                final def ${field.name}AsScala: Option[Seq[software.amazon.awssdk.core.SdkBytes]] = Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._; v.asScala } // ${field.fieldTypeDesc.fullTypeName}
            <#elseif valueTypeName == "Map">
                <#local mapKeyTypeName=field.fieldTypeDesc.valueTypeDesc.keyTypeDesc.simpleTypeName>
                <#local mapValueTypeName=field.fieldTypeDesc.valueTypeDesc.valueTypeDesc.simpleTypeName>
                final def ${field.name}AsScala: Option[Seq[Map[${mapKeyTypeName}, ${mapValueTypeName}]]] = Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._; v.asScala.map(_.asScala.toMap) } // ${field.fieldTypeDesc.fullTypeName}
            <#elseif isDefined(valueTypeName) && valueTypeName != "String">
                final def ${field.name}AsScala: Option[Seq[${valueTypeName}]] = Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._; v.asScala.map(_.${valueTypeName?uncap_first}Value()) } // ${field.fieldTypeDesc.fullTypeName}
            <#elseif valueTypeName == "String">
                final def ${field.name}AsScala: Option[Seq[String]] = Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._; v.asScala} // ${field.fieldTypeDesc.fullTypeName}
            <#else>
                final def ${field.name}AsScala: Option[Seq[${valueTypeName}]] = Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._; v.asScala } // ${field.fieldTypeDesc.fullTypeName}
            </#if>
            <#break >
        <#case "Map">
            <#local keyTypeName=getGetterKeyTypeName(methods, field.name, field.fieldTypeDesc.keyTypeDesc.simpleTypeName)>
            <#local valueTypeName=getGetterValueTypeName(methods, field.name, field.fieldTypeDesc.valueTypeDesc.simpleTypeName)>
            <#if valueTypeName == "SdkBytes">
                final def ${field.name}AsScala: Option[Map[${keyTypeName}, software.amazon.awssdk.core.SdkBytes]] = Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._; v.asScala } // ${field.fieldTypeDesc.fullTypeName}
            <#elseif valueTypeName == "Seq">
                <#local seqValueTypeName=field.fieldTypeDesc.valueTypeDesc.valueTypeDesc.simpleTypeName>
                <#if seqValueTypeName=="Map">
                    <#local mapKeyTypeName=field.fieldTypeDesc.valueTypeDesc.valueTypeDesc.keyTypeDesc.simpleTypeName>
                    <#local mapValueTypeName=field.fieldTypeDesc.valueTypeDesc.valueTypeDesc.valueTypeDesc.simpleTypeName>
                    final def ${field.name}AsScala: Option[Map[${keyTypeName}, Seq[Map[${mapKeyTypeName},${mapValueTypeName}]]]]  = Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._; v.asScala.toMap.mapValues(_.asScala.map(_.asScala.toMap)) } // ${field.fieldTypeDesc.fullTypeName}
                <#else>
                    final def ${field.name}AsScala: Option[Map[${keyTypeName},Seq[${seqValueTypeName}]]]  = Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._; v.asScala.toMap.mapValues(_.asScala) } // ${field.fieldTypeDesc.fullTypeName}
                </#if>
            <#elseif isDefined(valueTypeName) && valueTypeName != "String">
                final def ${field.name}AsScala: Option[Map[${keyTypeName}, ${valueTypeName}]]  = Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._; v.asScala.toMap.mapValues(_.${valueTypeName?uncap_first}Value())} // ${field.fieldTypeDesc.fullTypeName}
            <#elseif valueTypeName == "String">
                final def ${field.name}AsScala: Option[Map[${keyTypeName}, ${valueTypeName}]]  = Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._; v.asScala.toMap } // ${field.fieldTypeDesc.fullTypeName}
            <#else>
                final def ${field.name}AsScala: Option[Map[${keyTypeName}, ${valueTypeName}]]  = Option(self.${fieldName}).map{ v => import scala.collection.JavaConverters._; v.asScala.toMap } // ${field.fieldTypeDesc.fullTypeName}
            </#if>
            <#break >
        <#case "SdkBytes">
            final def ${field.name}AsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.${fieldName}) // ${field.fieldTypeDesc.fullTypeName}
            <#break >
        <#default >
            final def ${field.name}AsScala: Option[${typeName}] = Option(self.${fieldName}) // ${field.fieldTypeDesc.fullTypeName}
            <#break >
    </#switch>
</#macro>


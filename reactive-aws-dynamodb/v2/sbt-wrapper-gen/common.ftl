<#function getGetterSimpleTypeName methods name default>
    <#list methods as method>
        <#if method.name == name>
            <#return method.returnType.simpleTypeName?replace("Instant", "java.time.Instant")>
        </#if>
    </#list>
    <#return default?replace("Instant", "java.time.Instant")>
</#function>

<#macro mapToJava methods field>
    <#assign fieldName=field.name?replace("type", "`type`")>
    <#switch getGetterSimpleTypeName(methods, field.name, field.fieldType.simpleTypeName)>
        <#case "Int">
        <#case "Long">
        <#case "Short">
        <#case "Double">
        <#case "Float">
.foreach(v => result.${fieldName}(v)) // ${field.fieldType.fullTypeName}<#break >
<#case "Boolean">
.map(_.booleanValue).foreach(v => result.${fieldName}(v)) // ${field.fieldType.fullTypeName}<#break >
<#case "String">
<#case "Array">
.filter(_.nonEmpty).foreach(v => result.${fieldName}(v)) // ${field.fieldType.fullTypeName}<#break >
<#case "Seq">
 <#case "Map">
.filter(_.nonEmpty).foreach(v => result.${fieldName}(v)) // ${field.fieldType.fullTypeName}<#break >
<#case "SdkBytes">
.filter(_.nonEmpty).foreach(v => result.${fieldName}(v)) // ${field.fieldType.fullTypeName}<#break >
<#default>
.foreach(v => result.${fieldName}(v)) // ${field.fieldType.fullTypeName}</#switch>
</#macro>

<#macro mapToScala methods field>
    <#assign fieldName=field.name?replace("type", "`type`")>
        <#switch getGetterSimpleTypeName(methods, field.name, field.fieldType.simpleTypeName)>
            <#case "Int">
                .with${fieldName?cap_first}(Option(self.${fieldName}).map(_.intValue))
                <#break >
            <#case "Long">
                .with${fieldName?cap_first}(Option(self.${fieldName}).map(_.longValue))
                <#break >
            <#case "Double">
                .with${fieldName?cap_first}(Option(self.${fieldName}).map(_.doubleValue))
                <#break >
            <#case "Double">
                .with${fieldName?cap_first}(Option(self.${fieldName}).map(_.floatValue))
                <#break >
            <#case "Boolean">
                .with${fieldName?cap_first}(Option(self.${fieldName}).map(_.booleanValue))
                <#break >
            <#case "String">
            <#case "Array">
            <#case "Seq">
            <#case "Map">
                .with${fieldName?cap_first}(Option(self.${fieldName}))
                <#break >
            <#default >
            <#if field.fieldType.enum>
                .with${fieldName?cap_first}(Option(self.${fieldName}).map(_.toString).map(${fieldName?cap_first}.withName))
            <#else>
                .with${fieldName?cap_first}(Option(self.${fieldName}))
            </#if>
        </#switch>
</#macro>

package com.github.j5ik2o.reactive.aws.kinesis.model
<#function targetField fieldDesc>
  <#if fieldDesc.static >
    <#return false>
  </#if>
  <#return true>
</#function>
<#function getGetterTypeName name default>
  <#list methods as method>
    <#if method.name == name>
        <#return method.returnType.fullTypeName?replace("SdkBytes", "Array[Byte]")?replace("Instant", "java.time.Instant")>
    </#if>
  </#list>
  <#return default?replace("SdkBytes", "Array[Byte]")?replace("Instant", "java.time.Instant")>
</#function>

final case class ${simpleTypeName}(
<#list fields as field>
<#if targetField(field)>  ${field.name?replace("type", "`type`")}: Option[${getGetterTypeName(field.name, field.fieldType.fullTypeName)}] = None<#if field_has_next>,</#if>
</#if></#list>) {
<#list fields as field>
<#if targetField(field)>  def with${field.name?cap_first}(value: Option[${getGetterTypeName(field.name, field.fieldType.fullTypeName)}]): ${simpleTypeName} =
  copy(${field.name?replace("type", "`type`")} = value)
</#if></#list>
}
package com.github.j5ik2o.reactive.aws.kinesis.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class ${simpleTypeName}(
override val statusCode: Option[Int] = None,
override val statusText: Option[String] = None,
override val httpHeaders: Option[Map[String, Seq[String]]] = None<#if has_content(fields)>,</#if>
<#list fields as field>
<#if targetField(field)>  ${field.name}: Option[${getGetterTypeName(field.name, field.fieldTypeDesc.fullTypeName)}] = None<#if field_has_next>,</#if>
</#if></#list>) extends AbstractResponse(statusCode, statusText, httpHeaders) {
override type ThisType = ${simpleTypeName}
override def withStatusCode(value: Option[Int]): ${simpleTypeName}     = copy(statusCode = value)
override def withStatusText(value: Option[String]): ${simpleTypeName}  = copy(statusText = value)
override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): ${simpleTypeName}  =
copy(httpHeaders = value)
<#list fields as field>
<#if targetField(field)>  def with${field.name?cap_first}(value: Option[${getGetterTypeName(field.name, field.fieldTypeDesc.fullTypeName)}]): ${simpleTypeName} =
  copy(${field.name} = value)
</#if></#list>
}
<#function targetField fieldDesc>
  <#if fieldDesc.static >
    <#return false>
  </#if>
  <#return true>
</#function>
<#function getGetterTypeName name default>
  <#list methods as method>
    <#if method.name == name>
      <#return method.returnTypeDesc.fullTypeName?replace("Instant", "java.time.Instant")>
    </#if>
  </#list>
  <#return default?replace("Instant", "java.time.Instant")>
</#function>
<#function has_content list>
  <#list fields as field>
    <#if targetField(field)>
      <#return true>
    </#if>
  </#list>
  <#return false>
</#function>
// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops
<#function targetField fieldDesc>
  <#if fieldDesc.static >
    <#return false>
  </#if>
  <#return true>
</#function>
<#include "common.ftl">

import software.amazon.awssdk.services.s3.model._

final class ${simpleTypeName}BuilderOps(val self: ${simpleTypeName}.Builder) extends AnyVal {

<#list fields as field>
    <#if targetField(field)>
        <@enrichSetterAsScala simpleTypeName methods field/>

    </#if>
</#list>

  }

final class ${simpleTypeName}Ops(val self: ${simpleTypeName}) extends AnyVal {

<#list fields as field>
    <#if targetField(field)>
        <@enrichGetterAsScala simpleTypeName methods field/>

    </#if>
</#list>

   }

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait To${simpleTypeName}Ops {

  implicit def to${simpleTypeName}BuilderOps(v: ${simpleTypeName}.Builder): ${simpleTypeName}BuilderOps = new ${simpleTypeName}BuilderOps(v)

  implicit def to${simpleTypeName}Ops(v: ${simpleTypeName}): ${simpleTypeName}Ops = new ${simpleTypeName}Ops(v)

}
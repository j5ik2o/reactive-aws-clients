// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model
<#function targetField fieldDesc>
  <#if fieldDesc.static >
    <#return false>
  </#if>
  <#return true>
</#function>

<#include "common.ftl">

import com.github.j5ik2o.reactive.aws.kinesis.model.{ ${simpleTypeName} => Scala${simpleTypeName}, _ }
import com.amazonaws.services.kinesis.model.{ ${simpleTypeName} => Java${simpleTypeName} }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ${simpleTypeName}Ops {

  implicit class Scala${simpleTypeName}Ops(val self: Scala${simpleTypeName}) extends AnyVal {

    def toJava: Java${simpleTypeName} = {
      val result = new Java${simpleTypeName}()
<#list fields as field>
    <#assign prefix="self." + field.name?replace("type", "`type`")>
    <#if targetField(field)>    <@mapToJava simpleTypeName methods prefix field/></#if></#list>
      result
    }

  }

}
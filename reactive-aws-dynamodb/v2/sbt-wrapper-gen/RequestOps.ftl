package com.github.j5ik2o.reactive.aws.dynamodb.model.v2
<#function targetField fieldDesc>
  <#if fieldDesc.static >
    <#return false>
  </#if>
  <#return true>
</#function>

<#include "common.ftl">

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ${simpleTypeName} => Scala${simpleTypeName}, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ${simpleTypeName} => Java${simpleTypeName} }
import com.github.j5ik2o.reactive.aws.dynamodb.utils._

object ${simpleTypeName}Ops extends OpsSupport {

  implicit class Scala${simpleTypeName}Ops(val self: Scala${simpleTypeName}) extends AnyVal {

    def toJava: Java${simpleTypeName} = {
      val result = Java${simpleTypeName}.builder()
<#list fields as field><#if targetField(field)>    self.${field.name?replace("type", "`type`")}<@mapToJava fields field/></#if></#list>
      result.build()
    }

  }

}
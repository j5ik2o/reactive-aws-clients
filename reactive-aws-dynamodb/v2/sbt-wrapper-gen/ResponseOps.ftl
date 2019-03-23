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

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

object ${simpleTypeName}Ops extends OpsSupport {

  implicit class Java${simpleTypeName}Ops(val self: Java${simpleTypeName}) extends AnyVal {

    def toScala: Scala${simpleTypeName} = {
      Scala${simpleTypeName}()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
<#list fields as field>
    <#if targetField(field)><@mapToScala methods field/>
    </#if>
</#list>
    }

  }

}
// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model
<#function targetField fieldDesc>
  <#if fieldDesc.static >
    <#return false>
  </#if>
  <#return true>
</#function>

<#include "common.ftl">

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ${simpleTypeName} => Scala${simpleTypeName}, _ }
import com.amazonaws.services.dynamodbv2.model.{ ${simpleTypeName?replace("Response", "Result")} => Java${simpleTypeName} }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ${simpleTypeName}Ops {

  implicit class Java${simpleTypeName}Ops(val self: Java${simpleTypeName}) extends AnyVal {

    def toScala: Scala${simpleTypeName} = {
      Scala${simpleTypeName}()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
<#list fields as field>
    <#if targetField(field)><@mapToScala simpleTypeName methods field/>
    </#if>
</#list>
    }

  }

}
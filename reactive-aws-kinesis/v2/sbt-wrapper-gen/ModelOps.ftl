// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model
<#include "common.ftl">

import com.github.j5ik2o.reactive.aws.kinesis.model.{ ${simpleTypeName} => Scala${simpleTypeName}, _ }
import software.amazon.awssdk.services.kinesis.model.{ ${simpleTypeName} => Java${simpleTypeName} }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ${simpleTypeName}Ops {

  implicit class Scala${simpleTypeName}Ops(val self: Scala${simpleTypeName}) extends AnyVal {

    def toJava: Java${simpleTypeName} = {
      val result = Java${simpleTypeName}.builder()
<#list fields as field>
    <#assign prefix="self." + field.name?replace("type", "`type`")>
    <#if targetField(field)>      <@mapToJava simpleTypeName methods prefix field/></#if></#list>
      result.build()
    }

  }

  implicit class Java${simpleTypeName}Ops(val self: Java${simpleTypeName}) extends AnyVal {

     def toScala: Scala${simpleTypeName} = {
       Scala${simpleTypeName}()
<#list fields as field>
    <#if targetField(field)><@mapToScala simpleTypeName methods field/>
    </#if>
</#list>
     }

   }

}
<#function targetField fieldDesc>
    <#if fieldDesc.static >
        <#return false>
    </#if>
    <#return true>
</#function>
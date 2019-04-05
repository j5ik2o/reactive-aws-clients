// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs

import software.amazon.awssdk.services.sqs.model._
import software.amazon.awssdk.services.sqs.{ SqsAsyncClient => JavaSqsAsyncClient }

import scala.compat.java8.FutureConverters._
import scala.concurrent.Future

object SQSAsyncClient {

  def apply(underlying: JavaSqsAsyncClient): SQSAsyncClient =
    new SQSAsyncClientImpl(underlying)

}

trait SQSAsyncClient extends SQSClient[Future] /*with SQSAsyncClientSupport*/ {
  val underlying: JavaSqsAsyncClient

<#list methods as method><#if targetAsyncMethod(method)>    <#if !method.name?ends_with("Paginator")>override</#if> def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): <#if method.name?ends_with("Paginator")>${method.returnTypeDesc.simpleTypeName}<#else>Future[${method.returnTypeDesc.valueTypeDesc.simpleTypeName}]</#if> = {
    <#if method.name?ends_with("Paginator")>
        underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>)
    <#else>
        underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>).toScala
    </#if>
    }

</#if></#list>
}

<#function targetAsyncMethod methodDesc>
    <#if methodDesc.static >
        <#return false>
    </#if>
    <#if methodDesc.parameterTypeDescs?size gte 2>
        <#return false>
    </#if>
    <#local target=true>
    <#list methodDesc.parameterTypeDescs as p>
        <#if p.parameterTypeDesc.fullTypeName == "Consumer[Builder]">
            <#local target = false>
            <#break >
        </#if>
    </#list>
    <#return target>
</#function>

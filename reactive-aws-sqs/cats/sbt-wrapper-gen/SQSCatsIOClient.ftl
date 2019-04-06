// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.cats

import cats.effect.IO
import com.github.j5ik2o.reactive.aws.sqs.{ SQSAsyncClient, SQSClient }
import software.amazon.awssdk.services.sqs.model._

object SQSCatsIOClient {

  def apply(underlying: SQSAsyncClient): SQSCatsIOClient =
    new SQSCatsIOClientImpl(underlying)

}

trait SQSCatsIOClient extends SQSClient[IO] {

  val underlying: SQSAsyncClient

<#list methods as method>
    <#if targetMethod(method)>
        <#if method.name?ends_with("Paginator")>
            def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): ${method.returnTypeDesc.simpleTypeName} =
            underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>)
        <#else>
            override def ${method.name}(
            <#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>
            ): IO[${method.returnTypeDesc.valueTypeDesc.simpleTypeName}] =
            IO.fromFuture{
            IO(underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>))
            }
        </#if>

    </#if>
</#list>
}

<#function targetMethod methodDesc>
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


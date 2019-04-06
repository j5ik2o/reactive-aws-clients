// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.cats

import cats.effect.IO
import com.github.j5ik2o.reactive.aws.kinesis.{ KinesisAsyncClient, KinesisClient }
import software.amazon.awssdk.services.kinesis.model._
import software.amazon.awssdk.services.kinesis.paginators._

import scala.concurrent.{ ExecutionContext, Future }

object KinesisCatsIOClient {

  def apply(underlying: KinesisAsyncClient): KinesisCatsIOClient =
    new KinesisCatsIOClientImpl(underlying)

}

trait KinesisCatsIOClient extends KinesisClient[IO] {

  val underlying: KinesisAsyncClient

<#list methods as method>
    <#if targetMethod(method)>
        <#if method.name?ends_with("Paginator")>
            def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): ${method.returnTypeDesc.simpleTypeName} =
            underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>)
        <#else>
            <#assign responseTypeName=method.returnTypeDesc.valueTypeDesc.simpleTypeName>
            override def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): IO[${responseTypeName}] =
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
    <#if methodDesc.name == "subscribeToShard">
        <#return false>
    </#if>
    <#if !methodDesc.parameterTypeDescs?has_content>
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


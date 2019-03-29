// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.cats

import cats.data.ReaderT
import com.github.j5ik2o.reactive.aws.kinesis.KinesisClient
import com.github.j5ik2o.reactive.aws.kinesis.model._

import scala.concurrent.{ ExecutionContext, Future }

object KinesisReaderTFutureClient {

  def apply(underlying: KinesisClient[Future]): KinesisReaderTFutureClient =
    new KinesisReaderTFutureClientImpl(underlying)

}

trait KinesisReaderTFutureClient extends KinesisClient[ReaderT[Future, ExecutionContext, ?]] {

  val underlying: KinesisClient[Future]

<#list methods as method>
    <#if targetMethod(method)>
        <#assign requestParameterName=method.parameterTypeDescs[0].name>
        <#assign requestTypeName=method.parameterTypeDescs[0].parameterTypeDesc.simpleTypeName>
        <#assign responseTypeName=method.returnTypeDesc.valueTypeDesc.simpleTypeName>
        override def ${method.name}(
        ${requestParameterName}: ${requestTypeName}
        ): ReaderT[Future, ExecutionContext, ${responseTypeName}] =
        ReaderT { implicit ec =>
        underlying.${method.name}(${requestParameterName})
        }

</#if></#list>
}

<#function targetMethod methodDesc>
    <#if methodDesc.static >
        <#return false>
    </#if>
    <#if methodDesc.name == "subscribeToShard">
        <#return false>
    </#if>
    <#if methodDesc.name?ends_with("Paginator")>
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


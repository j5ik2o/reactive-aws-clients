// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.cats

import cats.data.ReaderT
import com.github.j5ik2o.reactive.aws.kinesis.{ KinesisAsyncClient, KinesisClient }
import com.github.j5ik2o.reactive.aws.kinesis.model._
import com.github.j5ik2o.reactive.aws.kinesis.model.rs._

import scala.concurrent.{ ExecutionContext, Future }

object KinesisReaderTFutureClient {

  def apply(underlying: KinesisAsyncClient): KinesisReaderTFutureClient =
    new KinesisReaderTFutureClientImpl(underlying)

}

trait KinesisReaderTFutureClient extends KinesisClient[ReaderT[Future, ExecutionContext, ?]] {

  val underlying: KinesisAsyncClient

<#list methods as method>
    <#if targetMethod(method)>
        <#if method.name?ends_with("Paginator")>
            def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): ${method.returnTypeDesc.simpleTypeName} =
            underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>)
        <#else>
            <#assign requestParameterName=method.parameterTypeDescs[0].name>
            <#assign requestTypeName=method.parameterTypeDescs[0].parameterTypeDesc.simpleTypeName>
            <#assign responseTypeName=method.returnTypeDesc.valueTypeDesc.simpleTypeName>
            override def ${method.name}(
            ${requestParameterName}: ${requestTypeName}
            ): ReaderT[Future, ExecutionContext, ${responseTypeName}] =
            ReaderT { implicit ec =>
            underlying.${method.name}(${requestParameterName})
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


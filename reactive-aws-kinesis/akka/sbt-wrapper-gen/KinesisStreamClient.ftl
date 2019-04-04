// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.akka

import akka.NotUsed
import akka.stream.scaladsl.{Flow, Source}
import com.github.j5ik2o.reactive.aws.kinesis.KinesisAsyncClient
import software.amazon.awssdk.services.kinesis.model._

import scala.concurrent.Future

object KinesisStreamClient {

def apply(underlying: KinesisAsyncClient): KinesisStreamClient = new KinesisStreamClientImpl(underlying)

val DefaultParallelism: Int = 1

}

trait KinesisStreamClient {

import KinesisStreamClient._

val underlying: KinesisAsyncClient

<#list methods as method>
    <#if targetMethod(method)>
        <#if method.name?ends_with("Paginator")>
            <#assign requestName=method.parameterTypeDescs[0].simpleTypeName>
            <#assign responseName=requestName?replace("Request", "Response")>
            def ${method.name?replace("Paginator", "")}Flow: Flow[${requestName},${responseName}, NotUsed] = Flow[${requestName}].flatMapConcat { request =>
            Source.fromPublisher(underlying.${method.name}(request))
            }
        <#else>
            <#assign requestParameterName=method.parameterTypeDescs[0].name>
            <#assign requestTypeName=method.parameterTypeDescs[0].parameterTypeDesc.simpleTypeName>
            <#assign responseTypeName=method.returnTypeDesc.valueTypeDesc.simpleTypeName>
            def ${method.name}Source(${requestParameterName}: ${requestTypeName}, parallelism: Int = DefaultParallelism): Source[${responseTypeName}, NotUsed] =
            Source.single(${requestParameterName}).via(${method.name}Flow(parallelism))

            def ${method.name}Flow(parallelism: Int = DefaultParallelism): Flow[${requestTypeName},${responseTypeName}, NotUsed] =
            Flow[${requestTypeName}].mapAsync(parallelism)(underlying.${method.name})
        </#if>

    </#if></#list>
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


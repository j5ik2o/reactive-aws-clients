// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.akka

import akka.NotUsed
import akka.stream.scaladsl.{Flow, Source}
import com.github.j5ik2o.reactive.aws.kinesis.KinesisAsyncClient
import software.amazon.awssdk.services.kinesis.model._

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
            <#if method.parameterTypeDescs?has_content>
                <#assign requestTypeName=method.parameterTypeDescs[0].parameterTypeDesc.simpleTypeName>
                <#assign responseTypeName=requestTypeName?replace("Request", "Response")>
                def ${method.name}Flow: Flow[${requestTypeName},${responseTypeName}, NotUsed] = Flow[${requestTypeName}].flatMapConcat { request =>
                Source.fromPublisher(underlying.${method.name}(request))
                }
            <#else>
                <#assign responseTypeName=method.returnTypeDesc.simpleTypeName?replace("Publisher", "Response")>
                def ${method.name}Source: Source[${responseTypeName}, NotUsed] =
                Source.fromPublisher(underlying.${method.name}())
            </#if>
        <#else>
            <#assign responseTypeName=method.returnTypeDesc.valueTypeDesc.simpleTypeName>
            <#if method.parameterTypeDescs?has_content>
                def ${method.name}Source(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list><#if method.parameterTypeDescs?has_content>,</#if> parallelism: Int = DefaultParallelism): Source[${responseTypeName}, NotUsed] =
                Source.single(<#if method.parameterTypeDescs?size == 1>${method.parameterTypeDescs[0].name}<#else>(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>)</#if>).via(${method.name}Flow(parallelism))

                def ${method.name}Flow(parallelism: Int = DefaultParallelism): Flow[<#if method.parameterTypeDescs?size == 1>${method.parameterTypeDescs[0].fullTypeName}<#else>(<#list method.parameterTypeDescs as p>${p.fullTypeName}<#if p_has_next>,</#if></#list>)</#if>,${responseTypeName}, NotUsed] =
                Flow[<#if method.parameterTypeDescs?size == 1>${method.parameterTypeDescs[0].fullTypeName}<#else>(<#list method.parameterTypeDescs as p>${p.fullTypeName}<#if p_has_next>,</#if></#list>)</#if>].mapAsync(parallelism){ <#if method.parameterTypeDescs?size == 1>${method.parameterTypeDescs[0].name}<#else>case (<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>)</#if> =>
                underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>)
                }
            <#else>
                def ${method.name}Source(): Source[${responseTypeName}, NotUsed] =
                Source.fromFuture(underlying.${method.name}())
            </#if>
        </#if>

    </#if></#list>
}

<#function targetMethod methodDesc>
    <#if methodDesc.static >
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


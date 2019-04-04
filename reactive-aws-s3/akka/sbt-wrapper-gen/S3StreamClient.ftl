// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.akka

import akka.NotUsed
import akka.stream.scaladsl.{Flow, Source}
import com.github.j5ik2o.reactive.aws.s3.S3AsyncClient
import software.amazon.awssdk.services.s3.model._

object S3StreamClient {

def apply(underlying: S3AsyncClient): S3StreamClient = new S3StreamClientImpl(underlying)

val DefaultParallelism: Int = 1

}

trait S3StreamClient extends S3StreamClientSupport {

import S3StreamClient._

val underlying: S3AsyncClient

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
    <#if methodDesc.name == "getObject" || methodDesc.name == "getObjectAsBytes"  || methodDesc.name == "getObjectTorrent" || methodDesc.name == "getObjectTorrentAsBytes"> <#return false>
    </#if>
    <#if !methodDesc.parameterTypeDescs?has_content>
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


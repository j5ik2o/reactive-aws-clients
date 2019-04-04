// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.akka

import akka.NotUsed
import akka.stream.scaladsl.{Flow, Source}
import com.github.j5ik2o.reactive.aws.dynamodb.DynamoDBAsyncClient
import software.amazon.awssdk.services.dynamodb.model._

import scala.concurrent.Future

object DynamoDBStreamClient {

def apply(underlying: DynamoDBAsyncClient): DynamoDBStreamClient = new DynamoDBStreamClientImpl(underlying)

val DefaultParallelism: Int = 1

}

trait DynamoDBStreamClient extends DynamoDBStreamClientSupport {

import DynamoDBStreamClient._

val underlying: DynamoDBAsyncClient

<#list methods as method>
    <#if targetMethod(method)>
        <#assign requestParameterName=method.parameterTypeDescs[0].name>
        <#assign requestTypeName=method.parameterTypeDescs[0].parameterTypeDesc.simpleTypeName>
        <#if method.name?ends_with("Paginator")>
            <#assign responseTypeName=requestTypeName?replace("Request", "Response")>
            def ${method.name?replace("Paginator", "")}Flow: Flow[${requestTypeName},${responseTypeName}, NotUsed] = Flow[${requestTypeName}].flatMapConcat { request =>
            Source.fromPublisher(underlying.${method.name}(request))
            }
        <#else>
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
<#--<#if methodDesc.name?ends_with("Paginator")>-->
<#--<#return false>-->
<#--</#if>-->
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


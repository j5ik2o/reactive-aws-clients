// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.cats

import cats.data.ReaderT
import com.github.j5ik2o.reactive.aws.dynamodb.{DynamoDBAsyncClient, DynamoDBClient}
import software.amazon.awssdk.services.dynamodb.model._
import software.amazon.awssdk.services.dynamodb.paginators._


import scala.concurrent.{ ExecutionContext, Future }

object DynamoDBReaderTFutureClient {

def apply(underlying: DynamoDBAsyncClient): DynamoDBReaderTFutureClient =
new DynamoDBReaderTFutureClientImpl(underlying)

}

trait DynamoDBReaderTFutureClient extends DynamoDBClient[ReaderT[Future, ExecutionContext, ?]] {

val underlying: DynamoDBAsyncClient

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

    </#if></#list>
}

<#function targetMethod methodDesc>
    <#if methodDesc.static >
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


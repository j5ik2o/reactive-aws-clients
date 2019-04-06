// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb

import software.amazon.awssdk.services.dynamodb.model._
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient
import software.amazon.awssdk.services.dynamodb.paginators._

import scala.compat.java8.FutureConverters._
import scala.concurrent.Future

object DynamoDBAsyncClient {

def apply(underlying: DynamoDbAsyncClient): DynamoDBAsyncClient =
new DynamoDBAsyncClientImpl(underlying)

}

trait DynamoDBAsyncClient extends DynamoDBClient[Future] {
val underlying: DynamoDbAsyncClient

<#list methods as method>
    <#if targetMethod(method)>
        <#if !method.name?ends_with("Paginator")>override</#if> def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): <#if method.name?ends_with("Paginator")>${method.returnTypeDesc.simpleTypeName}<#else>Future[${method.returnTypeDesc.valueTypeDesc.simpleTypeName}]</#if> =
        <#if method.name?ends_with("Paginator")>
            underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>)
        <#else>
            underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>).toScala
        </#if>

    </#if>
</#list>
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

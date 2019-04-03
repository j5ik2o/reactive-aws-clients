// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.monix

import software.amazon.awssdk.services.dynamodb.model._
import com.github.j5ik2o.reactive.aws.dynamodb.{ DynamoDBAsyncClient, DynamoDBClient }
import monix.eval.Task
import monix.reactive.Observable

object DynamoDBMonixClient {

def apply(underlying: DynamoDBAsyncClient): DynamoDBMonixClient = new DynamoDBMonixClientImpl(underlying)

}

trait DynamoDBMonixClient extends DynamoDBClient[Task] {

val underlying: DynamoDBAsyncClient

<#list methods as method>
    <#if targetMethod(method)>
        <#assign requestParameterName=method.parameterTypeDescs[0].name>
        <#assign requestTypeName=method.parameterTypeDescs[0].parameterTypeDesc.simpleTypeName>
        <#if method.name?ends_with("Paginator")>
            <#assign responseTypeName=requestTypeName?replace("Request", "Response")>
            def ${method.name}(<#list method.parameterTypeDescs as p>${requestParameterName}: ${requestTypeName}<#if p_has_next>,</#if></#list>): Observable[${responseTypeName}] =
            Observable.fromReactivePublisher(underlying.${method.name}(${requestParameterName}))
        <#else>
            <#assign responseTypeName=method.returnTypeDesc.valueTypeDesc.simpleTypeName>
            override def  ${method.name}(
            ${requestParameterName}: ${requestTypeName},
            ): Task[${responseTypeName}] = Task.deferFuture {
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


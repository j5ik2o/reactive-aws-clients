// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.cats

import cats.effect.IO
import com.github.j5ik2o.reactive.aws.dynamodb.{DynamoDBAsyncClient, DynamoDBClient}
import software.amazon.awssdk.services.dynamodb.model._
import software.amazon.awssdk.services.dynamodb.paginators._

object DynamoDBCatsIOClient {

def apply(underlying: DynamoDBAsyncClient): DynamoDBCatsIOClient =
new DynamoDBCatsIOClientImpl(underlying)

}

trait DynamoDBCatsIOClient extends DynamoDBClient[IO] {

val underlying: DynamoDBAsyncClient

<#list methods as method>
    <#if targetMethod(method)>
        <#if method.name?ends_with("Paginator")>
            def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): ${method.returnTypeDesc.simpleTypeName} =
              underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>)
        <#else>
            <#assign responseTypeName=method.returnTypeDesc.valueTypeDesc.simpleTypeName>
            override def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): IO[${responseTypeName}] =
            IO.fromFuture {
              IO(underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>))
            }
        </#if>

    </#if></#list>
}

<#function targetMethod methodDesc>
    <#if methodDesc.static >
        <#return false>
    </#if>
    <#--<#if !methodDesc.parameterTypeDescs?has_content>-->
        <#--<#return false>-->
    <#--</#if>-->
    <#local target=true>
    <#list methodDesc.parameterTypeDescs as p>
        <#if p.parameterTypeDesc.fullTypeName == "Consumer[Builder]">
            <#local target = false>
            <#break >
        </#if>
    </#list>
    <#return target>
</#function>


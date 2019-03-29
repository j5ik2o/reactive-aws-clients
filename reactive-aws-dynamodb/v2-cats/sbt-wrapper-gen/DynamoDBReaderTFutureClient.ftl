// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.cats

import com.github.j5ik2o.reactive.aws.dynamodb.cats.{DynamoDBReaderTFutureClient => BaseDynamoDBReaderTFutureClient}
import com.github.j5ik2o.reactive.aws.dynamodb.model._
import com.github.j5ik2o.reactive.aws.dynamodb.model.rs._
import com.github.j5ik2o.reactive.aws.dynamodb.v2.DynamoDBAsyncClient

object DynamoDBReaderTFutureClient {

def apply(underlying: DynamoDBAsyncClient): DynamoDBReaderTFutureClient =
  new DynamoDBReaderTFutureClientImpl(underlying)

}

trait DynamoDBReaderTFutureClient extends BaseDynamoDBReaderTFutureClient {

  val underlying: DynamoDBAsyncClient

<#list methods as method><#if targetMethod(method)>    def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): ${method.returnTypeDesc.simpleTypeName} =
        underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>)

</#if></#list>
}

<#function targetMethod methodDesc>
    <#if methodDesc.static >
        <#return false>
    </#if>
    <#if !methodDesc.name?ends_with("Paginator")>
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


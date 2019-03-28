// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.akka

import akka.NotUsed
import akka.stream.scaladsl.Flow
import com.github.j5ik2o.reactive.aws.dynamodb.akka
import com.github.j5ik2o.reactive.aws.dynamodb.model._
import com.github.j5ik2o.reactive.aws.dynamodb.v2.DynamoDBAsyncClient

object DynamoDBStreamClient {

  def apply(underlying: DynamoDBAsyncClient): DynamoDBStreamClient = new DynamoDBStreamClientImpl(underlying)

}

trait DynamoDBStreamClient extends akka.DynamoDBStreamClient with DynamoDBStreamClientSupport {

<#list methods as method>
    <#if targetMethod(method)>
        <#assign requestName=method.parameterTypeDescs[0].simpleTypeName>
        <#assign responseName=requestName?replace("Request", "Response")>
        def ${method.name?replace("Paginator", "")}Flow: Flow[${requestName},${responseName}, NotUsed]

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


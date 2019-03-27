// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.akka

import akka.NotUsed
import akka.stream.scaladsl.Flow
import com.github.j5ik2o.reactive.aws.dynamodb.DynamoDBClient
import com.github.j5ik2o.reactive.aws.dynamodb.model._

import scala.concurrent.Future

object DynamoDBStreamClient {

def apply(underlying: DynamoDBClient[Future]): DynamoDBStreamClient = new DynamoDBStreamClientImpl(underlying)

}

trait DynamoDBStreamClient {

val underlying: DynamoDBClient[Future]

<#list methods as method>
    <#if targetMethod(method)>
        <#assign requestName=method.parameterTypeDescs[0].simpleTypeName>
        <#assign responseName=requestName?replace("Request", "Response")>
        def ${method.name}Flow(parallelism: Int = 1): Flow[${requestName},${responseName}, NotUsed] =
        Flow[${requestName}].mapAsync(parallelism) { request =>
        underlying.${method.name}(request)
        }

</#if></#list>
}

<#function targetMethod methodDesc>
    <#if methodDesc.static >
        <#return false>
    </#if>
    <#if methodDesc.name?ends_with("Paginator")>
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


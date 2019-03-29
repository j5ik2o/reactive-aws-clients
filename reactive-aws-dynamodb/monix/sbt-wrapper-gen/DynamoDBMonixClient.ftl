// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.monix

import com.github.j5ik2o.reactive.aws.dynamodb.DynamoDBClient
import com.github.j5ik2o.reactive.aws.dynamodb.model._
import monix.eval.Task

import scala.concurrent.Future

object DynamoDBMonixClient {

  def apply(underlying: DynamoDBClient[Future]): DynamoDBMonixClient = new DynamoDBMonixClientImpl(underlying)

}

trait DynamoDBMonixClient extends DynamoDBClient[Task] {

  val underlying: DynamoDBClient[Future]

<#list methods as method>
    <#if targetMethod(method)>
        <#assign requestParameterName=method.parameterTypeDescs[0].name>
        <#assign requestTypeName=method.parameterTypeDescs[0].parameterTypeDesc.simpleTypeName>
        <#assign responseTypeName=method.returnTypeDesc.valueTypeDesc.simpleTypeName>
        override def  ${method.name}(
        ${requestParameterName}: ${requestTypeName},
        ): Task[${responseTypeName}] = Task.deferFuture {
        underlying.${method.name}(${requestParameterName})
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


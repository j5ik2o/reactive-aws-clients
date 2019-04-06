// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.streams

import software.amazon.awssdk.services.dynamodb.model._
import software.amazon.awssdk.services.dynamodb.streams.DynamoDbStreamsClient
import software.amazon.awssdk.services.dynamodb.streams.paginators._

object DynamoDBStreamsSyncClient {

  def apply(underlying: DynamoDbStreamsClient): DynamoDBStreamsSyncClient = new DynamoDBStreamsSyncClientImpl(underlying)

}

trait DynamoDBStreamsSyncClient extends DynamoDBStreamsClient[Either[Throwable, ?]] {
  val underlying: DynamoDbStreamsClient

  private def toEither[A](f: => A): Either[Throwable, A] = {
    try {
      Right(f)
    } catch {
      case t: Throwable =>
        Left(t)
    }
  }

<#list methods as method><#if targetMethod(method)>    <#if !method.name?ends_with("Paginator")>override</#if> def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): <#if method.name?ends_with("Paginator")>${method.returnTypeDesc.simpleTypeName}<#else>Either[Throwable, ${method.returnTypeDesc.simpleTypeName}]</#if> = {
    <#if method.name?ends_with("Paginator")>
        underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>)
    <#else>
        toEither(underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>))
    </#if>
    }

</#if></#list>
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

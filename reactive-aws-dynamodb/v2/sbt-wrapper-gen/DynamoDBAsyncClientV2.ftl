package com.github.j5ik2o.reactive.aws.dynamodb

import java.util.concurrent.CompletableFuture

import com.github.j5ik2o.reactive.aws.dynamodb.model._
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient

import scala.compat.java8.FutureConverters
import scala.concurrent.{ ExecutionContext, Future }

<#function targetMethod methodDesc>
    <#if methodDesc.static >
        <#return false>
    </#if>
    <#if !methodDesc.name?ends_with("Paginator")>
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
object DynamoDBAsyncClientV2 {

  def apply(underlying: DynamoDbAsyncClient)(implicit ec: ExecutionContext): DynamoDBAsyncClientV2 =
    new DynamoDBAsyncClientV2Impl(underlying)

  implicit class CompletableFutureOps[A](val cf: CompletableFuture[A]) extends AnyVal {
    def toFuture: Future[A] = FutureConverters.toScala(cf)
  }

}

trait DynamoDBAsyncClientV2 extends DynamoDBClient[Future] {
  val underlying: DynamoDbAsyncClient

<#list methods as method><#if targetMethod(method)>    def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): rs.${method.returnTypeDesc.simpleTypeName}

</#if></#list>
}


// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2

import java.util.concurrent.CompletableFuture

import com.github.j5ik2o.reactive.aws.kinesis.KinesisClient
import com.github.j5ik2o.reactive.aws.kinesis.model._
import com.github.j5ik2o.reactive.aws.kinesis.model.rs._
import software.amazon.awssdk.services.kinesis.{ KinesisAsyncClient => JavaKinesisAsyncClient }

import scala.compat.java8.FutureConverters
import scala.concurrent.{ ExecutionContext, Future }

object KinesisAsyncClient {

def apply(underlying: JavaKinesisAsyncClient)(implicit ec: ExecutionContext): KinesisAsyncClient =
new KinesisAsyncClientImpl(underlying)

implicit class CompletableFutureOps[A](val cf: CompletableFuture[A]) extends AnyVal {
def toFuture: Future[A] = FutureConverters.toScala(cf)
}

}

trait KinesisAsyncClient extends KinesisClient[Future] {

val underlying: JavaKinesisAsyncClient

<#list methods as method><#if targetMethod(method)>    def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): ${method.returnTypeDesc.simpleTypeName}

</#if></#list>

}

<#function targetMethod methodDesc>
  <#if methodDesc.static >
    <#return false>
  </#if>
  <#if !methodDesc.name?ends_with("Paginator")>
    <#return false>
  </#if>
  <#local target=true>
  <#list methodDesc.parameterTypeDescs as p>
    <#if p.name?ends_with("Handler")>
      <#local target = false>
      <#break >
    </#if>
    <#if p.parameterTypeDesc.fullTypeName == "Consumer[Builder]">
      <#local target = false>
      <#break >
    </#if>
  </#list>
  <#return target>
</#function>

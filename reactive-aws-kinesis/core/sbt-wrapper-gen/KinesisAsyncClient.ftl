// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis

import java.util.concurrent.CompletableFuture

import com.github.j5ik2o.reactive.aws.kinesis.model._
import com.github.j5ik2o.reactive.aws.kinesis.model.ops._
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

implicit val ec: ExecutionContext

val underlying: JavaKinesisAsyncClient

import KinesisAsyncClient._

<#list methods as method><#if targetMethod(method)>      <#if !method.name?ends_with("Paginator")>override</#if> def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): <#if method.name?ends_with("Paginator")>${method.returnTypeDesc.simpleTypeName}<#else>Future[${method.returnTypeDesc.valueTypeDesc.simpleTypeName}]</#if> = {
  <#if method.name?ends_with("Paginator")>
    <#if method.parameterTypeDescs?has_content>import <#list method.parameterTypeDescs as p>${p.parameterTypeDesc.fullTypeName}Ops._<#if p_has_next>,</#if></#list></#if>
    new ${method.returnTypeDesc.simpleTypeName}Impl(underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}.toJava<#if p_has_next>,</#if></#list>))
  <#else>
    <#if method.parameterTypeDescs?has_content>import <#list method.parameterTypeDescs as p>${p.parameterTypeDesc.fullTypeName}Ops._<#if p_has_next>,</#if></#list></#if>
    <#if method.returnTypeDesc.valueTypeDesc.simpleTypeName == "Unit">
      underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}.toJava<#if p_has_next>,</#if></#list>).toFuture.map(_ => ())
    <#else>
      import ${method.returnTypeDesc.valueTypeDesc.simpleTypeName}Ops._
      underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}.toJava<#if p_has_next>,</#if></#list>).toFuture.map(_.toScala)
    </#if>
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

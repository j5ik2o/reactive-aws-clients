// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis

import software.amazon.awssdk.services.kinesis.model._
import software.amazon.awssdk.services.kinesis.paginators._
import software.amazon.awssdk.services.kinesis.{ KinesisAsyncClient => JavaKinesisAsyncClient }

import scala.compat.java8.FutureConverters._
import scala.concurrent.Future

object KinesisAsyncClient {

def apply(underlying: JavaKinesisAsyncClient): KinesisAsyncClient =
new KinesisAsyncClientImpl(underlying)

}

trait KinesisAsyncClient extends KinesisClient[Future] {

val underlying: JavaKinesisAsyncClient

import KinesisAsyncClient._

<#list methods as method><#if targetMethod(method)>
    <#if !method.name?ends_with("Paginator") && method.returnTypeDesc.valueTypeDesc.simpleTypeName == "Unit">
        @SuppressWarnings(Array("org.wartremover.warts.Equals"))
    </#if>
    <#if !method.name?ends_with("Paginator") && method.name != "subscribeToShard">override</#if> def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): <#if method.name?ends_with("Paginator")>${method.returnTypeDesc.simpleTypeName}<#else>Future[${method.returnTypeDesc.valueTypeDesc.simpleTypeName}]</#if> = {
    <#if method.name?ends_with("Paginator")>
        underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>)
    <#else>
        <#if method.returnTypeDesc.valueTypeDesc.simpleTypeName == "Unit">
            val p = scala.concurrent.Promise[Unit]()
            underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>).whenCompleteAsync(
            new java.util.function.BiConsumer[Void, Throwable] {
            override def accept(t: Void, u: Throwable): Unit = {
            if (u != null)
            p.failure(u)
            else
            p.success(())
            }
            }
            )
            p.future
        <#else>
            underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>).toScala
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
        <#if p.parameterTypeDesc.fullTypeName == "Consumer[Builder]">
            <#local target = false>
            <#break >
        </#if>
    </#list>
    <#return target>
</#function>

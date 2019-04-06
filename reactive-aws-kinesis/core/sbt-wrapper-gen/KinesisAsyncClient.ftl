<#include "common.ftl"/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}

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

<#list methods as method>
    <#if targetMethod(method)>
        <@defScalaFutureMethod method method.name!="subscribeToShard"/>

    </#if>
</#list>

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

// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.akka

import akka.NotUsed
import akka.stream.scaladsl.{Flow, Source}
import com.github.j5ik2o.reactive.aws.kinesis.KinesisClient
import com.github.j5ik2o.reactive.aws.kinesis.model._

import scala.concurrent.Future

object KinesisStreamClient {

def apply(underlying: KinesisClient[Future]): KinesisStreamClient = new KinesisStreamClientImpl(underlying)

val DefaultParallelism: Int = 1

}

trait KinesisStreamClient {

  import KinesisStreamClient._

val underlying: KinesisClient[Future]

<#list methods as method>
    <#if targetMethod(method)>
        <#assign requestParameterName=method.parameterTypeDescs[0].name>
        <#assign requestTypeName=method.parameterTypeDescs[0].parameterTypeDesc.simpleTypeName>
        <#assign responseTypeName=method.returnTypeDesc.valueTypeDesc.simpleTypeName>
        def ${method.name}Source(${requestParameterName}: ${requestTypeName}, parallelism: Int = DefaultParallelism): Source[${responseTypeName}, NotUsed] =
          Source.single(${requestParameterName}).via(${method.name}Flow(parallelism))

        def ${method.name}Flow(parallelism: Int = DefaultParallelism): Flow[${requestTypeName},${responseTypeName}, NotUsed] =
          Flow[${requestTypeName}].mapAsync(parallelism)(underlying.${method.name})

</#if></#list>
}

<#function targetMethod methodDesc>
    <#if methodDesc.static >
        <#return false>
    </#if>
    <#if methodDesc.name == "subscribeToShard">
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


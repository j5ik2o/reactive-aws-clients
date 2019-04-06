<#include "common.ftl"/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}.akka

import akka.NotUsed
import akka.stream.scaladsl.{Flow, Source}
import com.github.j5ik2o.reactive.aws.kinesis.KinesisAsyncClient
import software.amazon.awssdk.services.kinesis.model._

object KinesisStreamClient {

def apply(underlying: KinesisAsyncClient): KinesisStreamClient = new KinesisStreamClientImpl(underlying)

val DefaultParallelism: Int = 1

}

trait KinesisStreamClient {

import KinesisStreamClient._

val underlying: KinesisAsyncClient

<#list methods as method>
    <#if targetMethod(method)>
        <@defAkkaMethod method/>

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


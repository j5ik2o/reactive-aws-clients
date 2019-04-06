<#include "common.ftl"/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}.akka

import akka.NotUsed
import akka.stream.scaladsl.{Flow, Source}
import com.github.j5ik2o.reactive.aws.sqs.SQSAsyncClient
import software.amazon.awssdk.services.sqs.model._

object SQSStreamClient {

def apply(underlying: SQSAsyncClient): SQSStreamClient = new SQSStreamClientImpl(underlying)

val DefaultParallelism: Int = 1

}

trait SQSStreamClient extends SQSStreamClientSupport {

import SQSStreamClient._

val underlying: SQSAsyncClient

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


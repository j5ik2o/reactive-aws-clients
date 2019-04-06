<#include "common.ftl"/>
<#assign baseName=simpleTypeName?replace("AsyncClient", "")/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}.akka

import akka.NotUsed
import akka.stream.scaladsl.{Flow, Source}
import com.github.j5ik2o.reactive.aws.kinesis.KinesisAsyncClient
import software.amazon.awssdk.services.kinesis.model._

object ${baseName}AkkaClient {

def apply(underlying: ${baseName}AsyncClient): ${baseName}AkkaClient = new ${baseName}AkkaClientImpl(underlying)

val DefaultParallelism: Int = 1

}

trait ${baseName}AkkaClient {

import ${baseName}AkkaClient._

val underlying: ${baseName}AsyncClient

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


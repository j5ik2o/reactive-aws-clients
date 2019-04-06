<#include "common.ftl"/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}.monix

import software.amazon.awssdk.services.kinesis.model._
import com.github.j5ik2o.reactive.aws.kinesis.{ KinesisAsyncClient, KinesisClient }
import monix.eval.Task
import monix.reactive.Observable

object KinesisMonixClient {

def apply(underlying: KinesisAsyncClient): KinesisMonixClient = new KinesisMonixClientImpl(underlying)

}

trait KinesisMonixClient extends KinesisClient[Task] {

val underlying: KinesisAsyncClient

<#list methods as method>
    <#if targetMethod(method)>
        <@defMonixMethod method/>

    </#if>
</#list>
}

<#function targetMethod methodDesc>
    <#if methodDesc.static >
        <#return false>
    </#if>
    <#if methodDesc.name == "subscribeToShard">
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


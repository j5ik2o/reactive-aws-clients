<#include "common.ftl"/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}.monix

import software.amazon.awssdk.services.sqs.model._
import com.github.j5ik2o.reactive.aws.sqs.{ SQSAsyncClient, SQSClient }
import monix.eval.Task
import monix.reactive.Observable

object SQSMonixClient {

def apply(underlying: SQSAsyncClient): SQSMonixClient = new SQSMonixClientImpl(underlying)

}

trait SQSMonixClient extends SQSClient[Task] {

val underlying: SQSAsyncClient

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
    <#if methodDesc.parameterTypeDescs?size gte 2>
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

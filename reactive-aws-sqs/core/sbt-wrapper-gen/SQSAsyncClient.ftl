<#include "common.ftl"/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}

import software.amazon.awssdk.services.sqs.model._
import software.amazon.awssdk.services.sqs.{ SqsAsyncClient => JavaSqsAsyncClient }

import scala.compat.java8.FutureConverters._
import scala.concurrent.Future

object SQSAsyncClient {

def apply(underlying: JavaSqsAsyncClient): SQSAsyncClient =
new SQSAsyncClientImpl(underlying)

}

trait SQSAsyncClient extends SQSClient[Future] {
val underlying: JavaSqsAsyncClient

<#list methods as method>
    <#if targetAsyncMethod(method)>
        <@defScalaFutureMethod method/>

    </#if>
</#list>
}

<#function targetAsyncMethod methodDesc>
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

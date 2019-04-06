<#include "common.ftl"/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}

import software.amazon.awssdk.services.dynamodb.model._
import software.amazon.awssdk.services.dynamodb.streams.DynamoDbStreamsAsyncClient
import software.amazon.awssdk.services.dynamodb.streams.paginators._

import scala.compat.java8.FutureConverters._
import scala.concurrent.Future

object DynamoDBStreamsAsyncClient {

def apply(underlying: DynamoDbStreamsAsyncClient): DynamoDBStreamsAsyncClient =
new DynamoDBStreamsAsyncClientImpl(underlying)

}

trait DynamoDBStreamsAsyncClient extends DynamoDBStreamsClient[Future] {
val underlying: DynamoDbStreamsAsyncClient

<#list methods as method>
    <#if targetMethod(method)>
        <@defScalaFutureMethod method/>

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

<#include "common.ftl"/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}

import software.amazon.awssdk.services.dynamodb.model._
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient
import software.amazon.awssdk.services.dynamodb.paginators._

import scala.compat.java8.FutureConverters._
import scala.concurrent.Future

object DynamoDBAsyncClient {

def apply(underlying: DynamoDbAsyncClient): DynamoDBAsyncClient =
new DynamoDBAsyncClientImpl(underlying)

}

trait DynamoDBAsyncClient extends DynamoDBClient[Future] {
val underlying: DynamoDbAsyncClient

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

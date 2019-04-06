<#include "common.ftl"/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}.akka

import akka.NotUsed
import akka.stream.scaladsl.{Flow, Source}
import com.github.j5ik2o.reactive.aws.dynamodb.DynamoDBAsyncClient
import software.amazon.awssdk.services.dynamodb.model._

import scala.concurrent.Future

object DynamoDBStreamClient {

def apply(underlying: DynamoDBAsyncClient): DynamoDBStreamClient = new DynamoDBStreamClientImpl(underlying)

val DefaultParallelism: Int = 1

}

trait DynamoDBStreamClient {

import DynamoDBStreamClient._

val underlying: DynamoDBAsyncClient

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


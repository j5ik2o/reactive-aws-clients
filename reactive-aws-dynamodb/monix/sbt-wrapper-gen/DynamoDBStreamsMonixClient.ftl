<#include "common.ftl"/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}.monix

import com.github.j5ik2o.reactive.aws.dynamodb.streams.{DynamoDBStreamsAsyncClient, DynamoDBStreamsClient}
import monix.eval.Task
import monix.reactive.Observable
import software.amazon.awssdk.services.dynamodb.model._

object DynamoDBStreamsMonixClient {

def apply(underlying: DynamoDBStreamsAsyncClient): DynamoDBStreamsMonixClient = new DynamoDBStreamsMonixClientImpl(underlying)

}

trait DynamoDBStreamsMonixClient extends DynamoDBStreamsClient[Task] {

val underlying: DynamoDBStreamsAsyncClient

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
    <#local target=true>
    <#list methodDesc.parameterTypeDescs as p>
        <#if p.parameterTypeDesc.fullTypeName == "Consumer[Builder]">
            <#local target = false>
            <#break >
        </#if>
    </#list>
    <#return target>
</#function>


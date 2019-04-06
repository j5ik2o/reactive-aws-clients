<#include "common.ftl"/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}.monix

import software.amazon.awssdk.services.dynamodb.model._
import com.github.j5ik2o.reactive.aws.dynamodb.{ DynamoDBAsyncClient, DynamoDBClient }
import monix.eval.Task
import monix.reactive.Observable

object DynamoDBMonixClient {

def apply(underlying: DynamoDBAsyncClient): DynamoDBMonixClient = new DynamoDBMonixClientImpl(underlying)

}

trait DynamoDBMonixClient extends DynamoDBClient[Task] {

val underlying: DynamoDBAsyncClient

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


<#include "common.ftl"/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}

import com.github.j5ik2o.reactive.aws.utils.ToEitherSupport
import software.amazon.awssdk.services.dynamodb.model._
import software.amazon.awssdk.services.dynamodb.streams.DynamoDbStreamsClient
import software.amazon.awssdk.services.dynamodb.streams.paginators._

object DynamoDBStreamsSyncClient extends ToEitherSupport {

def apply(underlying: DynamoDbStreamsClient): DynamoDBStreamsSyncClient = new DynamoDBStreamsSyncClientImpl(underlying)

}

trait DynamoDBStreamsSyncClient extends DynamoDBStreamsClient[Either[Throwable, ?]] {
val underlying: DynamoDbStreamsClient
import DynamoDBStreamsSyncClient._

<#list methods as method>
    <#if targetMethod(method)>
        <@defScalaEitherMethod method/>

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

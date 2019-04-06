<#include "common.ftl"/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}

import com.github.j5ik2o.reactive.aws.utils.ToEitherSupport
import software.amazon.awssdk.services.dynamodb.model._
import software.amazon.awssdk.services.dynamodb.DynamoDbClient
import software.amazon.awssdk.services.dynamodb.paginators._

object DynamoDBSyncClient extends ToEitherSupport {

def apply(underlying: DynamoDbClient): DynamoDBSyncClient = new DynamoDBSyncClientImpl(underlying)

}

trait DynamoDBSyncClient extends DynamoDBClient[Either[Throwable, ?]] {
val underlying: DynamoDbClient
import DynamoDBSyncClient._

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

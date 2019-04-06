<#include "common.ftl"/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}.cats

import cats.effect.IO
import com.github.j5ik2o.reactive.aws.dynamodb.{DynamoDBAsyncClient, DynamoDBClient}
import software.amazon.awssdk.services.dynamodb.model._
import software.amazon.awssdk.services.dynamodb.paginators._

object DynamoDBCatsIOClient {

def apply(underlying: DynamoDBAsyncClient): DynamoDBCatsIOClient =
new DynamoDBCatsIOClientImpl(underlying)

}

trait DynamoDBCatsIOClient extends DynamoDBClient[IO] {

val underlying: DynamoDBAsyncClient

<#list methods as method>
    <#if targetMethod(method)>
        <@defCatsMethod method />

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


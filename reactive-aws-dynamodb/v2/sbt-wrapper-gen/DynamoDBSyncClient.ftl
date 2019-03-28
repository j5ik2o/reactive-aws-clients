// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2

import com.github.j5ik2o.reactive.aws.dynamodb.DynamoDBClient
import com.github.j5ik2o.reactive.aws.dynamodb.model._
import software.amazon.awssdk.services.dynamodb.DynamoDbClient

object DynamoDBSyncClient {

  def apply(underlying: DynamoDbClient): DynamoDBSyncClient = new DynamoDBSyncClientImpl(underlying)

}

trait DynamoDBSyncClient extends DynamoDBClient[Either[Throwable, ?]] {
  val underlying: DynamoDbClient

<#list methods as method><#if targetMethod(method)>    def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): rs.${method.returnTypeDesc.simpleTypeName}

</#if></#list>
}

<#function targetMethod methodDesc>
    <#if methodDesc.static >
        <#return false>
    </#if>
    <#if !methodDesc.name?ends_with("Paginator")>
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

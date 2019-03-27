// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb
<#function targetMethod methodDesc>
    <#if methodDesc.static >
        <#return false>
    </#if>
    <#if methodDesc.name?ends_with("Paginator")>
        <#return false>
    </#if>
    <#if (methodDesc.name == "describeEndpoints" || methodDesc.name == "describeLimits" || methodDesc.name == "listBackups" || methodDesc.name == "listGlobalTables") &&
        !methodDesc.parameterTypeDescs?has_content>
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

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
import com.github.j5ik2o.reactive.aws.dynamodb.model._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v1._


import scala.concurrent.{ ExecutionContext, Future }

private[dynamodb] class DynamoDBAsyncClientV1Impl(override val underlying: AmazonDynamoDBAsync)(
  implicit ec: ExecutionContext
) extends DynamoDBAsyncClientV1 {
  import DynamoDBAsyncClientV1._

<#list methods as method><#if targetMethod(method)>    override def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): <#if method.name?ends_with("Paginator")>${method.returnTypeDesc.simpleTypeName}<#else>Future[${method.returnTypeDesc.valueTypeDesc.simpleTypeName}]</#if> = {
        <#if method.parameterTypeDescs?has_content>import <#list method.parameterTypeDescs as p>${p.parameterTypeDesc.fullTypeName}Ops._<#if p_has_next>,</#if></#list></#if>
        import ${method.returnTypeDesc.valueTypeDesc.simpleTypeName}Ops._
        underlying.${method.name}Async(<#list method.parameterTypeDescs as p>${p.name}.toJava<#if p_has_next>,</#if></#list>).toFuture.map(_.toScala)
    }

</#if></#list>
}

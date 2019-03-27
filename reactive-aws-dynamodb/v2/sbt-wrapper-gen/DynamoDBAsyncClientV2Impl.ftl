// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb
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

import com.github.j5ik2o.reactive.aws.dynamodb.model._
import com.github.j5ik2o.reactive.aws.dynamodb.model.rs._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.rs._
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient

import scala.concurrent.{ ExecutionContext, Future }

private[dynamodb] class DynamoDBAsyncClientV2Impl(override val underlying: DynamoDbAsyncClient)(
implicit execution: ExecutionContext
) extends DynamoDBAsyncClientV2 {
import DynamoDBAsyncClientV2._

<#list methods as method><#if targetMethod(method)>    override def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): <#if method.name?ends_with("Paginator")>${method.returnTypeDesc.simpleTypeName}<#else>Future[${method.returnTypeDesc.valueTypeDesc.simpleTypeName}]</#if> = {
    <#if method.name?ends_with("Paginator")>
        <#if method.parameterTypeDescs?has_content>import <#list method.parameterTypeDescs as p>${p.parameterTypeDesc.fullTypeName}Ops._<#if p_has_next>,</#if></#list></#if>
        new ${method.returnTypeDesc.simpleTypeName}Impl(underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}.toJava<#if p_has_next>,</#if></#list>))
    <#else>
        <#if method.parameterTypeDescs?has_content>import <#list method.parameterTypeDescs as p>${p.parameterTypeDesc.fullTypeName}Ops._<#if p_has_next>,</#if></#list></#if>
        import ${method.returnTypeDesc.valueTypeDesc.simpleTypeName}Ops._
        underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}.toJava<#if p_has_next>,</#if></#list>).toFuture.map(_.toScala)
    </#if>
}

</#if></#list>

}

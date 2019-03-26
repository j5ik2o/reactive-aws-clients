package com.github.j5ik2o.reactive.aws.dynamodb
<#include "macro-imports.ftl">
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
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.rs._
import software.amazon.awssdk.services.dynamodb.DynamoDbClient

class DynamoDBSyncClientV2Impl(override val underlying: DynamoDbClient) extends DynamoDBSyncClientV2 {
<@opsImports />

private def toEither[A](f: => A): Either[Throwable, A] = {
  try {
    Right(f)
  } catch {
    case t: Throwable =>
    Left(t)
  }
}

<#list methods as method><#if targetMethod(method)>    override def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): <#if method.name?ends_with("Paginator")>rs.${method.returnTypeDesc.simpleTypeName}<#else>Either[Throwable, ${method.returnTypeDesc.simpleTypeName}]</#if> =
    <#if method.name?ends_with("Paginator")>
        new ${method.returnTypeDesc.simpleTypeName}Impl(underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}.toJava<#if p_has_next>,</#if></#list>))
    <#else>
        toEither(underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}.toJava<#if p_has_next>,</#if></#list>)).right.map(_.toScala)
    </#if>
    
</#if></#list>

}

// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1
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

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB
import com.github.j5ik2o.reactive.aws.dynamodb.model._
import com.github.j5ik2o.reactive.aws.dynamodb.v1.model._

class DynamoDBSyncClientImpl(override val underlying: AmazonDynamoDB) extends DynamoDBSyncClient {

  private def toEither[A](f: => A): Either[Throwable, A] = {
    try {
      Right(f)
    } catch {
      case t: Throwable =>
        Left(t)
    }
  }

<#list methods as method><#if targetMethod(method)>    override def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): <#if method.name?ends_with("Paginator")>${method.returnTypeDesc.simpleTypeName}<#else>Either[Throwable, ${method.returnTypeDesc.simpleTypeName}]</#if> = {
    <#if method.parameterTypeDescs?has_content>import <#list method.parameterTypeDescs as p>${p.parameterTypeDesc.fullTypeName}Ops._<#if p_has_next>,</#if></#list></#if>
      import ${method.returnTypeDesc.simpleTypeName}Ops._
      toEither(underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}.toJava<#if p_has_next>,</#if></#list>)).right.map(_.toScala)
    }

</#if></#list>
}


// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.cats

import cats.data.ReaderT
import com.github.j5ik2o.reactive.aws.dynamodb.cats.{ DynamoDBAsyncClient => BaseDynamoDBAsyncClient }
import com.github.j5ik2o.reactive.aws.dynamodb.model._
import com.github.j5ik2o.reactive.aws.dynamodb.v2.model._
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient

import scala.concurrent.{ ExecutionContext, Future }

object DynamoDBAsyncClient {

  def apply(underlying: DynamoDbAsyncClient): DynamoDBAsyncClient =
     new DynamoDBAsyncClientImpl(underlying)

}

trait DynamoDBAsyncClient extends BaseDynamoDBAsyncClient {
  val underlying: DynamoDbAsyncClient

  import com.github.j5ik2o.reactive.aws.dynamodb.v2.DynamoDBAsyncClient._

<#list methods as method><#if targetMethod(method)>    override def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): <#if method.name?ends_with("Paginator")>${method.returnTypeDesc.simpleTypeName}<#else> ReaderT[Future, ExecutionContext, ${method.returnTypeDesc.valueTypeDesc.simpleTypeName}]</#if> =
    ReaderT { implicit ec =>
    <#if method.parameterTypeDescs?has_content>import <#list method.parameterTypeDescs as p>${p.parameterTypeDesc.fullTypeName}Ops._<#if p_has_next>,</#if></#list></#if>
        import ${method.returnTypeDesc.valueTypeDesc.simpleTypeName}Ops._
        underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}.toJava<#if p_has_next>,</#if></#list>).toFuture.map(_.toScala)
    }

</#if></#list>
}

<#function targetMethod methodDesc>
    <#if methodDesc.static >
        <#return false>
    </#if>
    <#if methodDesc.name?ends_with("Paginator")>
        <#return false>
    </#if>
    <#if !methodDesc.parameterTypeDescs?has_content>
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


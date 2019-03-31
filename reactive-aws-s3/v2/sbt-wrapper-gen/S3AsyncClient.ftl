// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2

import java.util.concurrent.CompletableFuture

import com.github.j5ik2o.reactive.aws.s3.S3Client
import com.github.j5ik2o.reactive.aws.s3.model._
import com.github.j5ik2o.reactive.aws.s3.model.rs._
import com.github.j5ik2o.reactive.aws.s3.v2.model._
import com.github.j5ik2o.reactive.aws.s3.v2.model.rs._
import software.amazon.awssdk.services.s3.{ S3AsyncClient => JavaS3AsyncClient }

import scala.compat.java8.FutureConverters
import scala.concurrent.{ ExecutionContext, Future }

object S3AsyncClient {

  def apply(underlying: JavaS3AsyncClient)(implicit ec: ExecutionContext): S3AsyncClient =
    new S3AsyncClientImpl(underlying)

  implicit class CompletableFutureOps[A](val cf: CompletableFuture[A]) extends AnyVal {
    def toFuture: Future[A] = FutureConverters.toScala(cf)
  }

}

trait S3AsyncClient extends S3Client[Future] with S3AsyncClientSupport {
  implicit val execution: ExecutionContext
  val underlying: JavaS3AsyncClient
import S3AsyncClient._

<#list methods as method><#if targetAsyncMethod(method)>    <#if !method.name?ends_with("Paginator")>override</#if> def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): <#if method.name?ends_with("Paginator")>${method.returnTypeDesc.simpleTypeName}<#else>Future[${method.returnTypeDesc.valueTypeDesc.simpleTypeName}]</#if> = {
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

<#function targetAsyncMethod methodDesc>
    <#if methodDesc.static >
        <#return false>
    </#if>
    <#if methodDesc.parameterTypeDescs?size gte 2>
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

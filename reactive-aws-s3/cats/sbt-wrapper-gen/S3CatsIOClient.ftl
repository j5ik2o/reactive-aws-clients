// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.cats

import cats.effect.IO
import com.github.j5ik2o.reactive.aws.s3.{ S3AsyncClient, S3Client }
import software.amazon.awssdk.services.s3.model._
import software.amazon.awssdk.services.s3.paginators._

import scala.concurrent.{ ExecutionContext, Future }

object S3CatsIOClient {

  def apply(underlying: S3AsyncClient): S3CatsIOClient =
    new S3CatsIOClientImpl(underlying)

}

trait S3CatsIOClient extends S3Client[IO] {

  val underlying: S3AsyncClient

<#list methods as method>
    <#if targetMethod(method)>
        <#if method.name?ends_with("Paginator")>
            def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): ${method.returnTypeDesc.simpleTypeName} =
            underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>)
        <#else>
            override def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): IO[${method.returnTypeDesc.valueTypeDesc.simpleTypeName}] = IO.fromFuture{
              IO(underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>))
            }
        </#if>

    </#if>
</#list>
}

<#function targetMethod methodDesc>
    <#if methodDesc.static >
        <#return false>
    </#if>
    <#if methodDesc.name == "getObject" || methodDesc.name == "getObjectAsBytes"  || methodDesc.name == "getObjectTorrent" || methodDesc.name == "getObjectTorrentAsBytes"> <#return false>
    </#if>
    <#if !methodDesc.parameterTypeDescs?has_content>
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


// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2

import com.github.j5ik2o.reactive.aws.s3.S3Client
import com.github.j5ik2o.reactive.aws.s3.model._
import com.github.j5ik2o.reactive.aws.s3.model.rs._
import software.amazon.awssdk.services.s3.{ S3Client => JavaS3Client }

object S3SyncClient {

  def apply(underlying: JavaS3Client): S3SyncClient = new S3SyncClientImpl(underlying)

}

trait S3SyncClient extends S3Client[Either[Throwable, ?]] {
  val underlying: JavaS3Client

<#list methods as method><#if targetMethod(method)>    def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): ${method.returnTypeDesc.simpleTypeName}

</#if></#list>
}

<#function targetMethod methodDesc>
    <#if methodDesc.static >
        <#return false>
    </#if>
    <#if methodDesc.parameterTypeDescs?size gte 2>
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

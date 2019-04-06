<#include "common.ftl"/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}

import com.github.j5ik2o.reactive.aws.utils.ToEitherSupport
import software.amazon.awssdk.services.s3.model._
import software.amazon.awssdk.services.s3.paginators._
import software.amazon.awssdk.services.s3.{ S3Client => JavaS3SyncClient }

object S3SyncClient extends ToEitherSupport {

def apply(underlying: JavaS3SyncClient): S3SyncClient = new S3SyncClientImpl(underlying)

}

trait S3SyncClient extends S3Client[Either[Throwable, ?]] with S3SyncClientSupport {
val underlying: JavaS3SyncClient

import S3SyncClient._

<#list methods as method>
    <#if targetMethod(method)>
        <@defScalaEitherMethod method/>

    </#if>
</#list>
}

<#function targetMethod methodDesc>
    <#if methodDesc.static >
        <#return false>
    </#if>
    <#if methodDesc.name == "getObject" || methodDesc.name == "getObjectAsBytes"  || methodDesc.name == "getObjectTorrent" || methodDesc.name == "getObjectTorrentAsBytes">
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

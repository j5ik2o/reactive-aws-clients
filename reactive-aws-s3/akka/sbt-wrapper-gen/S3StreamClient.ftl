<#include "common.ftl"/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}.akka

import akka.NotUsed
import akka.stream.scaladsl.{Flow, Source}
import com.github.j5ik2o.reactive.aws.s3.S3AsyncClient
import software.amazon.awssdk.services.s3.model._

object S3StreamClient {

def apply(underlying: S3AsyncClient): S3StreamClient = new S3StreamClientImpl(underlying)

val DefaultParallelism: Int = 1

}

trait S3StreamClient extends S3StreamClientSupport {

import S3StreamClient._

val underlying: S3AsyncClient

<#list methods as method>
    <#if targetMethod(method)>
        <@defAkkaMethod method/>

    </#if>
</#list>
}

<#function targetMethod methodDesc>
    <#if methodDesc.static >
        <#return false>
    </#if>
    <#if methodDesc.name == "listBuckets" || methodDesc.name == "getObject" || methodDesc.name == "getObjectAsBytes"  || methodDesc.name == "getObjectTorrent" || methodDesc.name == "getObjectTorrentAsBytes"> <#return false>
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


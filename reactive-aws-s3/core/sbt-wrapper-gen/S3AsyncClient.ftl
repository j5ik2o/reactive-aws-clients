// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}

import software.amazon.awssdk.services.s3.model._
import software.amazon.awssdk.services.s3.paginators._
import software.amazon.awssdk.services.s3.{ S3AsyncClient => JavaS3AsyncClient }

import scala.compat.java8.FutureConverters._
import scala.concurrent.Future

object S3AsyncClient {

def apply(underlying: JavaS3AsyncClient): S3AsyncClient =
new S3AsyncClientImpl(underlying)

}

trait S3AsyncClient extends S3Client[Future] with S3AsyncClientSupport {
val underlying: JavaS3AsyncClient

<#list methods as method>
    <#if targetAsyncMethod(method)>
        <#if !method.name?ends_with("Paginator")>override</#if> def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): <#if method.name?ends_with("Paginator")>${method.returnTypeDesc.simpleTypeName}<#else>Future[${method.returnTypeDesc.valueTypeDesc.simpleTypeName}]</#if> =
        <#if method.name?ends_with("Paginator")>
            underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>)
        <#else>
            underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>).toScala
        </#if>

    </#if>
</#list>
}

<#function targetAsyncMethod methodDesc>
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

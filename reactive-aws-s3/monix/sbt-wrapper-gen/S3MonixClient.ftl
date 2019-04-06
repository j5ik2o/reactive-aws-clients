// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}.monix

import software.amazon.awssdk.services.s3.model._
import com.github.j5ik2o.reactive.aws.s3.{ S3AsyncClient, S3Client }
import monix.eval.Task
import monix.reactive.Observable

object S3MonixClient {

def apply(underlying: S3AsyncClient): S3MonixClient = new S3MonixClientImpl(underlying)

}

trait S3MonixClient extends S3Client[Task] {

val underlying: S3AsyncClient

<#list methods as method>
    <#if targetMethod(method)>
        <#if method.name?ends_with("Paginator")>
            <#assign requestParameterName=method.parameterTypeDescs[0].name>
            <#assign requestTypeName=method.parameterTypeDescs[0].parameterTypeDesc.simpleTypeName>
            <#assign responseTypeName=requestTypeName?replace("Request", "Response")>
            def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): Observable[${responseTypeName}] =
              Observable.fromReactivePublisher(underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>))
        <#else>
            <#assign responseTypeName=method.returnTypeDesc.valueTypeDesc.simpleTypeName>
            override def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): Task[${responseTypeName}] = Task.deferFuture {
              underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>)
            }
        </#if>

    </#if></#list>

}

<#function targetMethod methodDesc>
    <#if methodDesc.static >
        <#return false>
    </#if>
    <#if methodDesc.name == "getObject" || methodDesc.name == "getObjectAsBytes"  || methodDesc.name == "getObjectTorrent" || methodDesc.name == "getObjectTorrentAsBytes"> <#return false>
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

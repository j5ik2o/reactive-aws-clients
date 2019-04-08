<#include "common.ftl"/>
<#assign baseName=simpleTypeName?replace("Client", "")/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}

import com.github.j5ik2o.reactive.aws.utils.ToEitherSupport
import software.amazon.awssdk.services.${baseName?lower_case}.model._
import software.amazon.awssdk.services.${baseName?lower_case}.paginators._
import software.amazon.awssdk.services.${baseName?lower_case}.{ ${baseName}Client => Java${baseName}SyncClient }

object ${baseName}SyncClient extends ToEitherSupport {

def apply(javaClient: Java${baseName}SyncClient): ${baseName}SyncClient = new ${baseName}SyncClient {
override val underlying: Java${baseName}SyncClient = javaClient
}

}

trait ${baseName}SyncClient extends ${baseName}Client[Either[Throwable, ?]] {
val underlying: Java${baseName}SyncClient

import ${baseName}SyncClient._

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
    <#local target=true>
    <#list methodDesc.parameterTypeDescs as p>
        <#if p.parameterTypeDesc.fullTypeName == "Consumer[Builder]">
            <#local target = false>
            <#break >
        </#if>
    </#list>
    <#return target>
</#function>

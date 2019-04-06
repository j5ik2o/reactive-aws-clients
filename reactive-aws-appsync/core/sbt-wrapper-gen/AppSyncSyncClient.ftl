<#include "common.ftl"/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}

import com.github.j5ik2o.reactive.aws.utils.ToEitherSupport
import software.amazon.awssdk.services.appsync.model._
import software.amazon.awssdk.services.appsync.{ AppSyncClient => JavaAppSyncClient }

object AppSyncSyncClient extends ToEitherSupport {

def apply(underlying: JavaAppSyncClient): AppSyncSyncClient = new AppSyncSyncClientImpl(underlying)

}

trait AppSyncSyncClient extends AppSyncClient[Either[Throwable, ?]] {
val underlying: JavaAppSyncClient
import AppSyncSyncClient._

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

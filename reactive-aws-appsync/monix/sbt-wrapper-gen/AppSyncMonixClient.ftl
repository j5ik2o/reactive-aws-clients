<#include "common.ftl"/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}.monix

import software.amazon.awssdk.services.appsync.model._
import com.github.j5ik2o.reactive.aws.appsync.{ AppSyncAsyncClient, AppSyncClient }
import monix.eval.Task
import monix.reactive.Observable

object AppSyncMonixClient {

def apply(underlying: AppSyncAsyncClient): AppSyncMonixClient = new AppSyncMonixClientImpl(underlying)

}

trait AppSyncMonixClient extends AppSyncClient[Task] {

val underlying: AppSyncAsyncClient

<#list methods as method>
    <#if targetMethod(method)>
        <@defMonixMethod method/>

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


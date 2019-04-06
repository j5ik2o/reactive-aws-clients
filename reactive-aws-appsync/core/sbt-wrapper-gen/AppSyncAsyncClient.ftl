<#include "common.ftl"/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}

import software.amazon.awssdk.services.appsync.model._
import software.amazon.awssdk.services.appsync.{ AppSyncAsyncClient => JavaAppSyncAsyncClient }

import scala.compat.java8.FutureConverters._
import scala.concurrent.Future

object AppSyncAsyncClient {

def apply(underlying: JavaAppSyncAsyncClient): AppSyncAsyncClient =
new AppSyncAsyncClientImpl(underlying)

}

trait AppSyncAsyncClient extends AppSyncClient[Future] {
val underlying: JavaAppSyncAsyncClient

<#list methods as method>
    <#if targetMethod(method)>
        <@defScalaFutureMethod method/>

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

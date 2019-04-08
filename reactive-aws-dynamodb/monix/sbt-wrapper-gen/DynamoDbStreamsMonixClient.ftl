<#include "common.ftl"/>
<#assign baseName=simpleTypeName?replace("AsyncClient", "")/>
<#assign packageBaseName="dynamodb"/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}.monix

import com.github.j5ik2o.reactive.aws.${packageBaseName}.streams.{${baseName}AsyncClient, ${baseName}Client}
import monix.eval.Task
import monix.reactive.Observable
import software.amazon.awssdk.services.${packageBaseName}.model._

object ${baseName}MonixClient {

def apply(underlying: ${baseName}AsyncClient): ${baseName}MonixClient = new ${baseName}MonixClientImpl(underlying)

}

trait ${baseName}MonixClient extends ${baseName}Client[Task] {

val underlying: ${baseName}AsyncClient

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


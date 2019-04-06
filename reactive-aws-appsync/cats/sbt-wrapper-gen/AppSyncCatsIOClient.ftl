<#include "common.ftl"/>
<#assign baseName=simpleTypeName?replace("AsyncClient", "")/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}.cats

import cats.effect.IO
import com.github.j5ik2o.reactive.aws.${baseName?lower_case}.{${baseName}AsyncClient, ${baseName}Client}
import software.amazon.awssdk.services.${baseName?lower_case}.model._

object ${baseName}CatsIOClient {

def apply(underlying: ${baseName}AsyncClient): ${baseName}CatsIOClient =
new ${baseName}CatsIOClientImpl(underlying)

}

trait ${baseName}CatsIOClient extends ${baseName}Client[IO] {

val underlying: ${baseName}AsyncClient

<#list methods as method>
    <#if targetMethod(method)>
        <@defCatsMethod method />

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


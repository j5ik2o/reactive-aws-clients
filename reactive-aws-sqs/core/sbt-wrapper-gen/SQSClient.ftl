<#include "common.ftl"/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}

import software.amazon.awssdk.services.sqs.model._

trait SQSClient[M[_]] {

<#list methods as method>
    <#if targetMethod(method)>
        <@defScalaInterface method/>

    </#if>
</#list>
}
<#function targetMethod methodDesc>
    <#if methodDesc.static >
        <#return false>
    </#if>
    <#if methodDesc.parameterTypeDescs?size gte 2>
        <#return false>
    </#if>
    <#if methodDesc.name?ends_with("Paginator")>
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

<#include "common.ftl"/>
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}

import software.amazon.awssdk.services.dynamodb.model._

trait DynamoDBClient[M[_]] extends DynamoDBClientSupport[M] {

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

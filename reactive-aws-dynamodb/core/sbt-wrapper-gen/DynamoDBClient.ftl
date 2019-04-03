package com.github.j5ik2o.reactive.aws.dynamodb

import software.amazon.awssdk.services.dynamodb.model._

trait DynamoDBClient[M[_]] extends DynamoDBClientSupport[M] {

<#list methods as method><#if targetMethod(method)>    def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): M[${method.returnTypeDesc.valueTypeDesc.simpleTypeName}]

</#if></#list>
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

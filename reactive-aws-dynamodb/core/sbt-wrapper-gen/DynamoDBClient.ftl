package com.github.j5ik2o.reactive.aws.dynamodb

import com.github.j5ik2o.reactive.aws.dynamodb.model._

<#function targetMethod methodDesc>
    <#if methodDesc.static >
        <#return false>
    </#if>
    <#if methodDesc.name?ends_with("Paginator")>
        <#return false>
    </#if>
    <#local target=true>
    <#list methodDesc.parameters as parameter>
        <#if parameter.typeName.fullTypeName == "Consumer[Builder]">
            <#local target = false>
            <#break >
        </#if>
    </#list>
    <#return target>
</#function>
trait DynamoDBClient[M[_]] extends DynamoDBClientSupport[M] {

<#list methods as method><#if targetMethod(method)>    def ${method.name}(<#list method.parameters as parameter>${parameter.name}: ${parameter.typeName.fullTypeName}<#if parameter_has_next>,</#if></#list>): M[${method.returnType.valueTypeName}]

</#if></#list>
}


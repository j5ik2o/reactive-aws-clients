package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}.metrics

import com.github.j5ik2o.reactive.aws.metrics.JavaClientMetricsInterceptor
import software.amazon.awssdk.services.dynamodb.DynamoDbClient
import software.amazon.awssdk.services.dynamodb.model._

trait JavaSyncClientMetricsInterceptor extends DynamoDbClient with JavaClientMetricsInterceptor {

<#list methods as method><#if targetMethod(method)>
    <#assign requestParameterName=method.parameterTypeDescs[0].name>
    <#assign requestTypeName=method.parameterTypeDescs[0].parameterTypeDesc.simpleTypeName>
    <#assign responseTypeName=method.returnTypeDesc.valueTypeDesc.simpleTypeName>
    abstract override def ${method.name}(
    ${requestParameterName}: ${requestTypeName}
    ): ${responseTypeName} =
    collectSync("${method.name}", ${requestParameterName})(super.${method.name})
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
    <#if methodDesc.parameterTypeDescs?size gte 2 || methodDesc.parameterTypeDescs?size == 0>
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

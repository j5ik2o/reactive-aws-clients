package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}.metrics

import java.util.concurrent.CompletableFuture
import java.util.function.BiConsumer

import com.github.j5ik2o.reactive.aws.metrics.JavaClientMetricsInterceptor
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient
import software.amazon.awssdk.services.dynamodb.model._

trait JavaAsyncClientMetricsInterceptor extends DynamoDbAsyncClient with JavaClientMetricsInterceptor {

protected def collectCompletableFuture[A, B](name: String, request: A)(f: A => CompletableFuture[B]): CompletableFuture[B] = {
val start = currentTime
f(request).whenComplete(new BiConsumer[B, Throwable] {
override def accept(t: B, u: Throwable): Unit = {
reporter.record(name, currentTime - start)
reporter.increment(name)
}
})
}

<#list methods as method><#if targetMethod(method)>
    <#assign requestParameterName=method.parameterTypeDescs[0].name>
    <#assign requestTypeName=method.parameterTypeDescs[0].parameterTypeDesc.simpleTypeName>
    <#assign responseTypeName=method.returnTypeDesc.valueTypeDesc.simpleTypeName>
    abstract override def ${method.name}(
    ${requestParameterName}: ${requestTypeName}
    ): CompletableFuture[${responseTypeName}] =
    collectCompletableFuture("${method.name}", ${requestParameterName})(super.${method.name})
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
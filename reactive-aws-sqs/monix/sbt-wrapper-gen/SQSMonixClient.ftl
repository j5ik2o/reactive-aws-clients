// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.monix

import software.amazon.awssdk.services.sqs.model._
import com.github.j5ik2o.reactive.aws.sqs.{ SQSAsyncClient, SQSClient }
import monix.eval.Task
import monix.reactive.Observable

object SQSMonixClient {

def apply(underlying: SQSAsyncClient): SQSMonixClient = new SQSMonixClientImpl(underlying)

}

trait SQSMonixClient extends SQSClient[Task] {

val underlying: SQSAsyncClient

<#list methods as method>
    <#if targetMethod(method)>
        <#if method.name?ends_with("Paginator")>
            <#assign requestTypeName=method.parameterTypeDescs[0].parameterTypeDesc.simpleTypeName>
            <#assign responseTypeName=requestTypeName?replace("Request", "Response")>
            def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): Observable[${responseTypeName}] =
              Observable.fromReactivePublisher(underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>))
        <#else>
            <#assign responseTypeName=method.returnTypeDesc.valueTypeDesc.simpleTypeName>
            override def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): Task[${responseTypeName}] = Task.deferFuture {
              underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>)
            }
        </#if>

    </#if></#list>

}

<#function targetMethod methodDesc>
    <#if methodDesc.static >
        <#return false>
    </#if>
    <#if methodDesc.parameterTypeDescs?size gte 2>
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

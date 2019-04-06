// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}.monix

import com.github.j5ik2o.reactive.aws.dynamodb.streams.{DynamoDBStreamsAsyncClient, DynamoDBStreamsClient}
import monix.eval.Task
import monix.reactive.Observable
import software.amazon.awssdk.services.dynamodb.model._

object DynamoDBStreamsMonixClient {

def apply(underlying: DynamoDBStreamsAsyncClient): DynamoDBStreamsMonixClient = new DynamoDBStreamsMonixClientImpl(underlying)

}

trait DynamoDBStreamsMonixClient extends DynamoDBStreamsClient[Task] {

val underlying: DynamoDBStreamsAsyncClient

<#list methods as method>
    <#if targetMethod(method)>
        <#if method.name?ends_with("Paginator")>
            <#assign responseTypeName=method.returnTypeDesc.simpleTypeName?replace("Publisher", "Response")>
            def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): Observable[${responseTypeName}] =
              Observable.fromReactivePublisher(underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>))
        <#else>
            <#assign responseTypeName=method.returnTypeDesc.valueTypeDesc.simpleTypeName>
            override def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): Task[${responseTypeName}] =
              Task.deferFuture {
                underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>)
              }
        </#if>

    </#if></#list>
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


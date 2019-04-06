// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs

import com.github.j5ik2o.reactive.aws.utils.ToEitherSupport
import software.amazon.awssdk.services.sqs.model._
import software.amazon.awssdk.services.sqs.{ SqsClient => JavaSQSSyncClient }

object SQSSyncClient extends ToEitherSupport {

  def apply(underlying: JavaSQSSyncClient): SQSSyncClient = new SQSSyncClientImpl(underlying)

}

trait SQSSyncClient extends SQSClient[Either[Throwable, ?]] {
  val underlying: JavaSQSSyncClient

  import SQSSyncClient._

<#list methods as method><#if targetMethod(method)>    <#if !method.name?ends_with("Paginator")>override</#if> def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): <#if method.name?ends_with("Paginator")>${method.returnTypeDesc.simpleTypeName}<#else>Either[Throwable, ${method.returnTypeDesc.simpleTypeName}]</#if> =
    <#if method.name?ends_with("Paginator")>
        underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>)
    <#else>
        underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>).toEither
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

// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis

import com.github.j5ik2o.reactive.aws.kinesis.model._
import com.github.j5ik2o.reactive.aws.kinesis.model.ops._
import com.github.j5ik2o.reactive.aws.kinesis.model.rs._
import software.amazon.awssdk.services.kinesis.{ KinesisClient => JavaKinesisSyncClient }

object KinesisSyncClient {

  def apply(underlying: JavaKinesisSyncClient): KinesisSyncClient = new KinesisSyncClientImpl(underlying)

}

trait KinesisSyncClient extends KinesisClient[Either[Throwable, ?]] {
  val underlying: JavaKinesisSyncClient

<#list methods as method><#if targetMethod(method)>    def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): ${method.returnTypeDesc.simpleTypeName}

</#if></#list>
}

<#function targetMethod methodDesc>
    <#if methodDesc.static >
        <#return false>
    </#if>
    <#if !methodDesc.name?ends_with("Paginator")>
        <#return false>
    </#if>
    <#local target=true>
    <#list methodDesc.parameterTypeDescs as p>
        <#if p.name?ends_with("Handler")>
            <#local target = false>
            <#break >
        </#if>
        <#if p.parameterTypeDesc.fullTypeName == "Consumer[Builder]">
            <#local target = false>
            <#break >
        </#if>
    </#list>
    <#return target>
</#function>
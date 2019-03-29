// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2

import com.github.j5ik2o.reactive.aws.kinesis.model._
import com.github.j5ik2o.reactive.aws.kinesis.model.rs._
import com.github.j5ik2o.reactive.aws.kinesis.{ KinesisClient => BaseKinesisClient }
import software.amazon.awssdk.services.kinesis.KinesisClient

object KinesisSyncClient {

  def apply(underlying: KinesisClient): KinesisSyncClient = new KinesisSyncClientImpl(underlying)

}

trait KinesisSyncClient extends BaseKinesisClient[Either[Throwable, ?]] {
  val underlying: KinesisClient

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
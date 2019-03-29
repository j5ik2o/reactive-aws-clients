// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.cats

import com.github.j5ik2o.reactive.aws.kinesis.cats.{ KinesisReaderTFutureClient => BaseKinesisReaderTFutureClient }
import com.github.j5ik2o.reactive.aws.kinesis.model._
import com.github.j5ik2o.reactive.aws.kinesis.model.rs.ListStreamConsumersPublisher
import com.github.j5ik2o.reactive.aws.kinesis.v2.KinesisAsyncClient

object KinesisReaderTFutureClient {

def apply(underlying: KinesisAsyncClient): KinesisReaderTFutureClient =
  new KinesisReaderTFutureClientImpl(underlying)

}

trait KinesisReaderTFutureClient extends BaseKinesisReaderTFutureClient {

  override val underlying: KinesisAsyncClient

<#list methods as method><#if targetMethod(method)>    def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): ${method.returnTypeDesc.simpleTypeName} =
        underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>)

</#if></#list>
}

<#function targetMethod methodDesc>
    <#if methodDesc.static >
        <#return false>
    </#if>
    <#if !methodDesc.name?ends_with("Paginator")>
        <#return false>
    </#if>
    <#if !methodDesc.parameterTypeDescs?has_content>
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


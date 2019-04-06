<#include "common.ftl"/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}.cats

import cats.effect.IO
import com.github.j5ik2o.reactive.aws.kinesis.{ KinesisAsyncClient, KinesisClient }
import software.amazon.awssdk.services.kinesis.model._
import software.amazon.awssdk.services.kinesis.paginators._

import scala.concurrent.{ ExecutionContext, Future }

object KinesisCatsIOClient {

  def apply(underlying: KinesisAsyncClient): KinesisCatsIOClient =
    new KinesisCatsIOClientImpl(underlying)

}

trait KinesisCatsIOClient extends KinesisClient[IO] {

  val underlying: KinesisAsyncClient

<#list methods as method>
    <#if targetMethod(method)>
        <@defCatsMethod method />

    </#if>
</#list>
}

<#function targetMethod methodDesc>
    <#if methodDesc.static >
        <#return false>
    </#if>
    <#if methodDesc.name == "subscribeToShard">
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


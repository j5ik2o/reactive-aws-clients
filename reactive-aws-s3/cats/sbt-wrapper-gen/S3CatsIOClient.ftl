<#include "common.ftl"/>
<#assign baseName=simpleTypeName?replace("AsyncClient", "")/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}.cats

import cats.effect.{ContextShift, IO}
import com.github.j5ik2o.reactive.aws.${baseName?lower_case}.{ ${baseName}AsyncClient, ${baseName}Client }
import software.amazon.awssdk.services.${baseName?lower_case}.model._
import software.amazon.awssdk.services.${baseName?lower_case}.paginators._

import scala.concurrent.{ ExecutionContext, Future }

object ${baseName}CatsIOClient {

  def apply(asyncClient: ${baseName}AsyncClient)(implicit ec: ExecutionContext): ${baseName}CatsIOClient = new ${baseName}CatsIOClient {
override val executionContext: ExecutionContext = ec
override val underlying: ${baseName}AsyncClient = asyncClient
}

}

trait ${baseName}CatsIOClient extends ${baseName}Client[IO] with ${baseName}CatsIOClientSupoprt {

  val underlying: ${baseName}AsyncClient

  def executionContext: ExecutionContext
  implicit def cs: ContextShift[IO]  = IO.contextShift(executionContext)

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
    <#if methodDesc.name == "getObject" || methodDesc.name == "getObjectAsBytes"  || methodDesc.name == "getObjectTorrent" || methodDesc.name == "getObjectTorrentAsBytes"> <#return false>
    </#if>
    <#if !methodDesc.parameterTypeDescs?has_content>
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


<#include "common.ftl"/>
<#assign baseName=simpleTypeName?replace("AsyncClient", "")/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}.akka

import akka.NotUsed
import akka.stream.scaladsl.{Flow, Source}
import com.github.j5ik2o.reactive.aws.${baseName?lower_case}.${baseName}AsyncClient
import software.amazon.awssdk.services.${baseName?lower_case}.model._

import scala.concurrent.Future

object ${baseName}AkkaClient {

def apply(asyncClient: ${baseName}AsyncClient): ${baseName}AkkaClient = new ${baseName}AkkaClient {
override val underlying: ${baseName}AsyncClient = asyncClient
}

val DefaultParallelism: Int = 1

}

trait ${baseName}AkkaClient {

import ${baseName}AkkaClient._

val underlying: ${baseName}AsyncClient

<#list methods as method>
    <#if targetMethod(method)>
        <@defAkkaMethod method/>

    </#if>
</#list>
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


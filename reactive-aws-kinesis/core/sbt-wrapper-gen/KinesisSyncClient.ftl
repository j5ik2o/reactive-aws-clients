<#include "common.ftl"/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}

import com.github.j5ik2o.reactive.aws.utils.ToEitherSupport
import software.amazon.awssdk.services.kinesis.model._
import software.amazon.awssdk.services.kinesis.paginators._
import software.amazon.awssdk.services.kinesis.{ KinesisClient => JavaKinesisSyncClient }

object KinesisSyncClient extends ToEitherSupport {

def apply(underlying: JavaKinesisSyncClient): KinesisSyncClient = new KinesisSyncClientImpl(underlying)

}

trait KinesisSyncClient extends KinesisClient[Either[Throwable, ?]] {
val underlying: JavaKinesisSyncClient
import KinesisSyncClient._

<#list methods as method>
    <#if targetMethod(method)>
        <@defScalaEitherMethod method/>

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
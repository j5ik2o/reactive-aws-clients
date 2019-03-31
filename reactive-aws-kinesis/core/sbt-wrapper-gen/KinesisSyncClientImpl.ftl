// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis

import com.github.j5ik2o.reactive.aws.kinesis.model._
import com.github.j5ik2o.reactive.aws.kinesis.model.ops._
import com.github.j5ik2o.reactive.aws.kinesis.model.rs._
import software.amazon.awssdk.services.kinesis.{ KinesisClient => JavaKinesisSyncClient }

private[kinesis] class KinesisSyncClientImpl(override val underlying: JavaKinesisSyncClient) extends KinesisSyncClient {

private def toEither[A](f: => A): Either[Throwable, A] = {
  try {
    Right(f)
  } catch {
    case t: Throwable =>
    Left(t)
  }
}

<#list methods as method><#if targetMethod(method)>    override def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): <#if method.name?ends_with("Paginator")>${method.returnTypeDesc.simpleTypeName}<#else>Either[Throwable, ${method.returnTypeDesc.simpleTypeName}]</#if> = {
    <#if method.name?ends_with("Paginator")>
        <#if method.parameterTypeDescs?has_content>import <#list method.parameterTypeDescs as p>${p.parameterTypeDesc.fullTypeName}Ops._<#if p_has_next>,</#if></#list></#if>
        new ${method.returnTypeDesc.simpleTypeName}Impl(underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}.toJava<#if p_has_next>,</#if></#list>))
    <#else>
        <#if method.parameterTypeDescs?has_content>import <#list method.parameterTypeDescs as p>${p.parameterTypeDesc.fullTypeName}Ops._<#if p_has_next>,</#if></#list></#if>
        import ${method.returnTypeDesc.simpleTypeName}Ops._
        toEither(underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}.toJava<#if p_has_next>,</#if></#list>)).right.map(_.toScala)
    </#if>
   }

</#if></#list>

}
<#function targetMethod methodDesc>
    <#if methodDesc.static >
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
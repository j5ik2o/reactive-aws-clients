<#include "common.ftl">
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")+".ops"}

import ${packageName}._

final class ${simpleTypeName}BuilderOps(val self: ${simpleTypeName}.Builder) extends AnyVal {

<#list methods as m>
    <#if !m.static && !m.name?ends_with("AsString") && !m.name?ends_with("AsStrings") && m.name != "builder" && m.name != "serializableBuilderClass" && m.name != "toBuilder" && m.name != "hashCode" && m.name != "toString" && m.name != "sdkFields" && !m.parameterTypeDescs?has_content>
        <@enrichSetterAsScala simpleTypeName m />

    </#if>
</#list>

}

final class ${simpleTypeName}Ops(val self: ${simpleTypeName}) extends AnyVal {

<#list methods as m>
    <#if !m.static && !m.name?ends_with("AsString") && !m.name?ends_with("AsStrings") && m.name != "builder" && m.name != "serializableBuilderClass" && m.name != "toBuilder" && m.name != "hashCode" && m.name != "toString" && m.name != "sdkFields" && !m.parameterTypeDescs?has_content>
        <@enrichGetterAsScala simpleTypeName m />

    </#if>
</#list>

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait To${simpleTypeName}Ops {

implicit def to${simpleTypeName}BuilderOps(v: ${simpleTypeName}.Builder): ${simpleTypeName}BuilderOps = new ${simpleTypeName}BuilderOps(v)

implicit def to${simpleTypeName}Ops(v: ${simpleTypeName}): ${simpleTypeName}Ops = new ${simpleTypeName}Ops(v)

}


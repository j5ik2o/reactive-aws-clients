// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyTrafficMirrorFilterRuleResponseBuilderOps(val self: ModifyTrafficMirrorFilterRuleResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def trafficMirrorFilterRuleAsScala(value: Option[TrafficMirrorFilterRule]): ModifyTrafficMirrorFilterRuleResponse.Builder = {
            value.fold(self){ v => self.trafficMirrorFilterRule(v) }
            } 


}

final class ModifyTrafficMirrorFilterRuleResponseOps(val self: ModifyTrafficMirrorFilterRuleResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def trafficMirrorFilterRuleAsScala: Option[TrafficMirrorFilterRule] = Option(self.trafficMirrorFilterRule) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyTrafficMirrorFilterRuleResponseOps {

implicit def toModifyTrafficMirrorFilterRuleResponseBuilderOps(v: ModifyTrafficMirrorFilterRuleResponse.Builder): ModifyTrafficMirrorFilterRuleResponseBuilderOps = new ModifyTrafficMirrorFilterRuleResponseBuilderOps(v)

implicit def toModifyTrafficMirrorFilterRuleResponseOps(v: ModifyTrafficMirrorFilterRuleResponse): ModifyTrafficMirrorFilterRuleResponseOps = new ModifyTrafficMirrorFilterRuleResponseOps(v)

}


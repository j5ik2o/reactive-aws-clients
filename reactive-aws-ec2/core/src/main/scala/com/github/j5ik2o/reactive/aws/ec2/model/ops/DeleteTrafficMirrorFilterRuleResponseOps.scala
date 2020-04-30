// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteTrafficMirrorFilterRuleResponseBuilderOps(val self: DeleteTrafficMirrorFilterRuleResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def trafficMirrorFilterRuleIdAsScala(value: Option[String]): DeleteTrafficMirrorFilterRuleResponse.Builder = {
            value.fold(self){ v => self.trafficMirrorFilterRuleId(v) }
            } 


}

final class DeleteTrafficMirrorFilterRuleResponseOps(val self: DeleteTrafficMirrorFilterRuleResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def trafficMirrorFilterRuleIdAsScala: Option[String] = Option(self.trafficMirrorFilterRuleId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteTrafficMirrorFilterRuleResponseOps {

implicit def toDeleteTrafficMirrorFilterRuleResponseBuilderOps(v: DeleteTrafficMirrorFilterRuleResponse.Builder): DeleteTrafficMirrorFilterRuleResponseBuilderOps = new DeleteTrafficMirrorFilterRuleResponseBuilderOps(v)

implicit def toDeleteTrafficMirrorFilterRuleResponseOps(v: DeleteTrafficMirrorFilterRuleResponse): DeleteTrafficMirrorFilterRuleResponseOps = new DeleteTrafficMirrorFilterRuleResponseOps(v)

}


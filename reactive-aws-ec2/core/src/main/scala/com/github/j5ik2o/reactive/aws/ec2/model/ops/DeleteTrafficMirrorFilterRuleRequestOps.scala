// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteTrafficMirrorFilterRuleRequestBuilderOps(val self: DeleteTrafficMirrorFilterRuleRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def trafficMirrorFilterRuleIdAsScala(value: Option[String]): DeleteTrafficMirrorFilterRuleRequest.Builder = {
            value.fold(self){ v => self.trafficMirrorFilterRuleId(v) }
            } 


}

final class DeleteTrafficMirrorFilterRuleRequestOps(val self: DeleteTrafficMirrorFilterRuleRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def trafficMirrorFilterRuleIdAsScala: Option[String] = Option(self.trafficMirrorFilterRuleId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteTrafficMirrorFilterRuleRequestOps {

implicit def toDeleteTrafficMirrorFilterRuleRequestBuilderOps(v: DeleteTrafficMirrorFilterRuleRequest.Builder): DeleteTrafficMirrorFilterRuleRequestBuilderOps = new DeleteTrafficMirrorFilterRuleRequestBuilderOps(v)

implicit def toDeleteTrafficMirrorFilterRuleRequestOps(v: DeleteTrafficMirrorFilterRuleRequest): DeleteTrafficMirrorFilterRuleRequestOps = new DeleteTrafficMirrorFilterRuleRequestOps(v)

}


// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateTrafficMirrorFilterRuleResponseBuilderOps(val self: CreateTrafficMirrorFilterRuleResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorFilterRuleAsScala(
      value: Option[TrafficMirrorFilterRule]
  ): CreateTrafficMirrorFilterRuleResponse.Builder = {
    value.fold(self) { v => self.trafficMirrorFilterRule(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): CreateTrafficMirrorFilterRuleResponse.Builder = {
    value.fold(self) { v => self.clientToken(v) }
  }

}

final class CreateTrafficMirrorFilterRuleResponseOps(val self: CreateTrafficMirrorFilterRuleResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorFilterRuleAsScala: Option[TrafficMirrorFilterRule] = Option(self.trafficMirrorFilterRule)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateTrafficMirrorFilterRuleResponseOps {

  implicit def toCreateTrafficMirrorFilterRuleResponseBuilderOps(
      v: CreateTrafficMirrorFilterRuleResponse.Builder
  ): CreateTrafficMirrorFilterRuleResponseBuilderOps = new CreateTrafficMirrorFilterRuleResponseBuilderOps(v)

  implicit def toCreateTrafficMirrorFilterRuleResponseOps(
      v: CreateTrafficMirrorFilterRuleResponse
  ): CreateTrafficMirrorFilterRuleResponseOps = new CreateTrafficMirrorFilterRuleResponseOps(v)

}

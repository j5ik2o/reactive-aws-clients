// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TrafficMirrorFilterRuleBuilderOps(val self: TrafficMirrorFilterRule.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorFilterRuleIdAsScala(value: Option[String]): TrafficMirrorFilterRule.Builder = {
    value.fold(self) { v => self.trafficMirrorFilterRuleId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorFilterIdAsScala(value: Option[String]): TrafficMirrorFilterRule.Builder = {
    value.fold(self) { v => self.trafficMirrorFilterId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficDirectionAsScala(value: Option[TrafficDirection]): TrafficMirrorFilterRule.Builder = {
    value.fold(self) { v => self.trafficDirection(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ruleNumberAsScala(value: Option[Int]): TrafficMirrorFilterRule.Builder = {
    value.fold(self) { v => self.ruleNumber(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ruleActionAsScala(value: Option[TrafficMirrorRuleAction]): TrafficMirrorFilterRule.Builder = {
    value.fold(self) { v => self.ruleAction(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def protocolAsScala(value: Option[Int]): TrafficMirrorFilterRule.Builder = {
    value.fold(self) { v => self.protocol(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationPortRangeAsScala(value: Option[TrafficMirrorPortRange]): TrafficMirrorFilterRule.Builder = {
    value.fold(self) { v => self.destinationPortRange(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourcePortRangeAsScala(value: Option[TrafficMirrorPortRange]): TrafficMirrorFilterRule.Builder = {
    value.fold(self) { v => self.sourcePortRange(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationCidrBlockAsScala(value: Option[String]): TrafficMirrorFilterRule.Builder = {
    value.fold(self) { v => self.destinationCidrBlock(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceCidrBlockAsScala(value: Option[String]): TrafficMirrorFilterRule.Builder = {
    value.fold(self) { v => self.sourceCidrBlock(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): TrafficMirrorFilterRule.Builder = {
    value.fold(self) { v => self.description(v) }
  }

}

final class TrafficMirrorFilterRuleOps(val self: TrafficMirrorFilterRule) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorFilterRuleIdAsScala: Option[String] = Option(self.trafficMirrorFilterRuleId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorFilterIdAsScala: Option[String] = Option(self.trafficMirrorFilterId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficDirectionAsScala: Option[TrafficDirection] = Option(self.trafficDirection)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ruleNumberAsScala: Option[Int] = Option(self.ruleNumber)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ruleActionAsScala: Option[TrafficMirrorRuleAction] = Option(self.ruleAction)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def protocolAsScala: Option[Int] = Option(self.protocol)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationPortRangeAsScala: Option[TrafficMirrorPortRange] = Option(self.destinationPortRange)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourcePortRangeAsScala: Option[TrafficMirrorPortRange] = Option(self.sourcePortRange)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationCidrBlockAsScala: Option[String] = Option(self.destinationCidrBlock)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceCidrBlockAsScala: Option[String] = Option(self.sourceCidrBlock)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTrafficMirrorFilterRuleOps {

  implicit def toTrafficMirrorFilterRuleBuilderOps(
      v: TrafficMirrorFilterRule.Builder
  ): TrafficMirrorFilterRuleBuilderOps = new TrafficMirrorFilterRuleBuilderOps(v)

  implicit def toTrafficMirrorFilterRuleOps(v: TrafficMirrorFilterRule): TrafficMirrorFilterRuleOps =
    new TrafficMirrorFilterRuleOps(v)

}

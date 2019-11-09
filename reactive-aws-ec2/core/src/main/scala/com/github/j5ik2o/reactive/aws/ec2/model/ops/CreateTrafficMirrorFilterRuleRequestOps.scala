// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateTrafficMirrorFilterRuleRequestBuilderOps(val self: CreateTrafficMirrorFilterRuleRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorFilterIdAsScala(value: Option[String]): CreateTrafficMirrorFilterRuleRequest.Builder = {
    value.fold(self) { v =>
      self.trafficMirrorFilterId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficDirectionAsScala(value: Option[TrafficDirection]): CreateTrafficMirrorFilterRuleRequest.Builder = {
    value.fold(self) { v =>
      self.trafficDirection(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ruleNumberAsScala(value: Option[Int]): CreateTrafficMirrorFilterRuleRequest.Builder = {
    value.fold(self) { v =>
      self.ruleNumber(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ruleActionAsScala(value: Option[TrafficMirrorRuleAction]): CreateTrafficMirrorFilterRuleRequest.Builder = {
    value.fold(self) { v =>
      self.ruleAction(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationPortRangeAsScala(
      value: Option[TrafficMirrorPortRangeRequest]
  ): CreateTrafficMirrorFilterRuleRequest.Builder = {
    value.fold(self) { v =>
      self.destinationPortRange(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourcePortRangeAsScala(
      value: Option[TrafficMirrorPortRangeRequest]
  ): CreateTrafficMirrorFilterRuleRequest.Builder = {
    value.fold(self) { v =>
      self.sourcePortRange(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def protocolAsScala(value: Option[Int]): CreateTrafficMirrorFilterRuleRequest.Builder = {
    value.fold(self) { v =>
      self.protocol(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationCidrBlockAsScala(value: Option[String]): CreateTrafficMirrorFilterRuleRequest.Builder = {
    value.fold(self) { v =>
      self.destinationCidrBlock(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceCidrBlockAsScala(value: Option[String]): CreateTrafficMirrorFilterRuleRequest.Builder = {
    value.fold(self) { v =>
      self.sourceCidrBlock(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): CreateTrafficMirrorFilterRuleRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): CreateTrafficMirrorFilterRuleRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

}

final class CreateTrafficMirrorFilterRuleRequestOps(val self: CreateTrafficMirrorFilterRuleRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorFilterIdAsScala: Option[String] = Option(self.trafficMirrorFilterId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficDirectionAsScala: Option[TrafficDirection] = Option(self.trafficDirection)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ruleNumberAsScala: Option[Int] = Option(self.ruleNumber)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ruleActionAsScala: Option[TrafficMirrorRuleAction] = Option(self.ruleAction)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationPortRangeAsScala: Option[TrafficMirrorPortRangeRequest] = Option(self.destinationPortRange)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourcePortRangeAsScala: Option[TrafficMirrorPortRangeRequest] = Option(self.sourcePortRange)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def protocolAsScala: Option[Int] = Option(self.protocol)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationCidrBlockAsScala: Option[String] = Option(self.destinationCidrBlock)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceCidrBlockAsScala: Option[String] = Option(self.sourceCidrBlock)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateTrafficMirrorFilterRuleRequestOps {

  implicit def toCreateTrafficMirrorFilterRuleRequestBuilderOps(
      v: CreateTrafficMirrorFilterRuleRequest.Builder
  ): CreateTrafficMirrorFilterRuleRequestBuilderOps = new CreateTrafficMirrorFilterRuleRequestBuilderOps(v)

  implicit def toCreateTrafficMirrorFilterRuleRequestOps(
      v: CreateTrafficMirrorFilterRuleRequest
  ): CreateTrafficMirrorFilterRuleRequestOps = new CreateTrafficMirrorFilterRuleRequestOps(v)

}

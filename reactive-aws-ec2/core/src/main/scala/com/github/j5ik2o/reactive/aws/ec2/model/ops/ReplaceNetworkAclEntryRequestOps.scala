// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReplaceNetworkAclEntryRequestBuilderOps(val self: ReplaceNetworkAclEntryRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrBlockAsScala(value: Option[String]): ReplaceNetworkAclEntryRequest.Builder = {
    value.fold(self) { v => self.cidrBlock(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def egressAsScala(value: Option[Boolean]): ReplaceNetworkAclEntryRequest.Builder = {
    value.fold(self) { v => self.egress(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def icmpTypeCodeAsScala(value: Option[IcmpTypeCode]): ReplaceNetworkAclEntryRequest.Builder = {
    value.fold(self) { v => self.icmpTypeCode(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6CidrBlockAsScala(value: Option[String]): ReplaceNetworkAclEntryRequest.Builder = {
    value.fold(self) { v => self.ipv6CidrBlock(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkAclIdAsScala(value: Option[String]): ReplaceNetworkAclEntryRequest.Builder = {
    value.fold(self) { v => self.networkAclId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def portRangeAsScala(value: Option[PortRange]): ReplaceNetworkAclEntryRequest.Builder = {
    value.fold(self) { v => self.portRange(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def protocolAsScala(value: Option[String]): ReplaceNetworkAclEntryRequest.Builder = {
    value.fold(self) { v => self.protocol(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ruleActionAsScala(value: Option[RuleAction]): ReplaceNetworkAclEntryRequest.Builder = {
    value.fold(self) { v => self.ruleAction(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ruleNumberAsScala(value: Option[Int]): ReplaceNetworkAclEntryRequest.Builder = {
    value.fold(self) { v => self.ruleNumber(v) }
  }

}

final class ReplaceNetworkAclEntryRequestOps(val self: ReplaceNetworkAclEntryRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrBlockAsScala: Option[String] = Option(self.cidrBlock)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def egressAsScala: Option[Boolean] = Option(self.egress)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def icmpTypeCodeAsScala: Option[IcmpTypeCode] = Option(self.icmpTypeCode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6CidrBlockAsScala: Option[String] = Option(self.ipv6CidrBlock)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkAclIdAsScala: Option[String] = Option(self.networkAclId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def portRangeAsScala: Option[PortRange] = Option(self.portRange)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def protocolAsScala: Option[String] = Option(self.protocol)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ruleActionAsScala: Option[RuleAction] = Option(self.ruleAction)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ruleNumberAsScala: Option[Int] = Option(self.ruleNumber)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplaceNetworkAclEntryRequestOps {

  implicit def toReplaceNetworkAclEntryRequestBuilderOps(
      v: ReplaceNetworkAclEntryRequest.Builder
  ): ReplaceNetworkAclEntryRequestBuilderOps = new ReplaceNetworkAclEntryRequestBuilderOps(v)

  implicit def toReplaceNetworkAclEntryRequestOps(v: ReplaceNetworkAclEntryRequest): ReplaceNetworkAclEntryRequestOps =
    new ReplaceNetworkAclEntryRequestOps(v)

}

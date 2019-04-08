// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReplaceNetworkAclEntryRequestBuilderOps(val self: ReplaceNetworkAclEntryRequest.Builder) extends AnyVal {

  final def cidrBlockAsScala(value: Option[String]): ReplaceNetworkAclEntryRequest.Builder = {
    value.fold(self) { v =>
      self.cidrBlock(v)
    }
  }

  final def egressAsScala(value: Option[Boolean]): ReplaceNetworkAclEntryRequest.Builder = {
    value.fold(self) { v =>
      self.egress(v)
    }
  }

  final def icmpTypeCodeAsScala(value: Option[IcmpTypeCode]): ReplaceNetworkAclEntryRequest.Builder = {
    value.fold(self) { v =>
      self.icmpTypeCode(v)
    }
  }

  final def ipv6CidrBlockAsScala(value: Option[String]): ReplaceNetworkAclEntryRequest.Builder = {
    value.fold(self) { v =>
      self.ipv6CidrBlock(v)
    }
  }

  final def networkAclIdAsScala(value: Option[String]): ReplaceNetworkAclEntryRequest.Builder = {
    value.fold(self) { v =>
      self.networkAclId(v)
    }
  }

  final def portRangeAsScala(value: Option[PortRange]): ReplaceNetworkAclEntryRequest.Builder = {
    value.fold(self) { v =>
      self.portRange(v)
    }
  }

  final def protocolAsScala(value: Option[String]): ReplaceNetworkAclEntryRequest.Builder = {
    value.fold(self) { v =>
      self.protocol(v)
    }
  }

  final def ruleActionAsScala(value: Option[RuleAction]): ReplaceNetworkAclEntryRequest.Builder = {
    value.fold(self) { v =>
      self.ruleAction(v)
    }
  }

  final def ruleNumberAsScala(value: Option[Int]): ReplaceNetworkAclEntryRequest.Builder = {
    value.fold(self) { v =>
      self.ruleNumber(v)
    }
  }

}

final class ReplaceNetworkAclEntryRequestOps(val self: ReplaceNetworkAclEntryRequest) extends AnyVal {

  final def cidrBlockAsScala: Option[String] = Option(self.cidrBlock)

  final def egressAsScala: Option[Boolean] = Option(self.egress)

  final def icmpTypeCodeAsScala: Option[IcmpTypeCode] = Option(self.icmpTypeCode)

  final def ipv6CidrBlockAsScala: Option[String] = Option(self.ipv6CidrBlock)

  final def networkAclIdAsScala: Option[String] = Option(self.networkAclId)

  final def portRangeAsScala: Option[PortRange] = Option(self.portRange)

  final def protocolAsScala: Option[String] = Option(self.protocol)

  final def ruleActionAsScala: Option[RuleAction] = Option(self.ruleAction)

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

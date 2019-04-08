// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateNetworkAclEntryRequestBuilderOps(val self: CreateNetworkAclEntryRequest.Builder) extends AnyVal {

  final def cidrBlockAsScala(value: Option[String]): CreateNetworkAclEntryRequest.Builder = {
    value.fold(self) { v =>
      self.cidrBlock(v)
    }
  }

  final def egressAsScala(value: Option[Boolean]): CreateNetworkAclEntryRequest.Builder = {
    value.fold(self) { v =>
      self.egress(v)
    }
  }

  final def icmpTypeCodeAsScala(value: Option[IcmpTypeCode]): CreateNetworkAclEntryRequest.Builder = {
    value.fold(self) { v =>
      self.icmpTypeCode(v)
    }
  }

  final def ipv6CidrBlockAsScala(value: Option[String]): CreateNetworkAclEntryRequest.Builder = {
    value.fold(self) { v =>
      self.ipv6CidrBlock(v)
    }
  }

  final def networkAclIdAsScala(value: Option[String]): CreateNetworkAclEntryRequest.Builder = {
    value.fold(self) { v =>
      self.networkAclId(v)
    }
  }

  final def portRangeAsScala(value: Option[PortRange]): CreateNetworkAclEntryRequest.Builder = {
    value.fold(self) { v =>
      self.portRange(v)
    }
  }

  final def protocolAsScala(value: Option[String]): CreateNetworkAclEntryRequest.Builder = {
    value.fold(self) { v =>
      self.protocol(v)
    }
  }

  final def ruleActionAsScala(value: Option[RuleAction]): CreateNetworkAclEntryRequest.Builder = {
    value.fold(self) { v =>
      self.ruleAction(v)
    }
  }

  final def ruleNumberAsScala(value: Option[Int]): CreateNetworkAclEntryRequest.Builder = {
    value.fold(self) { v =>
      self.ruleNumber(v)
    }
  }

}

final class CreateNetworkAclEntryRequestOps(val self: CreateNetworkAclEntryRequest) extends AnyVal {

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
trait ToCreateNetworkAclEntryRequestOps {

  implicit def toCreateNetworkAclEntryRequestBuilderOps(
      v: CreateNetworkAclEntryRequest.Builder
  ): CreateNetworkAclEntryRequestBuilderOps = new CreateNetworkAclEntryRequestBuilderOps(v)

  implicit def toCreateNetworkAclEntryRequestOps(v: CreateNetworkAclEntryRequest): CreateNetworkAclEntryRequestOps =
    new CreateNetworkAclEntryRequestOps(v)

}

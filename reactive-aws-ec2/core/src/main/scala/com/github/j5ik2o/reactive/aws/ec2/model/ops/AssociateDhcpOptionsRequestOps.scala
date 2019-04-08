// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AssociateDhcpOptionsRequestBuilderOps(val self: AssociateDhcpOptionsRequest.Builder) extends AnyVal {

  final def dhcpOptionsIdAsScala(value: Option[String]): AssociateDhcpOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.dhcpOptionsId(v)
    }
  }

  final def vpcIdAsScala(value: Option[String]): AssociateDhcpOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

}

final class AssociateDhcpOptionsRequestOps(val self: AssociateDhcpOptionsRequest) extends AnyVal {

  final def dhcpOptionsIdAsScala: Option[String] = Option(self.dhcpOptionsId)

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssociateDhcpOptionsRequestOps {

  implicit def toAssociateDhcpOptionsRequestBuilderOps(
      v: AssociateDhcpOptionsRequest.Builder
  ): AssociateDhcpOptionsRequestBuilderOps = new AssociateDhcpOptionsRequestBuilderOps(v)

  implicit def toAssociateDhcpOptionsRequestOps(v: AssociateDhcpOptionsRequest): AssociateDhcpOptionsRequestOps =
    new AssociateDhcpOptionsRequestOps(v)

}

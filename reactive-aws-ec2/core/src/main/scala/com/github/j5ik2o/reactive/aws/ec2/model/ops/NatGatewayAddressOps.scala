// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class NatGatewayAddressBuilderOps(val self: NatGatewayAddress.Builder) extends AnyVal {

  final def allocationIdAsScala(value: Option[String]): NatGatewayAddress.Builder = {
    value.fold(self) { v =>
      self.allocationId(v)
    }
  }

  final def networkInterfaceIdAsScala(value: Option[String]): NatGatewayAddress.Builder = {
    value.fold(self) { v =>
      self.networkInterfaceId(v)
    }
  }

  final def privateIpAsScala(value: Option[String]): NatGatewayAddress.Builder = {
    value.fold(self) { v =>
      self.privateIp(v)
    }
  }

  final def publicIpAsScala(value: Option[String]): NatGatewayAddress.Builder = {
    value.fold(self) { v =>
      self.publicIp(v)
    }
  }

}

final class NatGatewayAddressOps(val self: NatGatewayAddress) extends AnyVal {

  final def allocationIdAsScala: Option[String] = Option(self.allocationId)

  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

  final def privateIpAsScala: Option[String] = Option(self.privateIp)

  final def publicIpAsScala: Option[String] = Option(self.publicIp)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNatGatewayAddressOps {

  implicit def toNatGatewayAddressBuilderOps(v: NatGatewayAddress.Builder): NatGatewayAddressBuilderOps =
    new NatGatewayAddressBuilderOps(v)

  implicit def toNatGatewayAddressOps(v: NatGatewayAddress): NatGatewayAddressOps = new NatGatewayAddressOps(v)

}

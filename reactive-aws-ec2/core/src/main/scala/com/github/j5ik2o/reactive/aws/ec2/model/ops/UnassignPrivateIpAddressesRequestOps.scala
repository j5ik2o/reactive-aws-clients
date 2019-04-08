// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class UnassignPrivateIpAddressesRequestBuilderOps(val self: UnassignPrivateIpAddressesRequest.Builder)
    extends AnyVal {

  final def networkInterfaceIdAsScala(value: Option[String]): UnassignPrivateIpAddressesRequest.Builder = {
    value.fold(self) { v =>
      self.networkInterfaceId(v)
    }
  }

  final def privateIpAddressesAsScala(value: Option[Seq[String]]): UnassignPrivateIpAddressesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.privateIpAddresses(v.asJava)
    }
  }

}

final class UnassignPrivateIpAddressesRequestOps(val self: UnassignPrivateIpAddressesRequest) extends AnyVal {

  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

  final def privateIpAddressesAsScala: Option[Seq[String]] = Option(self.privateIpAddresses).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUnassignPrivateIpAddressesRequestOps {

  implicit def toUnassignPrivateIpAddressesRequestBuilderOps(
      v: UnassignPrivateIpAddressesRequest.Builder
  ): UnassignPrivateIpAddressesRequestBuilderOps = new UnassignPrivateIpAddressesRequestBuilderOps(v)

  implicit def toUnassignPrivateIpAddressesRequestOps(
      v: UnassignPrivateIpAddressesRequest
  ): UnassignPrivateIpAddressesRequestOps = new UnassignPrivateIpAddressesRequestOps(v)

}

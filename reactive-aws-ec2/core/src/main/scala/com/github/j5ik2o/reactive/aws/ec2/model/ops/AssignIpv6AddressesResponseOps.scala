// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AssignIpv6AddressesResponseBuilderOps(val self: AssignIpv6AddressesResponse.Builder) extends AnyVal {

  final def assignedIpv6AddressesAsScala(value: Option[Seq[String]]): AssignIpv6AddressesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.assignedIpv6Addresses(v.asJava)
    }
  }

  final def networkInterfaceIdAsScala(value: Option[String]): AssignIpv6AddressesResponse.Builder = {
    value.fold(self) { v =>
      self.networkInterfaceId(v)
    }
  }

}

final class AssignIpv6AddressesResponseOps(val self: AssignIpv6AddressesResponse) extends AnyVal {

  final def assignedIpv6AddressesAsScala: Option[Seq[String]] = Option(self.assignedIpv6Addresses).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssignIpv6AddressesResponseOps {

  implicit def toAssignIpv6AddressesResponseBuilderOps(
      v: AssignIpv6AddressesResponse.Builder
  ): AssignIpv6AddressesResponseBuilderOps = new AssignIpv6AddressesResponseBuilderOps(v)

  implicit def toAssignIpv6AddressesResponseOps(v: AssignIpv6AddressesResponse): AssignIpv6AddressesResponseOps =
    new AssignIpv6AddressesResponseOps(v)

}

// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AssignIpv6AddressesResponseBuilderOps(val self: AssignIpv6AddressesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def assignedIpv6AddressesAsScala(value: Option[Seq[String]]): AssignIpv6AddressesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.assignedIpv6Addresses(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala(value: Option[String]): AssignIpv6AddressesResponse.Builder = {
    value.fold(self) { v => self.networkInterfaceId(v) }
  }

}

final class AssignIpv6AddressesResponseOps(val self: AssignIpv6AddressesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def assignedIpv6AddressesAsScala: Option[Seq[String]] =
    Option(self.assignedIpv6Addresses).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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

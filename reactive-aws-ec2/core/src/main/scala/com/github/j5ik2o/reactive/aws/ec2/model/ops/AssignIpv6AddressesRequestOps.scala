// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AssignIpv6AddressesRequestBuilderOps(val self: AssignIpv6AddressesRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6AddressCountAsScala(value: Option[Int]): AssignIpv6AddressesRequest.Builder = {
    value.fold(self) { v =>
      self.ipv6AddressCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6AddressesAsScala(value: Option[Seq[String]]): AssignIpv6AddressesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.ipv6Addresses(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala(value: Option[String]): AssignIpv6AddressesRequest.Builder = {
    value.fold(self) { v =>
      self.networkInterfaceId(v)
    }
  }

}

final class AssignIpv6AddressesRequestOps(val self: AssignIpv6AddressesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6AddressCountAsScala: Option[Int] = Option(self.ipv6AddressCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6AddressesAsScala: Option[Seq[String]] = Option(self.ipv6Addresses).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssignIpv6AddressesRequestOps {

  implicit def toAssignIpv6AddressesRequestBuilderOps(
      v: AssignIpv6AddressesRequest.Builder
  ): AssignIpv6AddressesRequestBuilderOps = new AssignIpv6AddressesRequestBuilderOps(v)

  implicit def toAssignIpv6AddressesRequestOps(v: AssignIpv6AddressesRequest): AssignIpv6AddressesRequestOps =
    new AssignIpv6AddressesRequestOps(v)

}

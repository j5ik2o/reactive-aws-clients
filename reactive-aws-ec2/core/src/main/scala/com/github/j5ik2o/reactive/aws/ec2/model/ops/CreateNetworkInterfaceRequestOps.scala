// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateNetworkInterfaceRequestBuilderOps(val self: CreateNetworkInterfaceRequest.Builder) extends AnyVal {

  final def descriptionAsScala(value: Option[String]): CreateNetworkInterfaceRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def groupsAsScala(value: Option[Seq[String]]): CreateNetworkInterfaceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.groups(v.asJava)
    }
  }

  final def ipv6AddressCountAsScala(value: Option[Int]): CreateNetworkInterfaceRequest.Builder = {
    value.fold(self) { v =>
      self.ipv6AddressCount(v)
    }
  }

  final def ipv6AddressesAsScala(value: Option[Seq[InstanceIpv6Address]]): CreateNetworkInterfaceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.ipv6Addresses(v.asJava)
    }
  }

  final def privateIpAddressAsScala(value: Option[String]): CreateNetworkInterfaceRequest.Builder = {
    value.fold(self) { v =>
      self.privateIpAddress(v)
    }
  }

  final def privateIpAddressesAsScala(
      value: Option[Seq[PrivateIpAddressSpecification]]
  ): CreateNetworkInterfaceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.privateIpAddresses(v.asJava)
    }
  }

  final def secondaryPrivateIpAddressCountAsScala(value: Option[Int]): CreateNetworkInterfaceRequest.Builder = {
    value.fold(self) { v =>
      self.secondaryPrivateIpAddressCount(v)
    }
  }

  final def subnetIdAsScala(value: Option[String]): CreateNetworkInterfaceRequest.Builder = {
    value.fold(self) { v =>
      self.subnetId(v)
    }
  }

}

final class CreateNetworkInterfaceRequestOps(val self: CreateNetworkInterfaceRequest) extends AnyVal {

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def groupsAsScala: Option[Seq[String]] = Option(self.groups).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def ipv6AddressCountAsScala: Option[Int] = Option(self.ipv6AddressCount)

  final def ipv6AddressesAsScala: Option[Seq[InstanceIpv6Address]] = Option(self.ipv6Addresses).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def privateIpAddressAsScala: Option[String] = Option(self.privateIpAddress)

  final def privateIpAddressesAsScala: Option[Seq[PrivateIpAddressSpecification]] =
    Option(self.privateIpAddresses).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def secondaryPrivateIpAddressCountAsScala: Option[Int] = Option(self.secondaryPrivateIpAddressCount)

  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateNetworkInterfaceRequestOps {

  implicit def toCreateNetworkInterfaceRequestBuilderOps(
      v: CreateNetworkInterfaceRequest.Builder
  ): CreateNetworkInterfaceRequestBuilderOps = new CreateNetworkInterfaceRequestBuilderOps(v)

  implicit def toCreateNetworkInterfaceRequestOps(v: CreateNetworkInterfaceRequest): CreateNetworkInterfaceRequestOps =
    new CreateNetworkInterfaceRequestOps(v)

}

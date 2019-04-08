// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class NetworkInterfaceAssociationBuilderOps(val self: NetworkInterfaceAssociation.Builder) extends AnyVal {

  final def allocationIdAsScala(value: Option[String]): NetworkInterfaceAssociation.Builder = {
    value.fold(self) { v =>
      self.allocationId(v)
    }
  }

  final def associationIdAsScala(value: Option[String]): NetworkInterfaceAssociation.Builder = {
    value.fold(self) { v =>
      self.associationId(v)
    }
  }

  final def ipOwnerIdAsScala(value: Option[String]): NetworkInterfaceAssociation.Builder = {
    value.fold(self) { v =>
      self.ipOwnerId(v)
    }
  }

  final def publicDnsNameAsScala(value: Option[String]): NetworkInterfaceAssociation.Builder = {
    value.fold(self) { v =>
      self.publicDnsName(v)
    }
  }

  final def publicIpAsScala(value: Option[String]): NetworkInterfaceAssociation.Builder = {
    value.fold(self) { v =>
      self.publicIp(v)
    }
  }

}

final class NetworkInterfaceAssociationOps(val self: NetworkInterfaceAssociation) extends AnyVal {

  final def allocationIdAsScala: Option[String] = Option(self.allocationId)

  final def associationIdAsScala: Option[String] = Option(self.associationId)

  final def ipOwnerIdAsScala: Option[String] = Option(self.ipOwnerId)

  final def publicDnsNameAsScala: Option[String] = Option(self.publicDnsName)

  final def publicIpAsScala: Option[String] = Option(self.publicIp)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNetworkInterfaceAssociationOps {

  implicit def toNetworkInterfaceAssociationBuilderOps(
      v: NetworkInterfaceAssociation.Builder
  ): NetworkInterfaceAssociationBuilderOps = new NetworkInterfaceAssociationBuilderOps(v)

  implicit def toNetworkInterfaceAssociationOps(v: NetworkInterfaceAssociation): NetworkInterfaceAssociationOps =
    new NetworkInterfaceAssociationOps(v)

}

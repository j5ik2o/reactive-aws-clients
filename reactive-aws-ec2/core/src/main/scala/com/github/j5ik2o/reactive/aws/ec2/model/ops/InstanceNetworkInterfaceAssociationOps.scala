// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceNetworkInterfaceAssociationBuilderOps(val self: InstanceNetworkInterfaceAssociation.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipOwnerIdAsScala(value: Option[String]): InstanceNetworkInterfaceAssociation.Builder = {
    value.fold(self) { v =>
      self.ipOwnerId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publicDnsNameAsScala(value: Option[String]): InstanceNetworkInterfaceAssociation.Builder = {
    value.fold(self) { v =>
      self.publicDnsName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publicIpAsScala(value: Option[String]): InstanceNetworkInterfaceAssociation.Builder = {
    value.fold(self) { v =>
      self.publicIp(v)
    }
  }

}

final class InstanceNetworkInterfaceAssociationOps(val self: InstanceNetworkInterfaceAssociation) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipOwnerIdAsScala: Option[String] = Option(self.ipOwnerId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publicDnsNameAsScala: Option[String] = Option(self.publicDnsName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publicIpAsScala: Option[String] = Option(self.publicIp)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceNetworkInterfaceAssociationOps {

  implicit def toInstanceNetworkInterfaceAssociationBuilderOps(
      v: InstanceNetworkInterfaceAssociation.Builder
  ): InstanceNetworkInterfaceAssociationBuilderOps = new InstanceNetworkInterfaceAssociationBuilderOps(v)

  implicit def toInstanceNetworkInterfaceAssociationOps(
      v: InstanceNetworkInterfaceAssociation
  ): InstanceNetworkInterfaceAssociationOps = new InstanceNetworkInterfaceAssociationOps(v)

}

// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceNetworkInterfaceBuilderOps(val self: InstanceNetworkInterface.Builder) extends AnyVal {

  final def associationAsScala(value: Option[InstanceNetworkInterfaceAssociation]): InstanceNetworkInterface.Builder = {
    value.fold(self) { v =>
      self.association(v)
    }
  }

  final def attachmentAsScala(value: Option[InstanceNetworkInterfaceAttachment]): InstanceNetworkInterface.Builder = {
    value.fold(self) { v =>
      self.attachment(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): InstanceNetworkInterface.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def groupsAsScala(value: Option[Seq[GroupIdentifier]]): InstanceNetworkInterface.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.groups(v.asJava)
    }
  }

  final def ipv6AddressesAsScala(value: Option[Seq[InstanceIpv6Address]]): InstanceNetworkInterface.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.ipv6Addresses(v.asJava)
    }
  }

  final def macAddressAsScala(value: Option[String]): InstanceNetworkInterface.Builder = {
    value.fold(self) { v =>
      self.macAddress(v)
    }
  }

  final def networkInterfaceIdAsScala(value: Option[String]): InstanceNetworkInterface.Builder = {
    value.fold(self) { v =>
      self.networkInterfaceId(v)
    }
  }

  final def ownerIdAsScala(value: Option[String]): InstanceNetworkInterface.Builder = {
    value.fold(self) { v =>
      self.ownerId(v)
    }
  }

  final def privateDnsNameAsScala(value: Option[String]): InstanceNetworkInterface.Builder = {
    value.fold(self) { v =>
      self.privateDnsName(v)
    }
  }

  final def privateIpAddressAsScala(value: Option[String]): InstanceNetworkInterface.Builder = {
    value.fold(self) { v =>
      self.privateIpAddress(v)
    }
  }

  final def privateIpAddressesAsScala(
      value: Option[Seq[InstancePrivateIpAddress]]
  ): InstanceNetworkInterface.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.privateIpAddresses(v.asJava)
    }
  }

  final def sourceDestCheckAsScala(value: Option[Boolean]): InstanceNetworkInterface.Builder = {
    value.fold(self) { v =>
      self.sourceDestCheck(v)
    }
  }

  final def statusAsScala(value: Option[NetworkInterfaceStatus]): InstanceNetworkInterface.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def subnetIdAsScala(value: Option[String]): InstanceNetworkInterface.Builder = {
    value.fold(self) { v =>
      self.subnetId(v)
    }
  }

  final def vpcIdAsScala(value: Option[String]): InstanceNetworkInterface.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

}

final class InstanceNetworkInterfaceOps(val self: InstanceNetworkInterface) extends AnyVal {

  final def associationAsScala: Option[InstanceNetworkInterfaceAssociation] = Option(self.association)

  final def attachmentAsScala: Option[InstanceNetworkInterfaceAttachment] = Option(self.attachment)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def groupsAsScala: Option[Seq[GroupIdentifier]] = Option(self.groups).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def ipv6AddressesAsScala: Option[Seq[InstanceIpv6Address]] = Option(self.ipv6Addresses).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def macAddressAsScala: Option[String] = Option(self.macAddress)

  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

  final def privateDnsNameAsScala: Option[String] = Option(self.privateDnsName)

  final def privateIpAddressAsScala: Option[String] = Option(self.privateIpAddress)

  final def privateIpAddressesAsScala: Option[Seq[InstancePrivateIpAddress]] = Option(self.privateIpAddresses).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala
  }

  final def sourceDestCheckAsScala: Option[Boolean] = Option(self.sourceDestCheck)

  final def statusAsScala: Option[NetworkInterfaceStatus] = Option(self.status)

  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceNetworkInterfaceOps {

  implicit def toInstanceNetworkInterfaceBuilderOps(
      v: InstanceNetworkInterface.Builder
  ): InstanceNetworkInterfaceBuilderOps = new InstanceNetworkInterfaceBuilderOps(v)

  implicit def toInstanceNetworkInterfaceOps(v: InstanceNetworkInterface): InstanceNetworkInterfaceOps =
    new InstanceNetworkInterfaceOps(v)

}

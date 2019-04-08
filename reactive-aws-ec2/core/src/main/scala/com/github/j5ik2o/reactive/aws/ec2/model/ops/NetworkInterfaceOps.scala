// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class NetworkInterfaceBuilderOps(val self: NetworkInterface.Builder) extends AnyVal {

  final def associationAsScala(value: Option[NetworkInterfaceAssociation]): NetworkInterface.Builder = {
    value.fold(self) { v =>
      self.association(v)
    }
  }

  final def attachmentAsScala(value: Option[NetworkInterfaceAttachment]): NetworkInterface.Builder = {
    value.fold(self) { v =>
      self.attachment(v)
    }
  }

  final def availabilityZoneAsScala(value: Option[String]): NetworkInterface.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): NetworkInterface.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def groupsAsScala(value: Option[Seq[GroupIdentifier]]): NetworkInterface.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.groups(v.asJava)
    }
  }

  final def interfaceTypeAsScala(value: Option[NetworkInterfaceType]): NetworkInterface.Builder = {
    value.fold(self) { v =>
      self.interfaceType(v)
    }
  }

  final def ipv6AddressesAsScala(value: Option[Seq[NetworkInterfaceIpv6Address]]): NetworkInterface.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.ipv6Addresses(v.asJava)
    }
  }

  final def macAddressAsScala(value: Option[String]): NetworkInterface.Builder = {
    value.fold(self) { v =>
      self.macAddress(v)
    }
  }

  final def networkInterfaceIdAsScala(value: Option[String]): NetworkInterface.Builder = {
    value.fold(self) { v =>
      self.networkInterfaceId(v)
    }
  }

  final def ownerIdAsScala(value: Option[String]): NetworkInterface.Builder = {
    value.fold(self) { v =>
      self.ownerId(v)
    }
  }

  final def privateDnsNameAsScala(value: Option[String]): NetworkInterface.Builder = {
    value.fold(self) { v =>
      self.privateDnsName(v)
    }
  }

  final def privateIpAddressAsScala(value: Option[String]): NetworkInterface.Builder = {
    value.fold(self) { v =>
      self.privateIpAddress(v)
    }
  }

  final def privateIpAddressesAsScala(
      value: Option[Seq[NetworkInterfacePrivateIpAddress]]
  ): NetworkInterface.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.privateIpAddresses(v.asJava)
    }
  }

  final def requesterIdAsScala(value: Option[String]): NetworkInterface.Builder = {
    value.fold(self) { v =>
      self.requesterId(v)
    }
  }

  final def requesterManagedAsScala(value: Option[Boolean]): NetworkInterface.Builder = {
    value.fold(self) { v =>
      self.requesterManaged(v)
    }
  }

  final def sourceDestCheckAsScala(value: Option[Boolean]): NetworkInterface.Builder = {
    value.fold(self) { v =>
      self.sourceDestCheck(v)
    }
  }

  final def statusAsScala(value: Option[NetworkInterfaceStatus]): NetworkInterface.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def subnetIdAsScala(value: Option[String]): NetworkInterface.Builder = {
    value.fold(self) { v =>
      self.subnetId(v)
    }
  }

  final def tagSetAsScala(value: Option[Seq[Tag]]): NetworkInterface.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tagSet(v.asJava)
    }
  }

  final def vpcIdAsScala(value: Option[String]): NetworkInterface.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

}

final class NetworkInterfaceOps(val self: NetworkInterface) extends AnyVal {

  final def associationAsScala: Option[NetworkInterfaceAssociation] = Option(self.association)

  final def attachmentAsScala: Option[NetworkInterfaceAttachment] = Option(self.attachment)

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def groupsAsScala: Option[Seq[GroupIdentifier]] = Option(self.groups).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def interfaceTypeAsScala: Option[NetworkInterfaceType] = Option(self.interfaceType)

  final def ipv6AddressesAsScala: Option[Seq[NetworkInterfaceIpv6Address]] = Option(self.ipv6Addresses).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def macAddressAsScala: Option[String] = Option(self.macAddress)

  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

  final def privateDnsNameAsScala: Option[String] = Option(self.privateDnsName)

  final def privateIpAddressAsScala: Option[String] = Option(self.privateIpAddress)

  final def privateIpAddressesAsScala: Option[Seq[NetworkInterfacePrivateIpAddress]] =
    Option(self.privateIpAddresses).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def requesterIdAsScala: Option[String] = Option(self.requesterId)

  final def requesterManagedAsScala: Option[Boolean] = Option(self.requesterManaged)

  final def sourceDestCheckAsScala: Option[Boolean] = Option(self.sourceDestCheck)

  final def statusAsScala: Option[NetworkInterfaceStatus] = Option(self.status)

  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

  final def tagSetAsScala: Option[Seq[Tag]] = Option(self.tagSet).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNetworkInterfaceOps {

  implicit def toNetworkInterfaceBuilderOps(v: NetworkInterface.Builder): NetworkInterfaceBuilderOps =
    new NetworkInterfaceBuilderOps(v)

  implicit def toNetworkInterfaceOps(v: NetworkInterface): NetworkInterfaceOps = new NetworkInterfaceOps(v)

}

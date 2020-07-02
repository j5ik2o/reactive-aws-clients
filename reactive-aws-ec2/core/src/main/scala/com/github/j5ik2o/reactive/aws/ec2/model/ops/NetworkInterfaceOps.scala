// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class NetworkInterfaceBuilderOps(val self: NetworkInterface.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationAsScala(value: Option[NetworkInterfaceAssociation]): NetworkInterface.Builder = {
    value.fold(self) { v => self.association(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentAsScala(value: Option[NetworkInterfaceAttachment]): NetworkInterface.Builder = {
    value.fold(self) { v => self.attachment(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala(value: Option[String]): NetworkInterface.Builder = {
    value.fold(self) { v => self.availabilityZone(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): NetworkInterface.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupsAsScala(value: Option[Seq[GroupIdentifier]]): NetworkInterface.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.groups(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def interfaceTypeAsScala(value: Option[NetworkInterfaceType]): NetworkInterface.Builder = {
    value.fold(self) { v => self.interfaceType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6AddressesAsScala(value: Option[Seq[NetworkInterfaceIpv6Address]]): NetworkInterface.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.ipv6Addresses(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def macAddressAsScala(value: Option[String]): NetworkInterface.Builder = {
    value.fold(self) { v => self.macAddress(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala(value: Option[String]): NetworkInterface.Builder = {
    value.fold(self) { v => self.networkInterfaceId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outpostArnAsScala(value: Option[String]): NetworkInterface.Builder = {
    value.fold(self) { v => self.outpostArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala(value: Option[String]): NetworkInterface.Builder = {
    value.fold(self) { v => self.ownerId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateDnsNameAsScala(value: Option[String]): NetworkInterface.Builder = {
    value.fold(self) { v => self.privateDnsName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateIpAddressAsScala(value: Option[String]): NetworkInterface.Builder = {
    value.fold(self) { v => self.privateIpAddress(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateIpAddressesAsScala(
      value: Option[Seq[NetworkInterfacePrivateIpAddress]]
  ): NetworkInterface.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.privateIpAddresses(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requesterIdAsScala(value: Option[String]): NetworkInterface.Builder = {
    value.fold(self) { v => self.requesterId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requesterManagedAsScala(value: Option[Boolean]): NetworkInterface.Builder = {
    value.fold(self) { v => self.requesterManaged(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceDestCheckAsScala(value: Option[Boolean]): NetworkInterface.Builder = {
    value.fold(self) { v => self.sourceDestCheck(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[NetworkInterfaceStatus]): NetworkInterface.Builder = {
    value.fold(self) { v => self.status(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala(value: Option[String]): NetworkInterface.Builder = {
    value.fold(self) { v => self.subnetId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSetAsScala(value: Option[Seq[Tag]]): NetworkInterface.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSet(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): NetworkInterface.Builder = {
    value.fold(self) { v => self.vpcId(v) }
  }

}

final class NetworkInterfaceOps(val self: NetworkInterface) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationAsScala: Option[NetworkInterfaceAssociation] = Option(self.association)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentAsScala: Option[NetworkInterfaceAttachment] = Option(self.attachment)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupsAsScala: Option[Seq[GroupIdentifier]] =
    Option(self.groups).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def interfaceTypeAsScala: Option[NetworkInterfaceType] = Option(self.interfaceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6AddressesAsScala: Option[Seq[NetworkInterfaceIpv6Address]] =
    Option(self.ipv6Addresses).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def macAddressAsScala: Option[String] = Option(self.macAddress)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outpostArnAsScala: Option[String] = Option(self.outpostArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateDnsNameAsScala: Option[String] = Option(self.privateDnsName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateIpAddressAsScala: Option[String] = Option(self.privateIpAddress)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateIpAddressesAsScala: Option[Seq[NetworkInterfacePrivateIpAddress]] =
    Option(self.privateIpAddresses).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requesterIdAsScala: Option[String] = Option(self.requesterId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requesterManagedAsScala: Option[Boolean] = Option(self.requesterManaged)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceDestCheckAsScala: Option[Boolean] = Option(self.sourceDestCheck)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[NetworkInterfaceStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSetAsScala: Option[Seq[Tag]] =
    Option(self.tagSet).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNetworkInterfaceOps {

  implicit def toNetworkInterfaceBuilderOps(v: NetworkInterface.Builder): NetworkInterfaceBuilderOps =
    new NetworkInterfaceBuilderOps(v)

  implicit def toNetworkInterfaceOps(v: NetworkInterface): NetworkInterfaceOps = new NetworkInterfaceOps(v)

}

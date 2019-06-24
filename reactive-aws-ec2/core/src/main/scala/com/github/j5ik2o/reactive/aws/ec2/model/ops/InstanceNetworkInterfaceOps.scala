// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceNetworkInterfaceBuilderOps(val self: InstanceNetworkInterface.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationAsScala(value: Option[InstanceNetworkInterfaceAssociation]): InstanceNetworkInterface.Builder = {
    value.fold(self) { v =>
      self.association(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentAsScala(value: Option[InstanceNetworkInterfaceAttachment]): InstanceNetworkInterface.Builder = {
    value.fold(self) { v =>
      self.attachment(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): InstanceNetworkInterface.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupsAsScala(value: Option[Seq[GroupIdentifier]]): InstanceNetworkInterface.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.groups(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6AddressesAsScala(value: Option[Seq[InstanceIpv6Address]]): InstanceNetworkInterface.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.ipv6Addresses(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def macAddressAsScala(value: Option[String]): InstanceNetworkInterface.Builder = {
    value.fold(self) { v =>
      self.macAddress(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala(value: Option[String]): InstanceNetworkInterface.Builder = {
    value.fold(self) { v =>
      self.networkInterfaceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala(value: Option[String]): InstanceNetworkInterface.Builder = {
    value.fold(self) { v =>
      self.ownerId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateDnsNameAsScala(value: Option[String]): InstanceNetworkInterface.Builder = {
    value.fold(self) { v =>
      self.privateDnsName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateIpAddressAsScala(value: Option[String]): InstanceNetworkInterface.Builder = {
    value.fold(self) { v =>
      self.privateIpAddress(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateIpAddressesAsScala(
      value: Option[Seq[InstancePrivateIpAddress]]
  ): InstanceNetworkInterface.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.privateIpAddresses(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceDestCheckAsScala(value: Option[Boolean]): InstanceNetworkInterface.Builder = {
    value.fold(self) { v =>
      self.sourceDestCheck(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[NetworkInterfaceStatus]): InstanceNetworkInterface.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala(value: Option[String]): InstanceNetworkInterface.Builder = {
    value.fold(self) { v =>
      self.subnetId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): InstanceNetworkInterface.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

}

final class InstanceNetworkInterfaceOps(val self: InstanceNetworkInterface) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationAsScala: Option[InstanceNetworkInterfaceAssociation] = Option(self.association)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentAsScala: Option[InstanceNetworkInterfaceAttachment] = Option(self.attachment)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupsAsScala: Option[Seq[GroupIdentifier]] = Option(self.groups).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6AddressesAsScala: Option[Seq[InstanceIpv6Address]] = Option(self.ipv6Addresses).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def macAddressAsScala: Option[String] = Option(self.macAddress)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateDnsNameAsScala: Option[String] = Option(self.privateDnsName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateIpAddressAsScala: Option[String] = Option(self.privateIpAddress)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateIpAddressesAsScala: Option[Seq[InstancePrivateIpAddress]] = Option(self.privateIpAddresses).map {
    v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceDestCheckAsScala: Option[Boolean] = Option(self.sourceDestCheck)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[NetworkInterfaceStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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

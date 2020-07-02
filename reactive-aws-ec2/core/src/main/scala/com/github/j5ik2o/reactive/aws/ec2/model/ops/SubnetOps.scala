// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SubnetBuilderOps(val self: Subnet.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala(value: Option[String]): Subnet.Builder = {
    value.fold(self) { v => self.availabilityZone(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneIdAsScala(value: Option[String]): Subnet.Builder = {
    value.fold(self) { v => self.availabilityZoneId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availableIpAddressCountAsScala(value: Option[Int]): Subnet.Builder = {
    value.fold(self) { v => self.availableIpAddressCount(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrBlockAsScala(value: Option[String]): Subnet.Builder = {
    value.fold(self) { v => self.cidrBlock(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultForAzAsScala(value: Option[Boolean]): Subnet.Builder = {
    value.fold(self) { v => self.defaultForAz(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def mapPublicIpOnLaunchAsScala(value: Option[Boolean]): Subnet.Builder = {
    value.fold(self) { v => self.mapPublicIpOnLaunch(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[SubnetState]): Subnet.Builder = {
    value.fold(self) { v => self.state(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala(value: Option[String]): Subnet.Builder = {
    value.fold(self) { v => self.subnetId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): Subnet.Builder = {
    value.fold(self) { v => self.vpcId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala(value: Option[String]): Subnet.Builder = {
    value.fold(self) { v => self.ownerId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def assignIpv6AddressOnCreationAsScala(value: Option[Boolean]): Subnet.Builder = {
    value.fold(self) { v => self.assignIpv6AddressOnCreation(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6CidrBlockAssociationSetAsScala(value: Option[Seq[SubnetIpv6CidrBlockAssociation]]): Subnet.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.ipv6CidrBlockAssociationSet(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): Subnet.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetArnAsScala(value: Option[String]): Subnet.Builder = {
    value.fold(self) { v => self.subnetArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outpostArnAsScala(value: Option[String]): Subnet.Builder = {
    value.fold(self) { v => self.outpostArn(v) }
  }

}

final class SubnetOps(val self: Subnet) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneIdAsScala: Option[String] = Option(self.availabilityZoneId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availableIpAddressCountAsScala: Option[Int] = Option(self.availableIpAddressCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrBlockAsScala: Option[String] = Option(self.cidrBlock)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultForAzAsScala: Option[Boolean] = Option(self.defaultForAz)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def mapPublicIpOnLaunchAsScala: Option[Boolean] = Option(self.mapPublicIpOnLaunch)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[SubnetState] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def assignIpv6AddressOnCreationAsScala: Option[Boolean] = Option(self.assignIpv6AddressOnCreation)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6CidrBlockAssociationSetAsScala: Option[Seq[SubnetIpv6CidrBlockAssociation]] =
    Option(self.ipv6CidrBlockAssociationSet).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetArnAsScala: Option[String] = Option(self.subnetArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outpostArnAsScala: Option[String] = Option(self.outpostArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSubnetOps {

  implicit def toSubnetBuilderOps(v: Subnet.Builder): SubnetBuilderOps = new SubnetBuilderOps(v)

  implicit def toSubnetOps(v: Subnet): SubnetOps = new SubnetOps(v)

}

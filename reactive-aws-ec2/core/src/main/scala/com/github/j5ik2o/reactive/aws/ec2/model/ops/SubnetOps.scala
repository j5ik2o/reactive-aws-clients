// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SubnetBuilderOps(val self: Subnet.Builder) extends AnyVal {

  final def availabilityZoneAsScala(value: Option[String]): Subnet.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  final def availabilityZoneIdAsScala(value: Option[String]): Subnet.Builder = {
    value.fold(self) { v =>
      self.availabilityZoneId(v)
    }
  }

  final def availableIpAddressCountAsScala(value: Option[Int]): Subnet.Builder = {
    value.fold(self) { v =>
      self.availableIpAddressCount(v)
    }
  }

  final def cidrBlockAsScala(value: Option[String]): Subnet.Builder = {
    value.fold(self) { v =>
      self.cidrBlock(v)
    }
  }

  final def defaultForAzAsScala(value: Option[Boolean]): Subnet.Builder = {
    value.fold(self) { v =>
      self.defaultForAz(v)
    }
  }

  final def mapPublicIpOnLaunchAsScala(value: Option[Boolean]): Subnet.Builder = {
    value.fold(self) { v =>
      self.mapPublicIpOnLaunch(v)
    }
  }

  final def stateAsScala(value: Option[SubnetState]): Subnet.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def subnetIdAsScala(value: Option[String]): Subnet.Builder = {
    value.fold(self) { v =>
      self.subnetId(v)
    }
  }

  final def vpcIdAsScala(value: Option[String]): Subnet.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

  final def ownerIdAsScala(value: Option[String]): Subnet.Builder = {
    value.fold(self) { v =>
      self.ownerId(v)
    }
  }

  final def assignIpv6AddressOnCreationAsScala(value: Option[Boolean]): Subnet.Builder = {
    value.fold(self) { v =>
      self.assignIpv6AddressOnCreation(v)
    }
  }

  final def ipv6CidrBlockAssociationSetAsScala(value: Option[Seq[SubnetIpv6CidrBlockAssociation]]): Subnet.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.ipv6CidrBlockAssociationSet(v.asJava)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): Subnet.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def subnetArnAsScala(value: Option[String]): Subnet.Builder = {
    value.fold(self) { v =>
      self.subnetArn(v)
    }
  }

}

final class SubnetOps(val self: Subnet) extends AnyVal {

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  final def availabilityZoneIdAsScala: Option[String] = Option(self.availabilityZoneId)

  final def availableIpAddressCountAsScala: Option[Int] = Option(self.availableIpAddressCount)

  final def cidrBlockAsScala: Option[String] = Option(self.cidrBlock)

  final def defaultForAzAsScala: Option[Boolean] = Option(self.defaultForAz)

  final def mapPublicIpOnLaunchAsScala: Option[Boolean] = Option(self.mapPublicIpOnLaunch)

  final def stateAsScala: Option[SubnetState] = Option(self.state)

  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

  final def assignIpv6AddressOnCreationAsScala: Option[Boolean] = Option(self.assignIpv6AddressOnCreation)

  final def ipv6CidrBlockAssociationSetAsScala: Option[Seq[SubnetIpv6CidrBlockAssociation]] =
    Option(self.ipv6CidrBlockAssociationSet).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def subnetArnAsScala: Option[String] = Option(self.subnetArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSubnetOps {

  implicit def toSubnetBuilderOps(v: Subnet.Builder): SubnetBuilderOps = new SubnetBuilderOps(v)

  implicit def toSubnetOps(v: Subnet): SubnetOps = new SubnetOps(v)

}

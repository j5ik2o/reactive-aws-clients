// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VpcBuilderOps(val self: Vpc.Builder) extends AnyVal {

  final def cidrBlockAsScala(value: Option[String]): Vpc.Builder = {
    value.fold(self) { v =>
      self.cidrBlock(v)
    }
  }

  final def dhcpOptionsIdAsScala(value: Option[String]): Vpc.Builder = {
    value.fold(self) { v =>
      self.dhcpOptionsId(v)
    }
  }

  final def stateAsScala(value: Option[VpcState]): Vpc.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def vpcIdAsScala(value: Option[String]): Vpc.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

  final def ownerIdAsScala(value: Option[String]): Vpc.Builder = {
    value.fold(self) { v =>
      self.ownerId(v)
    }
  }

  final def instanceTenancyAsScala(value: Option[Tenancy]): Vpc.Builder = {
    value.fold(self) { v =>
      self.instanceTenancy(v)
    }
  }

  final def ipv6CidrBlockAssociationSetAsScala(value: Option[Seq[VpcIpv6CidrBlockAssociation]]): Vpc.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.ipv6CidrBlockAssociationSet(v.asJava)
    }
  }

  final def cidrBlockAssociationSetAsScala(value: Option[Seq[VpcCidrBlockAssociation]]): Vpc.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.cidrBlockAssociationSet(v.asJava)
    }
  }

  final def isDefaultAsScala(value: Option[Boolean]): Vpc.Builder = {
    value.fold(self) { v =>
      self.isDefault(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): Vpc.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class VpcOps(val self: Vpc) extends AnyVal {

  final def cidrBlockAsScala: Option[String] = Option(self.cidrBlock)

  final def dhcpOptionsIdAsScala: Option[String] = Option(self.dhcpOptionsId)

  final def stateAsScala: Option[VpcState] = Option(self.state)

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

  final def instanceTenancyAsScala: Option[Tenancy] = Option(self.instanceTenancy)

  final def ipv6CidrBlockAssociationSetAsScala: Option[Seq[VpcIpv6CidrBlockAssociation]] =
    Option(self.ipv6CidrBlockAssociationSet).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def cidrBlockAssociationSetAsScala: Option[Seq[VpcCidrBlockAssociation]] =
    Option(self.cidrBlockAssociationSet).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def isDefaultAsScala: Option[Boolean] = Option(self.isDefault)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVpcOps {

  implicit def toVpcBuilderOps(v: Vpc.Builder): VpcBuilderOps = new VpcBuilderOps(v)

  implicit def toVpcOps(v: Vpc): VpcOps = new VpcOps(v)

}

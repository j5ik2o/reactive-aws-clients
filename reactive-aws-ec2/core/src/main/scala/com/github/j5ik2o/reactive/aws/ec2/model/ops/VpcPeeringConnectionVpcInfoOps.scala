// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VpcPeeringConnectionVpcInfoBuilderOps(val self: VpcPeeringConnectionVpcInfo.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrBlockAsScala(value: Option[String]): VpcPeeringConnectionVpcInfo.Builder = {
    value.fold(self) { v =>
      self.cidrBlock(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6CidrBlockSetAsScala(value: Option[Seq[Ipv6CidrBlock]]): VpcPeeringConnectionVpcInfo.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.ipv6CidrBlockSet(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrBlockSetAsScala(value: Option[Seq[CidrBlock]]): VpcPeeringConnectionVpcInfo.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.cidrBlockSet(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala(value: Option[String]): VpcPeeringConnectionVpcInfo.Builder = {
    value.fold(self) { v =>
      self.ownerId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def peeringOptionsAsScala(
      value: Option[VpcPeeringConnectionOptionsDescription]
  ): VpcPeeringConnectionVpcInfo.Builder = {
    value.fold(self) { v =>
      self.peeringOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): VpcPeeringConnectionVpcInfo.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionAsScala(value: Option[String]): VpcPeeringConnectionVpcInfo.Builder = {
    value.fold(self) { v =>
      self.region(v)
    }
  }

}

final class VpcPeeringConnectionVpcInfoOps(val self: VpcPeeringConnectionVpcInfo) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrBlockAsScala: Option[String] = Option(self.cidrBlock)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6CidrBlockSetAsScala: Option[Seq[Ipv6CidrBlock]] = Option(self.ipv6CidrBlockSet).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrBlockSetAsScala: Option[Seq[CidrBlock]] = Option(self.cidrBlockSet).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def peeringOptionsAsScala: Option[VpcPeeringConnectionOptionsDescription] = Option(self.peeringOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionAsScala: Option[String] = Option(self.region)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVpcPeeringConnectionVpcInfoOps {

  implicit def toVpcPeeringConnectionVpcInfoBuilderOps(
      v: VpcPeeringConnectionVpcInfo.Builder
  ): VpcPeeringConnectionVpcInfoBuilderOps = new VpcPeeringConnectionVpcInfoBuilderOps(v)

  implicit def toVpcPeeringConnectionVpcInfoOps(v: VpcPeeringConnectionVpcInfo): VpcPeeringConnectionVpcInfoOps =
    new VpcPeeringConnectionVpcInfoOps(v)

}

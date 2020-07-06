// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateSubnetRequestBuilderOps(val self: CreateSubnetRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): CreateSubnetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSpecifications(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala(value: Option[String]): CreateSubnetRequest.Builder = {
    value.fold(self) { v => self.availabilityZone(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneIdAsScala(value: Option[String]): CreateSubnetRequest.Builder = {
    value.fold(self) { v => self.availabilityZoneId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrBlockAsScala(value: Option[String]): CreateSubnetRequest.Builder = {
    value.fold(self) { v => self.cidrBlock(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6CidrBlockAsScala(value: Option[String]): CreateSubnetRequest.Builder = {
    value.fold(self) { v => self.ipv6CidrBlock(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outpostArnAsScala(value: Option[String]): CreateSubnetRequest.Builder = {
    value.fold(self) { v => self.outpostArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): CreateSubnetRequest.Builder = {
    value.fold(self) { v => self.vpcId(v) }
  }

}

final class CreateSubnetRequestOps(val self: CreateSubnetRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] =
    Option(self.tagSpecifications).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneIdAsScala: Option[String] = Option(self.availabilityZoneId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrBlockAsScala: Option[String] = Option(self.cidrBlock)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6CidrBlockAsScala: Option[String] = Option(self.ipv6CidrBlock)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outpostArnAsScala: Option[String] = Option(self.outpostArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateSubnetRequestOps {

  implicit def toCreateSubnetRequestBuilderOps(v: CreateSubnetRequest.Builder): CreateSubnetRequestBuilderOps =
    new CreateSubnetRequestBuilderOps(v)

  implicit def toCreateSubnetRequestOps(v: CreateSubnetRequest): CreateSubnetRequestOps = new CreateSubnetRequestOps(v)

}

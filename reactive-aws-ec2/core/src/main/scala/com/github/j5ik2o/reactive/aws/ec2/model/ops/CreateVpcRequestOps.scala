// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateVpcRequestBuilderOps(val self: CreateVpcRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrBlockAsScala(value: Option[String]): CreateVpcRequest.Builder = {
    value.fold(self) { v => self.cidrBlock(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def amazonProvidedIpv6CidrBlockAsScala(value: Option[Boolean]): CreateVpcRequest.Builder = {
    value.fold(self) { v => self.amazonProvidedIpv6CidrBlock(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6PoolAsScala(value: Option[String]): CreateVpcRequest.Builder = {
    value.fold(self) { v => self.ipv6Pool(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6CidrBlockAsScala(value: Option[String]): CreateVpcRequest.Builder = {
    value.fold(self) { v => self.ipv6CidrBlock(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTenancyAsScala(value: Option[Tenancy]): CreateVpcRequest.Builder = {
    value.fold(self) { v => self.instanceTenancy(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6CidrBlockNetworkBorderGroupAsScala(value: Option[String]): CreateVpcRequest.Builder = {
    value.fold(self) { v => self.ipv6CidrBlockNetworkBorderGroup(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): CreateVpcRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSpecifications(v.asJava)
    }
  }

}

final class CreateVpcRequestOps(val self: CreateVpcRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrBlockAsScala: Option[String] = Option(self.cidrBlock)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def amazonProvidedIpv6CidrBlockAsScala: Option[Boolean] = Option(self.amazonProvidedIpv6CidrBlock)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6PoolAsScala: Option[String] = Option(self.ipv6Pool)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6CidrBlockAsScala: Option[String] = Option(self.ipv6CidrBlock)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTenancyAsScala: Option[Tenancy] = Option(self.instanceTenancy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6CidrBlockNetworkBorderGroupAsScala: Option[String] = Option(self.ipv6CidrBlockNetworkBorderGroup)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] =
    Option(self.tagSpecifications).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateVpcRequestOps {

  implicit def toCreateVpcRequestBuilderOps(v: CreateVpcRequest.Builder): CreateVpcRequestBuilderOps =
    new CreateVpcRequestBuilderOps(v)

  implicit def toCreateVpcRequestOps(v: CreateVpcRequest): CreateVpcRequestOps = new CreateVpcRequestOps(v)

}

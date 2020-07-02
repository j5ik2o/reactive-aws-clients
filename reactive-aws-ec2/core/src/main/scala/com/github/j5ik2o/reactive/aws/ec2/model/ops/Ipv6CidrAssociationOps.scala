// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class Ipv6CidrAssociationBuilderOps(val self: Ipv6CidrAssociation.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6CidrAsScala(value: Option[String]): Ipv6CidrAssociation.Builder = {
    value.fold(self) { v => self.ipv6Cidr(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associatedResourceAsScala(value: Option[String]): Ipv6CidrAssociation.Builder = {
    value.fold(self) { v => self.associatedResource(v) }
  }

}

final class Ipv6CidrAssociationOps(val self: Ipv6CidrAssociation) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6CidrAsScala: Option[String] = Option(self.ipv6Cidr)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associatedResourceAsScala: Option[String] = Option(self.associatedResource)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToIpv6CidrAssociationOps {

  implicit def toIpv6CidrAssociationBuilderOps(v: Ipv6CidrAssociation.Builder): Ipv6CidrAssociationBuilderOps =
    new Ipv6CidrAssociationBuilderOps(v)

  implicit def toIpv6CidrAssociationOps(v: Ipv6CidrAssociation): Ipv6CidrAssociationOps = new Ipv6CidrAssociationOps(v)

}

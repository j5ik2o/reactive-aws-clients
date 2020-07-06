// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PrefixListAssociationBuilderOps(val self: PrefixListAssociation.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceIdAsScala(value: Option[String]): PrefixListAssociation.Builder = {
    value.fold(self) { v => self.resourceId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceOwnerAsScala(value: Option[String]): PrefixListAssociation.Builder = {
    value.fold(self) { v => self.resourceOwner(v) }
  }

}

final class PrefixListAssociationOps(val self: PrefixListAssociation) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceIdAsScala: Option[String] = Option(self.resourceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceOwnerAsScala: Option[String] = Option(self.resourceOwner)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPrefixListAssociationOps {

  implicit def toPrefixListAssociationBuilderOps(v: PrefixListAssociation.Builder): PrefixListAssociationBuilderOps =
    new PrefixListAssociationBuilderOps(v)

  implicit def toPrefixListAssociationOps(v: PrefixListAssociation): PrefixListAssociationOps =
    new PrefixListAssociationOps(v)

}

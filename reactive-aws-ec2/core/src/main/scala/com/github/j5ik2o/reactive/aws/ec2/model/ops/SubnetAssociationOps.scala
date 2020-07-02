// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SubnetAssociationBuilderOps(val self: SubnetAssociation.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala(value: Option[String]): SubnetAssociation.Builder = {
    value.fold(self) { v => self.subnetId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[TransitGatewayMulitcastDomainAssociationState]): SubnetAssociation.Builder = {
    value.fold(self) { v => self.state(v) }
  }

}

final class SubnetAssociationOps(val self: SubnetAssociation) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[TransitGatewayMulitcastDomainAssociationState] = Option(self.state)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSubnetAssociationOps {

  implicit def toSubnetAssociationBuilderOps(v: SubnetAssociation.Builder): SubnetAssociationBuilderOps =
    new SubnetAssociationBuilderOps(v)

  implicit def toSubnetAssociationOps(v: SubnetAssociation): SubnetAssociationOps = new SubnetAssociationOps(v)

}

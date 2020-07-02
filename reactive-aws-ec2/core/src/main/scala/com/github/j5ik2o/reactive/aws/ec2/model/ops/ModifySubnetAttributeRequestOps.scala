// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifySubnetAttributeRequestBuilderOps(val self: ModifySubnetAttributeRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def assignIpv6AddressOnCreationAsScala(
      value: Option[AttributeBooleanValue]
  ): ModifySubnetAttributeRequest.Builder = {
    value.fold(self) { v => self.assignIpv6AddressOnCreation(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def mapPublicIpOnLaunchAsScala(value: Option[AttributeBooleanValue]): ModifySubnetAttributeRequest.Builder = {
    value.fold(self) { v => self.mapPublicIpOnLaunch(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala(value: Option[String]): ModifySubnetAttributeRequest.Builder = {
    value.fold(self) { v => self.subnetId(v) }
  }

}

final class ModifySubnetAttributeRequestOps(val self: ModifySubnetAttributeRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def assignIpv6AddressOnCreationAsScala: Option[AttributeBooleanValue] = Option(self.assignIpv6AddressOnCreation)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def mapPublicIpOnLaunchAsScala: Option[AttributeBooleanValue] = Option(self.mapPublicIpOnLaunch)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifySubnetAttributeRequestOps {

  implicit def toModifySubnetAttributeRequestBuilderOps(
      v: ModifySubnetAttributeRequest.Builder
  ): ModifySubnetAttributeRequestBuilderOps = new ModifySubnetAttributeRequestBuilderOps(v)

  implicit def toModifySubnetAttributeRequestOps(v: ModifySubnetAttributeRequest): ModifySubnetAttributeRequestOps =
    new ModifySubnetAttributeRequestOps(v)

}

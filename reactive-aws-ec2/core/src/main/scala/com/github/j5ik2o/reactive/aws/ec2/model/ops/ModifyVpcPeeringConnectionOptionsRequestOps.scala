// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyVpcPeeringConnectionOptionsRequestBuilderOps(
    val self: ModifyVpcPeeringConnectionOptionsRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accepterPeeringConnectionOptionsAsScala(
      value: Option[PeeringConnectionOptionsRequest]
  ): ModifyVpcPeeringConnectionOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.accepterPeeringConnectionOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requesterPeeringConnectionOptionsAsScala(
      value: Option[PeeringConnectionOptionsRequest]
  ): ModifyVpcPeeringConnectionOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.requesterPeeringConnectionOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcPeeringConnectionIdAsScala(value: Option[String]): ModifyVpcPeeringConnectionOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.vpcPeeringConnectionId(v)
    }
  }

}

final class ModifyVpcPeeringConnectionOptionsRequestOps(val self: ModifyVpcPeeringConnectionOptionsRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accepterPeeringConnectionOptionsAsScala: Option[PeeringConnectionOptionsRequest] =
    Option(self.accepterPeeringConnectionOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requesterPeeringConnectionOptionsAsScala: Option[PeeringConnectionOptionsRequest] =
    Option(self.requesterPeeringConnectionOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcPeeringConnectionIdAsScala: Option[String] = Option(self.vpcPeeringConnectionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyVpcPeeringConnectionOptionsRequestOps {

  implicit def toModifyVpcPeeringConnectionOptionsRequestBuilderOps(
      v: ModifyVpcPeeringConnectionOptionsRequest.Builder
  ): ModifyVpcPeeringConnectionOptionsRequestBuilderOps = new ModifyVpcPeeringConnectionOptionsRequestBuilderOps(v)

  implicit def toModifyVpcPeeringConnectionOptionsRequestOps(
      v: ModifyVpcPeeringConnectionOptionsRequest
  ): ModifyVpcPeeringConnectionOptionsRequestOps = new ModifyVpcPeeringConnectionOptionsRequestOps(v)

}

// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyVpcPeeringConnectionOptionsResponseBuilderOps(
    val self: ModifyVpcPeeringConnectionOptionsResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accepterPeeringConnectionOptionsAsScala(
      value: Option[PeeringConnectionOptions]
  ): ModifyVpcPeeringConnectionOptionsResponse.Builder = {
    value.fold(self) { v => self.accepterPeeringConnectionOptions(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requesterPeeringConnectionOptionsAsScala(
      value: Option[PeeringConnectionOptions]
  ): ModifyVpcPeeringConnectionOptionsResponse.Builder = {
    value.fold(self) { v => self.requesterPeeringConnectionOptions(v) }
  }

}

final class ModifyVpcPeeringConnectionOptionsResponseOps(val self: ModifyVpcPeeringConnectionOptionsResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accepterPeeringConnectionOptionsAsScala: Option[PeeringConnectionOptions] =
    Option(self.accepterPeeringConnectionOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requesterPeeringConnectionOptionsAsScala: Option[PeeringConnectionOptions] =
    Option(self.requesterPeeringConnectionOptions)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyVpcPeeringConnectionOptionsResponseOps {

  implicit def toModifyVpcPeeringConnectionOptionsResponseBuilderOps(
      v: ModifyVpcPeeringConnectionOptionsResponse.Builder
  ): ModifyVpcPeeringConnectionOptionsResponseBuilderOps = new ModifyVpcPeeringConnectionOptionsResponseBuilderOps(v)

  implicit def toModifyVpcPeeringConnectionOptionsResponseOps(
      v: ModifyVpcPeeringConnectionOptionsResponse
  ): ModifyVpcPeeringConnectionOptionsResponseOps = new ModifyVpcPeeringConnectionOptionsResponseOps(v)

}

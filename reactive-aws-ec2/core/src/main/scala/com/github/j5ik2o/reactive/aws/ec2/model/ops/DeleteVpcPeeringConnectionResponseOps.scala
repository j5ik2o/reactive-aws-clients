// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteVpcPeeringConnectionResponseBuilderOps(val self: DeleteVpcPeeringConnectionResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala(value: Option[Boolean]): DeleteVpcPeeringConnectionResponse.Builder = {
    value.fold(self) { v => self.returnValue(v) }
  }

}

final class DeleteVpcPeeringConnectionResponseOps(val self: DeleteVpcPeeringConnectionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala: Option[Boolean] = Option(self.returnValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteVpcPeeringConnectionResponseOps {

  implicit def toDeleteVpcPeeringConnectionResponseBuilderOps(
      v: DeleteVpcPeeringConnectionResponse.Builder
  ): DeleteVpcPeeringConnectionResponseBuilderOps = new DeleteVpcPeeringConnectionResponseBuilderOps(v)

  implicit def toDeleteVpcPeeringConnectionResponseOps(
      v: DeleteVpcPeeringConnectionResponse
  ): DeleteVpcPeeringConnectionResponseOps = new DeleteVpcPeeringConnectionResponseOps(v)

}

// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RejectVpcPeeringConnectionResponseBuilderOps(val self: RejectVpcPeeringConnectionResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala(value: Option[Boolean]): RejectVpcPeeringConnectionResponse.Builder = {
    value.fold(self) { v => self.returnValue(v) }
  }

}

final class RejectVpcPeeringConnectionResponseOps(val self: RejectVpcPeeringConnectionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala: Option[Boolean] = Option(self.returnValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRejectVpcPeeringConnectionResponseOps {

  implicit def toRejectVpcPeeringConnectionResponseBuilderOps(
      v: RejectVpcPeeringConnectionResponse.Builder
  ): RejectVpcPeeringConnectionResponseBuilderOps = new RejectVpcPeeringConnectionResponseBuilderOps(v)

  implicit def toRejectVpcPeeringConnectionResponseOps(
      v: RejectVpcPeeringConnectionResponse
  ): RejectVpcPeeringConnectionResponseOps = new RejectVpcPeeringConnectionResponseOps(v)

}

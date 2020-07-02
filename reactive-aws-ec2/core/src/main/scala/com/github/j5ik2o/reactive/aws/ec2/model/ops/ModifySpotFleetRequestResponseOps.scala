// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifySpotFleetRequestResponseBuilderOps(val self: ModifySpotFleetRequestResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala(value: Option[Boolean]): ModifySpotFleetRequestResponse.Builder = {
    value.fold(self) { v => self.returnValue(v) }
  }

}

final class ModifySpotFleetRequestResponseOps(val self: ModifySpotFleetRequestResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala: Option[Boolean] = Option(self.returnValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifySpotFleetRequestResponseOps {

  implicit def toModifySpotFleetRequestResponseBuilderOps(
      v: ModifySpotFleetRequestResponse.Builder
  ): ModifySpotFleetRequestResponseBuilderOps = new ModifySpotFleetRequestResponseBuilderOps(v)

  implicit def toModifySpotFleetRequestResponseOps(
      v: ModifySpotFleetRequestResponse
  ): ModifySpotFleetRequestResponseOps = new ModifySpotFleetRequestResponseOps(v)

}

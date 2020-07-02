// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyCapacityReservationResponseBuilderOps(val self: ModifyCapacityReservationResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala(value: Option[Boolean]): ModifyCapacityReservationResponse.Builder = {
    value.fold(self) { v => self.returnValue(v) }
  }

}

final class ModifyCapacityReservationResponseOps(val self: ModifyCapacityReservationResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala: Option[Boolean] = Option(self.returnValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyCapacityReservationResponseOps {

  implicit def toModifyCapacityReservationResponseBuilderOps(
      v: ModifyCapacityReservationResponse.Builder
  ): ModifyCapacityReservationResponseBuilderOps = new ModifyCapacityReservationResponseBuilderOps(v)

  implicit def toModifyCapacityReservationResponseOps(
      v: ModifyCapacityReservationResponse
  ): ModifyCapacityReservationResponseOps = new ModifyCapacityReservationResponseOps(v)

}

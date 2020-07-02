// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyInstanceCapacityReservationAttributesResponseBuilderOps(
    val self: ModifyInstanceCapacityReservationAttributesResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala(value: Option[Boolean]): ModifyInstanceCapacityReservationAttributesResponse.Builder = {
    value.fold(self) { v => self.returnValue(v) }
  }

}

final class ModifyInstanceCapacityReservationAttributesResponseOps(
    val self: ModifyInstanceCapacityReservationAttributesResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala: Option[Boolean] = Option(self.returnValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyInstanceCapacityReservationAttributesResponseOps {

  implicit def toModifyInstanceCapacityReservationAttributesResponseBuilderOps(
      v: ModifyInstanceCapacityReservationAttributesResponse.Builder
  ): ModifyInstanceCapacityReservationAttributesResponseBuilderOps =
    new ModifyInstanceCapacityReservationAttributesResponseBuilderOps(v)

  implicit def toModifyInstanceCapacityReservationAttributesResponseOps(
      v: ModifyInstanceCapacityReservationAttributesResponse
  ): ModifyInstanceCapacityReservationAttributesResponseOps =
    new ModifyInstanceCapacityReservationAttributesResponseOps(v)

}

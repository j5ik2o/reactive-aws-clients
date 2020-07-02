// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyCapacityReservationRequestBuilderOps(val self: ModifyCapacityReservationRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityReservationIdAsScala(value: Option[String]): ModifyCapacityReservationRequest.Builder = {
    value.fold(self) { v => self.capacityReservationId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceCountAsScala(value: Option[Int]): ModifyCapacityReservationRequest.Builder = {
    value.fold(self) { v => self.instanceCount(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endDateAsScala(value: Option[java.time.Instant]): ModifyCapacityReservationRequest.Builder = {
    value.fold(self) { v => self.endDate(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endDateTypeAsScala(value: Option[EndDateType]): ModifyCapacityReservationRequest.Builder = {
    value.fold(self) { v => self.endDateType(v) }
  }

}

final class ModifyCapacityReservationRequestOps(val self: ModifyCapacityReservationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityReservationIdAsScala: Option[String] = Option(self.capacityReservationId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceCountAsScala: Option[Int] = Option(self.instanceCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endDateAsScala: Option[java.time.Instant] = Option(self.endDate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endDateTypeAsScala: Option[EndDateType] = Option(self.endDateType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyCapacityReservationRequestOps {

  implicit def toModifyCapacityReservationRequestBuilderOps(
      v: ModifyCapacityReservationRequest.Builder
  ): ModifyCapacityReservationRequestBuilderOps = new ModifyCapacityReservationRequestBuilderOps(v)

  implicit def toModifyCapacityReservationRequestOps(
      v: ModifyCapacityReservationRequest
  ): ModifyCapacityReservationRequestOps = new ModifyCapacityReservationRequestOps(v)

}

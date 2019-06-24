// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CapacityReservationTargetBuilderOps(val self: CapacityReservationTarget.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityReservationIdAsScala(value: Option[String]): CapacityReservationTarget.Builder = {
    value.fold(self) { v =>
      self.capacityReservationId(v)
    }
  }

}

final class CapacityReservationTargetOps(val self: CapacityReservationTarget) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityReservationIdAsScala: Option[String] = Option(self.capacityReservationId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCapacityReservationTargetOps {

  implicit def toCapacityReservationTargetBuilderOps(
      v: CapacityReservationTarget.Builder
  ): CapacityReservationTargetBuilderOps = new CapacityReservationTargetBuilderOps(v)

  implicit def toCapacityReservationTargetOps(v: CapacityReservationTarget): CapacityReservationTargetOps =
    new CapacityReservationTargetOps(v)

}

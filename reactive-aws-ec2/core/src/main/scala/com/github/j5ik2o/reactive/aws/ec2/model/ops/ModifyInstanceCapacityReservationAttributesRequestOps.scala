// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyInstanceCapacityReservationAttributesRequestBuilderOps(
    val self: ModifyInstanceCapacityReservationAttributesRequest.Builder
) extends AnyVal {

  final def instanceIdAsScala(value: Option[String]): ModifyInstanceCapacityReservationAttributesRequest.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  final def capacityReservationSpecificationAsScala(
      value: Option[CapacityReservationSpecification]
  ): ModifyInstanceCapacityReservationAttributesRequest.Builder = {
    value.fold(self) { v =>
      self.capacityReservationSpecification(v)
    }
  }

}

final class ModifyInstanceCapacityReservationAttributesRequestOps(
    val self: ModifyInstanceCapacityReservationAttributesRequest
) extends AnyVal {

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  final def capacityReservationSpecificationAsScala: Option[CapacityReservationSpecification] =
    Option(self.capacityReservationSpecification)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyInstanceCapacityReservationAttributesRequestOps {

  implicit def toModifyInstanceCapacityReservationAttributesRequestBuilderOps(
      v: ModifyInstanceCapacityReservationAttributesRequest.Builder
  ): ModifyInstanceCapacityReservationAttributesRequestBuilderOps =
    new ModifyInstanceCapacityReservationAttributesRequestBuilderOps(v)

  implicit def toModifyInstanceCapacityReservationAttributesRequestOps(
      v: ModifyInstanceCapacityReservationAttributesRequest
  ): ModifyInstanceCapacityReservationAttributesRequestOps =
    new ModifyInstanceCapacityReservationAttributesRequestOps(v)

}

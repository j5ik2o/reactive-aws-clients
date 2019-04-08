// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CancelReservedInstancesListingRequestBuilderOps(val self: CancelReservedInstancesListingRequest.Builder)
    extends AnyVal {

  final def reservedInstancesListingIdAsScala(value: Option[String]): CancelReservedInstancesListingRequest.Builder = {
    value.fold(self) { v =>
      self.reservedInstancesListingId(v)
    }
  }

}

final class CancelReservedInstancesListingRequestOps(val self: CancelReservedInstancesListingRequest) extends AnyVal {

  final def reservedInstancesListingIdAsScala: Option[String] = Option(self.reservedInstancesListingId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCancelReservedInstancesListingRequestOps {

  implicit def toCancelReservedInstancesListingRequestBuilderOps(
      v: CancelReservedInstancesListingRequest.Builder
  ): CancelReservedInstancesListingRequestBuilderOps = new CancelReservedInstancesListingRequestBuilderOps(v)

  implicit def toCancelReservedInstancesListingRequestOps(
      v: CancelReservedInstancesListingRequest
  ): CancelReservedInstancesListingRequestOps = new CancelReservedInstancesListingRequestOps(v)

}

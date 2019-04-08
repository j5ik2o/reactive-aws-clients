// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CancelReservedInstancesListingResponseBuilderOps(val self: CancelReservedInstancesListingResponse.Builder)
    extends AnyVal {

  final def reservedInstancesListingsAsScala(
      value: Option[Seq[ReservedInstancesListing]]
  ): CancelReservedInstancesListingResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.reservedInstancesListings(v.asJava)
    }
  }

}

final class CancelReservedInstancesListingResponseOps(val self: CancelReservedInstancesListingResponse) extends AnyVal {

  final def reservedInstancesListingsAsScala: Option[Seq[ReservedInstancesListing]] =
    Option(self.reservedInstancesListings).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCancelReservedInstancesListingResponseOps {

  implicit def toCancelReservedInstancesListingResponseBuilderOps(
      v: CancelReservedInstancesListingResponse.Builder
  ): CancelReservedInstancesListingResponseBuilderOps = new CancelReservedInstancesListingResponseBuilderOps(v)

  implicit def toCancelReservedInstancesListingResponseOps(
      v: CancelReservedInstancesListingResponse
  ): CancelReservedInstancesListingResponseOps = new CancelReservedInstancesListingResponseOps(v)

}

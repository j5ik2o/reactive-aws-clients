// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateReservedInstancesListingResponseBuilderOps(val self: CreateReservedInstancesListingResponse.Builder)
    extends AnyVal {

  final def reservedInstancesListingsAsScala(
      value: Option[Seq[ReservedInstancesListing]]
  ): CreateReservedInstancesListingResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.reservedInstancesListings(v.asJava)
    }
  }

}

final class CreateReservedInstancesListingResponseOps(val self: CreateReservedInstancesListingResponse) extends AnyVal {

  final def reservedInstancesListingsAsScala: Option[Seq[ReservedInstancesListing]] =
    Option(self.reservedInstancesListings).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateReservedInstancesListingResponseOps {

  implicit def toCreateReservedInstancesListingResponseBuilderOps(
      v: CreateReservedInstancesListingResponse.Builder
  ): CreateReservedInstancesListingResponseBuilderOps = new CreateReservedInstancesListingResponseBuilderOps(v)

  implicit def toCreateReservedInstancesListingResponseOps(
      v: CreateReservedInstancesListingResponse
  ): CreateReservedInstancesListingResponseOps = new CreateReservedInstancesListingResponseOps(v)

}

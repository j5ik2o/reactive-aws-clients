// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateReservedInstancesListingRequestBuilderOps(val self: CreateReservedInstancesListingRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): CreateReservedInstancesListingRequest.Builder = {
    value.fold(self) { v => self.clientToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceCountAsScala(value: Option[Int]): CreateReservedInstancesListingRequest.Builder = {
    value.fold(self) { v => self.instanceCount(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def priceSchedulesAsScala(
      value: Option[Seq[PriceScheduleSpecification]]
  ): CreateReservedInstancesListingRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.priceSchedules(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesIdAsScala(value: Option[String]): CreateReservedInstancesListingRequest.Builder = {
    value.fold(self) { v => self.reservedInstancesId(v) }
  }

}

final class CreateReservedInstancesListingRequestOps(val self: CreateReservedInstancesListingRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceCountAsScala: Option[Int] = Option(self.instanceCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def priceSchedulesAsScala: Option[Seq[PriceScheduleSpecification]] =
    Option(self.priceSchedules).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesIdAsScala: Option[String] = Option(self.reservedInstancesId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateReservedInstancesListingRequestOps {

  implicit def toCreateReservedInstancesListingRequestBuilderOps(
      v: CreateReservedInstancesListingRequest.Builder
  ): CreateReservedInstancesListingRequestBuilderOps = new CreateReservedInstancesListingRequestBuilderOps(v)

  implicit def toCreateReservedInstancesListingRequestOps(
      v: CreateReservedInstancesListingRequest
  ): CreateReservedInstancesListingRequestOps = new CreateReservedInstancesListingRequestOps(v)

}

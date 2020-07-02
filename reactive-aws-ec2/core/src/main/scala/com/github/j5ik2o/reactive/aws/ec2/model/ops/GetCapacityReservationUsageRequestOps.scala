// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetCapacityReservationUsageRequestBuilderOps(val self: GetCapacityReservationUsageRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityReservationIdAsScala(value: Option[String]): GetCapacityReservationUsageRequest.Builder = {
    value.fold(self) { v => self.capacityReservationId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): GetCapacityReservationUsageRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): GetCapacityReservationUsageRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

}

final class GetCapacityReservationUsageRequestOps(val self: GetCapacityReservationUsageRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityReservationIdAsScala: Option[String] = Option(self.capacityReservationId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetCapacityReservationUsageRequestOps {

  implicit def toGetCapacityReservationUsageRequestBuilderOps(
      v: GetCapacityReservationUsageRequest.Builder
  ): GetCapacityReservationUsageRequestBuilderOps = new GetCapacityReservationUsageRequestBuilderOps(v)

  implicit def toGetCapacityReservationUsageRequestOps(
      v: GetCapacityReservationUsageRequest
  ): GetCapacityReservationUsageRequestOps = new GetCapacityReservationUsageRequestOps(v)

}

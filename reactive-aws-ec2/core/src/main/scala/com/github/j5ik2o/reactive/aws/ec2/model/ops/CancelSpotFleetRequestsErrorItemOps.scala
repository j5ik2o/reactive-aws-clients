// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CancelSpotFleetRequestsErrorItemBuilderOps(val self: CancelSpotFleetRequestsErrorItem.Builder)
    extends AnyVal {

  final def errorAsScala(value: Option[CancelSpotFleetRequestsError]): CancelSpotFleetRequestsErrorItem.Builder = {
    value.fold(self) { v =>
      self.error(v)
    }
  }

  final def spotFleetRequestIdAsScala(value: Option[String]): CancelSpotFleetRequestsErrorItem.Builder = {
    value.fold(self) { v =>
      self.spotFleetRequestId(v)
    }
  }

}

final class CancelSpotFleetRequestsErrorItemOps(val self: CancelSpotFleetRequestsErrorItem) extends AnyVal {

  final def errorAsScala: Option[CancelSpotFleetRequestsError] = Option(self.error)

  final def spotFleetRequestIdAsScala: Option[String] = Option(self.spotFleetRequestId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCancelSpotFleetRequestsErrorItemOps {

  implicit def toCancelSpotFleetRequestsErrorItemBuilderOps(
      v: CancelSpotFleetRequestsErrorItem.Builder
  ): CancelSpotFleetRequestsErrorItemBuilderOps = new CancelSpotFleetRequestsErrorItemBuilderOps(v)

  implicit def toCancelSpotFleetRequestsErrorItemOps(
      v: CancelSpotFleetRequestsErrorItem
  ): CancelSpotFleetRequestsErrorItemOps = new CancelSpotFleetRequestsErrorItemOps(v)

}

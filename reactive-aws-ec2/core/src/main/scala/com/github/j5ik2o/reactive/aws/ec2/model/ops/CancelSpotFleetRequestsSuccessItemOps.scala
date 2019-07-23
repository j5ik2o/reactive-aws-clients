// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CancelSpotFleetRequestsSuccessItemBuilderOps(val self: CancelSpotFleetRequestsSuccessItem.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currentSpotFleetRequestStateAsScala(
      value: Option[BatchState]
  ): CancelSpotFleetRequestsSuccessItem.Builder = {
    value.fold(self) { v =>
      self.currentSpotFleetRequestState(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def previousSpotFleetRequestStateAsScala(
      value: Option[BatchState]
  ): CancelSpotFleetRequestsSuccessItem.Builder = {
    value.fold(self) { v =>
      self.previousSpotFleetRequestState(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotFleetRequestIdAsScala(value: Option[String]): CancelSpotFleetRequestsSuccessItem.Builder = {
    value.fold(self) { v =>
      self.spotFleetRequestId(v)
    }
  }

}

final class CancelSpotFleetRequestsSuccessItemOps(val self: CancelSpotFleetRequestsSuccessItem) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currentSpotFleetRequestStateAsScala: Option[BatchState] = Option(self.currentSpotFleetRequestState)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def previousSpotFleetRequestStateAsScala: Option[BatchState] = Option(self.previousSpotFleetRequestState)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotFleetRequestIdAsScala: Option[String] = Option(self.spotFleetRequestId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCancelSpotFleetRequestsSuccessItemOps {

  implicit def toCancelSpotFleetRequestsSuccessItemBuilderOps(
      v: CancelSpotFleetRequestsSuccessItem.Builder
  ): CancelSpotFleetRequestsSuccessItemBuilderOps = new CancelSpotFleetRequestsSuccessItemBuilderOps(v)

  implicit def toCancelSpotFleetRequestsSuccessItemOps(
      v: CancelSpotFleetRequestsSuccessItem
  ): CancelSpotFleetRequestsSuccessItemOps = new CancelSpotFleetRequestsSuccessItemOps(v)

}

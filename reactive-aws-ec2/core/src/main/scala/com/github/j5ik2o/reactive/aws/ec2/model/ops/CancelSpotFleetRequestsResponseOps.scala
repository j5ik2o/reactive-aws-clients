// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CancelSpotFleetRequestsResponseBuilderOps(val self: CancelSpotFleetRequestsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def successfulFleetRequestsAsScala(
      value: Option[Seq[CancelSpotFleetRequestsSuccessItem]]
  ): CancelSpotFleetRequestsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.successfulFleetRequests(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unsuccessfulFleetRequestsAsScala(
      value: Option[Seq[CancelSpotFleetRequestsErrorItem]]
  ): CancelSpotFleetRequestsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.unsuccessfulFleetRequests(v.asJava)
    }
  }

}

final class CancelSpotFleetRequestsResponseOps(val self: CancelSpotFleetRequestsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def successfulFleetRequestsAsScala: Option[Seq[CancelSpotFleetRequestsSuccessItem]] =
    Option(self.successfulFleetRequests).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unsuccessfulFleetRequestsAsScala: Option[Seq[CancelSpotFleetRequestsErrorItem]] =
    Option(self.unsuccessfulFleetRequests).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCancelSpotFleetRequestsResponseOps {

  implicit def toCancelSpotFleetRequestsResponseBuilderOps(
      v: CancelSpotFleetRequestsResponse.Builder
  ): CancelSpotFleetRequestsResponseBuilderOps = new CancelSpotFleetRequestsResponseBuilderOps(v)

  implicit def toCancelSpotFleetRequestsResponseOps(
      v: CancelSpotFleetRequestsResponse
  ): CancelSpotFleetRequestsResponseOps = new CancelSpotFleetRequestsResponseOps(v)

}

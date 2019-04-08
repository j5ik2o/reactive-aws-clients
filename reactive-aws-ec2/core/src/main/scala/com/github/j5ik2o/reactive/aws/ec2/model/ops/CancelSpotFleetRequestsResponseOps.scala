// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CancelSpotFleetRequestsResponseBuilderOps(val self: CancelSpotFleetRequestsResponse.Builder)
    extends AnyVal {

  final def successfulFleetRequestsAsScala(
      value: Option[Seq[CancelSpotFleetRequestsSuccessItem]]
  ): CancelSpotFleetRequestsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.successfulFleetRequests(v.asJava)
    }
  }

  final def unsuccessfulFleetRequestsAsScala(
      value: Option[Seq[CancelSpotFleetRequestsErrorItem]]
  ): CancelSpotFleetRequestsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.unsuccessfulFleetRequests(v.asJava)
    }
  }

}

final class CancelSpotFleetRequestsResponseOps(val self: CancelSpotFleetRequestsResponse) extends AnyVal {

  final def successfulFleetRequestsAsScala: Option[Seq[CancelSpotFleetRequestsSuccessItem]] =
    Option(self.successfulFleetRequests).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def unsuccessfulFleetRequestsAsScala: Option[Seq[CancelSpotFleetRequestsErrorItem]] =
    Option(self.unsuccessfulFleetRequests).map { v =>
      import scala.collection.JavaConverters._; v.asScala
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

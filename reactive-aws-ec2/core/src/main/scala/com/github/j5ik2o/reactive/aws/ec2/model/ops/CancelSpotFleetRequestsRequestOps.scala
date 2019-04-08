// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CancelSpotFleetRequestsRequestBuilderOps(val self: CancelSpotFleetRequestsRequest.Builder) extends AnyVal {

  final def spotFleetRequestIdsAsScala(value: Option[Seq[String]]): CancelSpotFleetRequestsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.spotFleetRequestIds(v.asJava)
    }
  }

  final def terminateInstancesAsScala(value: Option[Boolean]): CancelSpotFleetRequestsRequest.Builder = {
    value.fold(self) { v =>
      self.terminateInstances(v)
    }
  }

}

final class CancelSpotFleetRequestsRequestOps(val self: CancelSpotFleetRequestsRequest) extends AnyVal {

  final def spotFleetRequestIdsAsScala: Option[Seq[String]] = Option(self.spotFleetRequestIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def terminateInstancesAsScala: Option[Boolean] = Option(self.terminateInstances)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCancelSpotFleetRequestsRequestOps {

  implicit def toCancelSpotFleetRequestsRequestBuilderOps(
      v: CancelSpotFleetRequestsRequest.Builder
  ): CancelSpotFleetRequestsRequestBuilderOps = new CancelSpotFleetRequestsRequestBuilderOps(v)

  implicit def toCancelSpotFleetRequestsRequestOps(
      v: CancelSpotFleetRequestsRequest
  ): CancelSpotFleetRequestsRequestOps = new CancelSpotFleetRequestsRequestOps(v)

}

// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CancelSpotInstanceRequestsResponseBuilderOps(val self: CancelSpotInstanceRequestsResponse.Builder)
    extends AnyVal {

  final def cancelledSpotInstanceRequestsAsScala(
      value: Option[Seq[CancelledSpotInstanceRequest]]
  ): CancelSpotInstanceRequestsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.cancelledSpotInstanceRequests(v.asJava)
    }
  }

}

final class CancelSpotInstanceRequestsResponseOps(val self: CancelSpotInstanceRequestsResponse) extends AnyVal {

  final def cancelledSpotInstanceRequestsAsScala: Option[Seq[CancelledSpotInstanceRequest]] =
    Option(self.cancelledSpotInstanceRequests).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCancelSpotInstanceRequestsResponseOps {

  implicit def toCancelSpotInstanceRequestsResponseBuilderOps(
      v: CancelSpotInstanceRequestsResponse.Builder
  ): CancelSpotInstanceRequestsResponseBuilderOps = new CancelSpotInstanceRequestsResponseBuilderOps(v)

  implicit def toCancelSpotInstanceRequestsResponseOps(
      v: CancelSpotInstanceRequestsResponse
  ): CancelSpotInstanceRequestsResponseOps = new CancelSpotInstanceRequestsResponseOps(v)

}

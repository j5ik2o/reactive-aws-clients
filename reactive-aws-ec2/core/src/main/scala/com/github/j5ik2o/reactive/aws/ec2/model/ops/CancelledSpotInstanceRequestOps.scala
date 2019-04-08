// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CancelledSpotInstanceRequestBuilderOps(val self: CancelledSpotInstanceRequest.Builder) extends AnyVal {

  final def spotInstanceRequestIdAsScala(value: Option[String]): CancelledSpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.spotInstanceRequestId(v)
    }
  }

  final def stateAsScala(value: Option[CancelSpotInstanceRequestState]): CancelledSpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

}

final class CancelledSpotInstanceRequestOps(val self: CancelledSpotInstanceRequest) extends AnyVal {

  final def spotInstanceRequestIdAsScala: Option[String] = Option(self.spotInstanceRequestId)

  final def stateAsScala: Option[CancelSpotInstanceRequestState] = Option(self.state)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCancelledSpotInstanceRequestOps {

  implicit def toCancelledSpotInstanceRequestBuilderOps(
      v: CancelledSpotInstanceRequest.Builder
  ): CancelledSpotInstanceRequestBuilderOps = new CancelledSpotInstanceRequestBuilderOps(v)

  implicit def toCancelledSpotInstanceRequestOps(v: CancelledSpotInstanceRequest): CancelledSpotInstanceRequestOps =
    new CancelledSpotInstanceRequestOps(v)

}

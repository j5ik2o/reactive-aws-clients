// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RequestSpotFleetRequestBuilderOps(val self: RequestSpotFleetRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotFleetRequestConfigAsScala(
      value: Option[SpotFleetRequestConfigData]
  ): RequestSpotFleetRequest.Builder = {
    value.fold(self) { v => self.spotFleetRequestConfig(v) }
  }

}

final class RequestSpotFleetRequestOps(val self: RequestSpotFleetRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotFleetRequestConfigAsScala: Option[SpotFleetRequestConfigData] = Option(self.spotFleetRequestConfig)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRequestSpotFleetRequestOps {

  implicit def toRequestSpotFleetRequestBuilderOps(
      v: RequestSpotFleetRequest.Builder
  ): RequestSpotFleetRequestBuilderOps = new RequestSpotFleetRequestBuilderOps(v)

  implicit def toRequestSpotFleetRequestOps(v: RequestSpotFleetRequest): RequestSpotFleetRequestOps =
    new RequestSpotFleetRequestOps(v)

}

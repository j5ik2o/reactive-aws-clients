// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RequestSpotFleetResponseBuilderOps(val self: RequestSpotFleetResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def spotFleetRequestIdAsScala(value: Option[String]): RequestSpotFleetResponse.Builder = {
            value.fold(self){ v => self.spotFleetRequestId(v) }
            } 


}

final class RequestSpotFleetResponseOps(val self: RequestSpotFleetResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def spotFleetRequestIdAsScala: Option[String] = Option(self.spotFleetRequestId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRequestSpotFleetResponseOps {

implicit def toRequestSpotFleetResponseBuilderOps(v: RequestSpotFleetResponse.Builder): RequestSpotFleetResponseBuilderOps = new RequestSpotFleetResponseBuilderOps(v)

implicit def toRequestSpotFleetResponseOps(v: RequestSpotFleetResponse): RequestSpotFleetResponseOps = new RequestSpotFleetResponseOps(v)

}


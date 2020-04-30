// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteTrafficMirrorSessionRequestBuilderOps(val self: DeleteTrafficMirrorSessionRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def trafficMirrorSessionIdAsScala(value: Option[String]): DeleteTrafficMirrorSessionRequest.Builder = {
            value.fold(self){ v => self.trafficMirrorSessionId(v) }
            } 


}

final class DeleteTrafficMirrorSessionRequestOps(val self: DeleteTrafficMirrorSessionRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def trafficMirrorSessionIdAsScala: Option[String] = Option(self.trafficMirrorSessionId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteTrafficMirrorSessionRequestOps {

implicit def toDeleteTrafficMirrorSessionRequestBuilderOps(v: DeleteTrafficMirrorSessionRequest.Builder): DeleteTrafficMirrorSessionRequestBuilderOps = new DeleteTrafficMirrorSessionRequestBuilderOps(v)

implicit def toDeleteTrafficMirrorSessionRequestOps(v: DeleteTrafficMirrorSessionRequest): DeleteTrafficMirrorSessionRequestOps = new DeleteTrafficMirrorSessionRequestOps(v)

}


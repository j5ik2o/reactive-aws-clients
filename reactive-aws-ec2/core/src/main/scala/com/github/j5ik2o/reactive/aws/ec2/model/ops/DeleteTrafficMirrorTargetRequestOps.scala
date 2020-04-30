// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteTrafficMirrorTargetRequestBuilderOps(val self: DeleteTrafficMirrorTargetRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def trafficMirrorTargetIdAsScala(value: Option[String]): DeleteTrafficMirrorTargetRequest.Builder = {
            value.fold(self){ v => self.trafficMirrorTargetId(v) }
            } 


}

final class DeleteTrafficMirrorTargetRequestOps(val self: DeleteTrafficMirrorTargetRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def trafficMirrorTargetIdAsScala: Option[String] = Option(self.trafficMirrorTargetId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteTrafficMirrorTargetRequestOps {

implicit def toDeleteTrafficMirrorTargetRequestBuilderOps(v: DeleteTrafficMirrorTargetRequest.Builder): DeleteTrafficMirrorTargetRequestBuilderOps = new DeleteTrafficMirrorTargetRequestBuilderOps(v)

implicit def toDeleteTrafficMirrorTargetRequestOps(v: DeleteTrafficMirrorTargetRequest): DeleteTrafficMirrorTargetRequestOps = new DeleteTrafficMirrorTargetRequestOps(v)

}


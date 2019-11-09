// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteTrafficMirrorTargetResponseBuilderOps(val self: DeleteTrafficMirrorTargetResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorTargetIdAsScala(value: Option[String]): DeleteTrafficMirrorTargetResponse.Builder = {
    value.fold(self) { v =>
      self.trafficMirrorTargetId(v)
    }
  }

}

final class DeleteTrafficMirrorTargetResponseOps(val self: DeleteTrafficMirrorTargetResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorTargetIdAsScala: Option[String] = Option(self.trafficMirrorTargetId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteTrafficMirrorTargetResponseOps {

  implicit def toDeleteTrafficMirrorTargetResponseBuilderOps(
      v: DeleteTrafficMirrorTargetResponse.Builder
  ): DeleteTrafficMirrorTargetResponseBuilderOps = new DeleteTrafficMirrorTargetResponseBuilderOps(v)

  implicit def toDeleteTrafficMirrorTargetResponseOps(
      v: DeleteTrafficMirrorTargetResponse
  ): DeleteTrafficMirrorTargetResponseOps = new DeleteTrafficMirrorTargetResponseOps(v)

}

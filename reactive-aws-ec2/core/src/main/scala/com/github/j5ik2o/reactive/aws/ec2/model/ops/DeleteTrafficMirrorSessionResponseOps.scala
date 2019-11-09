// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteTrafficMirrorSessionResponseBuilderOps(val self: DeleteTrafficMirrorSessionResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorSessionIdAsScala(value: Option[String]): DeleteTrafficMirrorSessionResponse.Builder = {
    value.fold(self) { v =>
      self.trafficMirrorSessionId(v)
    }
  }

}

final class DeleteTrafficMirrorSessionResponseOps(val self: DeleteTrafficMirrorSessionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorSessionIdAsScala: Option[String] = Option(self.trafficMirrorSessionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteTrafficMirrorSessionResponseOps {

  implicit def toDeleteTrafficMirrorSessionResponseBuilderOps(
      v: DeleteTrafficMirrorSessionResponse.Builder
  ): DeleteTrafficMirrorSessionResponseBuilderOps = new DeleteTrafficMirrorSessionResponseBuilderOps(v)

  implicit def toDeleteTrafficMirrorSessionResponseOps(
      v: DeleteTrafficMirrorSessionResponse
  ): DeleteTrafficMirrorSessionResponseOps = new DeleteTrafficMirrorSessionResponseOps(v)

}

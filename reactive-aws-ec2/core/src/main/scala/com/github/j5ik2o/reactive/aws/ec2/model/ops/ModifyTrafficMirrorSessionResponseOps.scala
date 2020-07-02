// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyTrafficMirrorSessionResponseBuilderOps(val self: ModifyTrafficMirrorSessionResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorSessionAsScala(
      value: Option[TrafficMirrorSession]
  ): ModifyTrafficMirrorSessionResponse.Builder = {
    value.fold(self) { v => self.trafficMirrorSession(v) }
  }

}

final class ModifyTrafficMirrorSessionResponseOps(val self: ModifyTrafficMirrorSessionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorSessionAsScala: Option[TrafficMirrorSession] = Option(self.trafficMirrorSession)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyTrafficMirrorSessionResponseOps {

  implicit def toModifyTrafficMirrorSessionResponseBuilderOps(
      v: ModifyTrafficMirrorSessionResponse.Builder
  ): ModifyTrafficMirrorSessionResponseBuilderOps = new ModifyTrafficMirrorSessionResponseBuilderOps(v)

  implicit def toModifyTrafficMirrorSessionResponseOps(
      v: ModifyTrafficMirrorSessionResponse
  ): ModifyTrafficMirrorSessionResponseOps = new ModifyTrafficMirrorSessionResponseOps(v)

}

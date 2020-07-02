// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateTrafficMirrorTargetResponseBuilderOps(val self: CreateTrafficMirrorTargetResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorTargetAsScala(
      value: Option[TrafficMirrorTarget]
  ): CreateTrafficMirrorTargetResponse.Builder = {
    value.fold(self) { v => self.trafficMirrorTarget(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): CreateTrafficMirrorTargetResponse.Builder = {
    value.fold(self) { v => self.clientToken(v) }
  }

}

final class CreateTrafficMirrorTargetResponseOps(val self: CreateTrafficMirrorTargetResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorTargetAsScala: Option[TrafficMirrorTarget] = Option(self.trafficMirrorTarget)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateTrafficMirrorTargetResponseOps {

  implicit def toCreateTrafficMirrorTargetResponseBuilderOps(
      v: CreateTrafficMirrorTargetResponse.Builder
  ): CreateTrafficMirrorTargetResponseBuilderOps = new CreateTrafficMirrorTargetResponseBuilderOps(v)

  implicit def toCreateTrafficMirrorTargetResponseOps(
      v: CreateTrafficMirrorTargetResponse
  ): CreateTrafficMirrorTargetResponseOps = new CreateTrafficMirrorTargetResponseOps(v)

}

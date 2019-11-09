// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateTrafficMirrorSessionResponseBuilderOps(val self: CreateTrafficMirrorSessionResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorSessionAsScala(
      value: Option[TrafficMirrorSession]
  ): CreateTrafficMirrorSessionResponse.Builder = {
    value.fold(self) { v =>
      self.trafficMirrorSession(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): CreateTrafficMirrorSessionResponse.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

}

final class CreateTrafficMirrorSessionResponseOps(val self: CreateTrafficMirrorSessionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorSessionAsScala: Option[TrafficMirrorSession] = Option(self.trafficMirrorSession)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateTrafficMirrorSessionResponseOps {

  implicit def toCreateTrafficMirrorSessionResponseBuilderOps(
      v: CreateTrafficMirrorSessionResponse.Builder
  ): CreateTrafficMirrorSessionResponseBuilderOps = new CreateTrafficMirrorSessionResponseBuilderOps(v)

  implicit def toCreateTrafficMirrorSessionResponseOps(
      v: CreateTrafficMirrorSessionResponse
  ): CreateTrafficMirrorSessionResponseOps = new CreateTrafficMirrorSessionResponseOps(v)

}

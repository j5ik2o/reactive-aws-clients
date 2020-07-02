// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateTrafficMirrorFilterResponseBuilderOps(val self: CreateTrafficMirrorFilterResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorFilterAsScala(
      value: Option[TrafficMirrorFilter]
  ): CreateTrafficMirrorFilterResponse.Builder = {
    value.fold(self) { v => self.trafficMirrorFilter(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): CreateTrafficMirrorFilterResponse.Builder = {
    value.fold(self) { v => self.clientToken(v) }
  }

}

final class CreateTrafficMirrorFilterResponseOps(val self: CreateTrafficMirrorFilterResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorFilterAsScala: Option[TrafficMirrorFilter] = Option(self.trafficMirrorFilter)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateTrafficMirrorFilterResponseOps {

  implicit def toCreateTrafficMirrorFilterResponseBuilderOps(
      v: CreateTrafficMirrorFilterResponse.Builder
  ): CreateTrafficMirrorFilterResponseBuilderOps = new CreateTrafficMirrorFilterResponseBuilderOps(v)

  implicit def toCreateTrafficMirrorFilterResponseOps(
      v: CreateTrafficMirrorFilterResponse
  ): CreateTrafficMirrorFilterResponseOps = new CreateTrafficMirrorFilterResponseOps(v)

}

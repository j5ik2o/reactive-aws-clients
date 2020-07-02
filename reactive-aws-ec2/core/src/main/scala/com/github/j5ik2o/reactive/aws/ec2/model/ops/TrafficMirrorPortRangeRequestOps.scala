// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TrafficMirrorPortRangeRequestBuilderOps(val self: TrafficMirrorPortRangeRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fromPortAsScala(value: Option[Int]): TrafficMirrorPortRangeRequest.Builder = {
    value.fold(self) { v => self.fromPort(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def toPortAsScala(value: Option[Int]): TrafficMirrorPortRangeRequest.Builder = {
    value.fold(self) { v => self.toPort(v) }
  }

}

final class TrafficMirrorPortRangeRequestOps(val self: TrafficMirrorPortRangeRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fromPortAsScala: Option[Int] = Option(self.fromPort)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def toPortAsScala: Option[Int] = Option(self.toPort)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTrafficMirrorPortRangeRequestOps {

  implicit def toTrafficMirrorPortRangeRequestBuilderOps(
      v: TrafficMirrorPortRangeRequest.Builder
  ): TrafficMirrorPortRangeRequestBuilderOps = new TrafficMirrorPortRangeRequestBuilderOps(v)

  implicit def toTrafficMirrorPortRangeRequestOps(v: TrafficMirrorPortRangeRequest): TrafficMirrorPortRangeRequestOps =
    new TrafficMirrorPortRangeRequestOps(v)

}

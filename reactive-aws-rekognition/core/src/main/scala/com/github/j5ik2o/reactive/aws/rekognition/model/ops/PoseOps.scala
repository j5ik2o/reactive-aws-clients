// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class PoseBuilderOps(val self: Pose.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rollAsScala(value: Option[Float]): Pose.Builder = {
    value.fold(self) { v => self.roll(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def yawAsScala(value: Option[Float]): Pose.Builder = {
    value.fold(self) { v => self.yaw(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pitchAsScala(value: Option[Float]): Pose.Builder = {
    value.fold(self) { v => self.pitch(v) }
  }

}

final class PoseOps(val self: Pose) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rollAsScala: Option[Float] = Option(self.roll)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def yawAsScala: Option[Float] = Option(self.yaw)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pitchAsScala: Option[Float] = Option(self.pitch)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPoseOps {

  implicit def toPoseBuilderOps(v: Pose.Builder): PoseBuilderOps = new PoseBuilderOps(v)

  implicit def toPoseOps(v: Pose): PoseOps = new PoseOps(v)

}

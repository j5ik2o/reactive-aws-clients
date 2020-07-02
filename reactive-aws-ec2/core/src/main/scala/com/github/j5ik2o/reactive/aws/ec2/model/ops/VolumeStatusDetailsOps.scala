// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VolumeStatusDetailsBuilderOps(val self: VolumeStatusDetails.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[VolumeStatusName]): VolumeStatusDetails.Builder = {
    value.fold(self) { v => self.name(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[String]): VolumeStatusDetails.Builder = {
    value.fold(self) { v => self.status(v) }
  }

}

final class VolumeStatusDetailsOps(val self: VolumeStatusDetails) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[VolumeStatusName] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[String] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVolumeStatusDetailsOps {

  implicit def toVolumeStatusDetailsBuilderOps(v: VolumeStatusDetails.Builder): VolumeStatusDetailsBuilderOps =
    new VolumeStatusDetailsBuilderOps(v)

  implicit def toVolumeStatusDetailsOps(v: VolumeStatusDetails): VolumeStatusDetailsOps = new VolumeStatusDetailsOps(v)

}

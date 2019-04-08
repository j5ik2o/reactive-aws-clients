// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class VolumeBuilderOps(val self: Volume.Builder) extends AnyVal {

  final def hostAsScala(value: Option[Host]): Volume.Builder = {
    value.fold(self) { v =>
      self.host(v)
    }
  } // Host

  final def nameAsScala(value: Option[String]): Volume.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  } // String

}

final class VolumeOps(val self: Volume) extends AnyVal {

  final def hostAsScala: Option[Host] = Option(self.host) // Host

  final def nameAsScala: Option[String] = Option(self.name) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVolumeOps {

  implicit def toVolumeBuilderOps(v: Volume.Builder): VolumeBuilderOps = new VolumeBuilderOps(v)

  implicit def toVolumeOps(v: Volume): VolumeOps = new VolumeOps(v)

}

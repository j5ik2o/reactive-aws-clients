// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class VolumeFromBuilderOps(val self: VolumeFrom.Builder) extends AnyVal {

  final def sourceContainerAsScala(value: Option[String]): VolumeFrom.Builder = {
    value.fold(self) { v =>
      self.sourceContainer(v)
    }
  }

  final def readOnlyAsScala(value: Option[Boolean]): VolumeFrom.Builder = {
    value.fold(self) { v =>
      self.readOnly(v)
    }
  }

}

final class VolumeFromOps(val self: VolumeFrom) extends AnyVal {

  final def sourceContainerAsScala: Option[String] = Option(self.sourceContainer)

  final def readOnlyAsScala: Option[Boolean] = Option(self.readOnly)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVolumeFromOps {

  implicit def toVolumeFromBuilderOps(v: VolumeFrom.Builder): VolumeFromBuilderOps = new VolumeFromBuilderOps(v)

  implicit def toVolumeFromOps(v: VolumeFrom): VolumeFromOps = new VolumeFromOps(v)

}

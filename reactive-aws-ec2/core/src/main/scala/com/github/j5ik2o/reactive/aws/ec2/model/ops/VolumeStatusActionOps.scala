// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VolumeStatusActionBuilderOps(val self: VolumeStatusAction.Builder) extends AnyVal {

  final def codeAsScala(value: Option[String]): VolumeStatusAction.Builder = {
    value.fold(self) { v =>
      self.code(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): VolumeStatusAction.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def eventIdAsScala(value: Option[String]): VolumeStatusAction.Builder = {
    value.fold(self) { v =>
      self.eventId(v)
    }
  }

  final def eventTypeAsScala(value: Option[String]): VolumeStatusAction.Builder = {
    value.fold(self) { v =>
      self.eventType(v)
    }
  }

}

final class VolumeStatusActionOps(val self: VolumeStatusAction) extends AnyVal {

  final def codeAsScala: Option[String] = Option(self.code)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def eventIdAsScala: Option[String] = Option(self.eventId)

  final def eventTypeAsScala: Option[String] = Option(self.eventType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVolumeStatusActionOps {

  implicit def toVolumeStatusActionBuilderOps(v: VolumeStatusAction.Builder): VolumeStatusActionBuilderOps =
    new VolumeStatusActionBuilderOps(v)

  implicit def toVolumeStatusActionOps(v: VolumeStatusAction): VolumeStatusActionOps = new VolumeStatusActionOps(v)

}

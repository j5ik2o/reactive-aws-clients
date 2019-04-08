// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VolumeStatusEventBuilderOps(val self: VolumeStatusEvent.Builder) extends AnyVal {

  final def descriptionAsScala(value: Option[String]): VolumeStatusEvent.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def eventIdAsScala(value: Option[String]): VolumeStatusEvent.Builder = {
    value.fold(self) { v =>
      self.eventId(v)
    }
  }

  final def eventTypeAsScala(value: Option[String]): VolumeStatusEvent.Builder = {
    value.fold(self) { v =>
      self.eventType(v)
    }
  }

  final def notAfterAsScala(value: Option[java.time.Instant]): VolumeStatusEvent.Builder = {
    value.fold(self) { v =>
      self.notAfter(v)
    }
  }

  final def notBeforeAsScala(value: Option[java.time.Instant]): VolumeStatusEvent.Builder = {
    value.fold(self) { v =>
      self.notBefore(v)
    }
  }

}

final class VolumeStatusEventOps(val self: VolumeStatusEvent) extends AnyVal {

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def eventIdAsScala: Option[String] = Option(self.eventId)

  final def eventTypeAsScala: Option[String] = Option(self.eventType)

  final def notAfterAsScala: Option[java.time.Instant] = Option(self.notAfter)

  final def notBeforeAsScala: Option[java.time.Instant] = Option(self.notBefore)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVolumeStatusEventOps {

  implicit def toVolumeStatusEventBuilderOps(v: VolumeStatusEvent.Builder): VolumeStatusEventBuilderOps =
    new VolumeStatusEventBuilderOps(v)

  implicit def toVolumeStatusEventOps(v: VolumeStatusEvent): VolumeStatusEventOps = new VolumeStatusEventOps(v)

}

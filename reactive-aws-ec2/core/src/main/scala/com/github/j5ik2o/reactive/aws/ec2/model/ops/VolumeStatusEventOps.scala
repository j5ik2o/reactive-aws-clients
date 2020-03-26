// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VolumeStatusEventBuilderOps(val self: VolumeStatusEvent.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): VolumeStatusEvent.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventIdAsScala(value: Option[String]): VolumeStatusEvent.Builder = {
    value.fold(self) { v =>
      self.eventId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventTypeAsScala(value: Option[String]): VolumeStatusEvent.Builder = {
    value.fold(self) { v =>
      self.eventType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def notAfterAsScala(value: Option[java.time.Instant]): VolumeStatusEvent.Builder = {
    value.fold(self) { v =>
      self.notAfter(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def notBeforeAsScala(value: Option[java.time.Instant]): VolumeStatusEvent.Builder = {
    value.fold(self) { v =>
      self.notBefore(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala(value: Option[String]): VolumeStatusEvent.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

}

final class VolumeStatusEventOps(val self: VolumeStatusEvent) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventIdAsScala: Option[String] = Option(self.eventId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventTypeAsScala: Option[String] = Option(self.eventType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def notAfterAsScala: Option[java.time.Instant] = Option(self.notAfter)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def notBeforeAsScala: Option[java.time.Instant] = Option(self.notBefore)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVolumeStatusEventOps {

  implicit def toVolumeStatusEventBuilderOps(v: VolumeStatusEvent.Builder): VolumeStatusEventBuilderOps =
    new VolumeStatusEventBuilderOps(v)

  implicit def toVolumeStatusEventOps(v: VolumeStatusEvent): VolumeStatusEventOps = new VolumeStatusEventOps(v)

}

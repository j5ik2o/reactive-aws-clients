// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DetachVolumeResponseBuilderOps(val self: DetachVolumeResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachTimeAsScala(value: Option[java.time.Instant]): DetachVolumeResponse.Builder = {
    value.fold(self) { v =>
      self.attachTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceAsScala(value: Option[String]): DetachVolumeResponse.Builder = {
    value.fold(self) { v =>
      self.device(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala(value: Option[String]): DetachVolumeResponse.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[VolumeAttachmentState]): DetachVolumeResponse.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeIdAsScala(value: Option[String]): DetachVolumeResponse.Builder = {
    value.fold(self) { v =>
      self.volumeId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deleteOnTerminationAsScala(value: Option[Boolean]): DetachVolumeResponse.Builder = {
    value.fold(self) { v =>
      self.deleteOnTermination(v)
    }
  }

}

final class DetachVolumeResponseOps(val self: DetachVolumeResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachTimeAsScala: Option[java.time.Instant] = Option(self.attachTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceAsScala: Option[String] = Option(self.device)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[VolumeAttachmentState] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeIdAsScala: Option[String] = Option(self.volumeId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deleteOnTerminationAsScala: Option[Boolean] = Option(self.deleteOnTermination)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDetachVolumeResponseOps {

  implicit def toDetachVolumeResponseBuilderOps(v: DetachVolumeResponse.Builder): DetachVolumeResponseBuilderOps =
    new DetachVolumeResponseBuilderOps(v)

  implicit def toDetachVolumeResponseOps(v: DetachVolumeResponse): DetachVolumeResponseOps =
    new DetachVolumeResponseOps(v)

}

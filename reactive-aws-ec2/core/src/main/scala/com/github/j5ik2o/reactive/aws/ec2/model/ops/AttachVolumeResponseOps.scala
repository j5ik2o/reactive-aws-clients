// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AttachVolumeResponseBuilderOps(val self: AttachVolumeResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachTimeAsScala(value: Option[java.time.Instant]): AttachVolumeResponse.Builder = {
    value.fold(self) { v =>
      self.attachTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceAsScala(value: Option[String]): AttachVolumeResponse.Builder = {
    value.fold(self) { v =>
      self.device(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala(value: Option[String]): AttachVolumeResponse.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[VolumeAttachmentState]): AttachVolumeResponse.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeIdAsScala(value: Option[String]): AttachVolumeResponse.Builder = {
    value.fold(self) { v =>
      self.volumeId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deleteOnTerminationAsScala(value: Option[Boolean]): AttachVolumeResponse.Builder = {
    value.fold(self) { v =>
      self.deleteOnTermination(v)
    }
  }

}

final class AttachVolumeResponseOps(val self: AttachVolumeResponse) extends AnyVal {

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
trait ToAttachVolumeResponseOps {

  implicit def toAttachVolumeResponseBuilderOps(v: AttachVolumeResponse.Builder): AttachVolumeResponseBuilderOps =
    new AttachVolumeResponseBuilderOps(v)

  implicit def toAttachVolumeResponseOps(v: AttachVolumeResponse): AttachVolumeResponseOps =
    new AttachVolumeResponseOps(v)

}

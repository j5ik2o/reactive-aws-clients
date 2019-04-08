// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AttachVolumeResponseBuilderOps(val self: AttachVolumeResponse.Builder) extends AnyVal {

  final def attachTimeAsScala(value: Option[java.time.Instant]): AttachVolumeResponse.Builder = {
    value.fold(self) { v =>
      self.attachTime(v)
    }
  }

  final def deviceAsScala(value: Option[String]): AttachVolumeResponse.Builder = {
    value.fold(self) { v =>
      self.device(v)
    }
  }

  final def instanceIdAsScala(value: Option[String]): AttachVolumeResponse.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  final def stateAsScala(value: Option[VolumeAttachmentState]): AttachVolumeResponse.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def volumeIdAsScala(value: Option[String]): AttachVolumeResponse.Builder = {
    value.fold(self) { v =>
      self.volumeId(v)
    }
  }

  final def deleteOnTerminationAsScala(value: Option[Boolean]): AttachVolumeResponse.Builder = {
    value.fold(self) { v =>
      self.deleteOnTermination(v)
    }
  }

}

final class AttachVolumeResponseOps(val self: AttachVolumeResponse) extends AnyVal {

  final def attachTimeAsScala: Option[java.time.Instant] = Option(self.attachTime)

  final def deviceAsScala: Option[String] = Option(self.device)

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  final def stateAsScala: Option[VolumeAttachmentState] = Option(self.state)

  final def volumeIdAsScala: Option[String] = Option(self.volumeId)

  final def deleteOnTerminationAsScala: Option[Boolean] = Option(self.deleteOnTermination)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAttachVolumeResponseOps {

  implicit def toAttachVolumeResponseBuilderOps(v: AttachVolumeResponse.Builder): AttachVolumeResponseBuilderOps =
    new AttachVolumeResponseBuilderOps(v)

  implicit def toAttachVolumeResponseOps(v: AttachVolumeResponse): AttachVolumeResponseOps =
    new AttachVolumeResponseOps(v)

}

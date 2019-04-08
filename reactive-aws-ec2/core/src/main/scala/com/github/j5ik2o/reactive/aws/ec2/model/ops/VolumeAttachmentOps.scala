// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VolumeAttachmentBuilderOps(val self: VolumeAttachment.Builder) extends AnyVal {

  final def attachTimeAsScala(value: Option[java.time.Instant]): VolumeAttachment.Builder = {
    value.fold(self) { v =>
      self.attachTime(v)
    }
  }

  final def deviceAsScala(value: Option[String]): VolumeAttachment.Builder = {
    value.fold(self) { v =>
      self.device(v)
    }
  }

  final def instanceIdAsScala(value: Option[String]): VolumeAttachment.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  final def stateAsScala(value: Option[VolumeAttachmentState]): VolumeAttachment.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def volumeIdAsScala(value: Option[String]): VolumeAttachment.Builder = {
    value.fold(self) { v =>
      self.volumeId(v)
    }
  }

  final def deleteOnTerminationAsScala(value: Option[Boolean]): VolumeAttachment.Builder = {
    value.fold(self) { v =>
      self.deleteOnTermination(v)
    }
  }

}

final class VolumeAttachmentOps(val self: VolumeAttachment) extends AnyVal {

  final def attachTimeAsScala: Option[java.time.Instant] = Option(self.attachTime)

  final def deviceAsScala: Option[String] = Option(self.device)

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  final def stateAsScala: Option[VolumeAttachmentState] = Option(self.state)

  final def volumeIdAsScala: Option[String] = Option(self.volumeId)

  final def deleteOnTerminationAsScala: Option[Boolean] = Option(self.deleteOnTermination)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVolumeAttachmentOps {

  implicit def toVolumeAttachmentBuilderOps(v: VolumeAttachment.Builder): VolumeAttachmentBuilderOps =
    new VolumeAttachmentBuilderOps(v)

  implicit def toVolumeAttachmentOps(v: VolumeAttachment): VolumeAttachmentOps = new VolumeAttachmentOps(v)

}

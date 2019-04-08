// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AttachVolumeRequestBuilderOps(val self: AttachVolumeRequest.Builder) extends AnyVal {

  final def deviceAsScala(value: Option[String]): AttachVolumeRequest.Builder = {
    value.fold(self) { v =>
      self.device(v)
    }
  }

  final def instanceIdAsScala(value: Option[String]): AttachVolumeRequest.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  final def volumeIdAsScala(value: Option[String]): AttachVolumeRequest.Builder = {
    value.fold(self) { v =>
      self.volumeId(v)
    }
  }

}

final class AttachVolumeRequestOps(val self: AttachVolumeRequest) extends AnyVal {

  final def deviceAsScala: Option[String] = Option(self.device)

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  final def volumeIdAsScala: Option[String] = Option(self.volumeId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAttachVolumeRequestOps {

  implicit def toAttachVolumeRequestBuilderOps(v: AttachVolumeRequest.Builder): AttachVolumeRequestBuilderOps =
    new AttachVolumeRequestBuilderOps(v)

  implicit def toAttachVolumeRequestOps(v: AttachVolumeRequest): AttachVolumeRequestOps = new AttachVolumeRequestOps(v)

}

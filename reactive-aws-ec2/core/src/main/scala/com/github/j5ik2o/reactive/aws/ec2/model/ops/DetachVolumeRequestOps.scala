// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DetachVolumeRequestBuilderOps(val self: DetachVolumeRequest.Builder) extends AnyVal {

  final def deviceAsScala(value: Option[String]): DetachVolumeRequest.Builder = {
    value.fold(self) { v =>
      self.device(v)
    }
  }

  final def forceAsScala(value: Option[Boolean]): DetachVolumeRequest.Builder = {
    value.fold(self) { v =>
      self.force(v)
    }
  }

  final def instanceIdAsScala(value: Option[String]): DetachVolumeRequest.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  final def volumeIdAsScala(value: Option[String]): DetachVolumeRequest.Builder = {
    value.fold(self) { v =>
      self.volumeId(v)
    }
  }

}

final class DetachVolumeRequestOps(val self: DetachVolumeRequest) extends AnyVal {

  final def deviceAsScala: Option[String] = Option(self.device)

  final def forceAsScala: Option[Boolean] = Option(self.force)

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  final def volumeIdAsScala: Option[String] = Option(self.volumeId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDetachVolumeRequestOps {

  implicit def toDetachVolumeRequestBuilderOps(v: DetachVolumeRequest.Builder): DetachVolumeRequestBuilderOps =
    new DetachVolumeRequestBuilderOps(v)

  implicit def toDetachVolumeRequestOps(v: DetachVolumeRequest): DetachVolumeRequestOps = new DetachVolumeRequestOps(v)

}

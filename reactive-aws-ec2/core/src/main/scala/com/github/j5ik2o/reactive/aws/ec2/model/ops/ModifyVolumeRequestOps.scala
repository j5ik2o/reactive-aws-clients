// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyVolumeRequestBuilderOps(val self: ModifyVolumeRequest.Builder) extends AnyVal {

  final def volumeIdAsScala(value: Option[String]): ModifyVolumeRequest.Builder = {
    value.fold(self) { v =>
      self.volumeId(v)
    }
  }

  final def sizeAsScala(value: Option[Int]): ModifyVolumeRequest.Builder = {
    value.fold(self) { v =>
      self.size(v)
    }
  }

  final def volumeTypeAsScala(value: Option[VolumeType]): ModifyVolumeRequest.Builder = {
    value.fold(self) { v =>
      self.volumeType(v)
    }
  }

  final def iopsAsScala(value: Option[Int]): ModifyVolumeRequest.Builder = {
    value.fold(self) { v =>
      self.iops(v)
    }
  }

}

final class ModifyVolumeRequestOps(val self: ModifyVolumeRequest) extends AnyVal {

  final def volumeIdAsScala: Option[String] = Option(self.volumeId)

  final def sizeAsScala: Option[Int] = Option(self.size)

  final def volumeTypeAsScala: Option[VolumeType] = Option(self.volumeType)

  final def iopsAsScala: Option[Int] = Option(self.iops)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyVolumeRequestOps {

  implicit def toModifyVolumeRequestBuilderOps(v: ModifyVolumeRequest.Builder): ModifyVolumeRequestBuilderOps =
    new ModifyVolumeRequestBuilderOps(v)

  implicit def toModifyVolumeRequestOps(v: ModifyVolumeRequest): ModifyVolumeRequestOps = new ModifyVolumeRequestOps(v)

}

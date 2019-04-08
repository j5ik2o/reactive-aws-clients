// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateVolumeRequestBuilderOps(val self: CreateVolumeRequest.Builder) extends AnyVal {

  final def availabilityZoneAsScala(value: Option[String]): CreateVolumeRequest.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  final def encryptedAsScala(value: Option[Boolean]): CreateVolumeRequest.Builder = {
    value.fold(self) { v =>
      self.encrypted(v)
    }
  }

  final def iopsAsScala(value: Option[Int]): CreateVolumeRequest.Builder = {
    value.fold(self) { v =>
      self.iops(v)
    }
  }

  final def kmsKeyIdAsScala(value: Option[String]): CreateVolumeRequest.Builder = {
    value.fold(self) { v =>
      self.kmsKeyId(v)
    }
  }

  final def sizeAsScala(value: Option[Int]): CreateVolumeRequest.Builder = {
    value.fold(self) { v =>
      self.size(v)
    }
  }

  final def snapshotIdAsScala(value: Option[String]): CreateVolumeRequest.Builder = {
    value.fold(self) { v =>
      self.snapshotId(v)
    }
  }

  final def volumeTypeAsScala(value: Option[VolumeType]): CreateVolumeRequest.Builder = {
    value.fold(self) { v =>
      self.volumeType(v)
    }
  }

  final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): CreateVolumeRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tagSpecifications(v.asJava)
    }
  }

}

final class CreateVolumeRequestOps(val self: CreateVolumeRequest) extends AnyVal {

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  final def encryptedAsScala: Option[Boolean] = Option(self.encrypted)

  final def iopsAsScala: Option[Int] = Option(self.iops)

  final def kmsKeyIdAsScala: Option[String] = Option(self.kmsKeyId)

  final def sizeAsScala: Option[Int] = Option(self.size)

  final def snapshotIdAsScala: Option[String] = Option(self.snapshotId)

  final def volumeTypeAsScala: Option[VolumeType] = Option(self.volumeType)

  final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] = Option(self.tagSpecifications).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateVolumeRequestOps {

  implicit def toCreateVolumeRequestBuilderOps(v: CreateVolumeRequest.Builder): CreateVolumeRequestBuilderOps =
    new CreateVolumeRequestBuilderOps(v)

  implicit def toCreateVolumeRequestOps(v: CreateVolumeRequest): CreateVolumeRequestOps = new CreateVolumeRequestOps(v)

}

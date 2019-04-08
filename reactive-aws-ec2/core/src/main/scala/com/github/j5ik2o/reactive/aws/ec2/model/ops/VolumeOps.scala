// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VolumeBuilderOps(val self: Volume.Builder) extends AnyVal {

  final def attachmentsAsScala(value: Option[Seq[VolumeAttachment]]): Volume.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attachments(v.asJava)
    }
  }

  final def availabilityZoneAsScala(value: Option[String]): Volume.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  final def createTimeAsScala(value: Option[java.time.Instant]): Volume.Builder = {
    value.fold(self) { v =>
      self.createTime(v)
    }
  }

  final def encryptedAsScala(value: Option[Boolean]): Volume.Builder = {
    value.fold(self) { v =>
      self.encrypted(v)
    }
  }

  final def kmsKeyIdAsScala(value: Option[String]): Volume.Builder = {
    value.fold(self) { v =>
      self.kmsKeyId(v)
    }
  }

  final def sizeAsScala(value: Option[Int]): Volume.Builder = {
    value.fold(self) { v =>
      self.size(v)
    }
  }

  final def snapshotIdAsScala(value: Option[String]): Volume.Builder = {
    value.fold(self) { v =>
      self.snapshotId(v)
    }
  }

  final def stateAsScala(value: Option[VolumeState]): Volume.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def volumeIdAsScala(value: Option[String]): Volume.Builder = {
    value.fold(self) { v =>
      self.volumeId(v)
    }
  }

  final def iopsAsScala(value: Option[Int]): Volume.Builder = {
    value.fold(self) { v =>
      self.iops(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): Volume.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def volumeTypeAsScala(value: Option[VolumeType]): Volume.Builder = {
    value.fold(self) { v =>
      self.volumeType(v)
    }
  }

}

final class VolumeOps(val self: Volume) extends AnyVal {

  final def attachmentsAsScala: Option[Seq[VolumeAttachment]] = Option(self.attachments).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  final def createTimeAsScala: Option[java.time.Instant] = Option(self.createTime)

  final def encryptedAsScala: Option[Boolean] = Option(self.encrypted)

  final def kmsKeyIdAsScala: Option[String] = Option(self.kmsKeyId)

  final def sizeAsScala: Option[Int] = Option(self.size)

  final def snapshotIdAsScala: Option[String] = Option(self.snapshotId)

  final def stateAsScala: Option[VolumeState] = Option(self.state)

  final def volumeIdAsScala: Option[String] = Option(self.volumeId)

  final def iopsAsScala: Option[Int] = Option(self.iops)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def volumeTypeAsScala: Option[VolumeType] = Option(self.volumeType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVolumeOps {

  implicit def toVolumeBuilderOps(v: Volume.Builder): VolumeBuilderOps = new VolumeBuilderOps(v)

  implicit def toVolumeOps(v: Volume): VolumeOps = new VolumeOps(v)

}

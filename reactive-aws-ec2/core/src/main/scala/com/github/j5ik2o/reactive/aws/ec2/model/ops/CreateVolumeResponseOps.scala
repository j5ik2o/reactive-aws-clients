// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateVolumeResponseBuilderOps(val self: CreateVolumeResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentsAsScala(value: Option[Seq[VolumeAttachment]]): CreateVolumeResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attachments(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala(value: Option[String]): CreateVolumeResponse.Builder = {
    value.fold(self) { v => self.availabilityZone(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createTimeAsScala(value: Option[java.time.Instant]): CreateVolumeResponse.Builder = {
    value.fold(self) { v => self.createTime(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptedAsScala(value: Option[Boolean]): CreateVolumeResponse.Builder = {
    value.fold(self) { v => self.encrypted(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyIdAsScala(value: Option[String]): CreateVolumeResponse.Builder = {
    value.fold(self) { v => self.kmsKeyId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outpostArnAsScala(value: Option[String]): CreateVolumeResponse.Builder = {
    value.fold(self) { v => self.outpostArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sizeAsScala(value: Option[Int]): CreateVolumeResponse.Builder = {
    value.fold(self) { v => self.size(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotIdAsScala(value: Option[String]): CreateVolumeResponse.Builder = {
    value.fold(self) { v => self.snapshotId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[VolumeState]): CreateVolumeResponse.Builder = {
    value.fold(self) { v => self.state(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeIdAsScala(value: Option[String]): CreateVolumeResponse.Builder = {
    value.fold(self) { v => self.volumeId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iopsAsScala(value: Option[Int]): CreateVolumeResponse.Builder = {
    value.fold(self) { v => self.iops(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): CreateVolumeResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeTypeAsScala(value: Option[VolumeType]): CreateVolumeResponse.Builder = {
    value.fold(self) { v => self.volumeType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fastRestoredAsScala(value: Option[Boolean]): CreateVolumeResponse.Builder = {
    value.fold(self) { v => self.fastRestored(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def multiAttachEnabledAsScala(value: Option[Boolean]): CreateVolumeResponse.Builder = {
    value.fold(self) { v => self.multiAttachEnabled(v) }
  }

}

final class CreateVolumeResponseOps(val self: CreateVolumeResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentsAsScala: Option[Seq[VolumeAttachment]] =
    Option(self.attachments).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createTimeAsScala: Option[java.time.Instant] = Option(self.createTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptedAsScala: Option[Boolean] = Option(self.encrypted)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyIdAsScala: Option[String] = Option(self.kmsKeyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outpostArnAsScala: Option[String] = Option(self.outpostArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sizeAsScala: Option[Int] = Option(self.size)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotIdAsScala: Option[String] = Option(self.snapshotId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[VolumeState] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeIdAsScala: Option[String] = Option(self.volumeId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iopsAsScala: Option[Int] = Option(self.iops)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeTypeAsScala: Option[VolumeType] = Option(self.volumeType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fastRestoredAsScala: Option[Boolean] = Option(self.fastRestored)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def multiAttachEnabledAsScala: Option[Boolean] = Option(self.multiAttachEnabled)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateVolumeResponseOps {

  implicit def toCreateVolumeResponseBuilderOps(v: CreateVolumeResponse.Builder): CreateVolumeResponseBuilderOps =
    new CreateVolumeResponseBuilderOps(v)

  implicit def toCreateVolumeResponseOps(v: CreateVolumeResponse): CreateVolumeResponseOps =
    new CreateVolumeResponseOps(v)

}

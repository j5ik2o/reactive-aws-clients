// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateSnapshotResponseBuilderOps(val self: CreateSnapshotResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataEncryptionKeyIdAsScala(value: Option[String]): CreateSnapshotResponse.Builder = {
    value.fold(self) { v => self.dataEncryptionKeyId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): CreateSnapshotResponse.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptedAsScala(value: Option[Boolean]): CreateSnapshotResponse.Builder = {
    value.fold(self) { v => self.encrypted(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyIdAsScala(value: Option[String]): CreateSnapshotResponse.Builder = {
    value.fold(self) { v => self.kmsKeyId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala(value: Option[String]): CreateSnapshotResponse.Builder = {
    value.fold(self) { v => self.ownerId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def progressAsScala(value: Option[String]): CreateSnapshotResponse.Builder = {
    value.fold(self) { v => self.progress(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotIdAsScala(value: Option[String]): CreateSnapshotResponse.Builder = {
    value.fold(self) { v => self.snapshotId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startTimeAsScala(value: Option[java.time.Instant]): CreateSnapshotResponse.Builder = {
    value.fold(self) { v => self.startTime(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[SnapshotState]): CreateSnapshotResponse.Builder = {
    value.fold(self) { v => self.state(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateMessageAsScala(value: Option[String]): CreateSnapshotResponse.Builder = {
    value.fold(self) { v => self.stateMessage(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeIdAsScala(value: Option[String]): CreateSnapshotResponse.Builder = {
    value.fold(self) { v => self.volumeId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeSizeAsScala(value: Option[Int]): CreateSnapshotResponse.Builder = {
    value.fold(self) { v => self.volumeSize(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerAliasAsScala(value: Option[String]): CreateSnapshotResponse.Builder = {
    value.fold(self) { v => self.ownerAlias(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): CreateSnapshotResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class CreateSnapshotResponseOps(val self: CreateSnapshotResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataEncryptionKeyIdAsScala: Option[String] = Option(self.dataEncryptionKeyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptedAsScala: Option[Boolean] = Option(self.encrypted)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyIdAsScala: Option[String] = Option(self.kmsKeyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def progressAsScala: Option[String] = Option(self.progress)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotIdAsScala: Option[String] = Option(self.snapshotId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startTimeAsScala: Option[java.time.Instant] = Option(self.startTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[SnapshotState] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateMessageAsScala: Option[String] = Option(self.stateMessage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeIdAsScala: Option[String] = Option(self.volumeId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeSizeAsScala: Option[Int] = Option(self.volumeSize)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerAliasAsScala: Option[String] = Option(self.ownerAlias)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateSnapshotResponseOps {

  implicit def toCreateSnapshotResponseBuilderOps(v: CreateSnapshotResponse.Builder): CreateSnapshotResponseBuilderOps =
    new CreateSnapshotResponseBuilderOps(v)

  implicit def toCreateSnapshotResponseOps(v: CreateSnapshotResponse): CreateSnapshotResponseOps =
    new CreateSnapshotResponseOps(v)

}

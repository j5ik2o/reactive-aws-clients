// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateSnapshotResponseBuilderOps(val self: CreateSnapshotResponse.Builder) extends AnyVal {

  final def dataEncryptionKeyIdAsScala(value: Option[String]): CreateSnapshotResponse.Builder = {
    value.fold(self) { v =>
      self.dataEncryptionKeyId(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): CreateSnapshotResponse.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def encryptedAsScala(value: Option[Boolean]): CreateSnapshotResponse.Builder = {
    value.fold(self) { v =>
      self.encrypted(v)
    }
  }

  final def kmsKeyIdAsScala(value: Option[String]): CreateSnapshotResponse.Builder = {
    value.fold(self) { v =>
      self.kmsKeyId(v)
    }
  }

  final def ownerIdAsScala(value: Option[String]): CreateSnapshotResponse.Builder = {
    value.fold(self) { v =>
      self.ownerId(v)
    }
  }

  final def progressAsScala(value: Option[String]): CreateSnapshotResponse.Builder = {
    value.fold(self) { v =>
      self.progress(v)
    }
  }

  final def snapshotIdAsScala(value: Option[String]): CreateSnapshotResponse.Builder = {
    value.fold(self) { v =>
      self.snapshotId(v)
    }
  }

  final def startTimeAsScala(value: Option[java.time.Instant]): CreateSnapshotResponse.Builder = {
    value.fold(self) { v =>
      self.startTime(v)
    }
  }

  final def stateAsScala(value: Option[SnapshotState]): CreateSnapshotResponse.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def stateMessageAsScala(value: Option[String]): CreateSnapshotResponse.Builder = {
    value.fold(self) { v =>
      self.stateMessage(v)
    }
  }

  final def volumeIdAsScala(value: Option[String]): CreateSnapshotResponse.Builder = {
    value.fold(self) { v =>
      self.volumeId(v)
    }
  }

  final def volumeSizeAsScala(value: Option[Int]): CreateSnapshotResponse.Builder = {
    value.fold(self) { v =>
      self.volumeSize(v)
    }
  }

  final def ownerAliasAsScala(value: Option[String]): CreateSnapshotResponse.Builder = {
    value.fold(self) { v =>
      self.ownerAlias(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): CreateSnapshotResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class CreateSnapshotResponseOps(val self: CreateSnapshotResponse) extends AnyVal {

  final def dataEncryptionKeyIdAsScala: Option[String] = Option(self.dataEncryptionKeyId)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def encryptedAsScala: Option[Boolean] = Option(self.encrypted)

  final def kmsKeyIdAsScala: Option[String] = Option(self.kmsKeyId)

  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

  final def progressAsScala: Option[String] = Option(self.progress)

  final def snapshotIdAsScala: Option[String] = Option(self.snapshotId)

  final def startTimeAsScala: Option[java.time.Instant] = Option(self.startTime)

  final def stateAsScala: Option[SnapshotState] = Option(self.state)

  final def stateMessageAsScala: Option[String] = Option(self.stateMessage)

  final def volumeIdAsScala: Option[String] = Option(self.volumeId)

  final def volumeSizeAsScala: Option[Int] = Option(self.volumeSize)

  final def ownerAliasAsScala: Option[String] = Option(self.ownerAlias)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateSnapshotResponseOps {

  implicit def toCreateSnapshotResponseBuilderOps(v: CreateSnapshotResponse.Builder): CreateSnapshotResponseBuilderOps =
    new CreateSnapshotResponseBuilderOps(v)

  implicit def toCreateSnapshotResponseOps(v: CreateSnapshotResponse): CreateSnapshotResponseOps =
    new CreateSnapshotResponseOps(v)

}

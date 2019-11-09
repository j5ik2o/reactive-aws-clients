// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SnapshotInfoBuilderOps(val self: SnapshotInfo.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): SnapshotInfo.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): SnapshotInfo.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptedAsScala(value: Option[Boolean]): SnapshotInfo.Builder = {
    value.fold(self) { v =>
      self.encrypted(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeIdAsScala(value: Option[String]): SnapshotInfo.Builder = {
    value.fold(self) { v =>
      self.volumeId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[SnapshotState]): SnapshotInfo.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeSizeAsScala(value: Option[Int]): SnapshotInfo.Builder = {
    value.fold(self) { v =>
      self.volumeSize(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startTimeAsScala(value: Option[java.time.Instant]): SnapshotInfo.Builder = {
    value.fold(self) { v =>
      self.startTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def progressAsScala(value: Option[String]): SnapshotInfo.Builder = {
    value.fold(self) { v =>
      self.progress(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala(value: Option[String]): SnapshotInfo.Builder = {
    value.fold(self) { v =>
      self.ownerId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotIdAsScala(value: Option[String]): SnapshotInfo.Builder = {
    value.fold(self) { v =>
      self.snapshotId(v)
    }
  }

}

final class SnapshotInfoOps(val self: SnapshotInfo) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptedAsScala: Option[Boolean] = Option(self.encrypted)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeIdAsScala: Option[String] = Option(self.volumeId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[SnapshotState] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeSizeAsScala: Option[Int] = Option(self.volumeSize)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startTimeAsScala: Option[java.time.Instant] = Option(self.startTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def progressAsScala: Option[String] = Option(self.progress)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotIdAsScala: Option[String] = Option(self.snapshotId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSnapshotInfoOps {

  implicit def toSnapshotInfoBuilderOps(v: SnapshotInfo.Builder): SnapshotInfoBuilderOps = new SnapshotInfoBuilderOps(v)

  implicit def toSnapshotInfoOps(v: SnapshotInfo): SnapshotInfoOps = new SnapshotInfoOps(v)

}

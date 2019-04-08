// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SnapshotTaskDetailBuilderOps(val self: SnapshotTaskDetail.Builder) extends AnyVal {

  final def descriptionAsScala(value: Option[String]): SnapshotTaskDetail.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def diskImageSizeAsScala(value: Option[Double]): SnapshotTaskDetail.Builder = {
    value.fold(self) { v =>
      self.diskImageSize(v)
    }
  }

  final def encryptedAsScala(value: Option[Boolean]): SnapshotTaskDetail.Builder = {
    value.fold(self) { v =>
      self.encrypted(v)
    }
  }

  final def formatAsScala(value: Option[String]): SnapshotTaskDetail.Builder = {
    value.fold(self) { v =>
      self.format(v)
    }
  }

  final def kmsKeyIdAsScala(value: Option[String]): SnapshotTaskDetail.Builder = {
    value.fold(self) { v =>
      self.kmsKeyId(v)
    }
  }

  final def progressAsScala(value: Option[String]): SnapshotTaskDetail.Builder = {
    value.fold(self) { v =>
      self.progress(v)
    }
  }

  final def snapshotIdAsScala(value: Option[String]): SnapshotTaskDetail.Builder = {
    value.fold(self) { v =>
      self.snapshotId(v)
    }
  }

  final def statusAsScala(value: Option[String]): SnapshotTaskDetail.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def statusMessageAsScala(value: Option[String]): SnapshotTaskDetail.Builder = {
    value.fold(self) { v =>
      self.statusMessage(v)
    }
  }

  final def urlAsScala(value: Option[String]): SnapshotTaskDetail.Builder = {
    value.fold(self) { v =>
      self.url(v)
    }
  }

  final def userBucketAsScala(value: Option[UserBucketDetails]): SnapshotTaskDetail.Builder = {
    value.fold(self) { v =>
      self.userBucket(v)
    }
  }

}

final class SnapshotTaskDetailOps(val self: SnapshotTaskDetail) extends AnyVal {

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def diskImageSizeAsScala: Option[Double] = Option(self.diskImageSize)

  final def encryptedAsScala: Option[Boolean] = Option(self.encrypted)

  final def formatAsScala: Option[String] = Option(self.format)

  final def kmsKeyIdAsScala: Option[String] = Option(self.kmsKeyId)

  final def progressAsScala: Option[String] = Option(self.progress)

  final def snapshotIdAsScala: Option[String] = Option(self.snapshotId)

  final def statusAsScala: Option[String] = Option(self.status)

  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  final def urlAsScala: Option[String] = Option(self.url)

  final def userBucketAsScala: Option[UserBucketDetails] = Option(self.userBucket)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSnapshotTaskDetailOps {

  implicit def toSnapshotTaskDetailBuilderOps(v: SnapshotTaskDetail.Builder): SnapshotTaskDetailBuilderOps =
    new SnapshotTaskDetailBuilderOps(v)

  implicit def toSnapshotTaskDetailOps(v: SnapshotTaskDetail): SnapshotTaskDetailOps = new SnapshotTaskDetailOps(v)

}

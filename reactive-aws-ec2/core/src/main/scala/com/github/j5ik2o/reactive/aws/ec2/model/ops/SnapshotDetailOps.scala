// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SnapshotDetailBuilderOps(val self: SnapshotDetail.Builder) extends AnyVal {

  final def descriptionAsScala(value: Option[String]): SnapshotDetail.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def deviceNameAsScala(value: Option[String]): SnapshotDetail.Builder = {
    value.fold(self) { v =>
      self.deviceName(v)
    }
  }

  final def diskImageSizeAsScala(value: Option[Double]): SnapshotDetail.Builder = {
    value.fold(self) { v =>
      self.diskImageSize(v)
    }
  }

  final def formatAsScala(value: Option[String]): SnapshotDetail.Builder = {
    value.fold(self) { v =>
      self.format(v)
    }
  }

  final def progressAsScala(value: Option[String]): SnapshotDetail.Builder = {
    value.fold(self) { v =>
      self.progress(v)
    }
  }

  final def snapshotIdAsScala(value: Option[String]): SnapshotDetail.Builder = {
    value.fold(self) { v =>
      self.snapshotId(v)
    }
  }

  final def statusAsScala(value: Option[String]): SnapshotDetail.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def statusMessageAsScala(value: Option[String]): SnapshotDetail.Builder = {
    value.fold(self) { v =>
      self.statusMessage(v)
    }
  }

  final def urlAsScala(value: Option[String]): SnapshotDetail.Builder = {
    value.fold(self) { v =>
      self.url(v)
    }
  }

  final def userBucketAsScala(value: Option[UserBucketDetails]): SnapshotDetail.Builder = {
    value.fold(self) { v =>
      self.userBucket(v)
    }
  }

}

final class SnapshotDetailOps(val self: SnapshotDetail) extends AnyVal {

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def deviceNameAsScala: Option[String] = Option(self.deviceName)

  final def diskImageSizeAsScala: Option[Double] = Option(self.diskImageSize)

  final def formatAsScala: Option[String] = Option(self.format)

  final def progressAsScala: Option[String] = Option(self.progress)

  final def snapshotIdAsScala: Option[String] = Option(self.snapshotId)

  final def statusAsScala: Option[String] = Option(self.status)

  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  final def urlAsScala: Option[String] = Option(self.url)

  final def userBucketAsScala: Option[UserBucketDetails] = Option(self.userBucket)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSnapshotDetailOps {

  implicit def toSnapshotDetailBuilderOps(v: SnapshotDetail.Builder): SnapshotDetailBuilderOps =
    new SnapshotDetailBuilderOps(v)

  implicit def toSnapshotDetailOps(v: SnapshotDetail): SnapshotDetailOps = new SnapshotDetailOps(v)

}

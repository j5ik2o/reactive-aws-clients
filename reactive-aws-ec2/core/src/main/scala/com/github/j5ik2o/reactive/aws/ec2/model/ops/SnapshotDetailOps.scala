// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SnapshotDetailBuilderOps(val self: SnapshotDetail.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): SnapshotDetail.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceNameAsScala(value: Option[String]): SnapshotDetail.Builder = {
    value.fold(self) { v =>
      self.deviceName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def diskImageSizeAsScala(value: Option[Double]): SnapshotDetail.Builder = {
    value.fold(self) { v =>
      self.diskImageSize(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def formatAsScala(value: Option[String]): SnapshotDetail.Builder = {
    value.fold(self) { v =>
      self.format(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def progressAsScala(value: Option[String]): SnapshotDetail.Builder = {
    value.fold(self) { v =>
      self.progress(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotIdAsScala(value: Option[String]): SnapshotDetail.Builder = {
    value.fold(self) { v =>
      self.snapshotId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[String]): SnapshotDetail.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala(value: Option[String]): SnapshotDetail.Builder = {
    value.fold(self) { v =>
      self.statusMessage(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def urlAsScala(value: Option[String]): SnapshotDetail.Builder = {
    value.fold(self) { v =>
      self.url(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userBucketAsScala(value: Option[UserBucketDetails]): SnapshotDetail.Builder = {
    value.fold(self) { v =>
      self.userBucket(v)
    }
  }

}

final class SnapshotDetailOps(val self: SnapshotDetail) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceNameAsScala: Option[String] = Option(self.deviceName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def diskImageSizeAsScala: Option[Double] = Option(self.diskImageSize)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def formatAsScala: Option[String] = Option(self.format)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def progressAsScala: Option[String] = Option(self.progress)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotIdAsScala: Option[String] = Option(self.snapshotId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[String] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def urlAsScala: Option[String] = Option(self.url)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userBucketAsScala: Option[UserBucketDetails] = Option(self.userBucket)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSnapshotDetailOps {

  implicit def toSnapshotDetailBuilderOps(v: SnapshotDetail.Builder): SnapshotDetailBuilderOps =
    new SnapshotDetailBuilderOps(v)

  implicit def toSnapshotDetailOps(v: SnapshotDetail): SnapshotDetailOps = new SnapshotDetailOps(v)

}

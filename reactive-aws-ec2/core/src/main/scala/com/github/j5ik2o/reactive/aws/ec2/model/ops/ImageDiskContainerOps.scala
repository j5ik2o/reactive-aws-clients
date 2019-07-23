// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ImageDiskContainerBuilderOps(val self: ImageDiskContainer.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): ImageDiskContainer.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceNameAsScala(value: Option[String]): ImageDiskContainer.Builder = {
    value.fold(self) { v =>
      self.deviceName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def formatAsScala(value: Option[String]): ImageDiskContainer.Builder = {
    value.fold(self) { v =>
      self.format(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotIdAsScala(value: Option[String]): ImageDiskContainer.Builder = {
    value.fold(self) { v =>
      self.snapshotId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def urlAsScala(value: Option[String]): ImageDiskContainer.Builder = {
    value.fold(self) { v =>
      self.url(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userBucketAsScala(value: Option[UserBucket]): ImageDiskContainer.Builder = {
    value.fold(self) { v =>
      self.userBucket(v)
    }
  }

}

final class ImageDiskContainerOps(val self: ImageDiskContainer) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceNameAsScala: Option[String] = Option(self.deviceName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def formatAsScala: Option[String] = Option(self.format)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotIdAsScala: Option[String] = Option(self.snapshotId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def urlAsScala: Option[String] = Option(self.url)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userBucketAsScala: Option[UserBucket] = Option(self.userBucket)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImageDiskContainerOps {

  implicit def toImageDiskContainerBuilderOps(v: ImageDiskContainer.Builder): ImageDiskContainerBuilderOps =
    new ImageDiskContainerBuilderOps(v)

  implicit def toImageDiskContainerOps(v: ImageDiskContainer): ImageDiskContainerOps = new ImageDiskContainerOps(v)

}

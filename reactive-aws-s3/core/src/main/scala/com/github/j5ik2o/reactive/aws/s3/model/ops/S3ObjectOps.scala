// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class S3ObjectBuilderOps(val self: S3Object.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala(value: Option[String]): S3Object.Builder = {
    value.fold(self) { v => self.key(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastModifiedAsScala(value: Option[java.time.Instant]): S3Object.Builder = {
    value.fold(self) { v => self.lastModified(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eTagAsScala(value: Option[String]): S3Object.Builder = {
    value.fold(self) { v => self.eTag(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sizeAsScala(value: Option[Long]): S3Object.Builder = {
    value.fold(self) { v => self.size(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def storageClassAsScala(value: Option[ObjectStorageClass]): S3Object.Builder = {
    value.fold(self) { v => self.storageClass(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerAsScala(value: Option[Owner]): S3Object.Builder = {
    value.fold(self) { v => self.owner(v) }
  }

}

final class S3ObjectOps(val self: S3Object) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala: Option[String] = Option(self.key)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastModifiedAsScala: Option[java.time.Instant] = Option(self.lastModified)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eTagAsScala: Option[String] = Option(self.eTag)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sizeAsScala: Option[Long] = Option(self.size)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def storageClassAsScala: Option[ObjectStorageClass] = Option(self.storageClass)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerAsScala: Option[Owner] = Option(self.owner)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToS3ObjectOps {

  implicit def toS3ObjectBuilderOps(v: S3Object.Builder): S3ObjectBuilderOps = new S3ObjectBuilderOps(v)

  implicit def toS3ObjectOps(v: S3Object): S3ObjectOps = new S3ObjectOps(v)

}

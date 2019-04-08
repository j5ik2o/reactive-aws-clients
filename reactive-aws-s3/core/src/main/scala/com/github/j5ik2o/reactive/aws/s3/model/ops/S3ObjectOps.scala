// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class S3ObjectBuilderOps(val self: S3Object.Builder) extends AnyVal {

  final def keyAsScala(value: Option[String]): S3Object.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def lastModifiedAsScala(value: Option[java.time.Instant]): S3Object.Builder = {
    value.fold(self) { v =>
      self.lastModified(v)
    }
  } // java.time.Instant

  final def eTagAsScala(value: Option[String]): S3Object.Builder = {
    value.fold(self) { v =>
      self.eTag(v)
    }
  } // String

  final def sizeAsScala(value: Option[Long]): S3Object.Builder = {
    value.fold(self) { v =>
      self.size(v)
    }
  } // Long

  final def storageClassAsScala(value: Option[ObjectStorageClass]): S3Object.Builder = {
    value.fold(self) { v =>
      self.storageClass(v)
    }
  } // ObjectStorageClass

  final def ownerAsScala(value: Option[Owner]): S3Object.Builder = {
    value.fold(self) { v =>
      self.owner(v)
    }
  } // Owner

}

final class S3ObjectOps(val self: S3Object) extends AnyVal {

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def lastModifiedAsScala: Option[java.time.Instant] = Option(self.lastModified) // java.time.Instant

  final def eTagAsScala: Option[String] = Option(self.eTag) // String

  final def sizeAsScala: Option[Long] = Option(self.size) // Long

  final def storageClassAsScala: Option[ObjectStorageClass] = Option(self.storageClass) // ObjectStorageClass

  final def ownerAsScala: Option[Owner] = Option(self.owner) // Owner

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToS3ObjectOps {

  implicit def toS3ObjectBuilderOps(v: S3Object.Builder): S3ObjectBuilderOps = new S3ObjectBuilderOps(v)

  implicit def toS3ObjectOps(v: S3Object): S3ObjectOps = new S3ObjectOps(v)

}

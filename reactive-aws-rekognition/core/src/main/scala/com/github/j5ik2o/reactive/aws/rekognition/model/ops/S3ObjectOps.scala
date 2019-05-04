// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class S3ObjectBuilderOps(val self: S3Object.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): S3Object.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def nameAsScala(value: Option[String]): S3Object.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def versionAsScala(value: Option[String]): S3Object.Builder = {
    value.fold(self) { v =>
      self.version(v)
    }
  }

}

final class S3ObjectOps(val self: S3Object) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def nameAsScala: Option[String] = Option(self.name)

  final def versionAsScala: Option[String] = Option(self.version)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToS3ObjectOps {

  implicit def toS3ObjectBuilderOps(v: S3Object.Builder): S3ObjectBuilderOps = new S3ObjectBuilderOps(v)

  implicit def toS3ObjectOps(v: S3Object): S3ObjectOps = new S3ObjectOps(v)

}

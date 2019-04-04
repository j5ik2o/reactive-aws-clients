// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class S3ErrorBuilderOps(val self: S3Error.Builder) extends AnyVal {

  final def withKeyAsScala(value: Option[String]): S3Error.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def withVersionIdAsScala(value: Option[String]): S3Error.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  } // String

  final def withCodeAsScala(value: Option[String]): S3Error.Builder = {
    value.fold(self) { v =>
      self.code(v)
    }
  } // String

  final def withMessageAsScala(value: Option[String]): S3Error.Builder = {
    value.fold(self) { v =>
      self.message(v)
    }
  } // String

}

final class S3ErrorOps(val self: S3Error) extends AnyVal {

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def versionIdAsScala: Option[String] = Option(self.versionId) // String

  final def codeAsScala: Option[String] = Option(self.code) // String

  final def messageAsScala: Option[String] = Option(self.message) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToS3ErrorOps {

  implicit def toS3ErrorBuilderOps(v: S3Error.Builder): S3ErrorBuilderOps = new S3ErrorBuilderOps(v)

  implicit def toS3ErrorOps(v: S3Error): S3ErrorOps = new S3ErrorOps(v)

}

// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteObjectRequestBuilderOps(val self: DeleteObjectRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): DeleteObjectRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala(value: Option[String]): DeleteObjectRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def mfaAsScala(value: Option[String]): DeleteObjectRequest.Builder = {
    value.fold(self) { v =>
      self.mfa(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionIdAsScala(value: Option[String]): DeleteObjectRequest.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestPayerAsScala(value: Option[RequestPayer]): DeleteObjectRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bypassGovernanceRetentionAsScala(value: Option[Boolean]): DeleteObjectRequest.Builder = {
    value.fold(self) { v =>
      self.bypassGovernanceRetention(v)
    }
  }

}

final class DeleteObjectRequestOps(val self: DeleteObjectRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala: Option[String] = Option(self.key)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def mfaAsScala: Option[String] = Option(self.mfa)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionIdAsScala: Option[String] = Option(self.versionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bypassGovernanceRetentionAsScala: Option[Boolean] = Option(self.bypassGovernanceRetention)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteObjectRequestOps {

  implicit def toDeleteObjectRequestBuilderOps(v: DeleteObjectRequest.Builder): DeleteObjectRequestBuilderOps =
    new DeleteObjectRequestBuilderOps(v)

  implicit def toDeleteObjectRequestOps(v: DeleteObjectRequest): DeleteObjectRequestOps = new DeleteObjectRequestOps(v)

}

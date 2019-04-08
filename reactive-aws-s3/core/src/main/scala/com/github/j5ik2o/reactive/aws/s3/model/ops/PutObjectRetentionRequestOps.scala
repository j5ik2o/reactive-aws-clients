// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutObjectRetentionRequestBuilderOps(val self: PutObjectRetentionRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): PutObjectRetentionRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def keyAsScala(value: Option[String]): PutObjectRetentionRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def retentionAsScala(value: Option[ObjectLockRetention]): PutObjectRetentionRequest.Builder = {
    value.fold(self) { v =>
      self.retention(v)
    }
  } // ObjectLockRetention

  final def requestPayerAsScala(value: Option[RequestPayer]): PutObjectRetentionRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  } // RequestPayer

  final def versionIdAsScala(value: Option[String]): PutObjectRetentionRequest.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  } // String

  final def bypassGovernanceRetentionAsScala(value: Option[Boolean]): PutObjectRetentionRequest.Builder = {
    value.fold(self) { v =>
      self.bypassGovernanceRetention(v)
    }
  } // Boolean

  final def contentMD5AsScala(value: Option[String]): PutObjectRetentionRequest.Builder = {
    value.fold(self) { v =>
      self.contentMD5(v)
    }
  } // String

}

final class PutObjectRetentionRequestOps(val self: PutObjectRetentionRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def retentionAsScala: Option[ObjectLockRetention] = Option(self.retention) // ObjectLockRetention

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer) // RequestPayer

  final def versionIdAsScala: Option[String] = Option(self.versionId) // String

  final def bypassGovernanceRetentionAsScala: Option[Boolean] = Option(self.bypassGovernanceRetention) // Boolean

  final def contentMD5AsScala: Option[String] = Option(self.contentMD5) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutObjectRetentionRequestOps {

  implicit def toPutObjectRetentionRequestBuilderOps(
      v: PutObjectRetentionRequest.Builder
  ): PutObjectRetentionRequestBuilderOps = new PutObjectRetentionRequestBuilderOps(v)

  implicit def toPutObjectRetentionRequestOps(v: PutObjectRetentionRequest): PutObjectRetentionRequestOps =
    new PutObjectRetentionRequestOps(v)

}

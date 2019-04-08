// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutObjectRetentionRequestBuilderOps(val self: PutObjectRetentionRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): PutObjectRetentionRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def keyAsScala(value: Option[String]): PutObjectRetentionRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  }

  final def retentionAsScala(value: Option[ObjectLockRetention]): PutObjectRetentionRequest.Builder = {
    value.fold(self) { v =>
      self.retention(v)
    }
  }

  final def requestPayerAsScala(value: Option[RequestPayer]): PutObjectRetentionRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  }

  final def versionIdAsScala(value: Option[String]): PutObjectRetentionRequest.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  }

  final def bypassGovernanceRetentionAsScala(value: Option[Boolean]): PutObjectRetentionRequest.Builder = {
    value.fold(self) { v =>
      self.bypassGovernanceRetention(v)
    }
  }

  final def contentMD5AsScala(value: Option[String]): PutObjectRetentionRequest.Builder = {
    value.fold(self) { v =>
      self.contentMD5(v)
    }
  }

}

final class PutObjectRetentionRequestOps(val self: PutObjectRetentionRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def keyAsScala: Option[String] = Option(self.key)

  final def retentionAsScala: Option[ObjectLockRetention] = Option(self.retention)

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer)

  final def versionIdAsScala: Option[String] = Option(self.versionId)

  final def bypassGovernanceRetentionAsScala: Option[Boolean] = Option(self.bypassGovernanceRetention)

  final def contentMD5AsScala: Option[String] = Option(self.contentMD5)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutObjectRetentionRequestOps {

  implicit def toPutObjectRetentionRequestBuilderOps(
      v: PutObjectRetentionRequest.Builder
  ): PutObjectRetentionRequestBuilderOps = new PutObjectRetentionRequestBuilderOps(v)

  implicit def toPutObjectRetentionRequestOps(v: PutObjectRetentionRequest): PutObjectRetentionRequestOps =
    new PutObjectRetentionRequestOps(v)

}

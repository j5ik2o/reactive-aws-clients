// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutObjectLegalHoldRequestBuilderOps(val self: PutObjectLegalHoldRequest.Builder) extends AnyVal {

  final def withBucketAsScala(value: Option[String]): PutObjectLegalHoldRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def withKeyAsScala(value: Option[String]): PutObjectLegalHoldRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def withLegalHoldAsScala(value: Option[ObjectLockLegalHold]): PutObjectLegalHoldRequest.Builder = {
    value.fold(self) { v =>
      self.legalHold(v)
    }
  } // ObjectLockLegalHold

  final def withRequestPayerAsScala(value: Option[RequestPayer]): PutObjectLegalHoldRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  } // String

  final def withVersionIdAsScala(value: Option[String]): PutObjectLegalHoldRequest.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  } // String

  final def withContentMD5AsScala(value: Option[String]): PutObjectLegalHoldRequest.Builder = {
    value.fold(self) { v =>
      self.contentMD5(v)
    }
  } // String

}

final class PutObjectLegalHoldRequestOps(val self: PutObjectLegalHoldRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def legalHoldAsScala: Option[ObjectLockLegalHold] = Option(self.legalHold) // ObjectLockLegalHold

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer) // String

  final def versionIdAsScala: Option[String] = Option(self.versionId) // String

  final def contentMD5AsScala: Option[String] = Option(self.contentMD5) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutObjectLegalHoldRequestOps {

  implicit def toPutObjectLegalHoldRequestBuilderOps(
      v: PutObjectLegalHoldRequest.Builder
  ): PutObjectLegalHoldRequestBuilderOps = new PutObjectLegalHoldRequestBuilderOps(v)

  implicit def toPutObjectLegalHoldRequestOps(v: PutObjectLegalHoldRequest): PutObjectLegalHoldRequestOps =
    new PutObjectLegalHoldRequestOps(v)

}

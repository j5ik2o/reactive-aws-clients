// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutObjectLockConfigurationRequestBuilderOps(val self: PutObjectLockConfigurationRequest.Builder)
    extends AnyVal {

  final def withBucketAsScala(value: Option[String]): PutObjectLockConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def withObjectLockConfigurationAsScala(
      value: Option[ObjectLockConfiguration]
  ): PutObjectLockConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.objectLockConfiguration(v)
    }
  } // ObjectLockConfiguration

  final def withRequestPayerAsScala(value: Option[RequestPayer]): PutObjectLockConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  } // String

  final def withTokenAsScala(value: Option[String]): PutObjectLockConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.token(v)
    }
  } // String

  final def withContentMD5AsScala(value: Option[String]): PutObjectLockConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.contentMD5(v)
    }
  } // String

}

final class PutObjectLockConfigurationRequestOps(val self: PutObjectLockConfigurationRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def objectLockConfigurationAsScala: Option[ObjectLockConfiguration] =
    Option(self.objectLockConfiguration) // ObjectLockConfiguration

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer) // String

  final def tokenAsScala: Option[String] = Option(self.token) // String

  final def contentMD5AsScala: Option[String] = Option(self.contentMD5) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutObjectLockConfigurationRequestOps {

  implicit def toPutObjectLockConfigurationRequestBuilderOps(
      v: PutObjectLockConfigurationRequest.Builder
  ): PutObjectLockConfigurationRequestBuilderOps = new PutObjectLockConfigurationRequestBuilderOps(v)

  implicit def toPutObjectLockConfigurationRequestOps(
      v: PutObjectLockConfigurationRequest
  ): PutObjectLockConfigurationRequestOps = new PutObjectLockConfigurationRequestOps(v)

}

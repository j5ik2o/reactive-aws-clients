// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutObjectLockConfigurationRequestBuilderOps(val self: PutObjectLockConfigurationRequest.Builder)
    extends AnyVal {

  final def bucketAsScala(value: Option[String]): PutObjectLockConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def objectLockConfigurationAsScala(
      value: Option[ObjectLockConfiguration]
  ): PutObjectLockConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.objectLockConfiguration(v)
    }
  }

  final def requestPayerAsScala(value: Option[RequestPayer]): PutObjectLockConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  }

  final def tokenAsScala(value: Option[String]): PutObjectLockConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.token(v)
    }
  }

  final def contentMD5AsScala(value: Option[String]): PutObjectLockConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.contentMD5(v)
    }
  }

}

final class PutObjectLockConfigurationRequestOps(val self: PutObjectLockConfigurationRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def objectLockConfigurationAsScala: Option[ObjectLockConfiguration] = Option(self.objectLockConfiguration)

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer)

  final def tokenAsScala: Option[String] = Option(self.token)

  final def contentMD5AsScala: Option[String] = Option(self.contentMD5)

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

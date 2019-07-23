// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutObjectLockConfigurationRequestBuilderOps(val self: PutObjectLockConfigurationRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): PutObjectLockConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def objectLockConfigurationAsScala(
      value: Option[ObjectLockConfiguration]
  ): PutObjectLockConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.objectLockConfiguration(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestPayerAsScala(value: Option[RequestPayer]): PutObjectLockConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tokenAsScala(value: Option[String]): PutObjectLockConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.token(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentMD5AsScala(value: Option[String]): PutObjectLockConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.contentMD5(v)
    }
  }

}

final class PutObjectLockConfigurationRequestOps(val self: PutObjectLockConfigurationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def objectLockConfigurationAsScala: Option[ObjectLockConfiguration] = Option(self.objectLockConfiguration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tokenAsScala: Option[String] = Option(self.token)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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

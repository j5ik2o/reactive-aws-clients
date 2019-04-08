// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketAccelerateConfigurationRequestBuilderOps(val self: PutBucketAccelerateConfigurationRequest.Builder)
    extends AnyVal {

  final def bucketAsScala(value: Option[String]): PutBucketAccelerateConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def accelerateConfigurationAsScala(
      value: Option[AccelerateConfiguration]
  ): PutBucketAccelerateConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.accelerateConfiguration(v)
    }
  }

}

final class PutBucketAccelerateConfigurationRequestOps(val self: PutBucketAccelerateConfigurationRequest)
    extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def accelerateConfigurationAsScala: Option[AccelerateConfiguration] = Option(self.accelerateConfiguration)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketAccelerateConfigurationRequestOps {

  implicit def toPutBucketAccelerateConfigurationRequestBuilderOps(
      v: PutBucketAccelerateConfigurationRequest.Builder
  ): PutBucketAccelerateConfigurationRequestBuilderOps = new PutBucketAccelerateConfigurationRequestBuilderOps(v)

  implicit def toPutBucketAccelerateConfigurationRequestOps(
      v: PutBucketAccelerateConfigurationRequest
  ): PutBucketAccelerateConfigurationRequestOps = new PutBucketAccelerateConfigurationRequestOps(v)

}

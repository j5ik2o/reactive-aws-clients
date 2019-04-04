// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketAccelerateConfigurationRequestBuilderOps(val self: PutBucketAccelerateConfigurationRequest.Builder)
    extends AnyVal {

  final def withBucketAsScala(value: Option[String]): PutBucketAccelerateConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def withAccelerateConfigurationAsScala(
      value: Option[AccelerateConfiguration]
  ): PutBucketAccelerateConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.accelerateConfiguration(v)
    }
  } // AccelerateConfiguration

}

final class PutBucketAccelerateConfigurationRequestOps(val self: PutBucketAccelerateConfigurationRequest)
    extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def accelerateConfigurationAsScala: Option[AccelerateConfiguration] =
    Option(self.accelerateConfiguration) // AccelerateConfiguration

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

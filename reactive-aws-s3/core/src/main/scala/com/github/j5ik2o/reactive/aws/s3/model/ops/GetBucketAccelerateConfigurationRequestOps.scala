// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketAccelerateConfigurationRequestBuilderOps(val self: GetBucketAccelerateConfigurationRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): GetBucketAccelerateConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

}

final class GetBucketAccelerateConfigurationRequestOps(val self: GetBucketAccelerateConfigurationRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketAccelerateConfigurationRequestOps {

  implicit def toGetBucketAccelerateConfigurationRequestBuilderOps(
      v: GetBucketAccelerateConfigurationRequest.Builder
  ): GetBucketAccelerateConfigurationRequestBuilderOps = new GetBucketAccelerateConfigurationRequestBuilderOps(v)

  implicit def toGetBucketAccelerateConfigurationRequestOps(
      v: GetBucketAccelerateConfigurationRequest
  ): GetBucketAccelerateConfigurationRequestOps = new GetBucketAccelerateConfigurationRequestOps(v)

}

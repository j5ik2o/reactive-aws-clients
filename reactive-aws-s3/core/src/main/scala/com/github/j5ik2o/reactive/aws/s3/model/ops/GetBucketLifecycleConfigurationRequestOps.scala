// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketLifecycleConfigurationRequestBuilderOps(val self: GetBucketLifecycleConfigurationRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): GetBucketLifecycleConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

}

final class GetBucketLifecycleConfigurationRequestOps(val self: GetBucketLifecycleConfigurationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketLifecycleConfigurationRequestOps {

  implicit def toGetBucketLifecycleConfigurationRequestBuilderOps(
      v: GetBucketLifecycleConfigurationRequest.Builder
  ): GetBucketLifecycleConfigurationRequestBuilderOps = new GetBucketLifecycleConfigurationRequestBuilderOps(v)

  implicit def toGetBucketLifecycleConfigurationRequestOps(
      v: GetBucketLifecycleConfigurationRequest
  ): GetBucketLifecycleConfigurationRequestOps = new GetBucketLifecycleConfigurationRequestOps(v)

}

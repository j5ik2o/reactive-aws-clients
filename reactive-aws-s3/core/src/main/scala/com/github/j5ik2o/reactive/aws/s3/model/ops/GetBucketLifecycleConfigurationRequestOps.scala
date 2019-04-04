// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketLifecycleConfigurationRequestBuilderOps(val self: GetBucketLifecycleConfigurationRequest.Builder)
    extends AnyVal {

  final def withBucketAsScala(value: Option[String]): GetBucketLifecycleConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

}

final class GetBucketLifecycleConfigurationRequestOps(val self: GetBucketLifecycleConfigurationRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

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

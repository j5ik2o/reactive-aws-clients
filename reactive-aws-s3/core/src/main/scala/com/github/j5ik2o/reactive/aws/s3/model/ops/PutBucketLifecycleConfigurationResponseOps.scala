// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketLifecycleConfigurationResponseBuilderOps(val self: PutBucketLifecycleConfigurationResponse.Builder)
    extends AnyVal {}

final class PutBucketLifecycleConfigurationResponseOps(val self: PutBucketLifecycleConfigurationResponse)
    extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketLifecycleConfigurationResponseOps {

  implicit def toPutBucketLifecycleConfigurationResponseBuilderOps(
      v: PutBucketLifecycleConfigurationResponse.Builder
  ): PutBucketLifecycleConfigurationResponseBuilderOps = new PutBucketLifecycleConfigurationResponseBuilderOps(v)

  implicit def toPutBucketLifecycleConfigurationResponseOps(
      v: PutBucketLifecycleConfigurationResponse
  ): PutBucketLifecycleConfigurationResponseOps = new PutBucketLifecycleConfigurationResponseOps(v)

}

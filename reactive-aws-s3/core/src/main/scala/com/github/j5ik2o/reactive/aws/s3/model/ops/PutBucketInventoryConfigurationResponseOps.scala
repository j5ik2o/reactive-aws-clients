// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketInventoryConfigurationResponseBuilderOps(val self: PutBucketInventoryConfigurationResponse.Builder)
    extends AnyVal {}

final class PutBucketInventoryConfigurationResponseOps(val self: PutBucketInventoryConfigurationResponse)
    extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketInventoryConfigurationResponseOps {

  implicit def toPutBucketInventoryConfigurationResponseBuilderOps(
      v: PutBucketInventoryConfigurationResponse.Builder
  ): PutBucketInventoryConfigurationResponseBuilderOps = new PutBucketInventoryConfigurationResponseBuilderOps(v)

  implicit def toPutBucketInventoryConfigurationResponseOps(
      v: PutBucketInventoryConfigurationResponse
  ): PutBucketInventoryConfigurationResponseOps = new PutBucketInventoryConfigurationResponseOps(v)

}

// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketAccelerateConfigurationResponseBuilderOps(
    val self: PutBucketAccelerateConfigurationResponse.Builder
) extends AnyVal {}

final class PutBucketAccelerateConfigurationResponseOps(val self: PutBucketAccelerateConfigurationResponse)
    extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketAccelerateConfigurationResponseOps {

  implicit def toPutBucketAccelerateConfigurationResponseBuilderOps(
      v: PutBucketAccelerateConfigurationResponse.Builder
  ): PutBucketAccelerateConfigurationResponseBuilderOps = new PutBucketAccelerateConfigurationResponseBuilderOps(v)

  implicit def toPutBucketAccelerateConfigurationResponseOps(
      v: PutBucketAccelerateConfigurationResponse
  ): PutBucketAccelerateConfigurationResponseOps = new PutBucketAccelerateConfigurationResponseOps(v)

}

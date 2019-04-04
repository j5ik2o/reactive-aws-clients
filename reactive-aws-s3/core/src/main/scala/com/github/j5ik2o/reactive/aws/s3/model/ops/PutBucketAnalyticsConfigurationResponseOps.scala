// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketAnalyticsConfigurationResponseBuilderOps(val self: PutBucketAnalyticsConfigurationResponse.Builder)
    extends AnyVal {}

final class PutBucketAnalyticsConfigurationResponseOps(val self: PutBucketAnalyticsConfigurationResponse)
    extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketAnalyticsConfigurationResponseOps {

  implicit def toPutBucketAnalyticsConfigurationResponseBuilderOps(
      v: PutBucketAnalyticsConfigurationResponse.Builder
  ): PutBucketAnalyticsConfigurationResponseBuilderOps = new PutBucketAnalyticsConfigurationResponseBuilderOps(v)

  implicit def toPutBucketAnalyticsConfigurationResponseOps(
      v: PutBucketAnalyticsConfigurationResponse
  ): PutBucketAnalyticsConfigurationResponseOps = new PutBucketAnalyticsConfigurationResponseOps(v)

}

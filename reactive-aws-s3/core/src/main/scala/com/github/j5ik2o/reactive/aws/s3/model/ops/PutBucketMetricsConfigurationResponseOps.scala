// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketMetricsConfigurationResponseBuilderOps(val self: PutBucketMetricsConfigurationResponse.Builder)
    extends AnyVal {}

final class PutBucketMetricsConfigurationResponseOps(val self: PutBucketMetricsConfigurationResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketMetricsConfigurationResponseOps {

  implicit def toPutBucketMetricsConfigurationResponseBuilderOps(
      v: PutBucketMetricsConfigurationResponse.Builder
  ): PutBucketMetricsConfigurationResponseBuilderOps = new PutBucketMetricsConfigurationResponseBuilderOps(v)

  implicit def toPutBucketMetricsConfigurationResponseOps(
      v: PutBucketMetricsConfigurationResponse
  ): PutBucketMetricsConfigurationResponseOps = new PutBucketMetricsConfigurationResponseOps(v)

}

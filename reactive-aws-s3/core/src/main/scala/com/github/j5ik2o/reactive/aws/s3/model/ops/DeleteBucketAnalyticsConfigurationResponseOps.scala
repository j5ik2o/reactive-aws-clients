// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteBucketAnalyticsConfigurationResponseBuilderOps(
    val self: DeleteBucketAnalyticsConfigurationResponse.Builder
) extends AnyVal {}

final class DeleteBucketAnalyticsConfigurationResponseOps(val self: DeleteBucketAnalyticsConfigurationResponse)
    extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteBucketAnalyticsConfigurationResponseOps {

  implicit def toDeleteBucketAnalyticsConfigurationResponseBuilderOps(
      v: DeleteBucketAnalyticsConfigurationResponse.Builder
  ): DeleteBucketAnalyticsConfigurationResponseBuilderOps = new DeleteBucketAnalyticsConfigurationResponseBuilderOps(v)

  implicit def toDeleteBucketAnalyticsConfigurationResponseOps(
      v: DeleteBucketAnalyticsConfigurationResponse
  ): DeleteBucketAnalyticsConfigurationResponseOps = new DeleteBucketAnalyticsConfigurationResponseOps(v)

}

// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteBucketMetricsConfigurationResponseBuilderOps(
    val self: DeleteBucketMetricsConfigurationResponse.Builder
) extends AnyVal {}

final class DeleteBucketMetricsConfigurationResponseOps(val self: DeleteBucketMetricsConfigurationResponse)
    extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteBucketMetricsConfigurationResponseOps {

  implicit def toDeleteBucketMetricsConfigurationResponseBuilderOps(
      v: DeleteBucketMetricsConfigurationResponse.Builder
  ): DeleteBucketMetricsConfigurationResponseBuilderOps = new DeleteBucketMetricsConfigurationResponseBuilderOps(v)

  implicit def toDeleteBucketMetricsConfigurationResponseOps(
      v: DeleteBucketMetricsConfigurationResponse
  ): DeleteBucketMetricsConfigurationResponseOps = new DeleteBucketMetricsConfigurationResponseOps(v)

}

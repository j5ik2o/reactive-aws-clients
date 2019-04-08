// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketMetricsConfigurationResponseBuilderOps(val self: GetBucketMetricsConfigurationResponse.Builder)
    extends AnyVal {

  final def metricsConfigurationAsScala(
      value: Option[MetricsConfiguration]
  ): GetBucketMetricsConfigurationResponse.Builder = {
    value.fold(self) { v =>
      self.metricsConfiguration(v)
    }
  } // MetricsConfiguration

}

final class GetBucketMetricsConfigurationResponseOps(val self: GetBucketMetricsConfigurationResponse) extends AnyVal {

  final def metricsConfigurationAsScala: Option[MetricsConfiguration] =
    Option(self.metricsConfiguration) // MetricsConfiguration

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketMetricsConfigurationResponseOps {

  implicit def toGetBucketMetricsConfigurationResponseBuilderOps(
      v: GetBucketMetricsConfigurationResponse.Builder
  ): GetBucketMetricsConfigurationResponseBuilderOps = new GetBucketMetricsConfigurationResponseBuilderOps(v)

  implicit def toGetBucketMetricsConfigurationResponseOps(
      v: GetBucketMetricsConfigurationResponse
  ): GetBucketMetricsConfigurationResponseOps = new GetBucketMetricsConfigurationResponseOps(v)

}

// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketMetricsConfigurationRequestBuilderOps(val self: GetBucketMetricsConfigurationRequest.Builder)
    extends AnyVal {

  final def bucketAsScala(value: Option[String]): GetBucketMetricsConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def idAsScala(value: Option[String]): GetBucketMetricsConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  } // String

}

final class GetBucketMetricsConfigurationRequestOps(val self: GetBucketMetricsConfigurationRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def idAsScala: Option[String] = Option(self.id) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketMetricsConfigurationRequestOps {

  implicit def toGetBucketMetricsConfigurationRequestBuilderOps(
      v: GetBucketMetricsConfigurationRequest.Builder
  ): GetBucketMetricsConfigurationRequestBuilderOps = new GetBucketMetricsConfigurationRequestBuilderOps(v)

  implicit def toGetBucketMetricsConfigurationRequestOps(
      v: GetBucketMetricsConfigurationRequest
  ): GetBucketMetricsConfigurationRequestOps = new GetBucketMetricsConfigurationRequestOps(v)

}

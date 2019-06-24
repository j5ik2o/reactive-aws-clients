// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListBucketMetricsConfigurationsRequestBuilderOps(val self: ListBucketMetricsConfigurationsRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): ListBucketMetricsConfigurationsRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def continuationTokenAsScala(value: Option[String]): ListBucketMetricsConfigurationsRequest.Builder = {
    value.fold(self) { v =>
      self.continuationToken(v)
    }
  }

}

final class ListBucketMetricsConfigurationsRequestOps(val self: ListBucketMetricsConfigurationsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def continuationTokenAsScala: Option[String] = Option(self.continuationToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListBucketMetricsConfigurationsRequestOps {

  implicit def toListBucketMetricsConfigurationsRequestBuilderOps(
      v: ListBucketMetricsConfigurationsRequest.Builder
  ): ListBucketMetricsConfigurationsRequestBuilderOps = new ListBucketMetricsConfigurationsRequestBuilderOps(v)

  implicit def toListBucketMetricsConfigurationsRequestOps(
      v: ListBucketMetricsConfigurationsRequest
  ): ListBucketMetricsConfigurationsRequestOps = new ListBucketMetricsConfigurationsRequestOps(v)

}

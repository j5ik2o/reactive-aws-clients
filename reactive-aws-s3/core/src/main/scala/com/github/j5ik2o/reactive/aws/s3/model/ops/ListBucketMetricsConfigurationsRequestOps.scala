// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListBucketMetricsConfigurationsRequestBuilderOps(val self: ListBucketMetricsConfigurationsRequest.Builder)
    extends AnyVal {

  final def bucketAsScala(value: Option[String]): ListBucketMetricsConfigurationsRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def continuationTokenAsScala(value: Option[String]): ListBucketMetricsConfigurationsRequest.Builder = {
    value.fold(self) { v =>
      self.continuationToken(v)
    }
  } // String

}

final class ListBucketMetricsConfigurationsRequestOps(val self: ListBucketMetricsConfigurationsRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def continuationTokenAsScala: Option[String] = Option(self.continuationToken) // String

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

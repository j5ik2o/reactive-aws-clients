// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteBucketMetricsConfigurationRequestBuilderOps(val self: DeleteBucketMetricsConfigurationRequest.Builder)
    extends AnyVal {

  final def withBucketAsScala(value: Option[String]): DeleteBucketMetricsConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def withIdAsScala(value: Option[String]): DeleteBucketMetricsConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  } // String

}

final class DeleteBucketMetricsConfigurationRequestOps(val self: DeleteBucketMetricsConfigurationRequest)
    extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def idAsScala: Option[String] = Option(self.id) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteBucketMetricsConfigurationRequestOps {

  implicit def toDeleteBucketMetricsConfigurationRequestBuilderOps(
      v: DeleteBucketMetricsConfigurationRequest.Builder
  ): DeleteBucketMetricsConfigurationRequestBuilderOps = new DeleteBucketMetricsConfigurationRequestBuilderOps(v)

  implicit def toDeleteBucketMetricsConfigurationRequestOps(
      v: DeleteBucketMetricsConfigurationRequest
  ): DeleteBucketMetricsConfigurationRequestOps = new DeleteBucketMetricsConfigurationRequestOps(v)

}

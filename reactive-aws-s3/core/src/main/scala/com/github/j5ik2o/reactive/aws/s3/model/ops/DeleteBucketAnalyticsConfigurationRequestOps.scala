// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteBucketAnalyticsConfigurationRequestBuilderOps(
    val self: DeleteBucketAnalyticsConfigurationRequest.Builder
) extends AnyVal {

  final def bucketAsScala(value: Option[String]): DeleteBucketAnalyticsConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def idAsScala(value: Option[String]): DeleteBucketAnalyticsConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  } // String

}

final class DeleteBucketAnalyticsConfigurationRequestOps(val self: DeleteBucketAnalyticsConfigurationRequest)
    extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def idAsScala: Option[String] = Option(self.id) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteBucketAnalyticsConfigurationRequestOps {

  implicit def toDeleteBucketAnalyticsConfigurationRequestBuilderOps(
      v: DeleteBucketAnalyticsConfigurationRequest.Builder
  ): DeleteBucketAnalyticsConfigurationRequestBuilderOps = new DeleteBucketAnalyticsConfigurationRequestBuilderOps(v)

  implicit def toDeleteBucketAnalyticsConfigurationRequestOps(
      v: DeleteBucketAnalyticsConfigurationRequest
  ): DeleteBucketAnalyticsConfigurationRequestOps = new DeleteBucketAnalyticsConfigurationRequestOps(v)

}

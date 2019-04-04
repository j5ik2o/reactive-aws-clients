// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketAnalyticsConfigurationRequestBuilderOps(val self: PutBucketAnalyticsConfigurationRequest.Builder)
    extends AnyVal {

  final def withBucketAsScala(value: Option[String]): PutBucketAnalyticsConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def withIdAsScala(value: Option[String]): PutBucketAnalyticsConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  } // String

  final def withAnalyticsConfigurationAsScala(
      value: Option[AnalyticsConfiguration]
  ): PutBucketAnalyticsConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.analyticsConfiguration(v)
    }
  } // AnalyticsConfiguration

}

final class PutBucketAnalyticsConfigurationRequestOps(val self: PutBucketAnalyticsConfigurationRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def idAsScala: Option[String] = Option(self.id) // String

  final def analyticsConfigurationAsScala: Option[AnalyticsConfiguration] =
    Option(self.analyticsConfiguration) // AnalyticsConfiguration

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketAnalyticsConfigurationRequestOps {

  implicit def toPutBucketAnalyticsConfigurationRequestBuilderOps(
      v: PutBucketAnalyticsConfigurationRequest.Builder
  ): PutBucketAnalyticsConfigurationRequestBuilderOps = new PutBucketAnalyticsConfigurationRequestBuilderOps(v)

  implicit def toPutBucketAnalyticsConfigurationRequestOps(
      v: PutBucketAnalyticsConfigurationRequest
  ): PutBucketAnalyticsConfigurationRequestOps = new PutBucketAnalyticsConfigurationRequestOps(v)

}

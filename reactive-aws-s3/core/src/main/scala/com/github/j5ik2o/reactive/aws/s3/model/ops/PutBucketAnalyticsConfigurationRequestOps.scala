// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketAnalyticsConfigurationRequestBuilderOps(val self: PutBucketAnalyticsConfigurationRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): PutBucketAnalyticsConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala(value: Option[String]): PutBucketAnalyticsConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def analyticsConfigurationAsScala(
      value: Option[AnalyticsConfiguration]
  ): PutBucketAnalyticsConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.analyticsConfiguration(v)
    }
  }

}

final class PutBucketAnalyticsConfigurationRequestOps(val self: PutBucketAnalyticsConfigurationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala: Option[String] = Option(self.id)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def analyticsConfigurationAsScala: Option[AnalyticsConfiguration] = Option(self.analyticsConfiguration)

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

// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketMetricsConfigurationRequestBuilderOps(val self: PutBucketMetricsConfigurationRequest.Builder)
    extends AnyVal {

  final def bucketAsScala(value: Option[String]): PutBucketMetricsConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def idAsScala(value: Option[String]): PutBucketMetricsConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

  final def metricsConfigurationAsScala(
      value: Option[MetricsConfiguration]
  ): PutBucketMetricsConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.metricsConfiguration(v)
    }
  }

}

final class PutBucketMetricsConfigurationRequestOps(val self: PutBucketMetricsConfigurationRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def idAsScala: Option[String] = Option(self.id)

  final def metricsConfigurationAsScala: Option[MetricsConfiguration] = Option(self.metricsConfiguration)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketMetricsConfigurationRequestOps {

  implicit def toPutBucketMetricsConfigurationRequestBuilderOps(
      v: PutBucketMetricsConfigurationRequest.Builder
  ): PutBucketMetricsConfigurationRequestBuilderOps = new PutBucketMetricsConfigurationRequestBuilderOps(v)

  implicit def toPutBucketMetricsConfigurationRequestOps(
      v: PutBucketMetricsConfigurationRequest
  ): PutBucketMetricsConfigurationRequestOps = new PutBucketMetricsConfigurationRequestOps(v)

}

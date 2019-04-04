// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListBucketMetricsConfigurationsResponseBuilderOps(val self: ListBucketMetricsConfigurationsResponse.Builder)
    extends AnyVal {

  final def withIsTruncatedAsScala(value: Option[Boolean]): ListBucketMetricsConfigurationsResponse.Builder = {
    value.fold(self) { v =>
      self.isTruncated(v)
    }
  } // Boolean

  final def withContinuationTokenAsScala(value: Option[String]): ListBucketMetricsConfigurationsResponse.Builder = {
    value.fold(self) { v =>
      self.continuationToken(v)
    }
  } // String

  final def withNextContinuationTokenAsScala(value: Option[String]): ListBucketMetricsConfigurationsResponse.Builder = {
    value.fold(self) { v =>
      self.nextContinuationToken(v)
    }
  } // String

  final def withMetricsConfigurationListAsScala(
      value: Option[Seq[MetricsConfiguration]]
  ): ListBucketMetricsConfigurationsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.metricsConfigurationList(v.asJava)
    } // Seq[MetricsConfiguration]
  }

}

final class ListBucketMetricsConfigurationsResponseOps(val self: ListBucketMetricsConfigurationsResponse)
    extends AnyVal {

  final def isTruncatedAsScala: Option[Boolean] = Option(self.isTruncated) // Boolean

  final def continuationTokenAsScala: Option[String] = Option(self.continuationToken) // String

  final def nextContinuationTokenAsScala: Option[String] = Option(self.nextContinuationToken) // String

  final def metricsConfigurationListAsScala: Option[Seq[MetricsConfiguration]] =
    Option(self.metricsConfigurationList).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    } // Seq[MetricsConfiguration]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListBucketMetricsConfigurationsResponseOps {

  implicit def toListBucketMetricsConfigurationsResponseBuilderOps(
      v: ListBucketMetricsConfigurationsResponse.Builder
  ): ListBucketMetricsConfigurationsResponseBuilderOps = new ListBucketMetricsConfigurationsResponseBuilderOps(v)

  implicit def toListBucketMetricsConfigurationsResponseOps(
      v: ListBucketMetricsConfigurationsResponse
  ): ListBucketMetricsConfigurationsResponseOps = new ListBucketMetricsConfigurationsResponseOps(v)

}

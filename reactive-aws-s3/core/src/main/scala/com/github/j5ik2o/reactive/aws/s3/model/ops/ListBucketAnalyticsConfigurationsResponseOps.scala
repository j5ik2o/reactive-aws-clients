// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListBucketAnalyticsConfigurationsResponseBuilderOps(
    val self: ListBucketAnalyticsConfigurationsResponse.Builder
) extends AnyVal {

  final def isTruncatedAsScala(value: Option[Boolean]): ListBucketAnalyticsConfigurationsResponse.Builder = {
    value.fold(self) { v =>
      self.isTruncated(v)
    }
  } // Boolean

  final def continuationTokenAsScala(value: Option[String]): ListBucketAnalyticsConfigurationsResponse.Builder = {
    value.fold(self) { v =>
      self.continuationToken(v)
    }
  } // String

  final def nextContinuationTokenAsScala(value: Option[String]): ListBucketAnalyticsConfigurationsResponse.Builder = {
    value.fold(self) { v =>
      self.nextContinuationToken(v)
    }
  } // String

  final def analyticsConfigurationListAsScala(
      value: Option[Seq[AnalyticsConfiguration]]
  ): ListBucketAnalyticsConfigurationsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.analyticsConfigurationList(v.asJava)
    } // Seq[AnalyticsConfiguration]
  }

}

final class ListBucketAnalyticsConfigurationsResponseOps(val self: ListBucketAnalyticsConfigurationsResponse)
    extends AnyVal {

  final def isTruncatedAsScala: Option[Boolean] = Option(self.isTruncated) // Boolean

  final def continuationTokenAsScala: Option[String] = Option(self.continuationToken) // String

  final def nextContinuationTokenAsScala: Option[String] = Option(self.nextContinuationToken) // String

  final def analyticsConfigurationListAsScala: Option[Seq[AnalyticsConfiguration]] =
    Option(self.analyticsConfigurationList).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    } // Seq[AnalyticsConfiguration]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListBucketAnalyticsConfigurationsResponseOps {

  implicit def toListBucketAnalyticsConfigurationsResponseBuilderOps(
      v: ListBucketAnalyticsConfigurationsResponse.Builder
  ): ListBucketAnalyticsConfigurationsResponseBuilderOps = new ListBucketAnalyticsConfigurationsResponseBuilderOps(v)

  implicit def toListBucketAnalyticsConfigurationsResponseOps(
      v: ListBucketAnalyticsConfigurationsResponse
  ): ListBucketAnalyticsConfigurationsResponseOps = new ListBucketAnalyticsConfigurationsResponseOps(v)

}

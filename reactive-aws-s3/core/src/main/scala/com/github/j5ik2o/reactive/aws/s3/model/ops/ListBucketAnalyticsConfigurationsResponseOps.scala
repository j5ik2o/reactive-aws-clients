// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListBucketAnalyticsConfigurationsResponseBuilderOps(
    val self: ListBucketAnalyticsConfigurationsResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def isTruncatedAsScala(value: Option[Boolean]): ListBucketAnalyticsConfigurationsResponse.Builder = {
    value.fold(self) { v => self.isTruncated(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def continuationTokenAsScala(value: Option[String]): ListBucketAnalyticsConfigurationsResponse.Builder = {
    value.fold(self) { v => self.continuationToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextContinuationTokenAsScala(value: Option[String]): ListBucketAnalyticsConfigurationsResponse.Builder = {
    value.fold(self) { v => self.nextContinuationToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def analyticsConfigurationListAsScala(
      value: Option[Seq[AnalyticsConfiguration]]
  ): ListBucketAnalyticsConfigurationsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.analyticsConfigurationList(v.asJava)
    }
  }

}

final class ListBucketAnalyticsConfigurationsResponseOps(val self: ListBucketAnalyticsConfigurationsResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def isTruncatedAsScala: Option[Boolean] = Option(self.isTruncated)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def continuationTokenAsScala: Option[String] = Option(self.continuationToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextContinuationTokenAsScala: Option[String] = Option(self.nextContinuationToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def analyticsConfigurationListAsScala: Option[Seq[AnalyticsConfiguration]] =
    Option(self.analyticsConfigurationList).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

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

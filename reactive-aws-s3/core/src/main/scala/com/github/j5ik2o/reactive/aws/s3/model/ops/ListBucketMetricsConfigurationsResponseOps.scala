// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListBucketMetricsConfigurationsResponseBuilderOps(val self: ListBucketMetricsConfigurationsResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def isTruncatedAsScala(value: Option[Boolean]): ListBucketMetricsConfigurationsResponse.Builder = {
            value.fold(self){ v => self.isTruncated(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def continuationTokenAsScala(value: Option[String]): ListBucketMetricsConfigurationsResponse.Builder = {
            value.fold(self){ v => self.continuationToken(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextContinuationTokenAsScala(value: Option[String]): ListBucketMetricsConfigurationsResponse.Builder = {
            value.fold(self){ v => self.nextContinuationToken(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def metricsConfigurationListAsScala(value: Option[Seq[MetricsConfiguration]]): ListBucketMetricsConfigurationsResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.metricsConfigurationList(v.asJava) } 
            }


}

final class ListBucketMetricsConfigurationsResponseOps(val self: ListBucketMetricsConfigurationsResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def isTruncatedAsScala: Option[Boolean] = Option(self.isTruncated) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def continuationTokenAsScala: Option[String] = Option(self.continuationToken) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextContinuationTokenAsScala: Option[String] = Option(self.nextContinuationToken) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def metricsConfigurationListAsScala: Option[Seq[MetricsConfiguration]] = Option(self.metricsConfigurationList).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListBucketMetricsConfigurationsResponseOps {

implicit def toListBucketMetricsConfigurationsResponseBuilderOps(v: ListBucketMetricsConfigurationsResponse.Builder): ListBucketMetricsConfigurationsResponseBuilderOps = new ListBucketMetricsConfigurationsResponseBuilderOps(v)

implicit def toListBucketMetricsConfigurationsResponseOps(v: ListBucketMetricsConfigurationsResponse): ListBucketMetricsConfigurationsResponseOps = new ListBucketMetricsConfigurationsResponseOps(v)

}


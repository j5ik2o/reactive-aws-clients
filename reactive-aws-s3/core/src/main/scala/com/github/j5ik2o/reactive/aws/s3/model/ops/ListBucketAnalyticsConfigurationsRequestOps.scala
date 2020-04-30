// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListBucketAnalyticsConfigurationsRequestBuilderOps(val self: ListBucketAnalyticsConfigurationsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketAsScala(value: Option[String]): ListBucketAnalyticsConfigurationsRequest.Builder = {
            value.fold(self){ v => self.bucket(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def continuationTokenAsScala(value: Option[String]): ListBucketAnalyticsConfigurationsRequest.Builder = {
            value.fold(self){ v => self.continuationToken(v) }
            } 


}

final class ListBucketAnalyticsConfigurationsRequestOps(val self: ListBucketAnalyticsConfigurationsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketAsScala: Option[String] = Option(self.bucket) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def continuationTokenAsScala: Option[String] = Option(self.continuationToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListBucketAnalyticsConfigurationsRequestOps {

implicit def toListBucketAnalyticsConfigurationsRequestBuilderOps(v: ListBucketAnalyticsConfigurationsRequest.Builder): ListBucketAnalyticsConfigurationsRequestBuilderOps = new ListBucketAnalyticsConfigurationsRequestBuilderOps(v)

implicit def toListBucketAnalyticsConfigurationsRequestOps(v: ListBucketAnalyticsConfigurationsRequest): ListBucketAnalyticsConfigurationsRequestOps = new ListBucketAnalyticsConfigurationsRequestOps(v)

}


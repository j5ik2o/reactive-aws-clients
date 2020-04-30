// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteBucketMetricsConfigurationRequestBuilderOps(val self: DeleteBucketMetricsConfigurationRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketAsScala(value: Option[String]): DeleteBucketMetricsConfigurationRequest.Builder = {
            value.fold(self){ v => self.bucket(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def idAsScala(value: Option[String]): DeleteBucketMetricsConfigurationRequest.Builder = {
            value.fold(self){ v => self.id(v) }
            } 


}

final class DeleteBucketMetricsConfigurationRequestOps(val self: DeleteBucketMetricsConfigurationRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketAsScala: Option[String] = Option(self.bucket) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def idAsScala: Option[String] = Option(self.id) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteBucketMetricsConfigurationRequestOps {

implicit def toDeleteBucketMetricsConfigurationRequestBuilderOps(v: DeleteBucketMetricsConfigurationRequest.Builder): DeleteBucketMetricsConfigurationRequestBuilderOps = new DeleteBucketMetricsConfigurationRequestBuilderOps(v)

implicit def toDeleteBucketMetricsConfigurationRequestOps(v: DeleteBucketMetricsConfigurationRequest): DeleteBucketMetricsConfigurationRequestOps = new DeleteBucketMetricsConfigurationRequestOps(v)

}


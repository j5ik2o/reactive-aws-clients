// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListBucketInventoryConfigurationsRequestBuilderOps(val self: ListBucketInventoryConfigurationsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketAsScala(value: Option[String]): ListBucketInventoryConfigurationsRequest.Builder = {
            value.fold(self){ v => self.bucket(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def continuationTokenAsScala(value: Option[String]): ListBucketInventoryConfigurationsRequest.Builder = {
            value.fold(self){ v => self.continuationToken(v) }
            } 


}

final class ListBucketInventoryConfigurationsRequestOps(val self: ListBucketInventoryConfigurationsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketAsScala: Option[String] = Option(self.bucket) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def continuationTokenAsScala: Option[String] = Option(self.continuationToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListBucketInventoryConfigurationsRequestOps {

implicit def toListBucketInventoryConfigurationsRequestBuilderOps(v: ListBucketInventoryConfigurationsRequest.Builder): ListBucketInventoryConfigurationsRequestBuilderOps = new ListBucketInventoryConfigurationsRequestBuilderOps(v)

implicit def toListBucketInventoryConfigurationsRequestOps(v: ListBucketInventoryConfigurationsRequest): ListBucketInventoryConfigurationsRequestOps = new ListBucketInventoryConfigurationsRequestOps(v)

}


// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketInventoryConfigurationRequestBuilderOps(val self: PutBucketInventoryConfigurationRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketAsScala(value: Option[String]): PutBucketInventoryConfigurationRequest.Builder = {
            value.fold(self){ v => self.bucket(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def idAsScala(value: Option[String]): PutBucketInventoryConfigurationRequest.Builder = {
            value.fold(self){ v => self.id(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def inventoryConfigurationAsScala(value: Option[InventoryConfiguration]): PutBucketInventoryConfigurationRequest.Builder = {
            value.fold(self){ v => self.inventoryConfiguration(v) }
            } 


}

final class PutBucketInventoryConfigurationRequestOps(val self: PutBucketInventoryConfigurationRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketAsScala: Option[String] = Option(self.bucket) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def idAsScala: Option[String] = Option(self.id) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def inventoryConfigurationAsScala: Option[InventoryConfiguration] = Option(self.inventoryConfiguration) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketInventoryConfigurationRequestOps {

implicit def toPutBucketInventoryConfigurationRequestBuilderOps(v: PutBucketInventoryConfigurationRequest.Builder): PutBucketInventoryConfigurationRequestBuilderOps = new PutBucketInventoryConfigurationRequestBuilderOps(v)

implicit def toPutBucketInventoryConfigurationRequestOps(v: PutBucketInventoryConfigurationRequest): PutBucketInventoryConfigurationRequestOps = new PutBucketInventoryConfigurationRequestOps(v)

}


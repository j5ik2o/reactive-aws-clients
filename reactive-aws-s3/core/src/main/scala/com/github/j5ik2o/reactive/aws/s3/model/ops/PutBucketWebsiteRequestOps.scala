// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketWebsiteRequestBuilderOps(val self: PutBucketWebsiteRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketAsScala(value: Option[String]): PutBucketWebsiteRequest.Builder = {
            value.fold(self){ v => self.bucket(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def contentMD5AsScala(value: Option[String]): PutBucketWebsiteRequest.Builder = {
            value.fold(self){ v => self.contentMD5(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def websiteConfigurationAsScala(value: Option[WebsiteConfiguration]): PutBucketWebsiteRequest.Builder = {
            value.fold(self){ v => self.websiteConfiguration(v) }
            } 


}

final class PutBucketWebsiteRequestOps(val self: PutBucketWebsiteRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketAsScala: Option[String] = Option(self.bucket) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def contentMD5AsScala: Option[String] = Option(self.contentMD5) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def websiteConfigurationAsScala: Option[WebsiteConfiguration] = Option(self.websiteConfiguration) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketWebsiteRequestOps {

implicit def toPutBucketWebsiteRequestBuilderOps(v: PutBucketWebsiteRequest.Builder): PutBucketWebsiteRequestBuilderOps = new PutBucketWebsiteRequestBuilderOps(v)

implicit def toPutBucketWebsiteRequestOps(v: PutBucketWebsiteRequest): PutBucketWebsiteRequestOps = new PutBucketWebsiteRequestOps(v)

}


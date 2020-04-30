// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CreateBucketRequestBuilderOps(val self: CreateBucketRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def aclAsScala(value: Option[BucketCannedACL]): CreateBucketRequest.Builder = {
            value.fold(self){ v => self.acl(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketAsScala(value: Option[String]): CreateBucketRequest.Builder = {
            value.fold(self){ v => self.bucket(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def createBucketConfigurationAsScala(value: Option[CreateBucketConfiguration]): CreateBucketRequest.Builder = {
            value.fold(self){ v => self.createBucketConfiguration(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def grantFullControlAsScala(value: Option[String]): CreateBucketRequest.Builder = {
            value.fold(self){ v => self.grantFullControl(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def grantReadAsScala(value: Option[String]): CreateBucketRequest.Builder = {
            value.fold(self){ v => self.grantRead(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def grantReadACPAsScala(value: Option[String]): CreateBucketRequest.Builder = {
            value.fold(self){ v => self.grantReadACP(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def grantWriteAsScala(value: Option[String]): CreateBucketRequest.Builder = {
            value.fold(self){ v => self.grantWrite(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def grantWriteACPAsScala(value: Option[String]): CreateBucketRequest.Builder = {
            value.fold(self){ v => self.grantWriteACP(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def objectLockEnabledForBucketAsScala(value: Option[Boolean]): CreateBucketRequest.Builder = {
            value.fold(self){ v => self.objectLockEnabledForBucket(v) }
            } 


}

final class CreateBucketRequestOps(val self: CreateBucketRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def aclAsScala: Option[BucketCannedACL] = Option(self.acl) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketAsScala: Option[String] = Option(self.bucket) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def createBucketConfigurationAsScala: Option[CreateBucketConfiguration] = Option(self.createBucketConfiguration) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def grantFullControlAsScala: Option[String] = Option(self.grantFullControl) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def grantReadAsScala: Option[String] = Option(self.grantRead) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def grantReadACPAsScala: Option[String] = Option(self.grantReadACP) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def grantWriteAsScala: Option[String] = Option(self.grantWrite) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def grantWriteACPAsScala: Option[String] = Option(self.grantWriteACP) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def objectLockEnabledForBucketAsScala: Option[Boolean] = Option(self.objectLockEnabledForBucket) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateBucketRequestOps {

implicit def toCreateBucketRequestBuilderOps(v: CreateBucketRequest.Builder): CreateBucketRequestBuilderOps = new CreateBucketRequestBuilderOps(v)

implicit def toCreateBucketRequestOps(v: CreateBucketRequest): CreateBucketRequestOps = new CreateBucketRequestOps(v)

}


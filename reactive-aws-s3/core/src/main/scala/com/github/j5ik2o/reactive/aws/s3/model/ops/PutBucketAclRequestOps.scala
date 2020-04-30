// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketAclRequestBuilderOps(val self: PutBucketAclRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def aclAsScala(value: Option[BucketCannedACL]): PutBucketAclRequest.Builder = {
            value.fold(self){ v => self.acl(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def accessControlPolicyAsScala(value: Option[AccessControlPolicy]): PutBucketAclRequest.Builder = {
            value.fold(self){ v => self.accessControlPolicy(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketAsScala(value: Option[String]): PutBucketAclRequest.Builder = {
            value.fold(self){ v => self.bucket(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def contentMD5AsScala(value: Option[String]): PutBucketAclRequest.Builder = {
            value.fold(self){ v => self.contentMD5(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def grantFullControlAsScala(value: Option[String]): PutBucketAclRequest.Builder = {
            value.fold(self){ v => self.grantFullControl(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def grantReadAsScala(value: Option[String]): PutBucketAclRequest.Builder = {
            value.fold(self){ v => self.grantRead(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def grantReadACPAsScala(value: Option[String]): PutBucketAclRequest.Builder = {
            value.fold(self){ v => self.grantReadACP(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def grantWriteAsScala(value: Option[String]): PutBucketAclRequest.Builder = {
            value.fold(self){ v => self.grantWrite(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def grantWriteACPAsScala(value: Option[String]): PutBucketAclRequest.Builder = {
            value.fold(self){ v => self.grantWriteACP(v) }
            } 


}

final class PutBucketAclRequestOps(val self: PutBucketAclRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def aclAsScala: Option[BucketCannedACL] = Option(self.acl) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def accessControlPolicyAsScala: Option[AccessControlPolicy] = Option(self.accessControlPolicy) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketAsScala: Option[String] = Option(self.bucket) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def contentMD5AsScala: Option[String] = Option(self.contentMD5) 

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


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketAclRequestOps {

implicit def toPutBucketAclRequestBuilderOps(v: PutBucketAclRequest.Builder): PutBucketAclRequestBuilderOps = new PutBucketAclRequestBuilderOps(v)

implicit def toPutBucketAclRequestOps(v: PutBucketAclRequest): PutBucketAclRequestOps = new PutBucketAclRequestOps(v)

}


// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CompleteMultipartUploadResponseBuilderOps(val self: CompleteMultipartUploadResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def locationAsScala(value: Option[String]): CompleteMultipartUploadResponse.Builder = {
            value.fold(self){ v => self.location(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketAsScala(value: Option[String]): CompleteMultipartUploadResponse.Builder = {
            value.fold(self){ v => self.bucket(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def keyAsScala(value: Option[String]): CompleteMultipartUploadResponse.Builder = {
            value.fold(self){ v => self.key(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def expirationAsScala(value: Option[String]): CompleteMultipartUploadResponse.Builder = {
            value.fold(self){ v => self.expiration(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def eTagAsScala(value: Option[String]): CompleteMultipartUploadResponse.Builder = {
            value.fold(self){ v => self.eTag(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def serverSideEncryptionAsScala(value: Option[ServerSideEncryption]): CompleteMultipartUploadResponse.Builder = {
            value.fold(self){ v => self.serverSideEncryption(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def versionIdAsScala(value: Option[String]): CompleteMultipartUploadResponse.Builder = {
            value.fold(self){ v => self.versionId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ssekmsKeyIdAsScala(value: Option[String]): CompleteMultipartUploadResponse.Builder = {
            value.fold(self){ v => self.ssekmsKeyId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def requestChargedAsScala(value: Option[RequestCharged]): CompleteMultipartUploadResponse.Builder = {
            value.fold(self){ v => self.requestCharged(v) }
            } 


}

final class CompleteMultipartUploadResponseOps(val self: CompleteMultipartUploadResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def locationAsScala: Option[String] = Option(self.location) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketAsScala: Option[String] = Option(self.bucket) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def keyAsScala: Option[String] = Option(self.key) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def expirationAsScala: Option[String] = Option(self.expiration) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def eTagAsScala: Option[String] = Option(self.eTag) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def serverSideEncryptionAsScala: Option[ServerSideEncryption] = Option(self.serverSideEncryption) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def versionIdAsScala: Option[String] = Option(self.versionId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ssekmsKeyIdAsScala: Option[String] = Option(self.ssekmsKeyId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCompleteMultipartUploadResponseOps {

implicit def toCompleteMultipartUploadResponseBuilderOps(v: CompleteMultipartUploadResponse.Builder): CompleteMultipartUploadResponseBuilderOps = new CompleteMultipartUploadResponseBuilderOps(v)

implicit def toCompleteMultipartUploadResponseOps(v: CompleteMultipartUploadResponse): CompleteMultipartUploadResponseOps = new CompleteMultipartUploadResponseOps(v)

}


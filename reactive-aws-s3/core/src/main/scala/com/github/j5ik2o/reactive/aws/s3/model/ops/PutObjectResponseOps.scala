// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutObjectResponseBuilderOps(val self: PutObjectResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def expirationAsScala(value: Option[String]): PutObjectResponse.Builder = {
            value.fold(self){ v => self.expiration(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def eTagAsScala(value: Option[String]): PutObjectResponse.Builder = {
            value.fold(self){ v => self.eTag(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def serverSideEncryptionAsScala(value: Option[ServerSideEncryption]): PutObjectResponse.Builder = {
            value.fold(self){ v => self.serverSideEncryption(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def versionIdAsScala(value: Option[String]): PutObjectResponse.Builder = {
            value.fold(self){ v => self.versionId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sseCustomerAlgorithmAsScala(value: Option[String]): PutObjectResponse.Builder = {
            value.fold(self){ v => self.sseCustomerAlgorithm(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sseCustomerKeyMD5AsScala(value: Option[String]): PutObjectResponse.Builder = {
            value.fold(self){ v => self.sseCustomerKeyMD5(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ssekmsKeyIdAsScala(value: Option[String]): PutObjectResponse.Builder = {
            value.fold(self){ v => self.ssekmsKeyId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ssekmsEncryptionContextAsScala(value: Option[String]): PutObjectResponse.Builder = {
            value.fold(self){ v => self.ssekmsEncryptionContext(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def requestChargedAsScala(value: Option[RequestCharged]): PutObjectResponse.Builder = {
            value.fold(self){ v => self.requestCharged(v) }
            } 


}

final class PutObjectResponseOps(val self: PutObjectResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def expirationAsScala: Option[String] = Option(self.expiration) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def eTagAsScala: Option[String] = Option(self.eTag) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def serverSideEncryptionAsScala: Option[ServerSideEncryption] = Option(self.serverSideEncryption) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def versionIdAsScala: Option[String] = Option(self.versionId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ssekmsKeyIdAsScala: Option[String] = Option(self.ssekmsKeyId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ssekmsEncryptionContextAsScala: Option[String] = Option(self.ssekmsEncryptionContext) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutObjectResponseOps {

implicit def toPutObjectResponseBuilderOps(v: PutObjectResponse.Builder): PutObjectResponseBuilderOps = new PutObjectResponseBuilderOps(v)

implicit def toPutObjectResponseOps(v: PutObjectResponse): PutObjectResponseOps = new PutObjectResponseOps(v)

}


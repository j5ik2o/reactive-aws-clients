// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutObjectLegalHoldRequestBuilderOps(val self: PutObjectLegalHoldRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketAsScala(value: Option[String]): PutObjectLegalHoldRequest.Builder = {
            value.fold(self){ v => self.bucket(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def keyAsScala(value: Option[String]): PutObjectLegalHoldRequest.Builder = {
            value.fold(self){ v => self.key(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def legalHoldAsScala(value: Option[ObjectLockLegalHold]): PutObjectLegalHoldRequest.Builder = {
            value.fold(self){ v => self.legalHold(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def requestPayerAsScala(value: Option[RequestPayer]): PutObjectLegalHoldRequest.Builder = {
            value.fold(self){ v => self.requestPayer(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def versionIdAsScala(value: Option[String]): PutObjectLegalHoldRequest.Builder = {
            value.fold(self){ v => self.versionId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def contentMD5AsScala(value: Option[String]): PutObjectLegalHoldRequest.Builder = {
            value.fold(self){ v => self.contentMD5(v) }
            } 


}

final class PutObjectLegalHoldRequestOps(val self: PutObjectLegalHoldRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketAsScala: Option[String] = Option(self.bucket) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def keyAsScala: Option[String] = Option(self.key) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def legalHoldAsScala: Option[ObjectLockLegalHold] = Option(self.legalHold) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def versionIdAsScala: Option[String] = Option(self.versionId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def contentMD5AsScala: Option[String] = Option(self.contentMD5) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutObjectLegalHoldRequestOps {

implicit def toPutObjectLegalHoldRequestBuilderOps(v: PutObjectLegalHoldRequest.Builder): PutObjectLegalHoldRequestBuilderOps = new PutObjectLegalHoldRequestBuilderOps(v)

implicit def toPutObjectLegalHoldRequestOps(v: PutObjectLegalHoldRequest): PutObjectLegalHoldRequestOps = new PutObjectLegalHoldRequestOps(v)

}


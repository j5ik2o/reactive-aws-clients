// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetObjectRequestBuilderOps(val self: GetObjectRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketAsScala(value: Option[String]): GetObjectRequest.Builder = {
            value.fold(self){ v => self.bucket(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ifMatchAsScala(value: Option[String]): GetObjectRequest.Builder = {
            value.fold(self){ v => self.ifMatch(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ifModifiedSinceAsScala(value: Option[java.time.Instant]): GetObjectRequest.Builder = {
            value.fold(self){ v => self.ifModifiedSince(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ifNoneMatchAsScala(value: Option[String]): GetObjectRequest.Builder = {
            value.fold(self){ v => self.ifNoneMatch(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ifUnmodifiedSinceAsScala(value: Option[java.time.Instant]): GetObjectRequest.Builder = {
            value.fold(self){ v => self.ifUnmodifiedSince(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def keyAsScala(value: Option[String]): GetObjectRequest.Builder = {
            value.fold(self){ v => self.key(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def rangeAsScala(value: Option[String]): GetObjectRequest.Builder = {
            value.fold(self){ v => self.range(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def responseCacheControlAsScala(value: Option[String]): GetObjectRequest.Builder = {
            value.fold(self){ v => self.responseCacheControl(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def responseContentDispositionAsScala(value: Option[String]): GetObjectRequest.Builder = {
            value.fold(self){ v => self.responseContentDisposition(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def responseContentEncodingAsScala(value: Option[String]): GetObjectRequest.Builder = {
            value.fold(self){ v => self.responseContentEncoding(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def responseContentLanguageAsScala(value: Option[String]): GetObjectRequest.Builder = {
            value.fold(self){ v => self.responseContentLanguage(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def responseContentTypeAsScala(value: Option[String]): GetObjectRequest.Builder = {
            value.fold(self){ v => self.responseContentType(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def responseExpiresAsScala(value: Option[java.time.Instant]): GetObjectRequest.Builder = {
            value.fold(self){ v => self.responseExpires(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def versionIdAsScala(value: Option[String]): GetObjectRequest.Builder = {
            value.fold(self){ v => self.versionId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sseCustomerAlgorithmAsScala(value: Option[String]): GetObjectRequest.Builder = {
            value.fold(self){ v => self.sseCustomerAlgorithm(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sseCustomerKeyAsScala(value: Option[String]): GetObjectRequest.Builder = {
            value.fold(self){ v => self.sseCustomerKey(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sseCustomerKeyMD5AsScala(value: Option[String]): GetObjectRequest.Builder = {
            value.fold(self){ v => self.sseCustomerKeyMD5(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def requestPayerAsScala(value: Option[RequestPayer]): GetObjectRequest.Builder = {
            value.fold(self){ v => self.requestPayer(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def partNumberAsScala(value: Option[Int]): GetObjectRequest.Builder = {
            value.fold(self){ v => self.partNumber(v) }
            } 


}

final class GetObjectRequestOps(val self: GetObjectRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketAsScala: Option[String] = Option(self.bucket) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ifMatchAsScala: Option[String] = Option(self.ifMatch) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ifModifiedSinceAsScala: Option[java.time.Instant] = Option(self.ifModifiedSince) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ifNoneMatchAsScala: Option[String] = Option(self.ifNoneMatch) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ifUnmodifiedSinceAsScala: Option[java.time.Instant] = Option(self.ifUnmodifiedSince) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def keyAsScala: Option[String] = Option(self.key) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def rangeAsScala: Option[String] = Option(self.range) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def responseCacheControlAsScala: Option[String] = Option(self.responseCacheControl) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def responseContentDispositionAsScala: Option[String] = Option(self.responseContentDisposition) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def responseContentEncodingAsScala: Option[String] = Option(self.responseContentEncoding) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def responseContentLanguageAsScala: Option[String] = Option(self.responseContentLanguage) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def responseContentTypeAsScala: Option[String] = Option(self.responseContentType) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def responseExpiresAsScala: Option[java.time.Instant] = Option(self.responseExpires) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def versionIdAsScala: Option[String] = Option(self.versionId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sseCustomerKeyAsScala: Option[String] = Option(self.sseCustomerKey) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def partNumberAsScala: Option[Int] = Option(self.partNumber) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetObjectRequestOps {

implicit def toGetObjectRequestBuilderOps(v: GetObjectRequest.Builder): GetObjectRequestBuilderOps = new GetObjectRequestBuilderOps(v)

implicit def toGetObjectRequestOps(v: GetObjectRequest): GetObjectRequestOps = new GetObjectRequestOps(v)

}


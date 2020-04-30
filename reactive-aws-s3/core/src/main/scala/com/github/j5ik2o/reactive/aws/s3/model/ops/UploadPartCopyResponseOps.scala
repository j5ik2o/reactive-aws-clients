// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class UploadPartCopyResponseBuilderOps(val self: UploadPartCopyResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def copySourceVersionIdAsScala(value: Option[String]): UploadPartCopyResponse.Builder = {
            value.fold(self){ v => self.copySourceVersionId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def copyPartResultAsScala(value: Option[CopyPartResult]): UploadPartCopyResponse.Builder = {
            value.fold(self){ v => self.copyPartResult(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def serverSideEncryptionAsScala(value: Option[ServerSideEncryption]): UploadPartCopyResponse.Builder = {
            value.fold(self){ v => self.serverSideEncryption(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sseCustomerAlgorithmAsScala(value: Option[String]): UploadPartCopyResponse.Builder = {
            value.fold(self){ v => self.sseCustomerAlgorithm(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sseCustomerKeyMD5AsScala(value: Option[String]): UploadPartCopyResponse.Builder = {
            value.fold(self){ v => self.sseCustomerKeyMD5(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ssekmsKeyIdAsScala(value: Option[String]): UploadPartCopyResponse.Builder = {
            value.fold(self){ v => self.ssekmsKeyId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def requestChargedAsScala(value: Option[RequestCharged]): UploadPartCopyResponse.Builder = {
            value.fold(self){ v => self.requestCharged(v) }
            } 


}

final class UploadPartCopyResponseOps(val self: UploadPartCopyResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def copySourceVersionIdAsScala: Option[String] = Option(self.copySourceVersionId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def copyPartResultAsScala: Option[CopyPartResult] = Option(self.copyPartResult) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def serverSideEncryptionAsScala: Option[ServerSideEncryption] = Option(self.serverSideEncryption) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ssekmsKeyIdAsScala: Option[String] = Option(self.ssekmsKeyId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUploadPartCopyResponseOps {

implicit def toUploadPartCopyResponseBuilderOps(v: UploadPartCopyResponse.Builder): UploadPartCopyResponseBuilderOps = new UploadPartCopyResponseBuilderOps(v)

implicit def toUploadPartCopyResponseOps(v: UploadPartCopyResponse): UploadPartCopyResponseOps = new UploadPartCopyResponseOps(v)

}


// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class MultipartUploadBuilderOps(val self: MultipartUpload.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def uploadIdAsScala(value: Option[String]): MultipartUpload.Builder = {
            value.fold(self){ v => self.uploadId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def keyAsScala(value: Option[String]): MultipartUpload.Builder = {
            value.fold(self){ v => self.key(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def initiatedAsScala(value: Option[java.time.Instant]): MultipartUpload.Builder = {
            value.fold(self){ v => self.initiated(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def storageClassAsScala(value: Option[StorageClass]): MultipartUpload.Builder = {
            value.fold(self){ v => self.storageClass(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ownerAsScala(value: Option[Owner]): MultipartUpload.Builder = {
            value.fold(self){ v => self.owner(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def initiatorAsScala(value: Option[Initiator]): MultipartUpload.Builder = {
            value.fold(self){ v => self.initiator(v) }
            } 


}

final class MultipartUploadOps(val self: MultipartUpload) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def uploadIdAsScala: Option[String] = Option(self.uploadId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def keyAsScala: Option[String] = Option(self.key) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def initiatedAsScala: Option[java.time.Instant] = Option(self.initiated) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def storageClassAsScala: Option[StorageClass] = Option(self.storageClass) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ownerAsScala: Option[Owner] = Option(self.owner) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def initiatorAsScala: Option[Initiator] = Option(self.initiator) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMultipartUploadOps {

implicit def toMultipartUploadBuilderOps(v: MultipartUpload.Builder): MultipartUploadBuilderOps = new MultipartUploadBuilderOps(v)

implicit def toMultipartUploadOps(v: MultipartUpload): MultipartUploadOps = new MultipartUploadOps(v)

}


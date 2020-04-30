// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class RestoreObjectRequestBuilderOps(val self: RestoreObjectRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketAsScala(value: Option[String]): RestoreObjectRequest.Builder = {
            value.fold(self){ v => self.bucket(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def keyAsScala(value: Option[String]): RestoreObjectRequest.Builder = {
            value.fold(self){ v => self.key(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def versionIdAsScala(value: Option[String]): RestoreObjectRequest.Builder = {
            value.fold(self){ v => self.versionId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def restoreRequestAsScala(value: Option[RestoreRequest]): RestoreObjectRequest.Builder = {
            value.fold(self){ v => self.restoreRequest(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def requestPayerAsScala(value: Option[RequestPayer]): RestoreObjectRequest.Builder = {
            value.fold(self){ v => self.requestPayer(v) }
            } 


}

final class RestoreObjectRequestOps(val self: RestoreObjectRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketAsScala: Option[String] = Option(self.bucket) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def keyAsScala: Option[String] = Option(self.key) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def versionIdAsScala: Option[String] = Option(self.versionId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def restoreRequestAsScala: Option[RestoreRequest] = Option(self.restoreRequest) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRestoreObjectRequestOps {

implicit def toRestoreObjectRequestBuilderOps(v: RestoreObjectRequest.Builder): RestoreObjectRequestBuilderOps = new RestoreObjectRequestBuilderOps(v)

implicit def toRestoreObjectRequestOps(v: RestoreObjectRequest): RestoreObjectRequestOps = new RestoreObjectRequestOps(v)

}


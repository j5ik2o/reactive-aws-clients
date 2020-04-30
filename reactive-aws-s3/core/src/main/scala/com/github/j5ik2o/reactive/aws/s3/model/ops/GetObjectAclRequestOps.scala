// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetObjectAclRequestBuilderOps(val self: GetObjectAclRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketAsScala(value: Option[String]): GetObjectAclRequest.Builder = {
            value.fold(self){ v => self.bucket(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def keyAsScala(value: Option[String]): GetObjectAclRequest.Builder = {
            value.fold(self){ v => self.key(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def versionIdAsScala(value: Option[String]): GetObjectAclRequest.Builder = {
            value.fold(self){ v => self.versionId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def requestPayerAsScala(value: Option[RequestPayer]): GetObjectAclRequest.Builder = {
            value.fold(self){ v => self.requestPayer(v) }
            } 


}

final class GetObjectAclRequestOps(val self: GetObjectAclRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketAsScala: Option[String] = Option(self.bucket) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def keyAsScala: Option[String] = Option(self.key) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def versionIdAsScala: Option[String] = Option(self.versionId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetObjectAclRequestOps {

implicit def toGetObjectAclRequestBuilderOps(v: GetObjectAclRequest.Builder): GetObjectAclRequestBuilderOps = new GetObjectAclRequestBuilderOps(v)

implicit def toGetObjectAclRequestOps(v: GetObjectAclRequest): GetObjectAclRequestOps = new GetObjectAclRequestOps(v)

}


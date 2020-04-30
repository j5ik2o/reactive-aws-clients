// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeletePublicAccessBlockRequestBuilderOps(val self: DeletePublicAccessBlockRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketAsScala(value: Option[String]): DeletePublicAccessBlockRequest.Builder = {
            value.fold(self){ v => self.bucket(v) }
            } 


}

final class DeletePublicAccessBlockRequestOps(val self: DeletePublicAccessBlockRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketAsScala: Option[String] = Option(self.bucket) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeletePublicAccessBlockRequestOps {

implicit def toDeletePublicAccessBlockRequestBuilderOps(v: DeletePublicAccessBlockRequest.Builder): DeletePublicAccessBlockRequestBuilderOps = new DeletePublicAccessBlockRequestBuilderOps(v)

implicit def toDeletePublicAccessBlockRequestOps(v: DeletePublicAccessBlockRequest): DeletePublicAccessBlockRequestOps = new DeletePublicAccessBlockRequestOps(v)

}


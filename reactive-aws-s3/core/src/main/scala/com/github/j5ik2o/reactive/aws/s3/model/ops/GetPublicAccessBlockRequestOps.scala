// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetPublicAccessBlockRequestBuilderOps(val self: GetPublicAccessBlockRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): GetPublicAccessBlockRequest.Builder = {
    value.fold(self) { v => self.bucket(v) }
  }

}

final class GetPublicAccessBlockRequestOps(val self: GetPublicAccessBlockRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetPublicAccessBlockRequestOps {

  implicit def toGetPublicAccessBlockRequestBuilderOps(
      v: GetPublicAccessBlockRequest.Builder
  ): GetPublicAccessBlockRequestBuilderOps = new GetPublicAccessBlockRequestBuilderOps(v)

  implicit def toGetPublicAccessBlockRequestOps(v: GetPublicAccessBlockRequest): GetPublicAccessBlockRequestOps =
    new GetPublicAccessBlockRequestOps(v)

}

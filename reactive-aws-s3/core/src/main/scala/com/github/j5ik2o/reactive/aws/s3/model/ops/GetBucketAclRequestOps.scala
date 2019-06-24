// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketAclRequestBuilderOps(val self: GetBucketAclRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): GetBucketAclRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

}

final class GetBucketAclRequestOps(val self: GetBucketAclRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketAclRequestOps {

  implicit def toGetBucketAclRequestBuilderOps(v: GetBucketAclRequest.Builder): GetBucketAclRequestBuilderOps =
    new GetBucketAclRequestBuilderOps(v)

  implicit def toGetBucketAclRequestOps(v: GetBucketAclRequest): GetBucketAclRequestOps = new GetBucketAclRequestOps(v)

}

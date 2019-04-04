// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketAclRequestBuilderOps(val self: GetBucketAclRequest.Builder) extends AnyVal {

  final def withBucketAsScala(value: Option[String]): GetBucketAclRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

}

final class GetBucketAclRequestOps(val self: GetBucketAclRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketAclRequestOps {

  implicit def toGetBucketAclRequestBuilderOps(v: GetBucketAclRequest.Builder): GetBucketAclRequestBuilderOps =
    new GetBucketAclRequestBuilderOps(v)

  implicit def toGetBucketAclRequestOps(v: GetBucketAclRequest): GetBucketAclRequestOps = new GetBucketAclRequestOps(v)

}

// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketReplicationRequestBuilderOps(val self: GetBucketReplicationRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): GetBucketReplicationRequest.Builder = {
    value.fold(self) { v => self.bucket(v) }
  }

}

final class GetBucketReplicationRequestOps(val self: GetBucketReplicationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketReplicationRequestOps {

  implicit def toGetBucketReplicationRequestBuilderOps(
      v: GetBucketReplicationRequest.Builder
  ): GetBucketReplicationRequestBuilderOps = new GetBucketReplicationRequestBuilderOps(v)

  implicit def toGetBucketReplicationRequestOps(v: GetBucketReplicationRequest): GetBucketReplicationRequestOps =
    new GetBucketReplicationRequestOps(v)

}

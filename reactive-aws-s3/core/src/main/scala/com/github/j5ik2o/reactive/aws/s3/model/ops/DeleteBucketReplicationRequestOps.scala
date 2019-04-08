// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteBucketReplicationRequestBuilderOps(val self: DeleteBucketReplicationRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): DeleteBucketReplicationRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

}

final class DeleteBucketReplicationRequestOps(val self: DeleteBucketReplicationRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteBucketReplicationRequestOps {

  implicit def toDeleteBucketReplicationRequestBuilderOps(
      v: DeleteBucketReplicationRequest.Builder
  ): DeleteBucketReplicationRequestBuilderOps = new DeleteBucketReplicationRequestBuilderOps(v)

  implicit def toDeleteBucketReplicationRequestOps(
      v: DeleteBucketReplicationRequest
  ): DeleteBucketReplicationRequestOps = new DeleteBucketReplicationRequestOps(v)

}

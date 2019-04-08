// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketReplicationRequestBuilderOps(val self: PutBucketReplicationRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): PutBucketReplicationRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def contentMD5AsScala(value: Option[String]): PutBucketReplicationRequest.Builder = {
    value.fold(self) { v =>
      self.contentMD5(v)
    }
  }

  final def replicationConfigurationAsScala(
      value: Option[ReplicationConfiguration]
  ): PutBucketReplicationRequest.Builder = {
    value.fold(self) { v =>
      self.replicationConfiguration(v)
    }
  }

}

final class PutBucketReplicationRequestOps(val self: PutBucketReplicationRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def contentMD5AsScala: Option[String] = Option(self.contentMD5)

  final def replicationConfigurationAsScala: Option[ReplicationConfiguration] = Option(self.replicationConfiguration)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketReplicationRequestOps {

  implicit def toPutBucketReplicationRequestBuilderOps(
      v: PutBucketReplicationRequest.Builder
  ): PutBucketReplicationRequestBuilderOps = new PutBucketReplicationRequestBuilderOps(v)

  implicit def toPutBucketReplicationRequestOps(v: PutBucketReplicationRequest): PutBucketReplicationRequestOps =
    new PutBucketReplicationRequestOps(v)

}

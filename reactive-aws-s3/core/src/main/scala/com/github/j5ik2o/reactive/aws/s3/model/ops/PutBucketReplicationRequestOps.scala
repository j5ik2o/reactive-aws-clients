// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketReplicationRequestBuilderOps(val self: PutBucketReplicationRequest.Builder) extends AnyVal {

  final def withBucketAsScala(value: Option[String]): PutBucketReplicationRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def withContentMD5AsScala(value: Option[String]): PutBucketReplicationRequest.Builder = {
    value.fold(self) { v =>
      self.contentMD5(v)
    }
  } // String

  final def withReplicationConfigurationAsScala(
      value: Option[ReplicationConfiguration]
  ): PutBucketReplicationRequest.Builder = {
    value.fold(self) { v =>
      self.replicationConfiguration(v)
    }
  } // ReplicationConfiguration

}

final class PutBucketReplicationRequestOps(val self: PutBucketReplicationRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def contentMD5AsScala: Option[String] = Option(self.contentMD5) // String

  final def replicationConfigurationAsScala: Option[ReplicationConfiguration] =
    Option(self.replicationConfiguration) // ReplicationConfiguration

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketReplicationRequestOps {

  implicit def toPutBucketReplicationRequestBuilderOps(
      v: PutBucketReplicationRequest.Builder
  ): PutBucketReplicationRequestBuilderOps = new PutBucketReplicationRequestBuilderOps(v)

  implicit def toPutBucketReplicationRequestOps(v: PutBucketReplicationRequest): PutBucketReplicationRequestOps =
    new PutBucketReplicationRequestOps(v)

}

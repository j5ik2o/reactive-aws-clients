// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketReplicationResponseBuilderOps(val self: GetBucketReplicationResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replicationConfigurationAsScala(
      value: Option[ReplicationConfiguration]
  ): GetBucketReplicationResponse.Builder = {
    value.fold(self) { v =>
      self.replicationConfiguration(v)
    }
  }

}

final class GetBucketReplicationResponseOps(val self: GetBucketReplicationResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replicationConfigurationAsScala: Option[ReplicationConfiguration] = Option(self.replicationConfiguration)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketReplicationResponseOps {

  implicit def toGetBucketReplicationResponseBuilderOps(
      v: GetBucketReplicationResponse.Builder
  ): GetBucketReplicationResponseBuilderOps = new GetBucketReplicationResponseBuilderOps(v)

  implicit def toGetBucketReplicationResponseOps(v: GetBucketReplicationResponse): GetBucketReplicationResponseOps =
    new GetBucketReplicationResponseOps(v)

}

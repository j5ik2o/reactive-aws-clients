// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ReplicaGlobalSecondaryIndexBuilderOps(val self: ReplicaGlobalSecondaryIndex.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala(value: Option[String]): ReplicaGlobalSecondaryIndex.Builder = {
    value.fold(self) { v => self.indexName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedThroughputOverrideAsScala(
      value: Option[ProvisionedThroughputOverride]
  ): ReplicaGlobalSecondaryIndex.Builder = {
    value.fold(self) { v => self.provisionedThroughputOverride(v) }
  }

}

final class ReplicaGlobalSecondaryIndexOps(val self: ReplicaGlobalSecondaryIndex) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala: Option[String] = Option(self.indexName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedThroughputOverrideAsScala: Option[ProvisionedThroughputOverride] =
    Option(self.provisionedThroughputOverride)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplicaGlobalSecondaryIndexOps {

  implicit def toReplicaGlobalSecondaryIndexBuilderOps(
      v: ReplicaGlobalSecondaryIndex.Builder
  ): ReplicaGlobalSecondaryIndexBuilderOps = new ReplicaGlobalSecondaryIndexBuilderOps(v)

  implicit def toReplicaGlobalSecondaryIndexOps(v: ReplicaGlobalSecondaryIndex): ReplicaGlobalSecondaryIndexOps =
    new ReplicaGlobalSecondaryIndexOps(v)

}

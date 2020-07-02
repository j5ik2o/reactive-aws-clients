// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class CreateReplicationGroupMemberActionBuilderOps(val self: CreateReplicationGroupMemberAction.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionNameAsScala(value: Option[String]): CreateReplicationGroupMemberAction.Builder = {
    value.fold(self) { v => self.regionName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsMasterKeyIdAsScala(value: Option[String]): CreateReplicationGroupMemberAction.Builder = {
    value.fold(self) { v => self.kmsMasterKeyId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedThroughputOverrideAsScala(
      value: Option[ProvisionedThroughputOverride]
  ): CreateReplicationGroupMemberAction.Builder = {
    value.fold(self) { v => self.provisionedThroughputOverride(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalSecondaryIndexesAsScala(
      value: Option[Seq[ReplicaGlobalSecondaryIndex]]
  ): CreateReplicationGroupMemberAction.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.globalSecondaryIndexes(v.asJava)
    }
  }

}

final class CreateReplicationGroupMemberActionOps(val self: CreateReplicationGroupMemberAction) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionNameAsScala: Option[String] = Option(self.regionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsMasterKeyIdAsScala: Option[String] = Option(self.kmsMasterKeyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedThroughputOverrideAsScala: Option[ProvisionedThroughputOverride] =
    Option(self.provisionedThroughputOverride)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalSecondaryIndexesAsScala: Option[Seq[ReplicaGlobalSecondaryIndex]] =
    Option(self.globalSecondaryIndexes).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateReplicationGroupMemberActionOps {

  implicit def toCreateReplicationGroupMemberActionBuilderOps(
      v: CreateReplicationGroupMemberAction.Builder
  ): CreateReplicationGroupMemberActionBuilderOps = new CreateReplicationGroupMemberActionBuilderOps(v)

  implicit def toCreateReplicationGroupMemberActionOps(
      v: CreateReplicationGroupMemberAction
  ): CreateReplicationGroupMemberActionOps = new CreateReplicationGroupMemberActionOps(v)

}

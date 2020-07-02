// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class UpdateTableReplicaAutoScalingRequestBuilderOps(val self: UpdateTableReplicaAutoScalingRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalSecondaryIndexUpdatesAsScala(
      value: Option[Seq[GlobalSecondaryIndexAutoScalingUpdate]]
  ): UpdateTableReplicaAutoScalingRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.globalSecondaryIndexUpdates(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala(value: Option[String]): UpdateTableReplicaAutoScalingRequest.Builder = {
    value.fold(self) { v => self.tableName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedWriteCapacityAutoScalingUpdateAsScala(
      value: Option[AutoScalingSettingsUpdate]
  ): UpdateTableReplicaAutoScalingRequest.Builder = {
    value.fold(self) { v => self.provisionedWriteCapacityAutoScalingUpdate(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replicaUpdatesAsScala(
      value: Option[Seq[ReplicaAutoScalingUpdate]]
  ): UpdateTableReplicaAutoScalingRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.replicaUpdates(v.asJava)
    }
  }

}

final class UpdateTableReplicaAutoScalingRequestOps(val self: UpdateTableReplicaAutoScalingRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalSecondaryIndexUpdatesAsScala: Option[Seq[GlobalSecondaryIndexAutoScalingUpdate]] =
    Option(self.globalSecondaryIndexUpdates).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala: Option[String] = Option(self.tableName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedWriteCapacityAutoScalingUpdateAsScala: Option[AutoScalingSettingsUpdate] =
    Option(self.provisionedWriteCapacityAutoScalingUpdate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replicaUpdatesAsScala: Option[Seq[ReplicaAutoScalingUpdate]] =
    Option(self.replicaUpdates).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateTableReplicaAutoScalingRequestOps {

  implicit def toUpdateTableReplicaAutoScalingRequestBuilderOps(
      v: UpdateTableReplicaAutoScalingRequest.Builder
  ): UpdateTableReplicaAutoScalingRequestBuilderOps = new UpdateTableReplicaAutoScalingRequestBuilderOps(v)

  implicit def toUpdateTableReplicaAutoScalingRequestOps(
      v: UpdateTableReplicaAutoScalingRequest
  ): UpdateTableReplicaAutoScalingRequestOps = new UpdateTableReplicaAutoScalingRequestOps(v)

}

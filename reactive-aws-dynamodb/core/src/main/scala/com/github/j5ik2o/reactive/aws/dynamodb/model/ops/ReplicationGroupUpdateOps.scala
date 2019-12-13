// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ReplicationGroupUpdateBuilderOps(val self: ReplicationGroupUpdate.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createAsScala(value: Option[CreateReplicationGroupMemberAction]): ReplicationGroupUpdate.Builder = {
    value.fold(self) { v =>
      self.create(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def updateAsScala(value: Option[UpdateReplicationGroupMemberAction]): ReplicationGroupUpdate.Builder = {
    value.fold(self) { v =>
      self.update(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deleteAsScala(value: Option[DeleteReplicationGroupMemberAction]): ReplicationGroupUpdate.Builder = {
    value.fold(self) { v =>
      self.delete(v)
    }
  }

}

final class ReplicationGroupUpdateOps(val self: ReplicationGroupUpdate) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createAsScala: Option[CreateReplicationGroupMemberAction] = Option(self.create)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def updateAsScala: Option[UpdateReplicationGroupMemberAction] = Option(self.update)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deleteAsScala: Option[DeleteReplicationGroupMemberAction] = Option(self.delete)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplicationGroupUpdateOps {

  implicit def toReplicationGroupUpdateBuilderOps(v: ReplicationGroupUpdate.Builder): ReplicationGroupUpdateBuilderOps =
    new ReplicationGroupUpdateBuilderOps(v)

  implicit def toReplicationGroupUpdateOps(v: ReplicationGroupUpdate): ReplicationGroupUpdateOps =
    new ReplicationGroupUpdateOps(v)

}

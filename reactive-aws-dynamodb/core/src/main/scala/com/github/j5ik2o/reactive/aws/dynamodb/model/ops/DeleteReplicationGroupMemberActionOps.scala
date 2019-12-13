// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DeleteReplicationGroupMemberActionBuilderOps(val self: DeleteReplicationGroupMemberAction.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionNameAsScala(value: Option[String]): DeleteReplicationGroupMemberAction.Builder = {
    value.fold(self) { v =>
      self.regionName(v)
    }
  }

}

final class DeleteReplicationGroupMemberActionOps(val self: DeleteReplicationGroupMemberAction) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionNameAsScala: Option[String] = Option(self.regionName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteReplicationGroupMemberActionOps {

  implicit def toDeleteReplicationGroupMemberActionBuilderOps(
      v: DeleteReplicationGroupMemberAction.Builder
  ): DeleteReplicationGroupMemberActionBuilderOps = new DeleteReplicationGroupMemberActionBuilderOps(v)

  implicit def toDeleteReplicationGroupMemberActionOps(
      v: DeleteReplicationGroupMemberAction
  ): DeleteReplicationGroupMemberActionOps = new DeleteReplicationGroupMemberActionOps(v)

}

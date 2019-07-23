// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DeleteReplicaActionBuilderOps(val self: DeleteReplicaAction.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionNameAsScala(value: Option[String]): DeleteReplicaAction.Builder = {
    value.fold(self) { v =>
      self.regionName(v)
    }
  }

}

final class DeleteReplicaActionOps(val self: DeleteReplicaAction) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionNameAsScala: Option[String] = Option(self.regionName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteReplicaActionOps {

  implicit def toDeleteReplicaActionBuilderOps(v: DeleteReplicaAction.Builder): DeleteReplicaActionBuilderOps =
    new DeleteReplicaActionBuilderOps(v)

  implicit def toDeleteReplicaActionOps(v: DeleteReplicaAction): DeleteReplicaActionOps = new DeleteReplicaActionOps(v)

}

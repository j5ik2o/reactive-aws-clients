// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class CreateReplicaActionBuilderOps(val self: CreateReplicaAction.Builder) extends AnyVal {

  final def regionNameAsScala(value: Option[String]): CreateReplicaAction.Builder = {
    value.fold(self) { v =>
      self.regionName(v)
    }
  }

}

final class CreateReplicaActionOps(val self: CreateReplicaAction) extends AnyVal {

  final def regionNameAsScala: Option[String] = Option(self.regionName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateReplicaActionOps {

  implicit def toCreateReplicaActionBuilderOps(v: CreateReplicaAction.Builder): CreateReplicaActionBuilderOps =
    new CreateReplicaActionBuilderOps(v)

  implicit def toCreateReplicaActionOps(v: CreateReplicaAction): CreateReplicaActionOps = new CreateReplicaActionOps(v)

}

package com.github.j5ik2o.reactive.dynamodb.model

final case class ReplicaUpdate(create: Option[CreateReplicaAction] = None, delete: Option[DeleteReplicaAction] = None) {
  def withCreate(value: Option[CreateReplicaAction]): ReplicaUpdate = copy(create = value)
  def withDelete(value: Option[DeleteReplicaAction]): ReplicaUpdate = copy(delete = value)
}

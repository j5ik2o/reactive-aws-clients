package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class UpdateGlobalTableRequest(globalTableName: Option[String] = None,
                                          replicaUpdates: Option[Seq[ReplicaUpdate]] = None) {
  def withGlobalTableName(value: Option[String]): UpdateGlobalTableRequest            = copy(globalTableName = value)
  def withReplicaUpdates(value: Option[Seq[ReplicaUpdate]]): UpdateGlobalTableRequest = copy(replicaUpdates = value)

}

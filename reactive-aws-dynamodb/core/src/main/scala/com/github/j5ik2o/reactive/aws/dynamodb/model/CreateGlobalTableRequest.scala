package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class CreateGlobalTableRequest(
    globalTableName: Option[String] = None,
    replicationGroup: Option[Seq[Replica]] = None
) {
  def withGlobalTableName(value: Option[String]): CreateGlobalTableRequest =
    copy(globalTableName = value)
  def withReplicationGroup(value: Option[Seq[Replica]]): CreateGlobalTableRequest =
    copy(replicationGroup = value)
}

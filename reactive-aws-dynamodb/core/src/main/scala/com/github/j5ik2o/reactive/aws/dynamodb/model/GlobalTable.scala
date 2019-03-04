package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class GlobalTable(globalTableName: Option[String] = None, replicationGroup: Option[Seq[Replica]] = None) {
  def withGlobalTableName(value: Option[String]): GlobalTable        = copy(globalTableName = value)
  def withReplicationGroup(value: Option[Seq[Replica]]): GlobalTable = copy(replicationGroup = value)
}

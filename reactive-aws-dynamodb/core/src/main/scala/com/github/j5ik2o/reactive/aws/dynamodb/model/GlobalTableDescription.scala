package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class GlobalTableDescription(replicationGroup: Option[Seq[ReplicaDescription]] = None,
                                        globalTableArn: Option[String] = None,
                                        creationDateTime: Option[java.util.Date] = None,
                                        globalTableStatus: Option[GlobalTableStatus] = None,
                                        globalTableName: Option[String] = None) {
  def withReplicationGroup(value: Option[Seq[ReplicaDescription]]): GlobalTableDescription =
    copy(replicationGroup = value)
  def withGlobalTableArn(value: Option[String]): GlobalTableDescription               = copy(globalTableArn = value)
  def withCreationDateTime(value: Option[java.util.Date]): GlobalTableDescription     = copy(creationDateTime = value)
  def withGlobalTableStatus(value: Option[GlobalTableStatus]): GlobalTableDescription = copy(globalTableStatus = value)
  def withGlobalTableName(value: Option[String]): GlobalTableDescription              = copy(globalTableName = value)
}

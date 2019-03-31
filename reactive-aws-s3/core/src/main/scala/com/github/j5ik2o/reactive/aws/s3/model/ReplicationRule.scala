package com.github.j5ik2o.reactive.aws.s3.model

final case class ReplicationRule(
    id: Option[String] = None,
    priority: Option[Int] = None,
    prefix: Option[String] = None,
    filter: Option[ReplicationRuleFilter] = None,
    status: Option[ReplicationRuleStatus] = None,
    sourceSelectionCriteria: Option[SourceSelectionCriteria] = None,
    destination: Option[Destination] = None,
    deleteMarkerReplication: Option[DeleteMarkerReplication] = None
) {
  def withId(value: Option[String]): ReplicationRule =
    copy(id = value)
  def withPriority(value: Option[Int]): ReplicationRule =
    copy(priority = value)
  def withPrefix(value: Option[String]): ReplicationRule =
    copy(prefix = value)
  def withFilter(value: Option[ReplicationRuleFilter]): ReplicationRule =
    copy(filter = value)
  def withStatus(value: Option[ReplicationRuleStatus]): ReplicationRule =
    copy(status = value)
  def withSourceSelectionCriteria(value: Option[SourceSelectionCriteria]): ReplicationRule =
    copy(sourceSelectionCriteria = value)
  def withDestination(value: Option[Destination]): ReplicationRule =
    copy(destination = value)
  def withDeleteMarkerReplication(value: Option[DeleteMarkerReplication]): ReplicationRule =
    copy(deleteMarkerReplication = value)
}

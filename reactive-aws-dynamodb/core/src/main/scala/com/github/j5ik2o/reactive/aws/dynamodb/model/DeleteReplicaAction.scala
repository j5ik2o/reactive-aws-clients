package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class DeleteReplicaAction(
    regionName: Option[String] = None
) {
  def withRegionName(value: Option[String]): DeleteReplicaAction =
    copy(regionName = value)
}

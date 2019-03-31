package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class CreateReplicaAction(
    regionName: Option[String] = None
) {
  def withRegionName(value: Option[String]): CreateReplicaAction =
    copy(regionName = value)
}

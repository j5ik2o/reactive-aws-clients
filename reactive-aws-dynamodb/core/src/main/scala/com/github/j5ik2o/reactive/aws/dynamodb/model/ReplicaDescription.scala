package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class ReplicaDescription(regionName: Option[String] = None) {
  def withRegionName(value: Option[String]): ReplicaDescription = copy(regionName = value)
}

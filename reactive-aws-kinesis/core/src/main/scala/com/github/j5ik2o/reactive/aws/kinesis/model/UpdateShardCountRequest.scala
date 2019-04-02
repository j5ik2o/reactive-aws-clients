package com.github.j5ik2o.reactive.aws.kinesis.model

final case class UpdateShardCountRequest(
    streamName: Option[String] = None, // String
    targetShardCount: Option[Int] = None, // Int
    scalingType: Option[ScalingType] = None // String
) {
  def withStreamName(value: Option[String]): UpdateShardCountRequest =
    copy(streamName = value)
  def withTargetShardCount(value: Option[Int]): UpdateShardCountRequest =
    copy(targetShardCount = value)
  def withScalingType(value: Option[ScalingType]): UpdateShardCountRequest =
    copy(scalingType = value)
}

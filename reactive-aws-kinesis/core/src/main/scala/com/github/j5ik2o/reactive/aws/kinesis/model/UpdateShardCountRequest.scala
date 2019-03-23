package com.github.j5ik2o.reactive.aws.kinesis.model

final case class UpdateShardCountRequest(
    streamName: Option[String] = None,
    targetShardCount: Option[Int] = None,
    scalingType: Option[ScalingType] = None
) {
  def withStreamName(value: Option[String]): UpdateShardCountRequest =
    copy(streamName = value)
  def withTargetShardCount(value: Option[Int]): UpdateShardCountRequest =
    copy(targetShardCount = value)
  def withScalingType(value: Option[ScalingType]): UpdateShardCountRequest =
    copy(scalingType = value)
}

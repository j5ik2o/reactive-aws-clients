package com.github.j5ik2o.reactive.aws.kinesis.model

final case class DisableEnhancedMonitoringRequest(
    streamName: Option[String] = None,
    shardLevelMetrics: Option[Seq[MetricsName]] = None
) {
  def withStreamName(value: Option[String]): DisableEnhancedMonitoringRequest =
    copy(streamName = value)
  def withShardLevelMetrics(value: Option[Seq[MetricsName]]): DisableEnhancedMonitoringRequest =
    copy(shardLevelMetrics = value)
}

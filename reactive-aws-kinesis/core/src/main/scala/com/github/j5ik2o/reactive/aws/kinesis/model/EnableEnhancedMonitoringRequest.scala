package com.github.j5ik2o.reactive.aws.kinesis.model

final case class EnableEnhancedMonitoringRequest(
    streamName: Option[String] = None, // String
    shardLevelMetrics: Option[Seq[MetricsName]] = None // Seq[String]
) {
  def withStreamName(value: Option[String]): EnableEnhancedMonitoringRequest =
    copy(streamName = value)
  def withShardLevelMetrics(value: Option[Seq[MetricsName]]): EnableEnhancedMonitoringRequest =
    copy(shardLevelMetrics = value)
}

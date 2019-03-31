package com.github.j5ik2o.reactive.aws.kinesis.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class EnableEnhancedMonitoringResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    streamName: Option[String] = None,
    currentShardLevelMetrics: Option[Seq[MetricsName]] = None,
    desiredShardLevelMetrics: Option[Seq[MetricsName]] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = EnableEnhancedMonitoringResponse
  override def withStatusCode(value: Option[Int]): EnableEnhancedMonitoringResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): EnableEnhancedMonitoringResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): EnableEnhancedMonitoringResponse =
    copy(httpHeaders = value)
  def withStreamName(value: Option[String]): EnableEnhancedMonitoringResponse =
    copy(streamName = value)
  def withCurrentShardLevelMetrics(value: Option[Seq[MetricsName]]): EnableEnhancedMonitoringResponse =
    copy(currentShardLevelMetrics = value)
  def withDesiredShardLevelMetrics(value: Option[Seq[MetricsName]]): EnableEnhancedMonitoringResponse =
    copy(desiredShardLevelMetrics = value)
}

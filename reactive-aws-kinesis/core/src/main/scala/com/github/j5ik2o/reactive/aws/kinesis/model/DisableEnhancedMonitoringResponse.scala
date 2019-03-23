package com.github.j5ik2o.reactive.aws.kinesis.model

final case class DisableEnhancedMonitoringResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    streamName: Option[String] = None,
    currentShardLevelMetrics: Option[Seq[MetricsName]] = None,
    desiredShardLevelMetrics: Option[Seq[MetricsName]] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = DisableEnhancedMonitoringResponse
  override def withStatusCode(value: Option[Int]): DisableEnhancedMonitoringResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): DisableEnhancedMonitoringResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): DisableEnhancedMonitoringResponse =
    copy(httpHeaders = value)
  def withStreamName(value: Option[String]): DisableEnhancedMonitoringResponse =
    copy(streamName = value)
  def withCurrentShardLevelMetrics(value: Option[Seq[MetricsName]]): DisableEnhancedMonitoringResponse =
    copy(currentShardLevelMetrics = value)
  def withDesiredShardLevelMetrics(value: Option[Seq[MetricsName]]): DisableEnhancedMonitoringResponse =
    copy(desiredShardLevelMetrics = value)
}

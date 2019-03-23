package com.github.j5ik2o.reactive.aws.kinesis.model

final case class UpdateShardCountResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    streamName: Option[String] = None,
    currentShardCount: Option[Int] = None,
    targetShardCount: Option[Int] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = UpdateShardCountResponse
  override def withStatusCode(value: Option[Int]): UpdateShardCountResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): UpdateShardCountResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): UpdateShardCountResponse =
    copy(httpHeaders = value)
  def withStreamName(value: Option[String]): UpdateShardCountResponse =
    copy(streamName = value)
  def withCurrentShardCount(value: Option[Int]): UpdateShardCountResponse =
    copy(currentShardCount = value)
  def withTargetShardCount(value: Option[Int]): UpdateShardCountResponse =
    copy(targetShardCount = value)
}

package com.github.j5ik2o.reactive.aws.kinesis.model

final case class GetShardIteratorResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    shardIterator: Option[String] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = GetShardIteratorResponse
  override def withStatusCode(value: Option[Int]): GetShardIteratorResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): GetShardIteratorResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): GetShardIteratorResponse =
    copy(httpHeaders = value)
  def withShardIterator(value: Option[String]): GetShardIteratorResponse =
    copy(shardIterator = value)
}

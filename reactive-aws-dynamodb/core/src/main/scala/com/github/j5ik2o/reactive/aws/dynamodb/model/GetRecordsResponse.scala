package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class GetRecordsResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    records: Option[Seq[Record]] = None,
    nextShardIterator: Option[String] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = GetRecordsResponse
  override def withStatusCode(value: Option[Int]): GetRecordsResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): GetRecordsResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): GetRecordsResponse =
    copy(httpHeaders = value)
  def withRecords(value: Option[Seq[Record]]): GetRecordsResponse =
    copy(records = value)
  def withNextShardIterator(value: Option[String]): GetRecordsResponse =
    copy(nextShardIterator = value)
}

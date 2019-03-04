package com.github.j5ik2o.reactive.dynamodb.model

final case class DescribeLimitsResponse(override val statusCode: Option[Int] = None,
                                        override val statusText: Option[String] = None,
                                        override val httpHeaders: Option[Map[String, Seq[String]]] = None,
                                        accountMaxReadCapacityUnits: Option[Long] = None,
                                        accountMaxWriteCapacityUnits: Option[Long] = None,
                                        tableMaxReadCapacityUnits: Option[Long] = None,
                                        tableMaxWriteCapacityUnits: Option[Long] = None)
    extends AbstractResponse(statusCode, statusText, httpHeaders) {

  override type ThisType = DescribeLimitsResponse
  override def withStatusCode(value: Option[Int]): DescribeLimitsResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): DescribeLimitsResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): DescribeLimitsResponse =
    copy(httpHeaders = value)
  def withAccountMaxReadCapacityUnits(value: Option[Long]): DescribeLimitsResponse =
    copy(accountMaxReadCapacityUnits = value)
  def withAccountMaxWriteCapacityUnits(value: Option[Long]): DescribeLimitsResponse =
    copy(accountMaxWriteCapacityUnits = value)
  def withTableMaxReadCapacityUnits(value: Option[Long]): DescribeLimitsResponse =
    copy(tableMaxReadCapacityUnits = value)
  def withTableMaxWriteCapacityUnits(value: Option[Long]): DescribeLimitsResponse =
    copy(tableMaxWriteCapacityUnits = value)

}

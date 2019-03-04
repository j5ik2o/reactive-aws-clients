package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class DescribeGlobalTableSettingsResponse(override val statusCode: Option[Int] = None,
                                                     override val statusText: Option[String] = None,
                                                     override val httpHeaders: Option[Map[String, Seq[String]]] = None,
                                                     globalTableName: Option[String] = None)
    extends AbstractResponse(statusCode, statusText, httpHeaders) {

  override type ThisType = DescribeGlobalTableSettingsResponse
  override def withStatusCode(value: Option[Int]): DescribeGlobalTableSettingsResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): DescribeGlobalTableSettingsResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): DescribeGlobalTableSettingsResponse =
    copy(httpHeaders = value)
  def withGlobalTableName(value: Option[String]): DescribeGlobalTableSettingsResponse = copy(globalTableName = value)

}

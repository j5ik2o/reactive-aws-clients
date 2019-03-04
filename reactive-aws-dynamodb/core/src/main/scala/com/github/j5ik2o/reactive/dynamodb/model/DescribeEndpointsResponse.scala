package com.github.j5ik2o.reactive.dynamodb.model

final case class DescribeEndpointsResponse(override val statusCode: Option[Int] = None,
                                           override val statusText: Option[String] = None,
                                           override val httpHeaders: Option[Map[String, Seq[String]]] = None,
                                           endpoints: Option[Seq[Endpoint]] = None)
    extends AbstractResponse(statusCode, statusText, httpHeaders) {

  override type ThisType = DescribeEndpointsResponse
  override def withStatusCode(value: Option[Int]): DescribeEndpointsResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): DescribeEndpointsResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): DescribeEndpointsResponse =
    copy(httpHeaders = value)
  def withEndpoints(value: Option[Seq[Endpoint]]): DescribeEndpointsResponse = copy(endpoints = value)

}

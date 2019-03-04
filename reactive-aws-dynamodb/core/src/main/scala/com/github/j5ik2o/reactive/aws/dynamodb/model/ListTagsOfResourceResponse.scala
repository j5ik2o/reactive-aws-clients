package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class ListTagsOfResourceResponse(override val statusCode: Option[Int] = None,
                                            override val statusText: Option[String] = None,
                                            override val httpHeaders: Option[Map[String, Seq[String]]] = None,
                                            tags: Option[Seq[Tag]] = None,
                                            nextToken: Option[String] = None)
    extends AbstractResponse(statusCode, statusText, httpHeaders) {

  override type ThisType = ListTagsOfResourceResponse
  override def withStatusCode(value: Option[Int]): ListTagsOfResourceResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): ListTagsOfResourceResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): ListTagsOfResourceResponse =
    copy(httpHeaders = value)
  def withTags(value: Option[Seq[Tag]]): ListTagsOfResourceResponse    = copy(tags = value)
  def withNextToken(value: Option[String]): ListTagsOfResourceResponse = copy(nextToken = value)

}

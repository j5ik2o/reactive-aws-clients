package com.github.j5ik2o.reactive.aws.kinesis.model

final case class ListTagsForStreamResponse(override val statusCode: Option[Int] = None,
                                           override val statusText: Option[String] = None,
                                           override val httpHeaders: Option[Map[String, Seq[String]]] = None,
                                           tags: Option[Seq[Tag]] = None,
                                           hasMoreTags: Option[Boolean] = None)
    extends AbstractResponse(statusCode, statusText, httpHeaders) {

  override type ThisType = ListTagsForStreamResponse
  override def withStatusCode(value: Option[Int]): ListTagsForStreamResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): ListTagsForStreamResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): ListTagsForStreamResponse =
    copy(httpHeaders = value)
  def withTags(value: Option[Seq[Tag]]): ListTagsForStreamResponse       = copy(tags = value)
  def withHasMoreTags(value: Option[Boolean]): ListTagsForStreamResponse = copy(hasMoreTags = value)

}

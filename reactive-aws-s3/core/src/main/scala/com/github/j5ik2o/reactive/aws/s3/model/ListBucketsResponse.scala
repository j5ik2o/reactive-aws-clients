package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class ListBucketsResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    buckets: Option[Seq[Bucket]] = None,
    owner: Option[Owner] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = ListBucketsResponse
  override def withStatusCode(value: Option[Int]): ListBucketsResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): ListBucketsResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): ListBucketsResponse =
    copy(httpHeaders = value)
  def withBuckets(value: Option[Seq[Bucket]]): ListBucketsResponse =
    copy(buckets = value)
  def withOwner(value: Option[Owner]): ListBucketsResponse =
    copy(owner = value)
}

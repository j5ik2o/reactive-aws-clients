package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class GetBucketWebsiteResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    redirectAllRequestsTo: Option[RedirectAllRequestsTo] = None,
    indexDocument: Option[IndexDocument] = None,
    errorDocument: Option[ErrorDocument] = None,
    routingRules: Option[Seq[RoutingRule]] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = GetBucketWebsiteResponse
  override def withStatusCode(value: Option[Int]): GetBucketWebsiteResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): GetBucketWebsiteResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): GetBucketWebsiteResponse =
    copy(httpHeaders = value)
  def withRedirectAllRequestsTo(value: Option[RedirectAllRequestsTo]): GetBucketWebsiteResponse =
    copy(redirectAllRequestsTo = value)
  def withIndexDocument(value: Option[IndexDocument]): GetBucketWebsiteResponse =
    copy(indexDocument = value)
  def withErrorDocument(value: Option[ErrorDocument]): GetBucketWebsiteResponse =
    copy(errorDocument = value)
  def withRoutingRules(value: Option[Seq[RoutingRule]]): GetBucketWebsiteResponse =
    copy(routingRules = value)
}

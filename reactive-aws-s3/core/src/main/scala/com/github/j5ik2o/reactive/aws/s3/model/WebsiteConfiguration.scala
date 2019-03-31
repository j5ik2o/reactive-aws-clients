package com.github.j5ik2o.reactive.aws.s3.model

final case class WebsiteConfiguration(
    errorDocument: Option[ErrorDocument] = None,
    indexDocument: Option[IndexDocument] = None,
    redirectAllRequestsTo: Option[RedirectAllRequestsTo] = None,
    routingRules: Option[Seq[RoutingRule]] = None
) {
  def withErrorDocument(value: Option[ErrorDocument]): WebsiteConfiguration =
    copy(errorDocument = value)
  def withIndexDocument(value: Option[IndexDocument]): WebsiteConfiguration =
    copy(indexDocument = value)
  def withRedirectAllRequestsTo(value: Option[RedirectAllRequestsTo]): WebsiteConfiguration =
    copy(redirectAllRequestsTo = value)
  def withRoutingRules(value: Option[Seq[RoutingRule]]): WebsiteConfiguration =
    copy(routingRules = value)
}

package com.github.j5ik2o.reactive.aws.s3.model

final case class RedirectAllRequestsTo(
    hostName: Option[String] = None,
    protocol: Option[Protocol] = None
) {
  def withHostName(value: Option[String]): RedirectAllRequestsTo =
    copy(hostName = value)
  def withProtocol(value: Option[Protocol]): RedirectAllRequestsTo =
    copy(protocol = value)
}

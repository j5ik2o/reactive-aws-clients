package com.github.j5ik2o.reactive.aws.s3.model

final case class Redirect(
    hostName: Option[String] = None,
    httpRedirectCode: Option[String] = None,
    protocol: Option[Protocol] = None,
    replaceKeyPrefixWith: Option[String] = None,
    replaceKeyWith: Option[String] = None
) {
  def withHostName(value: Option[String]): Redirect =
    copy(hostName = value)
  def withHttpRedirectCode(value: Option[String]): Redirect =
    copy(httpRedirectCode = value)
  def withProtocol(value: Option[Protocol]): Redirect =
    copy(protocol = value)
  def withReplaceKeyPrefixWith(value: Option[String]): Redirect =
    copy(replaceKeyPrefixWith = value)
  def withReplaceKeyWith(value: Option[String]): Redirect =
    copy(replaceKeyWith = value)
}

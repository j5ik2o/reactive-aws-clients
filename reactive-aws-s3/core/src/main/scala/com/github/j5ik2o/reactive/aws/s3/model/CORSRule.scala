package com.github.j5ik2o.reactive.aws.s3.model

final case class CORSRule(
    allowedHeaders: Option[Seq[String]] = None,
    allowedMethods: Option[Seq[String]] = None,
    allowedOrigins: Option[Seq[String]] = None,
    exposeHeaders: Option[Seq[String]] = None,
    maxAgeSeconds: Option[Int] = None
) {
  def withAllowedHeaders(value: Option[Seq[String]]): CORSRule =
    copy(allowedHeaders = value)
  def withAllowedMethods(value: Option[Seq[String]]): CORSRule =
    copy(allowedMethods = value)
  def withAllowedOrigins(value: Option[Seq[String]]): CORSRule =
    copy(allowedOrigins = value)
  def withExposeHeaders(value: Option[Seq[String]]): CORSRule =
    copy(exposeHeaders = value)
  def withMaxAgeSeconds(value: Option[Int]): CORSRule =
    copy(maxAgeSeconds = value)
}

package com.github.j5ik2o.reactive.aws.s3.model

final case class Condition(
    httpErrorCodeReturnedEquals: Option[String] = None,
    keyPrefixEquals: Option[String] = None
) {
  def withHttpErrorCodeReturnedEquals(value: Option[String]): Condition =
    copy(httpErrorCodeReturnedEquals = value)
  def withKeyPrefixEquals(value: Option[String]): Condition =
    copy(keyPrefixEquals = value)
}

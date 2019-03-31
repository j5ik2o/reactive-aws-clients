package com.github.j5ik2o.reactive.aws.s3.model

final case class S3Error(
    key: Option[String] = None,
    versionId: Option[String] = None,
    code: Option[String] = None,
    message: Option[String] = None
) {
  def withKey(value: Option[String]): S3Error =
    copy(key = value)
  def withVersionId(value: Option[String]): S3Error =
    copy(versionId = value)
  def withCode(value: Option[String]): S3Error =
    copy(code = value)
  def withMessage(value: Option[String]): S3Error =
    copy(message = value)
}

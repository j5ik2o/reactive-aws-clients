package com.github.j5ik2o.reactive.aws.s3.model

final case class PutObjectLockConfigurationRequest(
    bucket: Option[String] = None,
    objectLockConfiguration: Option[ObjectLockConfiguration] = None,
    requestPayer: Option[RequestPayer] = None,
    token: Option[String] = None,
    contentMD5: Option[String] = None
) {
  def withBucket(value: Option[String]): PutObjectLockConfigurationRequest =
    copy(bucket = value)
  def withObjectLockConfiguration(value: Option[ObjectLockConfiguration]): PutObjectLockConfigurationRequest =
    copy(objectLockConfiguration = value)
  def withRequestPayer(value: Option[RequestPayer]): PutObjectLockConfigurationRequest =
    copy(requestPayer = value)
  def withToken(value: Option[String]): PutObjectLockConfigurationRequest =
    copy(token = value)
  def withContentMD5(value: Option[String]): PutObjectLockConfigurationRequest =
    copy(contentMD5 = value)
}

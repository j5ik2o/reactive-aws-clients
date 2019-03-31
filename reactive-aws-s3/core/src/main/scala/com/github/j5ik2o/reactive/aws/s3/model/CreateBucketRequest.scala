package com.github.j5ik2o.reactive.aws.s3.model

final case class CreateBucketRequest(
    acl: Option[BucketCannedACL] = None,
    bucket: Option[String] = None,
    createBucketConfiguration: Option[CreateBucketConfiguration] = None,
    grantFullControl: Option[String] = None,
    grantRead: Option[String] = None,
    grantReadACP: Option[String] = None,
    grantWrite: Option[String] = None,
    grantWriteACP: Option[String] = None,
    objectLockEnabledForBucket: Option[Boolean] = None
) {
  def withAcl(value: Option[BucketCannedACL]): CreateBucketRequest =
    copy(acl = value)
  def withBucket(value: Option[String]): CreateBucketRequest =
    copy(bucket = value)
  def withCreateBucketConfiguration(value: Option[CreateBucketConfiguration]): CreateBucketRequest =
    copy(createBucketConfiguration = value)
  def withGrantFullControl(value: Option[String]): CreateBucketRequest =
    copy(grantFullControl = value)
  def withGrantRead(value: Option[String]): CreateBucketRequest =
    copy(grantRead = value)
  def withGrantReadACP(value: Option[String]): CreateBucketRequest =
    copy(grantReadACP = value)
  def withGrantWrite(value: Option[String]): CreateBucketRequest =
    copy(grantWrite = value)
  def withGrantWriteACP(value: Option[String]): CreateBucketRequest =
    copy(grantWriteACP = value)
  def withObjectLockEnabledForBucket(value: Option[Boolean]): CreateBucketRequest =
    copy(objectLockEnabledForBucket = value)
}

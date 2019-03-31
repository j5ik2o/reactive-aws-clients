package com.github.j5ik2o.reactive.aws.s3.model

final case class PutBucketAclRequest(
    acl: Option[BucketCannedACL] = None,
    accessControlPolicy: Option[AccessControlPolicy] = None,
    bucket: Option[String] = None,
    contentMD5: Option[String] = None,
    grantFullControl: Option[String] = None,
    grantRead: Option[String] = None,
    grantReadACP: Option[String] = None,
    grantWrite: Option[String] = None,
    grantWriteACP: Option[String] = None
) {
  def withAcl(value: Option[BucketCannedACL]): PutBucketAclRequest =
    copy(acl = value)
  def withAccessControlPolicy(value: Option[AccessControlPolicy]): PutBucketAclRequest =
    copy(accessControlPolicy = value)
  def withBucket(value: Option[String]): PutBucketAclRequest =
    copy(bucket = value)
  def withContentMD5(value: Option[String]): PutBucketAclRequest =
    copy(contentMD5 = value)
  def withGrantFullControl(value: Option[String]): PutBucketAclRequest =
    copy(grantFullControl = value)
  def withGrantRead(value: Option[String]): PutBucketAclRequest =
    copy(grantRead = value)
  def withGrantReadACP(value: Option[String]): PutBucketAclRequest =
    copy(grantReadACP = value)
  def withGrantWrite(value: Option[String]): PutBucketAclRequest =
    copy(grantWrite = value)
  def withGrantWriteACP(value: Option[String]): PutBucketAclRequest =
    copy(grantWriteACP = value)
}

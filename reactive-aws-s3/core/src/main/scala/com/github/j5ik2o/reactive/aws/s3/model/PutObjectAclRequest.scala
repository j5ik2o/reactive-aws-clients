package com.github.j5ik2o.reactive.aws.s3.model

final case class PutObjectAclRequest(
    acl: Option[ObjectCannedACL] = None,
    accessControlPolicy: Option[AccessControlPolicy] = None,
    bucket: Option[String] = None,
    contentMD5: Option[String] = None,
    grantFullControl: Option[String] = None,
    grantRead: Option[String] = None,
    grantReadACP: Option[String] = None,
    grantWrite: Option[String] = None,
    grantWriteACP: Option[String] = None,
    key: Option[String] = None,
    requestPayer: Option[RequestPayer] = None,
    versionId: Option[String] = None
) {
  def withAcl(value: Option[ObjectCannedACL]): PutObjectAclRequest =
    copy(acl = value)
  def withAccessControlPolicy(value: Option[AccessControlPolicy]): PutObjectAclRequest =
    copy(accessControlPolicy = value)
  def withBucket(value: Option[String]): PutObjectAclRequest =
    copy(bucket = value)
  def withContentMD5(value: Option[String]): PutObjectAclRequest =
    copy(contentMD5 = value)
  def withGrantFullControl(value: Option[String]): PutObjectAclRequest =
    copy(grantFullControl = value)
  def withGrantRead(value: Option[String]): PutObjectAclRequest =
    copy(grantRead = value)
  def withGrantReadACP(value: Option[String]): PutObjectAclRequest =
    copy(grantReadACP = value)
  def withGrantWrite(value: Option[String]): PutObjectAclRequest =
    copy(grantWrite = value)
  def withGrantWriteACP(value: Option[String]): PutObjectAclRequest =
    copy(grantWriteACP = value)
  def withKey(value: Option[String]): PutObjectAclRequest =
    copy(key = value)
  def withRequestPayer(value: Option[RequestPayer]): PutObjectAclRequest =
    copy(requestPayer = value)
  def withVersionId(value: Option[String]): PutObjectAclRequest =
    copy(versionId = value)
}

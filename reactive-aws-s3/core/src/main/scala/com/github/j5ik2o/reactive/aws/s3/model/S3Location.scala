package com.github.j5ik2o.reactive.aws.s3.model

final case class S3Location(
    bucketName: Option[String] = None,
    prefix: Option[String] = None,
    encryption: Option[Encryption] = None,
    cannedACL: Option[ObjectCannedACL] = None,
    accessControlList: Option[Seq[Grant]] = None,
    tagging: Option[Tagging] = None,
    userMetadata: Option[Seq[MetadataEntry]] = None,
    storageClass: Option[StorageClass] = None
) {
  def withBucketName(value: Option[String]): S3Location =
    copy(bucketName = value)
  def withPrefix(value: Option[String]): S3Location =
    copy(prefix = value)
  def withEncryption(value: Option[Encryption]): S3Location =
    copy(encryption = value)
  def withCannedACL(value: Option[ObjectCannedACL]): S3Location =
    copy(cannedACL = value)
  def withAccessControlList(value: Option[Seq[Grant]]): S3Location =
    copy(accessControlList = value)
  def withTagging(value: Option[Tagging]): S3Location =
    copy(tagging = value)
  def withUserMetadata(value: Option[Seq[MetadataEntry]]): S3Location =
    copy(userMetadata = value)
  def withStorageClass(value: Option[StorageClass]): S3Location =
    copy(storageClass = value)
}

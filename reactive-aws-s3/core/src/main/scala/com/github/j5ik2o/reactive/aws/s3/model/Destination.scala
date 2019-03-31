package com.github.j5ik2o.reactive.aws.s3.model

final case class Destination(
    bucket: Option[String] = None,
    account: Option[String] = None,
    storageClass: Option[StorageClass] = None,
    accessControlTranslation: Option[AccessControlTranslation] = None,
    encryptionConfiguration: Option[EncryptionConfiguration] = None
) {
  def withBucket(value: Option[String]): Destination =
    copy(bucket = value)
  def withAccount(value: Option[String]): Destination =
    copy(account = value)
  def withStorageClass(value: Option[StorageClass]): Destination =
    copy(storageClass = value)
  def withAccessControlTranslation(value: Option[AccessControlTranslation]): Destination =
    copy(accessControlTranslation = value)
  def withEncryptionConfiguration(value: Option[EncryptionConfiguration]): Destination =
    copy(encryptionConfiguration = value)
}

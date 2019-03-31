package com.github.j5ik2o.reactive.aws.s3.model

final case class MultipartUpload(
    uploadId: Option[String] = None,
    key: Option[String] = None,
    initiated: Option[java.time.Instant] = None,
    storageClass: Option[StorageClass] = None,
    owner: Option[Owner] = None,
    initiator: Option[Initiator] = None
) {
  def withUploadId(value: Option[String]): MultipartUpload =
    copy(uploadId = value)
  def withKey(value: Option[String]): MultipartUpload =
    copy(key = value)
  def withInitiated(value: Option[java.time.Instant]): MultipartUpload =
    copy(initiated = value)
  def withStorageClass(value: Option[StorageClass]): MultipartUpload =
    copy(storageClass = value)
  def withOwner(value: Option[Owner]): MultipartUpload =
    copy(owner = value)
  def withInitiator(value: Option[Initiator]): MultipartUpload =
    copy(initiator = value)
}

package com.github.j5ik2o.reactive.aws.s3.model

final case class ListPartsRequest(
    bucket: Option[String] = None,
    key: Option[String] = None,
    maxParts: Option[Int] = None,
    partNumberMarker: Option[Int] = None,
    uploadId: Option[String] = None,
    requestPayer: Option[RequestPayer] = None
) {
  def withBucket(value: Option[String]): ListPartsRequest =
    copy(bucket = value)
  def withKey(value: Option[String]): ListPartsRequest =
    copy(key = value)
  def withMaxParts(value: Option[Int]): ListPartsRequest =
    copy(maxParts = value)
  def withPartNumberMarker(value: Option[Int]): ListPartsRequest =
    copy(partNumberMarker = value)
  def withUploadId(value: Option[String]): ListPartsRequest =
    copy(uploadId = value)
  def withRequestPayer(value: Option[RequestPayer]): ListPartsRequest =
    copy(requestPayer = value)
}

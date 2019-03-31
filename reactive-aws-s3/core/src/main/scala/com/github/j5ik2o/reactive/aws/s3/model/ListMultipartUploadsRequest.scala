package com.github.j5ik2o.reactive.aws.s3.model

final case class ListMultipartUploadsRequest(
    bucket: Option[String] = None,
    delimiter: Option[String] = None,
    encodingType: Option[EncodingType] = None,
    keyMarker: Option[String] = None,
    maxUploads: Option[Int] = None,
    prefix: Option[String] = None,
    uploadIdMarker: Option[String] = None
) {
  def withBucket(value: Option[String]): ListMultipartUploadsRequest =
    copy(bucket = value)
  def withDelimiter(value: Option[String]): ListMultipartUploadsRequest =
    copy(delimiter = value)
  def withEncodingType(value: Option[EncodingType]): ListMultipartUploadsRequest =
    copy(encodingType = value)
  def withKeyMarker(value: Option[String]): ListMultipartUploadsRequest =
    copy(keyMarker = value)
  def withMaxUploads(value: Option[Int]): ListMultipartUploadsRequest =
    copy(maxUploads = value)
  def withPrefix(value: Option[String]): ListMultipartUploadsRequest =
    copy(prefix = value)
  def withUploadIdMarker(value: Option[String]): ListMultipartUploadsRequest =
    copy(uploadIdMarker = value)
}

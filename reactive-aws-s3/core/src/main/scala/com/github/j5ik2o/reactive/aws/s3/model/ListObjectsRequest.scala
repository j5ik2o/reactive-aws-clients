package com.github.j5ik2o.reactive.aws.s3.model

final case class ListObjectsRequest(
    bucket: Option[String] = None,
    delimiter: Option[String] = None,
    encodingType: Option[EncodingType] = None,
    marker: Option[String] = None,
    maxKeys: Option[Int] = None,
    prefix: Option[String] = None,
    requestPayer: Option[RequestPayer] = None
) {
  def withBucket(value: Option[String]): ListObjectsRequest =
    copy(bucket = value)
  def withDelimiter(value: Option[String]): ListObjectsRequest =
    copy(delimiter = value)
  def withEncodingType(value: Option[EncodingType]): ListObjectsRequest =
    copy(encodingType = value)
  def withMarker(value: Option[String]): ListObjectsRequest =
    copy(marker = value)
  def withMaxKeys(value: Option[Int]): ListObjectsRequest =
    copy(maxKeys = value)
  def withPrefix(value: Option[String]): ListObjectsRequest =
    copy(prefix = value)
  def withRequestPayer(value: Option[RequestPayer]): ListObjectsRequest =
    copy(requestPayer = value)
}

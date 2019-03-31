package com.github.j5ik2o.reactive.aws.s3.model

final case class ListObjectsV2Request(
    bucket: Option[String] = None,
    delimiter: Option[String] = None,
    encodingType: Option[EncodingType] = None,
    maxKeys: Option[Int] = None,
    prefix: Option[String] = None,
    continuationToken: Option[String] = None,
    fetchOwner: Option[Boolean] = None,
    startAfter: Option[String] = None,
    requestPayer: Option[RequestPayer] = None
) {
  def withBucket(value: Option[String]): ListObjectsV2Request =
    copy(bucket = value)
  def withDelimiter(value: Option[String]): ListObjectsV2Request =
    copy(delimiter = value)
  def withEncodingType(value: Option[EncodingType]): ListObjectsV2Request =
    copy(encodingType = value)
  def withMaxKeys(value: Option[Int]): ListObjectsV2Request =
    copy(maxKeys = value)
  def withPrefix(value: Option[String]): ListObjectsV2Request =
    copy(prefix = value)
  def withContinuationToken(value: Option[String]): ListObjectsV2Request =
    copy(continuationToken = value)
  def withFetchOwner(value: Option[Boolean]): ListObjectsV2Request =
    copy(fetchOwner = value)
  def withStartAfter(value: Option[String]): ListObjectsV2Request =
    copy(startAfter = value)
  def withRequestPayer(value: Option[RequestPayer]): ListObjectsV2Request =
    copy(requestPayer = value)
}

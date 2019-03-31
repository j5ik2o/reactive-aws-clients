package com.github.j5ik2o.reactive.aws.s3.model

final case class ListObjectVersionsRequest(
    bucket: Option[String] = None,
    delimiter: Option[String] = None,
    encodingType: Option[EncodingType] = None,
    keyMarker: Option[String] = None,
    maxKeys: Option[Int] = None,
    prefix: Option[String] = None,
    versionIdMarker: Option[String] = None
) {
  def withBucket(value: Option[String]): ListObjectVersionsRequest =
    copy(bucket = value)
  def withDelimiter(value: Option[String]): ListObjectVersionsRequest =
    copy(delimiter = value)
  def withEncodingType(value: Option[EncodingType]): ListObjectVersionsRequest =
    copy(encodingType = value)
  def withKeyMarker(value: Option[String]): ListObjectVersionsRequest =
    copy(keyMarker = value)
  def withMaxKeys(value: Option[Int]): ListObjectVersionsRequest =
    copy(maxKeys = value)
  def withPrefix(value: Option[String]): ListObjectVersionsRequest =
    copy(prefix = value)
  def withVersionIdMarker(value: Option[String]): ListObjectVersionsRequest =
    copy(versionIdMarker = value)
}

package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class ListObjectsV2Response(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    isTruncated: Option[Boolean] = None,
    contents: Option[Seq[S3Object]] = None,
    name: Option[String] = None,
    prefix: Option[String] = None,
    delimiter: Option[String] = None,
    maxKeys: Option[Int] = None,
    commonPrefixes: Option[Seq[CommonPrefix]] = None,
    encodingType: Option[EncodingType] = None,
    keyCount: Option[Int] = None,
    continuationToken: Option[String] = None,
    nextContinuationToken: Option[String] = None,
    startAfter: Option[String] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = ListObjectsV2Response
  override def withStatusCode(value: Option[Int]): ListObjectsV2Response    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): ListObjectsV2Response = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): ListObjectsV2Response =
    copy(httpHeaders = value)
  def withIsTruncated(value: Option[Boolean]): ListObjectsV2Response =
    copy(isTruncated = value)
  def withContents(value: Option[Seq[S3Object]]): ListObjectsV2Response =
    copy(contents = value)
  def withName(value: Option[String]): ListObjectsV2Response =
    copy(name = value)
  def withPrefix(value: Option[String]): ListObjectsV2Response =
    copy(prefix = value)
  def withDelimiter(value: Option[String]): ListObjectsV2Response =
    copy(delimiter = value)
  def withMaxKeys(value: Option[Int]): ListObjectsV2Response =
    copy(maxKeys = value)
  def withCommonPrefixes(value: Option[Seq[CommonPrefix]]): ListObjectsV2Response =
    copy(commonPrefixes = value)
  def withEncodingType(value: Option[EncodingType]): ListObjectsV2Response =
    copy(encodingType = value)
  def withKeyCount(value: Option[Int]): ListObjectsV2Response =
    copy(keyCount = value)
  def withContinuationToken(value: Option[String]): ListObjectsV2Response =
    copy(continuationToken = value)
  def withNextContinuationToken(value: Option[String]): ListObjectsV2Response =
    copy(nextContinuationToken = value)
  def withStartAfter(value: Option[String]): ListObjectsV2Response =
    copy(startAfter = value)
}

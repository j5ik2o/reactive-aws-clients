package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class ListObjectsResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    isTruncated: Option[Boolean] = None,
    marker: Option[String] = None,
    nextMarker: Option[String] = None,
    contents: Option[Seq[S3Object]] = None,
    name: Option[String] = None,
    prefix: Option[String] = None,
    delimiter: Option[String] = None,
    maxKeys: Option[Int] = None,
    commonPrefixes: Option[Seq[CommonPrefix]] = None,
    encodingType: Option[EncodingType] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = ListObjectsResponse
  override def withStatusCode(value: Option[Int]): ListObjectsResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): ListObjectsResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): ListObjectsResponse =
    copy(httpHeaders = value)
  def withIsTruncated(value: Option[Boolean]): ListObjectsResponse =
    copy(isTruncated = value)
  def withMarker(value: Option[String]): ListObjectsResponse =
    copy(marker = value)
  def withNextMarker(value: Option[String]): ListObjectsResponse =
    copy(nextMarker = value)
  def withContents(value: Option[Seq[S3Object]]): ListObjectsResponse =
    copy(contents = value)
  def withName(value: Option[String]): ListObjectsResponse =
    copy(name = value)
  def withPrefix(value: Option[String]): ListObjectsResponse =
    copy(prefix = value)
  def withDelimiter(value: Option[String]): ListObjectsResponse =
    copy(delimiter = value)
  def withMaxKeys(value: Option[Int]): ListObjectsResponse =
    copy(maxKeys = value)
  def withCommonPrefixes(value: Option[Seq[CommonPrefix]]): ListObjectsResponse =
    copy(commonPrefixes = value)
  def withEncodingType(value: Option[EncodingType]): ListObjectsResponse =
    copy(encodingType = value)
}

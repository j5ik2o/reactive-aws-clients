package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class ListObjectVersionsResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    isTruncated: Option[Boolean] = None,
    keyMarker: Option[String] = None,
    versionIdMarker: Option[String] = None,
    nextKeyMarker: Option[String] = None,
    nextVersionIdMarker: Option[String] = None,
    versions: Option[Seq[ObjectVersion]] = None,
    deleteMarkers: Option[Seq[DeleteMarkerEntry]] = None,
    name: Option[String] = None,
    prefix: Option[String] = None,
    delimiter: Option[String] = None,
    maxKeys: Option[Int] = None,
    commonPrefixes: Option[Seq[CommonPrefix]] = None,
    encodingType: Option[EncodingType] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = ListObjectVersionsResponse
  override def withStatusCode(value: Option[Int]): ListObjectVersionsResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): ListObjectVersionsResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): ListObjectVersionsResponse =
    copy(httpHeaders = value)
  def withIsTruncated(value: Option[Boolean]): ListObjectVersionsResponse =
    copy(isTruncated = value)
  def withKeyMarker(value: Option[String]): ListObjectVersionsResponse =
    copy(keyMarker = value)
  def withVersionIdMarker(value: Option[String]): ListObjectVersionsResponse =
    copy(versionIdMarker = value)
  def withNextKeyMarker(value: Option[String]): ListObjectVersionsResponse =
    copy(nextKeyMarker = value)
  def withNextVersionIdMarker(value: Option[String]): ListObjectVersionsResponse =
    copy(nextVersionIdMarker = value)
  def withVersions(value: Option[Seq[ObjectVersion]]): ListObjectVersionsResponse =
    copy(versions = value)
  def withDeleteMarkers(value: Option[Seq[DeleteMarkerEntry]]): ListObjectVersionsResponse =
    copy(deleteMarkers = value)
  def withName(value: Option[String]): ListObjectVersionsResponse =
    copy(name = value)
  def withPrefix(value: Option[String]): ListObjectVersionsResponse =
    copy(prefix = value)
  def withDelimiter(value: Option[String]): ListObjectVersionsResponse =
    copy(delimiter = value)
  def withMaxKeys(value: Option[Int]): ListObjectVersionsResponse =
    copy(maxKeys = value)
  def withCommonPrefixes(value: Option[Seq[CommonPrefix]]): ListObjectVersionsResponse =
    copy(commonPrefixes = value)
  def withEncodingType(value: Option[EncodingType]): ListObjectVersionsResponse =
    copy(encodingType = value)
}

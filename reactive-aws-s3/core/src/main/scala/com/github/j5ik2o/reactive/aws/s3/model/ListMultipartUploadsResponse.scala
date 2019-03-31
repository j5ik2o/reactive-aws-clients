package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class ListMultipartUploadsResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    bucket: Option[String] = None,
    keyMarker: Option[String] = None,
    uploadIdMarker: Option[String] = None,
    nextKeyMarker: Option[String] = None,
    prefix: Option[String] = None,
    delimiter: Option[String] = None,
    nextUploadIdMarker: Option[String] = None,
    maxUploads: Option[Int] = None,
    isTruncated: Option[Boolean] = None,
    uploads: Option[Seq[MultipartUpload]] = None,
    commonPrefixes: Option[Seq[CommonPrefix]] = None,
    encodingType: Option[EncodingType] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = ListMultipartUploadsResponse
  override def withStatusCode(value: Option[Int]): ListMultipartUploadsResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): ListMultipartUploadsResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): ListMultipartUploadsResponse =
    copy(httpHeaders = value)
  def withBucket(value: Option[String]): ListMultipartUploadsResponse =
    copy(bucket = value)
  def withKeyMarker(value: Option[String]): ListMultipartUploadsResponse =
    copy(keyMarker = value)
  def withUploadIdMarker(value: Option[String]): ListMultipartUploadsResponse =
    copy(uploadIdMarker = value)
  def withNextKeyMarker(value: Option[String]): ListMultipartUploadsResponse =
    copy(nextKeyMarker = value)
  def withPrefix(value: Option[String]): ListMultipartUploadsResponse =
    copy(prefix = value)
  def withDelimiter(value: Option[String]): ListMultipartUploadsResponse =
    copy(delimiter = value)
  def withNextUploadIdMarker(value: Option[String]): ListMultipartUploadsResponse =
    copy(nextUploadIdMarker = value)
  def withMaxUploads(value: Option[Int]): ListMultipartUploadsResponse =
    copy(maxUploads = value)
  def withIsTruncated(value: Option[Boolean]): ListMultipartUploadsResponse =
    copy(isTruncated = value)
  def withUploads(value: Option[Seq[MultipartUpload]]): ListMultipartUploadsResponse =
    copy(uploads = value)
  def withCommonPrefixes(value: Option[Seq[CommonPrefix]]): ListMultipartUploadsResponse =
    copy(commonPrefixes = value)
  def withEncodingType(value: Option[EncodingType]): ListMultipartUploadsResponse =
    copy(encodingType = value)
}

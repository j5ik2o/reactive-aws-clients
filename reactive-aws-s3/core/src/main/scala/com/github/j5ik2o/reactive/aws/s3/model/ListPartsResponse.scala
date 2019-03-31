package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class ListPartsResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    abortDate: Option[java.time.Instant] = None,
    abortRuleId: Option[String] = None,
    bucket: Option[String] = None,
    key: Option[String] = None,
    uploadId: Option[String] = None,
    partNumberMarker: Option[Int] = None,
    nextPartNumberMarker: Option[Int] = None,
    maxParts: Option[Int] = None,
    isTruncated: Option[Boolean] = None,
    parts: Option[Seq[Part]] = None,
    initiator: Option[Initiator] = None,
    owner: Option[Owner] = None,
    storageClass: Option[StorageClass] = None,
    requestCharged: Option[RequestCharged] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = ListPartsResponse
  override def withStatusCode(value: Option[Int]): ListPartsResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): ListPartsResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): ListPartsResponse =
    copy(httpHeaders = value)
  def withAbortDate(value: Option[java.time.Instant]): ListPartsResponse =
    copy(abortDate = value)
  def withAbortRuleId(value: Option[String]): ListPartsResponse =
    copy(abortRuleId = value)
  def withBucket(value: Option[String]): ListPartsResponse =
    copy(bucket = value)
  def withKey(value: Option[String]): ListPartsResponse =
    copy(key = value)
  def withUploadId(value: Option[String]): ListPartsResponse =
    copy(uploadId = value)
  def withPartNumberMarker(value: Option[Int]): ListPartsResponse =
    copy(partNumberMarker = value)
  def withNextPartNumberMarker(value: Option[Int]): ListPartsResponse =
    copy(nextPartNumberMarker = value)
  def withMaxParts(value: Option[Int]): ListPartsResponse =
    copy(maxParts = value)
  def withIsTruncated(value: Option[Boolean]): ListPartsResponse =
    copy(isTruncated = value)
  def withParts(value: Option[Seq[Part]]): ListPartsResponse =
    copy(parts = value)
  def withInitiator(value: Option[Initiator]): ListPartsResponse =
    copy(initiator = value)
  def withOwner(value: Option[Owner]): ListPartsResponse =
    copy(owner = value)
  def withStorageClass(value: Option[StorageClass]): ListPartsResponse =
    copy(storageClass = value)
  def withRequestCharged(value: Option[RequestCharged]): ListPartsResponse =
    copy(requestCharged = value)
}

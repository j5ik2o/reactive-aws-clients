package com.github.j5ik2o.reactive.aws.kinesis.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class PutRecordsResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    failedRecordCount: Option[Int] = None,
    records: Option[Seq[PutRecordsResultEntry]] = None,
    encryptionType: Option[EncryptionType] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = PutRecordsResponse
  override def withStatusCode(value: Option[Int]): PutRecordsResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): PutRecordsResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): PutRecordsResponse =
    copy(httpHeaders = value)
  def withFailedRecordCount(value: Option[Int]): PutRecordsResponse =
    copy(failedRecordCount = value)
  def withRecords(value: Option[Seq[PutRecordsResultEntry]]): PutRecordsResponse =
    copy(records = value)
  def withEncryptionType(value: Option[EncryptionType]): PutRecordsResponse =
    copy(encryptionType = value)
}

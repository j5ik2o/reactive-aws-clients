package com.github.j5ik2o.reactive.kinesis.model

final case class PutRecordResponse(override val statusCode: Option[Int] = None,
                                   override val statusText: Option[String] = None,
                                   override val httpHeaders: Option[Map[String, Seq[String]]] = None,
                                   shardId: Option[String] = None,
                                   sequenceNumber: Option[String] = None,
                                   encryptionType: Option[EncryptionType] = None)
    extends AbstractResponse(statusCode, statusText, httpHeaders) {

  override type ThisType = PutRecordResponse
  override def withStatusCode(value: Option[Int]): PutRecordResponse                       = copy(statusCode = value)
  override def withStatusText(value: Option[String]): PutRecordResponse                    = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): PutRecordResponse = copy(httpHeaders = value)
  def withShardId(value: Option[String]): PutRecordResponse                                = copy(shardId = value)
  def withSequenceNumber(value: Option[String]): PutRecordResponse                         = copy(sequenceNumber = value)
  def withEncryptionType(value: Option[EncryptionType]): PutRecordResponse                 = copy(encryptionType = value)

}

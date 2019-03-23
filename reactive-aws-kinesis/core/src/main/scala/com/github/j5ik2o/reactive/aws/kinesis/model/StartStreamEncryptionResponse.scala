package com.github.j5ik2o.reactive.aws.kinesis.model

final case class StartStreamEncryptionResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = StartStreamEncryptionResponse
  override def withStatusCode(value: Option[Int]): StartStreamEncryptionResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): StartStreamEncryptionResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): StartStreamEncryptionResponse =
    copy(httpHeaders = value)
}

package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class CreateBackupResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    backupDetails: Option[BackupDetails] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = CreateBackupResponse
  override def withStatusCode(value: Option[Int]): CreateBackupResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): CreateBackupResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): CreateBackupResponse =
    copy(httpHeaders = value)
  def withBackupDetails(value: Option[BackupDetails]): CreateBackupResponse =
    copy(backupDetails = value)
}

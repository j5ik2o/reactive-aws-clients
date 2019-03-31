package com.github.j5ik2o.reactive.aws.dynamodb.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class ListBackupsResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    backupSummaries: Option[Seq[BackupSummary]] = None,
    lastEvaluatedBackupArn: Option[String] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = ListBackupsResponse
  override def withStatusCode(value: Option[Int]): ListBackupsResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): ListBackupsResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): ListBackupsResponse =
    copy(httpHeaders = value)
  def withBackupSummaries(value: Option[Seq[BackupSummary]]): ListBackupsResponse =
    copy(backupSummaries = value)
  def withLastEvaluatedBackupArn(value: Option[String]): ListBackupsResponse =
    copy(lastEvaluatedBackupArn = value)
}

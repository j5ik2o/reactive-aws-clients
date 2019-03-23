package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class DescribeBackupResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    backupDescription: Option[BackupDescription] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = DescribeBackupResponse
  override def withStatusCode(value: Option[Int]): DescribeBackupResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): DescribeBackupResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): DescribeBackupResponse =
    copy(httpHeaders = value)
  def withBackupDescription(value: Option[BackupDescription]): DescribeBackupResponse =
    copy(backupDescription = value)
}

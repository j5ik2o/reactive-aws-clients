package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class DeleteBackupResponse(override val statusCode: Option[Int] = None,
                                      override val statusText: Option[String] = None,
                                      override val httpHeaders: Option[Map[String, Seq[String]]] = None,
                                      backupDescription: Option[BackupDescription] = None)
    extends AbstractResponse(statusCode, statusText, httpHeaders) {

  override type ThisType = DeleteBackupResponse
  override def withStatusCode(value: Option[Int]): DeleteBackupResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): DeleteBackupResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): DeleteBackupResponse =
    copy(httpHeaders = value)
  def withBackupDescription(value: Option[BackupDescription]): DeleteBackupResponse = copy(backupDescription = value)

}

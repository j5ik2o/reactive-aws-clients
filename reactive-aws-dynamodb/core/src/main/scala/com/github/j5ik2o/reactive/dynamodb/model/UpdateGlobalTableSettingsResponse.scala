package com.github.j5ik2o.reactive.dynamodb.model

final case class UpdateGlobalTableSettingsResponse(override val statusCode: Option[Int] = None,
                                                   override val statusText: Option[String] = None,
                                                   override val httpHeaders: Option[Map[String, Seq[String]]] = None,
                                                   globalTableName: Option[String] = None,
                                                   replicaSettings: Option[Seq[ReplicaSettingsDescription]] = None)
    extends AbstractResponse(statusCode, statusText, httpHeaders) {

  override type ThisType = UpdateGlobalTableSettingsResponse
  override def withStatusCode(value: Option[Int]): UpdateGlobalTableSettingsResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): UpdateGlobalTableSettingsResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): UpdateGlobalTableSettingsResponse =
    copy(httpHeaders = value)
  def withGlobalTableName(value: Option[String]): UpdateGlobalTableSettingsResponse = copy(globalTableName = value)
  def withReplicaSettings(value: Option[Seq[ReplicaSettingsDescription]]): UpdateGlobalTableSettingsResponse =
    copy(replicaSettings = value)

}

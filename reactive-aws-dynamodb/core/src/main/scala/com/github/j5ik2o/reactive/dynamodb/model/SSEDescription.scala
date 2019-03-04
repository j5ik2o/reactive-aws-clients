package com.github.j5ik2o.reactive.dynamodb.model

final case class SSEDescription(status: Option[SSEStatus] = None,
                                sseType: Option[SSEType] = None,
                                kmsMasterKeyArn: Option[String] = None) {
  def withStatus(value: Option[SSEStatus]): SSEDescription       = copy(status = value)
  def withSSEType(value: Option[SSEType]): SSEDescription        = copy(sseType = value)
  def withKMSMasterKeyArn(value: Option[String]): SSEDescription = copy(kmsMasterKeyArn = value)
}

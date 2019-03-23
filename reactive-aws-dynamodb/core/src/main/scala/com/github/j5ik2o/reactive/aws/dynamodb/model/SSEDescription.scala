package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class SSEDescription(
    status: Option[SSEStatus] = None,
    sseType: Option[SSEType] = None,
    kmsMasterKeyArn: Option[String] = None
) {
  def withStatus(value: Option[SSEStatus]): SSEDescription =
    copy(status = value)
  def withSseType(value: Option[SSEType]): SSEDescription =
    copy(sseType = value)
  def withKmsMasterKeyArn(value: Option[String]): SSEDescription =
    copy(kmsMasterKeyArn = value)
}

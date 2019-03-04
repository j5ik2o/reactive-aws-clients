package com.github.j5ik2o.reactive.dynamodb.model

final case class SSESpecification(enabled: Option[Boolean] = None,
                                  sseType: Option[SSEType] = None,
                                  kmsMasterKeyId: Option[String] = None) {
  def withEnabled(value: Option[Boolean]): SSESpecification       = copy(enabled = value)
  def withSSEType(value: Option[SSEType]): SSESpecification       = copy(sseType = value)
  def withKMSMasterKeyId(value: Option[String]): SSESpecification = copy(kmsMasterKeyId = value)
}

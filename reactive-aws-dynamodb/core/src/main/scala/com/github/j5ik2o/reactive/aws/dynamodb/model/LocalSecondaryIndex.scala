package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class LocalSecondaryIndex(indexName: Option[String] = None,
                                     keySchema: Option[Seq[KeySchemaElement]] = None,
                                     projection: Option[Projection] = None) {
  def withIndexName(value: Option[String]): LocalSecondaryIndex                = copy(indexName = value)
  def withKeySchema(value: Option[Seq[KeySchemaElement]]): LocalSecondaryIndex = copy(keySchema = value)
  def withProjection(value: Option[Projection]): LocalSecondaryIndex           = copy(projection = value)
}

package com.github.j5ik2o.reactive.dynamodb.model

final case class LocalSecondaryIndexInfo(indexName: Option[String] = None,
                                         keySchema: Option[Seq[KeySchemaElement]] = None,
                                         projection: Option[Projection] = None) {
  def withIndexName(value: Option[String]): LocalSecondaryIndexInfo                = copy(indexName = value)
  def withKeySchema(value: Option[Seq[KeySchemaElement]]): LocalSecondaryIndexInfo = copy(keySchema = value)
  def withProjection(value: Option[Projection]): LocalSecondaryIndexInfo           = copy(projection = value)
}

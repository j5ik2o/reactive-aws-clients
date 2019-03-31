package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class LocalSecondaryIndexDescription(
    indexName: Option[String] = None,
    keySchema: Option[Seq[KeySchemaElement]] = None,
    projection: Option[Projection] = None,
    indexSizeBytes: Option[Long] = None,
    itemCount: Option[Long] = None,
    indexArn: Option[String] = None
) {
  def withIndexName(value: Option[String]): LocalSecondaryIndexDescription =
    copy(indexName = value)
  def withKeySchema(value: Option[Seq[KeySchemaElement]]): LocalSecondaryIndexDescription =
    copy(keySchema = value)
  def withProjection(value: Option[Projection]): LocalSecondaryIndexDescription =
    copy(projection = value)
  def withIndexSizeBytes(value: Option[Long]): LocalSecondaryIndexDescription =
    copy(indexSizeBytes = value)
  def withItemCount(value: Option[Long]): LocalSecondaryIndexDescription =
    copy(itemCount = value)
  def withIndexArn(value: Option[String]): LocalSecondaryIndexDescription =
    copy(indexArn = value)
}

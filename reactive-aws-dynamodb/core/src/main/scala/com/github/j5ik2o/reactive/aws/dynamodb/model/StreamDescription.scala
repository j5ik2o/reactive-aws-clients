package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class StreamDescription(
    streamArn: Option[String] = None,
    streamLabel: Option[String] = None,
    streamStatus: Option[StreamStatus] = None,
    streamViewType: Option[StreamViewType] = None,
    creationRequestDateTime: Option[java.time.Instant] = None,
    tableName: Option[String] = None,
    keySchema: Option[Seq[KeySchemaElement]] = None,
    shards: Option[Seq[Shard]] = None,
    lastEvaluatedShardId: Option[String] = None
) {
  def withStreamArn(value: Option[String]): StreamDescription =
    copy(streamArn = value)
  def withStreamLabel(value: Option[String]): StreamDescription =
    copy(streamLabel = value)
  def withStreamStatus(value: Option[StreamStatus]): StreamDescription =
    copy(streamStatus = value)
  def withStreamViewType(value: Option[StreamViewType]): StreamDescription =
    copy(streamViewType = value)
  def withCreationRequestDateTime(value: Option[java.time.Instant]): StreamDescription =
    copy(creationRequestDateTime = value)
  def withTableName(value: Option[String]): StreamDescription =
    copy(tableName = value)
  def withKeySchema(value: Option[Seq[KeySchemaElement]]): StreamDescription =
    copy(keySchema = value)
  def withShards(value: Option[Seq[Shard]]): StreamDescription =
    copy(shards = value)
  def withLastEvaluatedShardId(value: Option[String]): StreamDescription =
    copy(lastEvaluatedShardId = value)
}

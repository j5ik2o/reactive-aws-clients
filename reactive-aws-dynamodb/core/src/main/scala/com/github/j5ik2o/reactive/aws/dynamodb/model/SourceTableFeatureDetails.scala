package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class SourceTableFeatureDetails(
    localSecondaryIndexes: Option[Seq[LocalSecondaryIndexInfo]] = None,
    globalSecondaryIndexes: Option[Seq[GlobalSecondaryIndexInfo]] = None,
    streamDescription: Option[StreamSpecification] = None,
    timeToLiveDescription: Option[TimeToLiveDescription] = None,
    sseDescription: Option[SSEDescription] = None
) {
  def withLocalSecondaryIndexes(value: Option[Seq[LocalSecondaryIndexInfo]]): SourceTableFeatureDetails =
    copy(localSecondaryIndexes = value)
  def withGlobalSecondaryIndexes(value: Option[Seq[GlobalSecondaryIndexInfo]]): SourceTableFeatureDetails =
    copy(globalSecondaryIndexes = value)
  def withStreamDescription(value: Option[StreamSpecification]): SourceTableFeatureDetails =
    copy(streamDescription = value)
  def withTimeToLiveDescription(value: Option[TimeToLiveDescription]): SourceTableFeatureDetails =
    copy(timeToLiveDescription = value)
  def withSseDescription(value: Option[SSEDescription]): SourceTableFeatureDetails =
    copy(sseDescription = value)
}

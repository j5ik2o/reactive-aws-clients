package com.github.j5ik2o.reactive.dynamodb.model

import java.time.Instant

final case class TableDescription(attributeDefinitions: Option[Seq[AttributeDefinition]] = None,
                                  tableName: Option[String] = None,
                                  keySchema: Option[Seq[KeySchemaElement]] = None,
                                  tableStatus: Option[TableStatus] = None,
                                  creationDateTime: Option[Instant] = None,
                                  provisionedThroughput: Option[ProvisionedThroughputDescription] = None,
                                  tableSizeBytes: Option[Long] = Some(0L),
                                  itemCount: Option[Long] = Some(0L),
                                  tableArn: Option[String] = None,
                                  tableId: Option[String] = None,
                                  billingModeSummary: Option[BillingModeSummary] = None,
                                  localSecondaryIndexes: Option[Seq[LocalSecondaryIndexDescription]] = None,
                                  globalSecondaryIndexes: Option[Seq[GlobalSecondaryIndexDescription]] = None,
                                  streamSpecification: Option[StreamSpecification] = None,
                                  latestStreamLabel: Option[String] = None,
                                  latestStreamArn: Option[String] = None,
                                  restoreSummary: Option[RestoreSummary] = None,
                                  sseDescription: Option[SSEDescription] = None) {
  def withAttributeDefinitions(value: Option[Seq[AttributeDefinition]]): TableDescription =
    copy(attributeDefinitions = value)
  def withTableName(value: Option[String]): TableDescription                = copy(tableName = value)
  def withKeySchema(value: Option[Seq[KeySchemaElement]]): TableDescription = copy(keySchema = value)
  def withTableStatus(value: Option[TableStatus]): TableDescription         = copy(tableStatus = value)
  def withCreationDateTime(value: Option[Instant]): TableDescription        = copy(creationDateTime = value)
  def withProvisionedThroughputDescription(value: Option[ProvisionedThroughputDescription]): TableDescription =
    copy(provisionedThroughput = value)
  def withTableSizeBytes(value: Option[Long]): TableDescription                   = copy(tableSizeBytes = value)
  def withItemCount(value: Option[Long]): TableDescription                        = copy(itemCount = value)
  def withTableArn(value: Option[String]): TableDescription                       = copy(tableArn = value)
  def withTableId(value: Option[String]): TableDescription                        = copy(tableId = value)
  def withBillingModeSummary(value: Option[BillingModeSummary]): TableDescription = copy(billingModeSummary = value)
  def withLocalSecondaryIndexes(value: Option[Seq[LocalSecondaryIndexDescription]]): TableDescription =
    copy(localSecondaryIndexes = value)
  def withGlobalSecondaryIndexes(value: Option[Seq[GlobalSecondaryIndexDescription]]): TableDescription =
    copy(globalSecondaryIndexes = value)
  def withStreamSpecification(value: Option[StreamSpecification]): TableDescription = copy(streamSpecification = value)
  def withLatestStreamLabel(value: Option[String]): TableDescription                = copy(latestStreamLabel = value)
  def withLatestStreamArn(value: Option[String]): TableDescription                  = copy(latestStreamArn = value)
  def withRestoreSummary(value: Option[RestoreSummary]): TableDescription           = copy(restoreSummary = value)
  def withSSEDescription(value: Option[SSEDescription]): TableDescription           = copy(sseDescription = value)
}

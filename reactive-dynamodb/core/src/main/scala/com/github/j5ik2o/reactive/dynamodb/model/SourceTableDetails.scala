package com.github.j5ik2o.reactive.dynamodb.model

import java.time.Instant

final case class SourceTableDetails(tableName: Option[String] = None,
                                    tableId: Option[String] = None,
                                    tableArn: Option[String] = None,
                                    tableSizeBytes: Option[Long] = Some(0L),
                                    keySchema: Option[Seq[KeySchemaElement]] = None,
                                    tableCreationDateTime: Option[Instant] = None,
                                    provisionedThroughput: Option[ProvisionedThroughput] = None,
                                    itemCount: Option[Long] = Some(0L),
                                    billingMode: Option[BillingMode] = None) {
  def withTableName(value: Option[String]): SourceTableDetails                = copy(tableName = value)
  def withTableId(value: Option[String]): SourceTableDetails                  = copy(tableId = value)
  def withTableArn(value: Option[String]): SourceTableDetails                 = copy(tableArn = value)
  def withTableSizeBytes(value: Option[Long]): SourceTableDetails             = copy(tableSizeBytes = value)
  def withKeySchema(value: Option[Seq[KeySchemaElement]]): SourceTableDetails = copy(keySchema = value)
  def withTableCreationDateTime(value: Option[Instant]): SourceTableDetails   = copy(tableCreationDateTime = value)
  def withProvisionedThroughput(value: Option[ProvisionedThroughput]): SourceTableDetails =
    copy(provisionedThroughput = value)
  def withItemCount(value: Option[Long]): SourceTableDetails          = copy(itemCount = value)
  def withBillingMode(value: Option[BillingMode]): SourceTableDetails = copy(billingMode = value)
}

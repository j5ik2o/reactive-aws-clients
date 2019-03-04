package com.github.j5ik2o.reactive.dynamodb.model

final case class UpdateTableRequest(attributeDefinitions: Option[Seq[AttributeDefinition]] = None,
                                    tableName: Option[String] = None,
                                    billingMode: Option[BillingMode] = None,
                                    provisionedThroughput: Option[ProvisionedThroughput] = None,
                                    globalSecondaryIndexUpdates: Option[Seq[GlobalSecondaryIndexUpdate]] = None,
                                    streamSpecification: Option[StreamSpecification] = None,
                                    sseSpecification: Option[SSESpecification] = None) {
  def withAttributeDefinitions(value: Option[Seq[AttributeDefinition]]): UpdateTableRequest =
    copy(attributeDefinitions = value)
  def withTableName(value: Option[String]): UpdateTableRequest        = copy(tableName = value)
  def withBillingMode(value: Option[BillingMode]): UpdateTableRequest = copy(billingMode = value)
  def withProvisionedThroughput(value: Option[ProvisionedThroughput]): UpdateTableRequest =
    copy(provisionedThroughput = value)
  def withGlobalSecondaryIndexUpdates(value: Option[Seq[GlobalSecondaryIndexUpdate]]): UpdateTableRequest =
    copy(globalSecondaryIndexUpdates = value)
  def withStreamSpecification(value: Option[StreamSpecification]): UpdateTableRequest =
    copy(streamSpecification = value)
  def withSSESpecification(value: Option[SSESpecification]): UpdateTableRequest = copy(sseSpecification = value)

}

package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class CreateTableRequest(attributeDefinitions: Option[Seq[AttributeDefinition]] = None,
                                    tableName: Option[String] = None,
                                    keySchema: Option[Seq[KeySchemaElement]] = None,
                                    localSecondaryIndexes: Option[Seq[LocalSecondaryIndex]] = None,
                                    globalSecondaryIndexes: Option[Seq[GlobalSecondaryIndex]] = None,
                                    billingMode: Option[BillingMode] = None,
                                    provisionedThroughput: Option[ProvisionedThroughput] = None,
                                    streamSpecification: Option[StreamSpecification] = None,
                                    SSESpecification: Option[SSESpecification] = None) {
  def withAttributeDefinitions(value: Option[Seq[AttributeDefinition]]): CreateTableRequest =
    copy(attributeDefinitions = value)
  def withTableName(value: Option[String]): CreateTableRequest                = copy(tableName = value)
  def withKeySchema(value: Option[Seq[KeySchemaElement]]): CreateTableRequest = copy(keySchema = value)
  def withLocalSecondaryIndexes(value: Option[Seq[LocalSecondaryIndex]]): CreateTableRequest =
    copy(localSecondaryIndexes = value)
  def withGlobalSecondaryIndexes(value: Option[Seq[GlobalSecondaryIndex]]): CreateTableRequest =
    copy(globalSecondaryIndexes = value)
  def withBillingMode(value: Option[BillingMode]): CreateTableRequest = copy(billingMode = value)
  def withProvisionedThroughput(value: Option[ProvisionedThroughput]): CreateTableRequest =
    copy(provisionedThroughput = value)
  def withStreamSpecification(value: Option[StreamSpecification]): CreateTableRequest =
    copy(streamSpecification = value)
  def withSSESpecification(value: Option[SSESpecification]): CreateTableRequest = copy(SSESpecification = value)
}

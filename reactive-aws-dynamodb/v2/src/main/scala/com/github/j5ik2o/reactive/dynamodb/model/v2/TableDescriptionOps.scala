package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ TableStatus, TableDescription => ScalaTableDescription }
import software.amazon.awssdk.services.dynamodb.model.{ TableDescription => JavaTableDescription }

import scala.collection.JavaConverters._

object TableDescriptionOps {
  import AttributeDefinitionOps._
  import BillingModeSummaryOps._
  import GlobalSecondaryIndexDescriptionOps._
  import KeySchemaElementOps._
  import LocalSecondaryIndexDescriptionOps._
  import ProvisionedThroughputDescriptionOps._
  import RestoreSummaryOps._
  import SSEDescriptionOps._
  import StreamSpecificationOps._

  implicit class ScalaTableDescriptionOps(val self: ScalaTableDescription) extends AnyVal {
    def toJava: JavaTableDescription = {
      val result = JavaTableDescription.builder()
      self.attributeDefinitions.map(_.map(_.toJava).asJava).foreach(result.attributeDefinitions)
      self.tableName.foreach(result.tableName)
      self.keySchema.map(_.map(_.toJava).asJava).foreach(result.keySchema)
      self.tableStatus.map(_.entryName).foreach(result.tableStatus)
      self.creationDateTime.foreach(result.creationDateTime)
      self.provisionedThroughput.map(_.toJava).foreach(result.provisionedThroughput)
      self.tableSizeBytes.foreach(v => result.tableSizeBytes(v))
      self.itemCount.foreach(v => result.itemCount(v))
      self.tableArn.foreach(v => result.tableArn(v))
      self.tableId.foreach(result.tableId)
      self.billingModeSummary.map(_.toJava).foreach(result.billingModeSummary)
      self.localSecondaryIndexes.map(_.map(_.toJava).asJava).foreach(result.localSecondaryIndexes)
      self.globalSecondaryIndexes.map(_.map(_.toJava).asJava).foreach(result.globalSecondaryIndexes)
      self.streamSpecification.map(_.toJava).foreach(result.streamSpecification)
      self.latestStreamLabel.foreach(result.latestStreamLabel)
      self.latestStreamArn.foreach(result.latestStreamArn)
      self.restoreSummary.map(_.toJava).foreach(result.restoreSummary)
      self.sseDescription.map(_.toJava).foreach(result.sseDescription)
      result.build()
    }
  }

  implicit class JavaTableDescriptionOps(val self: JavaTableDescription) extends AnyVal {

    def toScala: ScalaTableDescription = {
      ScalaTableDescription()
        .withAttributeDefinitions(
          Option(self.attributeDefinitions).map(_.asScala.map(_.toScala))
        ).withTableName(Option(self.tableName))
        .withKeySchema(Option(self.keySchema).map(_.asScala.map(_.toScala)))
        .withTableStatus(Option(self.tableStatus).map(_.toString).map(TableStatus.withName))
        .withCreationDateTime(Option(self.creationDateTime))
        .withProvisionedThroughputDescription(Option(self.provisionedThroughput).map(_.toScala))
        .withTableSizeBytes(Option(self.tableSizeBytes))
        .withItemCount(Option(self.itemCount))
        .withTableArn(Option(self.tableArn))
        .withTableId(Option(self.tableId))
        .withBillingModeSummary(Option(self.billingModeSummary).map(_.toScala))
        .withLocalSecondaryIndexes(Option(self.localSecondaryIndexes).map(_.asScala.map(_.toScala)))
        .withGlobalSecondaryIndexes(Option(self.globalSecondaryIndexes).map(_.asScala.map(_.toScala)))
        .withStreamSpecification(Option(self.streamSpecification).map(_.toScala))
        .withLatestStreamLabel(Option(self.latestStreamLabel))
        .withLatestStreamArn(Option(self.latestStreamArn))
        .withRestoreSummary(Option(self.restoreSummary).map(_.toScala))
        .withSSEDescription(Option(self.sseDescription).map(_.toScala))
    }

  }
}

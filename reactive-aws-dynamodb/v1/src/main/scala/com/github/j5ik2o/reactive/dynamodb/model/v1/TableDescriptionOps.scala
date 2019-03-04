package com.github.j5ik2o.reactive.dynamodb.model.v1

import java.util.Date

import com.amazonaws.services.dynamodbv2.model.{ TableDescription => JavaTableDescription }
import com.github.j5ik2o.reactive.dynamodb.model.{ TableStatus, TableDescription => ScalaTableDescription }

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
      val result = new JavaTableDescription()
      self.attributeDefinitions.map(_.map(_.toJava).asJava).foreach(result.setAttributeDefinitions)
      self.tableName.foreach(result.setTableName)
      self.keySchema.map(_.map(_.toJava).asJava).foreach(result.setKeySchema)
      self.tableStatus.map(_.entryName).foreach(result.setTableStatus)
      self.creationDateTime.map(Date.from).foreach(result.setCreationDateTime)
      self.provisionedThroughput.map(_.toJava).foreach(result.setProvisionedThroughput)
      self.tableSizeBytes.foreach(v => result.setTableSizeBytes(v))
      self.itemCount.foreach(v => result.setItemCount(v))
      self.tableArn.foreach(v => result.setTableArn(v))
      self.tableId.foreach(result.setTableId)
      self.billingModeSummary.map(_.toJava).foreach(result.setBillingModeSummary)
      self.localSecondaryIndexes.map(_.map(_.toJava).asJava).foreach(result.setLocalSecondaryIndexes)
      self.globalSecondaryIndexes.map(_.map(_.toJava).asJava).foreach(result.setGlobalSecondaryIndexes)
      self.streamSpecification.map(_.toJava).foreach(result.setStreamSpecification)
      self.latestStreamLabel.foreach(result.setLatestStreamLabel)
      self.latestStreamArn.foreach(result.setLatestStreamArn)
      self.restoreSummary.map(_.toJava).foreach(result.setRestoreSummary)
      self.sseDescription.map(_.toJava).foreach(result.setSSEDescription)
      result
    }
  }

  implicit class JavaTableDescriptionOps(val self: JavaTableDescription) extends AnyVal {

    def toScala: ScalaTableDescription = {
      ScalaTableDescription()
        .withAttributeDefinitions(
          Option(self.getAttributeDefinitions).map(_.asScala.map(_.toScala))
        ).withTableName(Option(self.getTableName))
        .withKeySchema(Option(self.getKeySchema).map(_.asScala.map(_.toScala)))
        .withTableStatus(Option(self.getTableStatus).map(TableStatus.withName))
        .withCreationDateTime(Option(self.getCreationDateTime).map(_.toInstant))
        .withProvisionedThroughputDescription(Option(self.getProvisionedThroughput).map(_.toScala))
        .withTableSizeBytes(Option(self.getTableSizeBytes))
        .withItemCount(Option(self.getItemCount))
        .withTableArn(Option(self.getTableArn))
        .withTableId(Option(self.getTableId))
        .withBillingModeSummary(Option(self.getBillingModeSummary).map(_.toScala))
        .withLocalSecondaryIndexes(Option(self.getLocalSecondaryIndexes).map(_.asScala.map(_.toScala)))
        .withGlobalSecondaryIndexes(Option(self.getGlobalSecondaryIndexes).map(_.asScala.map(_.toScala)))
        .withStreamSpecification(Option(self.getStreamSpecification).map(_.toScala))
        .withLatestStreamLabel(Option(self.getLatestStreamLabel))
        .withLatestStreamArn(Option(self.getLatestStreamArn))
        .withRestoreSummary(Option(self.getRestoreSummary).map(_.toScala))
        .withSSEDescription(Option(self.getSSEDescription).map(_.toScala))
    }

  }

}

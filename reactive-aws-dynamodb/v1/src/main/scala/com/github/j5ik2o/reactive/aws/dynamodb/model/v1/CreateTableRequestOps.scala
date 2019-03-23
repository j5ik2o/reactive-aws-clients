package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ CreateTableRequest => JavaCreateTableRequest }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BillingMode, CreateTableRequest => ScalaCreateTableRequest }

import scala.collection.JavaConverters._

object CreateTableRequestOps {

  import AttributeDefinitionOps._
  import GlobalSecondaryIndexOps._
  import KeySchemaElementOps._
  import LocalSecondaryIndexOps._
  import ProvisionedThroughputOps._
  import SSESpecificationOps._
  import StreamSpecificationOps._

  implicit class ScalaCreateTableRequestOps(val self: ScalaCreateTableRequest) extends AnyVal {

    def toJava: JavaCreateTableRequest = {
      val result = new JavaCreateTableRequest()
      self.attributeDefinitions.map(_.map(_.toJava).asJava).foreach(result.setAttributeDefinitions)
      self.tableName.foreach(result.setTableName)
      self.keySchema.map(_.map(_.toJava).asJava).foreach(result.setKeySchema)
      self.localSecondaryIndexes.map(_.map(_.toJava).asJava).foreach(result.setLocalSecondaryIndexes)
      self.globalSecondaryIndexes.map(_.map(_.toJava).asJava).foreach(result.setGlobalSecondaryIndexes)
      self.billingMode.map(_.entryName).foreach(result.setBillingMode)
      self.provisionedThroughput.map(_.toJava).foreach(result.setProvisionedThroughput)
      self.streamSpecification.map(_.toJava).foreach(result.setStreamSpecification)
      self.sseSpecification.map(_.toJava).foreach(result.setSSESpecification)
      result
    }

  }

  implicit class JavaCreateTableRequestOps(val self: JavaCreateTableRequest) extends AnyVal {

    def toScala: ScalaCreateTableRequest = {
      ScalaCreateTableRequest()
        .withTableName(Option(self.getTableName))
        .withAttributeDefinitions(Option(self.getAttributeDefinitions).map(_.asScala.map(_.toScala)))
        .withKeySchema(Option(self.getKeySchema).map(_.asScala.map(_.toScala)))
        .withLocalSecondaryIndexes(Option(self.getLocalSecondaryIndexes).map(_.asScala.map(_.toScala)))
        .withGlobalSecondaryIndexes(Option(self.getGlobalSecondaryIndexes).map(_.asScala.map(_.toScala)))
        .withBillingMode(Option(self.getBillingMode).map(BillingMode.withName))
        .withProvisionedThroughput(Option(self.getProvisionedThroughput).map(_.toScala))
        .withStreamSpecification(Option(self.getStreamSpecification).map(_.toScala))
        .withSseSpecification(Option(self.getSSESpecification).map(_.toScala))
    }

  }

}

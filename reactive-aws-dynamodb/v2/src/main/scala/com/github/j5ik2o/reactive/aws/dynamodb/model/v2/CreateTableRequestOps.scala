package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BillingMode, CreateTableRequest => ScalaCreateTableRequest }
import software.amazon.awssdk.services.dynamodb.model.{ CreateTableRequest => JavaCreateTableRequest }

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
      val result = JavaCreateTableRequest.builder()
      self.attributeDefinitions.map(_.map(_.toJava).asJava).foreach(result.attributeDefinitions)
      self.tableName.foreach(result.tableName)
      self.keySchema.map(_.map(_.toJava).asJava).foreach(result.keySchema)
      self.localSecondaryIndexes.map(_.map(_.toJava).asJava).foreach(result.localSecondaryIndexes)
      self.globalSecondaryIndexes.map(_.map(_.toJava).asJava).foreach(result.globalSecondaryIndexes)
      self.billingMode.map(_.entryName).foreach(result.billingMode)
      self.provisionedThroughput.map(_.toJava).foreach(result.provisionedThroughput)
      self.streamSpecification.map(_.toJava).foreach(result.streamSpecification)
      self.sseSpecification.map(_.toJava).foreach(result.sseSpecification)
      result.build()
    }

  }

  implicit class JavaCreateTableRequestOps(val self: JavaCreateTableRequest) extends AnyVal {

    def toScala: ScalaCreateTableRequest = {
      ScalaCreateTableRequest()
        .withTableName(Option(self.tableName))
        .withAttributeDefinitions(Option(self.attributeDefinitions).map(_.asScala.map(_.toScala)))
        .withKeySchema(Option(self.keySchema).map(_.asScala.map(_.toScala)))
        .withLocalSecondaryIndexes(Option(self.localSecondaryIndexes).map(_.asScala.map(_.toScala)))
        .withGlobalSecondaryIndexes(Option(self.globalSecondaryIndexes).map(_.asScala.map(_.toScala)))
        .withBillingMode(Option(self.billingMode).map(_.toString).map(BillingMode.withName))
        .withProvisionedThroughput(Option(self.provisionedThroughput).map(_.toScala))
        .withStreamSpecification(Option(self.streamSpecification).map(_.toScala))
        .withSseSpecification(Option(self.sseSpecification).map(_.toScala))
    }

  }
}

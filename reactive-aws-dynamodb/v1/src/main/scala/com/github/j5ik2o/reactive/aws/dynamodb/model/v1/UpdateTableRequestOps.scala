package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ UpdateTableRequest => JavaUpdateTableRequest }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BillingMode, UpdateTableRequest => ScalaUpdateTableRequest }

import scala.collection.JavaConverters._

object UpdateTableRequestOps {

  import AttributeDefinitionOps._
  import GlobalSecondaryIndexUpdateOps._
  import ProvisionedThroughputOps._
  import SSESpecificationOps._
  import StreamSpecificationOps._

  implicit class ScalaUpdateTableRequestOps(val self: ScalaUpdateTableRequest) extends AnyVal {

    def toJava: JavaUpdateTableRequest = {
      val result = new JavaUpdateTableRequest
      self.attributeDefinitions.map(_.map(_.toJava).asJava).foreach(result.setAttributeDefinitions)
      self.tableName.foreach(result.setTableName)
      self.billingMode.map(_.entryName).foreach(result.setBillingMode)
      self.provisionedThroughput.map(_.toJava).foreach(result.setProvisionedThroughput)
      self.globalSecondaryIndexUpdates.map(_.map(_.toJava).asJava).foreach(result.setGlobalSecondaryIndexUpdates)
      self.streamSpecification.map(_.toJava).foreach(result.setStreamSpecification)
      self.sseSpecification.map(_.toJava).foreach(result.setSSESpecification)
      result
    }

  }

  implicit class JavaUpdateTableRequestOps(val self: JavaUpdateTableRequest) extends AnyVal {

    def toScala: ScalaUpdateTableRequest = {
      ScalaUpdateTableRequest()
        .withAttributeDefinitions(
          Option(self.getAttributeDefinitions).map(_.asScala.map(_.toScala))
        )
        .withTableName(Option(self.getTableName))
        .withBillingMode(Option(self.getBillingMode).map(BillingMode.withName))
        .withProvisionedThroughput(Option(self.getProvisionedThroughput).map(_.toScala))
        .withGlobalSecondaryIndexUpdates(Option(self.getGlobalSecondaryIndexUpdates).map(_.asScala.map(_.toScala)))
        .withStreamSpecification(Option(self.getStreamSpecification).map(_.toScala))
        .withSseSpecification(Option(self.getSSESpecification).map(_.toScala))
    }

  }

}

package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ BillingMode, UpdateTableRequest => ScalaUpdateTableRequest }
import software.amazon.awssdk.services.dynamodb.model.{ UpdateTableRequest => JavaUpdateTableRequest }

import scala.collection.JavaConverters._

object UpdateTableRequestOps {

  import AttributeDefinitionOps._
  import GlobalSecondaryIndexUpdateOps._
  import ProvisionedThroughputOps._
  import SSESpecificationOps._
  import StreamSpecificationOps._

  implicit class ScalaUpdateTableRequestOps(val self: ScalaUpdateTableRequest) extends AnyVal {

    def toJava: JavaUpdateTableRequest = {
      val result = JavaUpdateTableRequest.builder()
      self.attributeDefinitions.map(_.map(_.toJava).asJava).foreach(result.attributeDefinitions)
      self.tableName.foreach(result.tableName)
      self.billingMode.map(_.entryName).foreach(result.billingMode)
      self.provisionedThroughput.map(_.toJava).foreach(result.provisionedThroughput)
      self.globalSecondaryIndexUpdates.map(_.map(_.toJava).asJava).foreach(result.globalSecondaryIndexUpdates)
      self.streamSpecification.map(_.toJava).foreach(result.streamSpecification)
      self.sseSpecification.map(_.toJava).foreach(result.sseSpecification)
      result.build()
    }

  }

  implicit class JavaUpdateTableRequestOps(val self: JavaUpdateTableRequest) extends AnyVal {

    def toScala: ScalaUpdateTableRequest = {
      ScalaUpdateTableRequest()
        .withAttributeDefinitions(
          Option(self.attributeDefinitions).map(_.asScala.map(_.toScala))
        )
        .withTableName(Option(self.tableName))
        .withBillingMode(Option(self.billingMode).map(_.toString).map(BillingMode.withName))
        .withProvisionedThroughput(Option(self.provisionedThroughput).map(_.toScala))
        .withGlobalSecondaryIndexUpdates(Option(self.globalSecondaryIndexUpdates).map(_.asScala.map(_.toScala)))
        .withStreamSpecification(Option(self.streamSpecification).map(_.toScala))
        .withSSESpecification(Option(self.sseSpecification).map(_.toScala))
    }

  }

}

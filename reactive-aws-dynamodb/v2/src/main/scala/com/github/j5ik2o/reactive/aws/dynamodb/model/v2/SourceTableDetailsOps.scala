package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BillingMode, SourceTableDetails => ScalaSourceTableDetails }
import software.amazon.awssdk.services.dynamodb.model.{ SourceTableDetails => JavaSourceTableDetails }

import scala.collection.JavaConverters._

object SourceTableDetailsOps {

  import KeySchemaElementOps._
  import ProvisionedThroughputOps._

  implicit class ScalaSourceTableDetailsOps(val self: ScalaSourceTableDetails) extends AnyVal {

    def toJava: JavaSourceTableDetails = {
      val result = JavaSourceTableDetails.builder()
      self.tableName.foreach(result.tableName)
      self.tableId.foreach(result.tableId)
      self.tableArn.foreach(result.tableArn)
      self.tableSizeBytes.foreach(v => result.tableSizeBytes(v))
      self.keySchema.map(_.map(_.toJava).asJava).foreach(result.keySchema)
      self.tableCreationDateTime.foreach(result.tableCreationDateTime)
      self.provisionedThroughput.map(_.toJava).foreach(result.provisionedThroughput)
      self.itemCount.foreach(v => result.itemCount(v))
      self.billingMode.map(_.entryName).foreach(result.billingMode)
      result.build()
    }

  }

  implicit class JavaSourceTableDetailsOps(val self: JavaSourceTableDetails) extends AnyVal {

    def toScala: ScalaSourceTableDetails = {
      ScalaSourceTableDetails()
        .withTableName(Option(self.tableName))
        .withTableId(Option(self.tableId))
        .withTableArn(Option(self.tableArn))
        .withTableSizeBytes(Option(self.tableSizeBytes))
        .withKeySchema(Option(self.keySchema).map(_.asScala.map(_.toScala)))
        .withTableCreationDateTime(Option(self.tableCreationDateTime))
        .withProvisionedThroughput(Option(self.provisionedThroughput).map(_.toScala))
        .withItemCount(Option(self.itemCount))
        .withBillingMode(Option(self.billingMode).map(_.toString).map(BillingMode.withName))
    }

  }

}

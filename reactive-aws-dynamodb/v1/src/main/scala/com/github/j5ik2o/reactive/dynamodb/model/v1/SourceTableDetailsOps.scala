package com.github.j5ik2o.reactive.dynamodb.model.v1

import java.util.Date

import com.amazonaws.services.dynamodbv2.model.{ SourceTableDetails => JavaSourceTableDetails }
import com.github.j5ik2o.reactive.dynamodb.model.{ BillingMode, SourceTableDetails => ScalaSourceTableDetails }

import scala.collection.JavaConverters._

object SourceTableDetailsOps {

  import KeySchemaElementOps._
  import ProvisionedThroughputOps._

  implicit class ScalaSourceTableDetailsOps(val self: ScalaSourceTableDetails) extends AnyVal {

    def toJava: JavaSourceTableDetails = {
      val result = new JavaSourceTableDetails()
      self.tableName.foreach(result.setTableName)
      self.tableId.foreach(result.setTableId)
      self.tableArn.foreach(result.setTableArn)
      self.tableSizeBytes.foreach(v => result.setTableSizeBytes(v))
      self.keySchema.map(_.map(_.toJava).asJava).foreach(result.setKeySchema)
      self.tableCreationDateTime.map(Date.from).foreach(result.setTableCreationDateTime)
      self.provisionedThroughput.map(_.toJava).foreach(result.setProvisionedThroughput)
      self.itemCount.foreach(v => result.setItemCount(v))
      self.billingMode.map(_.entryName).foreach(result.setBillingMode)
      result
    }

  }

  implicit class JavaSourceTableDetailsOps(val self: JavaSourceTableDetails) extends AnyVal {

    def toScala: ScalaSourceTableDetails = {
      ScalaSourceTableDetails()
        .withTableName(Option(self.getTableName))
        .withTableId(Option(self.getTableId))
        .withTableArn(Option(self.getTableArn))
        .withTableSizeBytes(Option(self.getTableSizeBytes))
        .withKeySchema(Option(self.getKeySchema).map(_.asScala.map(_.toScala)))
        .withTableCreationDateTime(Option(self.getTableCreationDateTime).map(_.toInstant))
        .withProvisionedThroughput(Option(self.getProvisionedThroughput).map(_.toScala))
        .withItemCount(Option(self.getItemCount))
        .withBillingMode(Option(self.getBillingMode).map(BillingMode.withName))
    }

  }

}

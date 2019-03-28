// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ SourceTableDetails => ScalaSourceTableDetails, _ }
import com.amazonaws.services.dynamodbv2.model.{ SourceTableDetails => JavaSourceTableDetails }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object SourceTableDetailsOps {

  implicit class ScalaSourceTableDetailsOps(val self: ScalaSourceTableDetails) extends AnyVal {

    def toJava: JavaSourceTableDetails = {
      val result = new JavaSourceTableDetails()
      self.tableName.filter(_.nonEmpty).foreach(v => result.withTableName(v))         // String
      self.tableId.filter(_.nonEmpty).foreach(v => result.withTableId(v))             // String
      self.tableArn.filter(_.nonEmpty).foreach(v => result.withTableArn(v))           // String
      self.tableSizeBytes.map(_.longValue).foreach(v => result.withTableSizeBytes(v)) // Long
      self.keySchema.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, KeySchemaElementOps._; result.withKeySchema(v.map(_.toJava).asJava)
      } // Seq[KeySchemaElement]
      self.tableCreationDateTime.map(java.util.Date.from).foreach(v => result.withTableCreationDateTime(v)) // Instant
      self.provisionedThroughput.foreach { v =>
        import ProvisionedThroughputOps._; result.withProvisionedThroughput(v.toJava)
      } // ProvisionedThroughput
      self.itemCount.map(_.longValue).foreach(v => result.withItemCount(v)) // Long
      self.billingMode.foreach { v =>
        import BillingModeOps._; result.withBillingMode(v.toJava)
      } // String

      result
    }

  }

  implicit class JavaSourceTableDetailsOps(val self: JavaSourceTableDetails) extends AnyVal {

    def toScala: ScalaSourceTableDetails = {
      ScalaSourceTableDetails()
        .withTableName(Option(self.getTableName)) // String
        .withTableId(Option(self.getTableId)) // String
        .withTableArn(Option(self.getTableArn)) // String
        .withTableSizeBytes(Option(self.getTableSizeBytes).map(_.longValue)) // Long
        .withKeySchema(Option(self.getKeySchema).map { v =>
          import scala.collection.JavaConverters._, KeySchemaElementOps._; v.asScala.map(_.toScala)
        }) // Seq[KeySchemaElement]
        .withTableCreationDateTime(Option(self.getTableCreationDateTime).map(_.toInstant)) // Instant
        .withProvisionedThroughput(Option(self.getProvisionedThroughput).map { v =>
          import ProvisionedThroughputOps._; v.toScala
        }) // ProvisionedThroughput
        .withItemCount(Option(self.getItemCount).map(_.longValue)) // Long
        .withBillingMode(Option(self.getBillingMode).map { v =>
          import BillingModeOps._; v.toScala
        }) // String
    }

  }

}

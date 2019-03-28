// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ SourceTableDetails => ScalaSourceTableDetails, _ }
import software.amazon.awssdk.services.dynamodb.model.{ SourceTableDetails => JavaSourceTableDetails }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object SourceTableDetailsOps {

  implicit class ScalaSourceTableDetailsOps(val self: ScalaSourceTableDetails) extends AnyVal {

    def toJava: JavaSourceTableDetails = {
      val result = JavaSourceTableDetails.builder()
      self.tableName.filter(_.nonEmpty).foreach(v => result.tableName(v))         // String
      self.tableId.filter(_.nonEmpty).foreach(v => result.tableId(v))             // String
      self.tableArn.filter(_.nonEmpty).foreach(v => result.tableArn(v))           // String
      self.tableSizeBytes.map(_.longValue).foreach(v => result.tableSizeBytes(v)) // Long
      self.keySchema.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, KeySchemaElementOps._; result.keySchema(v.map(_.toJava).asJava)
      } // Seq[KeySchemaElement]
      self.tableCreationDateTime.foreach(v => result.tableCreationDateTime(v)) // Instant
      self.provisionedThroughput.foreach { v =>
        import ProvisionedThroughputOps._; result.provisionedThroughput(v.toJava)
      } // ProvisionedThroughput
      self.itemCount.map(_.longValue).foreach(v => result.itemCount(v)) // Long
      self.billingMode.foreach { v =>
        import BillingModeOps._; result.billingMode(v.toJava)
      } // String

      result.build()
    }

  }

  implicit class JavaSourceTableDetailsOps(val self: JavaSourceTableDetails) extends AnyVal {

    def toScala: ScalaSourceTableDetails = {
      ScalaSourceTableDetails()
        .withTableName(Option(self.tableName)) // String
        .withTableId(Option(self.tableId)) // String
        .withTableArn(Option(self.tableArn)) // String
        .withTableSizeBytes(Option(self.tableSizeBytes).map(_.longValue)) // Long
        .withKeySchema(Option(self.keySchema).map { v =>
          import scala.collection.JavaConverters._, KeySchemaElementOps._; v.asScala.map(_.toScala)
        }) // Seq[KeySchemaElement]
        .withTableCreationDateTime(Option(self.tableCreationDateTime)) // Instant
        .withProvisionedThroughput(Option(self.provisionedThroughput).map { v =>
          import ProvisionedThroughputOps._; v.toScala
        }) // ProvisionedThroughput
        .withItemCount(Option(self.itemCount).map(_.longValue)) // Long
        .withBillingMode(Option(self.billingMode).map { v =>
          import BillingModeOps._; v.toScala
        }) // String
    }

  }

}

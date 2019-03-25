package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ SourceTableDetails => ScalaSourceTableDetails, _ }
import software.amazon.awssdk.services.dynamodb.model.{ SourceTableDetails => JavaSourceTableDetails }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object SourceTableDetailsOps {

  implicit class ScalaSourceTableDetailsOps(val self: ScalaSourceTableDetails) extends AnyVal {

    def toJava: JavaSourceTableDetails = {
      val result = JavaSourceTableDetails.builder()
      self.tableName.filter(_.nonEmpty).foreach(v => result.tableName(v))         // String, case String
      self.tableId.filter(_.nonEmpty).foreach(v => result.tableId(v))             // String, case String
      self.tableArn.filter(_.nonEmpty).foreach(v => result.tableArn(v))           // String, case String
      self.tableSizeBytes.map(_.longValue).foreach(v => result.tableSizeBytes(v)) // Long, case Long
      self.keySchema.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, KeySchemaElementOps._; result.keySchema(v.map(_.toJava).asJava)
      } // Seq[KeySchemaElement], case Seq[_], UserDefined
      self.tableCreationDateTime.foreach(v => result.tableCreationDateTime(v)) // Instant, case java.time.Instant
      self.provisionedThroughput.foreach { v =>
        result.provisionedThroughput(v.toJava)
      } // ProvisionedThroughput, case Other
      self.itemCount.map(_.longValue).foreach(v => result.itemCount(v)) // Long, case Long
      self.billingMode.foreach { v =>
        import BillingModeOps._; result.billingMode(v.toJava)
      } // String, case Other

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
        }) // Seq[KeySchemaElement], Seq-6
        .withTableCreationDateTime(Option(self.tableCreationDateTime)) // Instant, Map-11
        .withProvisionedThroughput(Option(self.provisionedThroughput).map { v =>
          v.toScala
        }) // ProvisionedThroughput, Map-12
        .withItemCount(Option(self.itemCount).map(_.longValue)) // Long
        .withBillingMode(Option(self.billingMode).map { v =>
          import BillingModeOps._; v.toScala
        }) // String, Map-12
    }

  }

}

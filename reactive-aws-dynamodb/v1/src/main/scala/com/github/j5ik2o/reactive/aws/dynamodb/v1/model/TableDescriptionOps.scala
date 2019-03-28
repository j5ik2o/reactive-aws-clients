// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TableDescription => ScalaTableDescription, _ }
import com.amazonaws.services.dynamodbv2.model.{ TableDescription => JavaTableDescription }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object TableDescriptionOps {

  implicit class ScalaTableDescriptionOps(val self: ScalaTableDescription) extends AnyVal {

    def toJava: JavaTableDescription = {
      val result = new JavaTableDescription()
      self.attributeDefinitions.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeDefinitionOps._;
        result.withAttributeDefinitions(v.map(_.toJava).asJava)
      } // Seq[AttributeDefinition]
      self.tableName.filter(_.nonEmpty).foreach(v => result.withTableName(v)) // String
      self.keySchema.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, KeySchemaElementOps._; result.withKeySchema(v.map(_.toJava).asJava)
      } // Seq[KeySchemaElement]
      self.tableStatus.foreach { v =>
        import TableStatusOps._; result.withTableStatus(v.toJava)
      } // String
      self.creationDateTime.map(java.util.Date.from).foreach(v => result.withCreationDateTime(v)) // Instant
      self.provisionedThroughput.foreach { v =>
        import ProvisionedThroughputDescriptionOps._; result.withProvisionedThroughput(v.toJava)
      } // ProvisionedThroughputDescription
      self.tableSizeBytes.map(_.longValue).foreach(v => result.withTableSizeBytes(v)) // Long
      self.itemCount.map(_.longValue).foreach(v => result.withItemCount(v))           // Long
      self.tableArn.filter(_.nonEmpty).foreach(v => result.withTableArn(v))           // String
      self.tableId.filter(_.nonEmpty).foreach(v => result.withTableId(v))             // String
      self.billingModeSummary.foreach { v =>
        import BillingModeSummaryOps._; result.withBillingModeSummary(v.toJava)
      } // BillingModeSummary
      self.localSecondaryIndexes.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, LocalSecondaryIndexDescriptionOps._;
        result.withLocalSecondaryIndexes(v.map(_.toJava).asJava)
      } // Seq[LocalSecondaryIndexDescription]
      self.globalSecondaryIndexes.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, GlobalSecondaryIndexDescriptionOps._;
        result.withGlobalSecondaryIndexes(v.map(_.toJava).asJava)
      } // Seq[GlobalSecondaryIndexDescription]
      self.streamSpecification.foreach { v =>
        import StreamSpecificationOps._; result.withStreamSpecification(v.toJava)
      } // StreamSpecification
      self.latestStreamLabel.filter(_.nonEmpty).foreach(v => result.withLatestStreamLabel(v)) // String
      self.latestStreamArn.filter(_.nonEmpty).foreach(v => result.withLatestStreamArn(v))     // String
      self.restoreSummary.foreach { v =>
        import RestoreSummaryOps._; result.withRestoreSummary(v.toJava)
      } // RestoreSummary
      self.sseDescription.foreach { v =>
        import SSEDescriptionOps._; result.withSSEDescription(v.toJava)
      } // SSEDescription

      result
    }

  }

  implicit class JavaTableDescriptionOps(val self: JavaTableDescription) extends AnyVal {

    def toScala: ScalaTableDescription = {
      ScalaTableDescription()
        .withAttributeDefinitions(Option(self.getAttributeDefinitions).map { v =>
          import scala.collection.JavaConverters._, AttributeDefinitionOps._; v.asScala.map(_.toScala)
        }) // Seq[AttributeDefinition]
        .withTableName(Option(self.getTableName)) // String
        .withKeySchema(Option(self.getKeySchema).map { v =>
          import scala.collection.JavaConverters._, KeySchemaElementOps._; v.asScala.map(_.toScala)
        }) // Seq[KeySchemaElement]
        .withTableStatus(Option(self.getTableStatus).map { v =>
          import TableStatusOps._; v.toScala
        }) // String
        .withCreationDateTime(Option(self.getCreationDateTime).map(_.toInstant)) // Instant
        .withProvisionedThroughput(Option(self.getProvisionedThroughput).map { v =>
          import ProvisionedThroughputDescriptionOps._; v.toScala
        }) // ProvisionedThroughputDescription
        .withTableSizeBytes(Option(self.getTableSizeBytes).map(_.longValue)) // Long
        .withItemCount(Option(self.getItemCount).map(_.longValue)) // Long
        .withTableArn(Option(self.getTableArn)) // String
        .withTableId(Option(self.getTableId)) // String
        .withBillingModeSummary(Option(self.getBillingModeSummary).map { v =>
          import BillingModeSummaryOps._; v.toScala
        }) // BillingModeSummary
        .withLocalSecondaryIndexes(Option(self.getLocalSecondaryIndexes).map { v =>
          import scala.collection.JavaConverters._, LocalSecondaryIndexDescriptionOps._; v.asScala.map(_.toScala)
        }) // Seq[LocalSecondaryIndexDescription]
        .withGlobalSecondaryIndexes(Option(self.getGlobalSecondaryIndexes).map { v =>
          import scala.collection.JavaConverters._, GlobalSecondaryIndexDescriptionOps._; v.asScala.map(_.toScala)
        }) // Seq[GlobalSecondaryIndexDescription]
        .withStreamSpecification(Option(self.getStreamSpecification).map { v =>
          import StreamSpecificationOps._; v.toScala
        }) // StreamSpecification
        .withLatestStreamLabel(Option(self.getLatestStreamLabel)) // String
        .withLatestStreamArn(Option(self.getLatestStreamArn)) // String
        .withRestoreSummary(Option(self.getRestoreSummary).map { v =>
          import RestoreSummaryOps._; v.toScala
        }) // RestoreSummary
        .withSseDescription(Option(self.getSSEDescription).map { v =>
          import SSEDescriptionOps._; v.toScala
        }) // SSEDescription
    }

  }

}

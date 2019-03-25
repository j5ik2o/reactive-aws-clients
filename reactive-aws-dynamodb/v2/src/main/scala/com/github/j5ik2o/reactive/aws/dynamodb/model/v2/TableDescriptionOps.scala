package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TableDescription => ScalaTableDescription, _ }
import software.amazon.awssdk.services.dynamodb.model.{ TableDescription => JavaTableDescription }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object TableDescriptionOps {

  implicit class ScalaTableDescriptionOps(val self: ScalaTableDescription) extends AnyVal {

    def toJava: JavaTableDescription = {
      val result = JavaTableDescription.builder()
      self.attributeDefinitions.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeDefinitionOps._;
        result.attributeDefinitions(v.map(_.toJava).asJava)
      } // Seq[AttributeDefinition]
      self.tableName.filter(_.nonEmpty).foreach(v => result.tableName(v)) // String, case String
      self.keySchema.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, KeySchemaElementOps._; result.keySchema(v.map(_.toJava).asJava)
      } // Seq[KeySchemaElement]
      self.tableStatus.foreach { v =>
        import TableStatusOps._; result.tableStatus(v.toJava)
      } // String
      self.creationDateTime.foreach(v => result.creationDateTime(v)) // Instant
      self.provisionedThroughput.foreach { v =>
        import ProvisionedThroughputDescriptionOps._; result.provisionedThroughput(v.toJava)
      } // ProvisionedThroughputDescription
      self.tableSizeBytes.map(_.longValue).foreach(v => result.tableSizeBytes(v)) // Long, case Long
      self.itemCount.map(_.longValue).foreach(v => result.itemCount(v))           // Long, case Long
      self.tableArn.filter(_.nonEmpty).foreach(v => result.tableArn(v))           // String, case String
      self.tableId.filter(_.nonEmpty).foreach(v => result.tableId(v))             // String, case String
      self.billingModeSummary.foreach { v =>
        import BillingModeSummaryOps._; result.billingModeSummary(v.toJava)
      } // BillingModeSummary
      self.localSecondaryIndexes.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, LocalSecondaryIndexDescriptionOps._;
        result.localSecondaryIndexes(v.map(_.toJava).asJava)
      } // Seq[LocalSecondaryIndexDescription]
      self.globalSecondaryIndexes.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, GlobalSecondaryIndexDescriptionOps._;
        result.globalSecondaryIndexes(v.map(_.toJava).asJava)
      } // Seq[GlobalSecondaryIndexDescription]
      self.streamSpecification.foreach { v =>
        import StreamSpecificationOps._; result.streamSpecification(v.toJava)
      } // StreamSpecification
      self.latestStreamLabel.filter(_.nonEmpty).foreach(v => result.latestStreamLabel(v)) // String, case String
      self.latestStreamArn.filter(_.nonEmpty).foreach(v => result.latestStreamArn(v))     // String, case String
      self.restoreSummary.foreach { v =>
        import RestoreSummaryOps._; result.restoreSummary(v.toJava)
      } // RestoreSummary
      self.sseDescription.foreach { v =>
        import SSEDescriptionOps._; result.sseDescription(v.toJava)
      } // SSEDescription

      result.build()
    }

  }

  implicit class JavaTableDescriptionOps(val self: JavaTableDescription) extends AnyVal {

    def toScala: ScalaTableDescription = {
      ScalaTableDescription()
        .withAttributeDefinitions(Option(self.attributeDefinitions).map { v =>
          import scala.collection.JavaConverters._, AttributeDefinitionOps._; v.asScala.map(_.toScala)
        }) // Seq[AttributeDefinition]
        .withTableName(Option(self.tableName)) // String
        .withKeySchema(Option(self.keySchema).map { v =>
          import scala.collection.JavaConverters._, KeySchemaElementOps._; v.asScala.map(_.toScala)
        }) // Seq[KeySchemaElement]
        .withTableStatus(Option(self.tableStatus).map { v =>
          import TableStatusOps._; v.toScala
        }) // String
        .withCreationDateTime(Option(self.creationDateTime)) // Instant
        .withProvisionedThroughput(Option(self.provisionedThroughput).map { v =>
          import ProvisionedThroughputDescriptionOps._; v.toScala
        }) // ProvisionedThroughputDescription
        .withTableSizeBytes(Option(self.tableSizeBytes).map(_.longValue)) // Long
        .withItemCount(Option(self.itemCount).map(_.longValue)) // Long
        .withTableArn(Option(self.tableArn)) // String
        .withTableId(Option(self.tableId)) // String
        .withBillingModeSummary(Option(self.billingModeSummary).map { v =>
          import BillingModeSummaryOps._; v.toScala
        }) // BillingModeSummary
        .withLocalSecondaryIndexes(Option(self.localSecondaryIndexes).map { v =>
          import scala.collection.JavaConverters._, LocalSecondaryIndexDescriptionOps._; v.asScala.map(_.toScala)
        }) // Seq[LocalSecondaryIndexDescription]
        .withGlobalSecondaryIndexes(Option(self.globalSecondaryIndexes).map { v =>
          import scala.collection.JavaConverters._, GlobalSecondaryIndexDescriptionOps._; v.asScala.map(_.toScala)
        }) // Seq[GlobalSecondaryIndexDescription]
        .withStreamSpecification(Option(self.streamSpecification).map { v =>
          import StreamSpecificationOps._; v.toScala
        }) // StreamSpecification
        .withLatestStreamLabel(Option(self.latestStreamLabel)) // String
        .withLatestStreamArn(Option(self.latestStreamArn)) // String
        .withRestoreSummary(Option(self.restoreSummary).map { v =>
          import RestoreSummaryOps._; v.toScala
        }) // RestoreSummary
        .withSseDescription(Option(self.sseDescription).map { v =>
          import SSEDescriptionOps._; v.toScala
        }) // SSEDescription
    }

  }

}

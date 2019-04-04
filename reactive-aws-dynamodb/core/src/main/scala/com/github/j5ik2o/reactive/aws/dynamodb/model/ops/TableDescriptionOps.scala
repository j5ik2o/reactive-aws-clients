// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class TableDescriptionBuilderOps(val self: TableDescription.Builder) extends AnyVal {

  final def withAttributeDefinitionsAsScala(value: Option[Seq[AttributeDefinition]]): TableDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributeDefinitions(v.asJava)
    } // Seq[AttributeDefinition]
  }

  final def withTableNameAsScala(value: Option[String]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  } // String

  final def withKeySchemaAsScala(value: Option[Seq[KeySchemaElement]]): TableDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.keySchema(v.asJava)
    } // Seq[KeySchemaElement]
  }

  final def withTableStatusAsScala(value: Option[TableStatus]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.tableStatus(v)
    }
  } // String

  final def withCreationDateTimeAsScala(value: Option[java.time.Instant]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.creationDateTime(v)
    }
  } // Instant

  final def withProvisionedThroughputAsScala(
      value: Option[ProvisionedThroughputDescription]
  ): TableDescription.Builder = {
    value.fold(self) { v =>
      self.provisionedThroughput(v)
    }
  } // ProvisionedThroughputDescription

  final def withTableSizeBytesAsScala(value: Option[Long]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.tableSizeBytes(v)
    }
  } // Long

  final def withItemCountAsScala(value: Option[Long]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.itemCount(v)
    }
  } // Long

  final def withTableArnAsScala(value: Option[String]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.tableArn(v)
    }
  } // String

  final def withTableIdAsScala(value: Option[String]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.tableId(v)
    }
  } // String

  final def withBillingModeSummaryAsScala(value: Option[BillingModeSummary]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.billingModeSummary(v)
    }
  } // BillingModeSummary

  final def withLocalSecondaryIndexesAsScala(
      value: Option[Seq[LocalSecondaryIndexDescription]]
  ): TableDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.localSecondaryIndexes(v.asJava)
    } // Seq[LocalSecondaryIndexDescription]
  }

  final def withGlobalSecondaryIndexesAsScala(
      value: Option[Seq[GlobalSecondaryIndexDescription]]
  ): TableDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.globalSecondaryIndexes(v.asJava)
    } // Seq[GlobalSecondaryIndexDescription]
  }

  final def withStreamSpecificationAsScala(value: Option[StreamSpecification]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.streamSpecification(v)
    }
  } // StreamSpecification

  final def withLatestStreamLabelAsScala(value: Option[String]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.latestStreamLabel(v)
    }
  } // String

  final def withLatestStreamArnAsScala(value: Option[String]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.latestStreamArn(v)
    }
  } // String

  final def withRestoreSummaryAsScala(value: Option[RestoreSummary]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.restoreSummary(v)
    }
  } // RestoreSummary

  final def withSseDescriptionAsScala(value: Option[SSEDescription]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.sseDescription(v)
    }
  } // SSEDescription

}

final class TableDescriptionOps(val self: TableDescription) extends AnyVal {

  final def attributeDefinitionsAsScala: Option[Seq[AttributeDefinition]] = Option(self.attributeDefinitions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[AttributeDefinition]

  final def tableNameAsScala: Option[String] = Option(self.tableName) // String

  final def keySchemaAsScala: Option[Seq[KeySchemaElement]] = Option(self.keySchema).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[KeySchemaElement]

  final def tableStatusAsScala: Option[TableStatus] = Option(self.tableStatus) // String

  final def creationDateTimeAsScala: Option[java.time.Instant] = Option(self.creationDateTime) // Instant

  final def provisionedThroughputAsScala: Option[ProvisionedThroughputDescription] =
    Option(self.provisionedThroughput) // ProvisionedThroughputDescription

  final def tableSizeBytesAsScala: Option[Long] = Option(self.tableSizeBytes) // Long

  final def itemCountAsScala: Option[Long] = Option(self.itemCount) // Long

  final def tableArnAsScala: Option[String] = Option(self.tableArn) // String

  final def tableIdAsScala: Option[String] = Option(self.tableId) // String

  final def billingModeSummaryAsScala: Option[BillingModeSummary] =
    Option(self.billingModeSummary) // BillingModeSummary

  final def localSecondaryIndexesAsScala: Option[Seq[LocalSecondaryIndexDescription]] =
    Option(self.localSecondaryIndexes).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    } // Seq[LocalSecondaryIndexDescription]

  final def globalSecondaryIndexesAsScala: Option[Seq[GlobalSecondaryIndexDescription]] =
    Option(self.globalSecondaryIndexes).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    } // Seq[GlobalSecondaryIndexDescription]

  final def streamSpecificationAsScala: Option[StreamSpecification] =
    Option(self.streamSpecification) // StreamSpecification

  final def latestStreamLabelAsScala: Option[String] = Option(self.latestStreamLabel) // String

  final def latestStreamArnAsScala: Option[String] = Option(self.latestStreamArn) // String

  final def restoreSummaryAsScala: Option[RestoreSummary] = Option(self.restoreSummary) // RestoreSummary

  final def sseDescriptionAsScala: Option[SSEDescription] = Option(self.sseDescription) // SSEDescription

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTableDescriptionOps {

  implicit def toTableDescriptionBuilderOps(v: TableDescription.Builder): TableDescriptionBuilderOps =
    new TableDescriptionBuilderOps(v)

  implicit def toTableDescriptionOps(v: TableDescription): TableDescriptionOps = new TableDescriptionOps(v)

}

// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class TableDescriptionBuilderOps(val self: TableDescription.Builder) extends AnyVal {

  final def attributeDefinitionsAsScala(value: Option[Seq[AttributeDefinition]]): TableDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributeDefinitions(v.asJava)
    } // Seq[AttributeDefinition]
  }

  final def tableNameAsScala(value: Option[String]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  } // String

  final def keySchemaAsScala(value: Option[Seq[KeySchemaElement]]): TableDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.keySchema(v.asJava)
    } // Seq[KeySchemaElement]
  }

  final def tableStatusAsScala(value: Option[TableStatus]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.tableStatus(v)
    }
  } // TableStatus

  final def creationDateTimeAsScala(value: Option[java.time.Instant]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.creationDateTime(v)
    }
  } // java.time.Instant

  final def provisionedThroughputAsScala(value: Option[ProvisionedThroughputDescription]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.provisionedThroughput(v)
    }
  } // ProvisionedThroughputDescription

  final def tableSizeBytesAsScala(value: Option[Long]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.tableSizeBytes(v)
    }
  } // Long

  final def itemCountAsScala(value: Option[Long]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.itemCount(v)
    }
  } // Long

  final def tableArnAsScala(value: Option[String]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.tableArn(v)
    }
  } // String

  final def tableIdAsScala(value: Option[String]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.tableId(v)
    }
  } // String

  final def billingModeSummaryAsScala(value: Option[BillingModeSummary]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.billingModeSummary(v)
    }
  } // BillingModeSummary

  final def localSecondaryIndexesAsScala(
      value: Option[Seq[LocalSecondaryIndexDescription]]
  ): TableDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.localSecondaryIndexes(v.asJava)
    } // Seq[LocalSecondaryIndexDescription]
  }

  final def globalSecondaryIndexesAsScala(
      value: Option[Seq[GlobalSecondaryIndexDescription]]
  ): TableDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.globalSecondaryIndexes(v.asJava)
    } // Seq[GlobalSecondaryIndexDescription]
  }

  final def streamSpecificationAsScala(value: Option[StreamSpecification]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.streamSpecification(v)
    }
  } // StreamSpecification

  final def latestStreamLabelAsScala(value: Option[String]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.latestStreamLabel(v)
    }
  } // String

  final def latestStreamArnAsScala(value: Option[String]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.latestStreamArn(v)
    }
  } // String

  final def restoreSummaryAsScala(value: Option[RestoreSummary]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.restoreSummary(v)
    }
  } // RestoreSummary

  final def sseDescriptionAsScala(value: Option[SSEDescription]): TableDescription.Builder = {
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

  final def tableStatusAsScala: Option[TableStatus] = Option(self.tableStatus) // TableStatus

  final def creationDateTimeAsScala: Option[java.time.Instant] = Option(self.creationDateTime) // java.time.Instant

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

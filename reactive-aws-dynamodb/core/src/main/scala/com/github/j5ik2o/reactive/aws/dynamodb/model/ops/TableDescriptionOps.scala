// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class TableDescriptionBuilderOps(val self: TableDescription.Builder) extends AnyVal {

  final def attributeDefinitionsAsScala(value: Option[Seq[AttributeDefinition]]): TableDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributeDefinitions(v.asJava)
    }
  }

  final def tableNameAsScala(value: Option[String]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  }

  final def keySchemaAsScala(value: Option[Seq[KeySchemaElement]]): TableDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.keySchema(v.asJava)
    }
  }

  final def tableStatusAsScala(value: Option[TableStatus]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.tableStatus(v)
    }
  }

  final def creationDateTimeAsScala(value: Option[java.time.Instant]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.creationDateTime(v)
    }
  }

  final def provisionedThroughputAsScala(value: Option[ProvisionedThroughputDescription]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.provisionedThroughput(v)
    }
  }

  final def tableSizeBytesAsScala(value: Option[Long]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.tableSizeBytes(v)
    }
  }

  final def itemCountAsScala(value: Option[Long]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.itemCount(v)
    }
  }

  final def tableArnAsScala(value: Option[String]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.tableArn(v)
    }
  }

  final def tableIdAsScala(value: Option[String]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.tableId(v)
    }
  }

  final def billingModeSummaryAsScala(value: Option[BillingModeSummary]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.billingModeSummary(v)
    }
  }

  final def localSecondaryIndexesAsScala(
      value: Option[Seq[LocalSecondaryIndexDescription]]
  ): TableDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.localSecondaryIndexes(v.asJava)
    }
  }

  final def globalSecondaryIndexesAsScala(
      value: Option[Seq[GlobalSecondaryIndexDescription]]
  ): TableDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.globalSecondaryIndexes(v.asJava)
    }
  }

  final def streamSpecificationAsScala(value: Option[StreamSpecification]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.streamSpecification(v)
    }
  }

  final def latestStreamLabelAsScala(value: Option[String]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.latestStreamLabel(v)
    }
  }

  final def latestStreamArnAsScala(value: Option[String]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.latestStreamArn(v)
    }
  }

  final def restoreSummaryAsScala(value: Option[RestoreSummary]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.restoreSummary(v)
    }
  }

  final def sseDescriptionAsScala(value: Option[SSEDescription]): TableDescription.Builder = {
    value.fold(self) { v =>
      self.sseDescription(v)
    }
  }

}

final class TableDescriptionOps(val self: TableDescription) extends AnyVal {

  final def attributeDefinitionsAsScala: Option[Seq[AttributeDefinition]] = Option(self.attributeDefinitions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def tableNameAsScala: Option[String] = Option(self.tableName)

  final def keySchemaAsScala: Option[Seq[KeySchemaElement]] = Option(self.keySchema).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def tableStatusAsScala: Option[TableStatus] = Option(self.tableStatus)

  final def creationDateTimeAsScala: Option[java.time.Instant] = Option(self.creationDateTime)

  final def provisionedThroughputAsScala: Option[ProvisionedThroughputDescription] = Option(self.provisionedThroughput)

  final def tableSizeBytesAsScala: Option[Long] = Option(self.tableSizeBytes)

  final def itemCountAsScala: Option[Long] = Option(self.itemCount)

  final def tableArnAsScala: Option[String] = Option(self.tableArn)

  final def tableIdAsScala: Option[String] = Option(self.tableId)

  final def billingModeSummaryAsScala: Option[BillingModeSummary] = Option(self.billingModeSummary)

  final def localSecondaryIndexesAsScala: Option[Seq[LocalSecondaryIndexDescription]] =
    Option(self.localSecondaryIndexes).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def globalSecondaryIndexesAsScala: Option[Seq[GlobalSecondaryIndexDescription]] =
    Option(self.globalSecondaryIndexes).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def streamSpecificationAsScala: Option[StreamSpecification] = Option(self.streamSpecification)

  final def latestStreamLabelAsScala: Option[String] = Option(self.latestStreamLabel)

  final def latestStreamArnAsScala: Option[String] = Option(self.latestStreamArn)

  final def restoreSummaryAsScala: Option[RestoreSummary] = Option(self.restoreSummary)

  final def sseDescriptionAsScala: Option[SSEDescription] = Option(self.sseDescription)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTableDescriptionOps {

  implicit def toTableDescriptionBuilderOps(v: TableDescription.Builder): TableDescriptionBuilderOps =
    new TableDescriptionBuilderOps(v)

  implicit def toTableDescriptionOps(v: TableDescription): TableDescriptionOps = new TableDescriptionOps(v)

}

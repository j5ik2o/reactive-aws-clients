// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class SourceTableDetailsBuilderOps(val self: SourceTableDetails.Builder) extends AnyVal {

  final def tableNameAsScala(value: Option[String]): SourceTableDetails.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  } // String

  final def tableIdAsScala(value: Option[String]): SourceTableDetails.Builder = {
    value.fold(self) { v =>
      self.tableId(v)
    }
  } // String

  final def tableArnAsScala(value: Option[String]): SourceTableDetails.Builder = {
    value.fold(self) { v =>
      self.tableArn(v)
    }
  } // String

  final def tableSizeBytesAsScala(value: Option[Long]): SourceTableDetails.Builder = {
    value.fold(self) { v =>
      self.tableSizeBytes(v)
    }
  } // Long

  final def keySchemaAsScala(value: Option[Seq[KeySchemaElement]]): SourceTableDetails.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.keySchema(v.asJava)
    } // Seq[KeySchemaElement]
  }

  final def tableCreationDateTimeAsScala(value: Option[java.time.Instant]): SourceTableDetails.Builder = {
    value.fold(self) { v =>
      self.tableCreationDateTime(v)
    }
  } // Instant

  final def provisionedThroughputAsScala(value: Option[ProvisionedThroughput]): SourceTableDetails.Builder = {
    value.fold(self) { v =>
      self.provisionedThroughput(v)
    }
  } // ProvisionedThroughput

  final def itemCountAsScala(value: Option[Long]): SourceTableDetails.Builder = {
    value.fold(self) { v =>
      self.itemCount(v)
    }
  } // Long

  final def billingModeAsScala(value: Option[BillingMode]): SourceTableDetails.Builder = {
    value.fold(self) { v =>
      self.billingMode(v)
    }
  } // String

}

final class SourceTableDetailsOps(val self: SourceTableDetails) extends AnyVal {

  final def tableNameAsScala: Option[String] = Option(self.tableName) // String

  final def tableIdAsScala: Option[String] = Option(self.tableId) // String

  final def tableArnAsScala: Option[String] = Option(self.tableArn) // String

  final def tableSizeBytesAsScala: Option[Long] = Option(self.tableSizeBytes) // Long

  final def keySchemaAsScala: Option[Seq[KeySchemaElement]] = Option(self.keySchema).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[KeySchemaElement]

  final def tableCreationDateTimeAsScala: Option[java.time.Instant] = Option(self.tableCreationDateTime) // Instant

  final def provisionedThroughputAsScala: Option[ProvisionedThroughput] =
    Option(self.provisionedThroughput) // ProvisionedThroughput

  final def itemCountAsScala: Option[Long] = Option(self.itemCount) // Long

  final def billingModeAsScala: Option[BillingMode] = Option(self.billingMode) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSourceTableDetailsOps {

  implicit def toSourceTableDetailsBuilderOps(v: SourceTableDetails.Builder): SourceTableDetailsBuilderOps =
    new SourceTableDetailsBuilderOps(v)

  implicit def toSourceTableDetailsOps(v: SourceTableDetails): SourceTableDetailsOps = new SourceTableDetailsOps(v)

}

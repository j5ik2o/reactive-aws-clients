// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class SourceTableDetailsBuilderOps(val self: SourceTableDetails.Builder) extends AnyVal {

  final def tableNameAsScala(value: Option[String]): SourceTableDetails.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  }

  final def tableIdAsScala(value: Option[String]): SourceTableDetails.Builder = {
    value.fold(self) { v =>
      self.tableId(v)
    }
  }

  final def tableArnAsScala(value: Option[String]): SourceTableDetails.Builder = {
    value.fold(self) { v =>
      self.tableArn(v)
    }
  }

  final def tableSizeBytesAsScala(value: Option[Long]): SourceTableDetails.Builder = {
    value.fold(self) { v =>
      self.tableSizeBytes(v)
    }
  }

  final def keySchemaAsScala(value: Option[Seq[KeySchemaElement]]): SourceTableDetails.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.keySchema(v.asJava)
    }
  }

  final def tableCreationDateTimeAsScala(value: Option[java.time.Instant]): SourceTableDetails.Builder = {
    value.fold(self) { v =>
      self.tableCreationDateTime(v)
    }
  }

  final def provisionedThroughputAsScala(value: Option[ProvisionedThroughput]): SourceTableDetails.Builder = {
    value.fold(self) { v =>
      self.provisionedThroughput(v)
    }
  }

  final def itemCountAsScala(value: Option[Long]): SourceTableDetails.Builder = {
    value.fold(self) { v =>
      self.itemCount(v)
    }
  }

  final def billingModeAsScala(value: Option[BillingMode]): SourceTableDetails.Builder = {
    value.fold(self) { v =>
      self.billingMode(v)
    }
  }

}

final class SourceTableDetailsOps(val self: SourceTableDetails) extends AnyVal {

  final def tableNameAsScala: Option[String] = Option(self.tableName)

  final def tableIdAsScala: Option[String] = Option(self.tableId)

  final def tableArnAsScala: Option[String] = Option(self.tableArn)

  final def tableSizeBytesAsScala: Option[Long] = Option(self.tableSizeBytes)

  final def keySchemaAsScala: Option[Seq[KeySchemaElement]] = Option(self.keySchema).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def tableCreationDateTimeAsScala: Option[java.time.Instant] = Option(self.tableCreationDateTime)

  final def provisionedThroughputAsScala: Option[ProvisionedThroughput] = Option(self.provisionedThroughput)

  final def itemCountAsScala: Option[Long] = Option(self.itemCount)

  final def billingModeAsScala: Option[BillingMode] = Option(self.billingMode)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSourceTableDetailsOps {

  implicit def toSourceTableDetailsBuilderOps(v: SourceTableDetails.Builder): SourceTableDetailsBuilderOps =
    new SourceTableDetailsBuilderOps(v)

  implicit def toSourceTableDetailsOps(v: SourceTableDetails): SourceTableDetailsOps = new SourceTableDetailsOps(v)

}

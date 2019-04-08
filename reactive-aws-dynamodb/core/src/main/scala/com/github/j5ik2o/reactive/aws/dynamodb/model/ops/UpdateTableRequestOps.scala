// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class UpdateTableRequestBuilderOps(val self: UpdateTableRequest.Builder) extends AnyVal {

  final def attributeDefinitionsAsScala(value: Option[Seq[AttributeDefinition]]): UpdateTableRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributeDefinitions(v.asJava)
    } // Seq[AttributeDefinition]
  }

  final def tableNameAsScala(value: Option[String]): UpdateTableRequest.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  } // String

  final def billingModeAsScala(value: Option[BillingMode]): UpdateTableRequest.Builder = {
    value.fold(self) { v =>
      self.billingMode(v)
    }
  } // BillingMode

  final def provisionedThroughputAsScala(value: Option[ProvisionedThroughput]): UpdateTableRequest.Builder = {
    value.fold(self) { v =>
      self.provisionedThroughput(v)
    }
  } // ProvisionedThroughput

  final def globalSecondaryIndexUpdatesAsScala(
      value: Option[Seq[GlobalSecondaryIndexUpdate]]
  ): UpdateTableRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.globalSecondaryIndexUpdates(v.asJava)
    } // Seq[GlobalSecondaryIndexUpdate]
  }

  final def streamSpecificationAsScala(value: Option[StreamSpecification]): UpdateTableRequest.Builder = {
    value.fold(self) { v =>
      self.streamSpecification(v)
    }
  } // StreamSpecification

  final def sseSpecificationAsScala(value: Option[SSESpecification]): UpdateTableRequest.Builder = {
    value.fold(self) { v =>
      self.sseSpecification(v)
    }
  } // SSESpecification

}

final class UpdateTableRequestOps(val self: UpdateTableRequest) extends AnyVal {

  final def attributeDefinitionsAsScala: Option[Seq[AttributeDefinition]] = Option(self.attributeDefinitions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[AttributeDefinition]

  final def tableNameAsScala: Option[String] = Option(self.tableName) // String

  final def billingModeAsScala: Option[BillingMode] = Option(self.billingMode) // BillingMode

  final def provisionedThroughputAsScala: Option[ProvisionedThroughput] =
    Option(self.provisionedThroughput) // ProvisionedThroughput

  final def globalSecondaryIndexUpdatesAsScala: Option[Seq[GlobalSecondaryIndexUpdate]] =
    Option(self.globalSecondaryIndexUpdates).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    } // Seq[GlobalSecondaryIndexUpdate]

  final def streamSpecificationAsScala: Option[StreamSpecification] =
    Option(self.streamSpecification) // StreamSpecification

  final def sseSpecificationAsScala: Option[SSESpecification] = Option(self.sseSpecification) // SSESpecification

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateTableRequestOps {

  implicit def toUpdateTableRequestBuilderOps(v: UpdateTableRequest.Builder): UpdateTableRequestBuilderOps =
    new UpdateTableRequestBuilderOps(v)

  implicit def toUpdateTableRequestOps(v: UpdateTableRequest): UpdateTableRequestOps = new UpdateTableRequestOps(v)

}

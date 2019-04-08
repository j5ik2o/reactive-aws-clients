// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class UpdateTableRequestBuilderOps(val self: UpdateTableRequest.Builder) extends AnyVal {

  final def attributeDefinitionsAsScala(value: Option[Seq[AttributeDefinition]]): UpdateTableRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributeDefinitions(v.asJava)
    }
  }

  final def tableNameAsScala(value: Option[String]): UpdateTableRequest.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  }

  final def billingModeAsScala(value: Option[BillingMode]): UpdateTableRequest.Builder = {
    value.fold(self) { v =>
      self.billingMode(v)
    }
  }

  final def provisionedThroughputAsScala(value: Option[ProvisionedThroughput]): UpdateTableRequest.Builder = {
    value.fold(self) { v =>
      self.provisionedThroughput(v)
    }
  }

  final def globalSecondaryIndexUpdatesAsScala(
      value: Option[Seq[GlobalSecondaryIndexUpdate]]
  ): UpdateTableRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.globalSecondaryIndexUpdates(v.asJava)
    }
  }

  final def streamSpecificationAsScala(value: Option[StreamSpecification]): UpdateTableRequest.Builder = {
    value.fold(self) { v =>
      self.streamSpecification(v)
    }
  }

  final def sseSpecificationAsScala(value: Option[SSESpecification]): UpdateTableRequest.Builder = {
    value.fold(self) { v =>
      self.sseSpecification(v)
    }
  }

}

final class UpdateTableRequestOps(val self: UpdateTableRequest) extends AnyVal {

  final def attributeDefinitionsAsScala: Option[Seq[AttributeDefinition]] = Option(self.attributeDefinitions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def tableNameAsScala: Option[String] = Option(self.tableName)

  final def billingModeAsScala: Option[BillingMode] = Option(self.billingMode)

  final def provisionedThroughputAsScala: Option[ProvisionedThroughput] = Option(self.provisionedThroughput)

  final def globalSecondaryIndexUpdatesAsScala: Option[Seq[GlobalSecondaryIndexUpdate]] =
    Option(self.globalSecondaryIndexUpdates).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def streamSpecificationAsScala: Option[StreamSpecification] = Option(self.streamSpecification)

  final def sseSpecificationAsScala: Option[SSESpecification] = Option(self.sseSpecification)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateTableRequestOps {

  implicit def toUpdateTableRequestBuilderOps(v: UpdateTableRequest.Builder): UpdateTableRequestBuilderOps =
    new UpdateTableRequestBuilderOps(v)

  implicit def toUpdateTableRequestOps(v: UpdateTableRequest): UpdateTableRequestOps = new UpdateTableRequestOps(v)

}

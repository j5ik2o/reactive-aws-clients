// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class CreateTableRequestBuilderOps(val self: CreateTableRequest.Builder) extends AnyVal {

  final def withAttributeDefinitionsAsScala(value: Option[Seq[AttributeDefinition]]): CreateTableRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributeDefinitions(v.asJava)
    } // Seq[AttributeDefinition]
  }

  final def withTableNameAsScala(value: Option[String]): CreateTableRequest.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  } // String

  final def withKeySchemaAsScala(value: Option[Seq[KeySchemaElement]]): CreateTableRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.keySchema(v.asJava)
    } // Seq[KeySchemaElement]
  }

  final def withLocalSecondaryIndexesAsScala(value: Option[Seq[LocalSecondaryIndex]]): CreateTableRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.localSecondaryIndexes(v.asJava)
    } // Seq[LocalSecondaryIndex]
  }

  final def withGlobalSecondaryIndexesAsScala(value: Option[Seq[GlobalSecondaryIndex]]): CreateTableRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.globalSecondaryIndexes(v.asJava)
    } // Seq[GlobalSecondaryIndex]
  }

  final def withBillingModeAsScala(value: Option[BillingMode]): CreateTableRequest.Builder = {
    value.fold(self) { v =>
      self.billingMode(v)
    }
  } // String

  final def withProvisionedThroughputAsScala(value: Option[ProvisionedThroughput]): CreateTableRequest.Builder = {
    value.fold(self) { v =>
      self.provisionedThroughput(v)
    }
  } // ProvisionedThroughput

  final def withStreamSpecificationAsScala(value: Option[StreamSpecification]): CreateTableRequest.Builder = {
    value.fold(self) { v =>
      self.streamSpecification(v)
    }
  } // StreamSpecification

  final def withSseSpecificationAsScala(value: Option[SSESpecification]): CreateTableRequest.Builder = {
    value.fold(self) { v =>
      self.sseSpecification(v)
    }
  } // SSESpecification

}

final class CreateTableRequestOps(val self: CreateTableRequest) extends AnyVal {

  final def attributeDefinitionsAsScala: Option[Seq[AttributeDefinition]] = Option(self.attributeDefinitions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[AttributeDefinition]

  final def tableNameAsScala: Option[String] = Option(self.tableName) // String

  final def keySchemaAsScala: Option[Seq[KeySchemaElement]] = Option(self.keySchema).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[KeySchemaElement]

  final def localSecondaryIndexesAsScala: Option[Seq[LocalSecondaryIndex]] = Option(self.localSecondaryIndexes).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala
  } // Seq[LocalSecondaryIndex]

  final def globalSecondaryIndexesAsScala: Option[Seq[GlobalSecondaryIndex]] = Option(self.globalSecondaryIndexes).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala
  } // Seq[GlobalSecondaryIndex]

  final def billingModeAsScala: Option[BillingMode] = Option(self.billingMode) // String

  final def provisionedThroughputAsScala: Option[ProvisionedThroughput] =
    Option(self.provisionedThroughput) // ProvisionedThroughput

  final def streamSpecificationAsScala: Option[StreamSpecification] =
    Option(self.streamSpecification) // StreamSpecification

  final def sseSpecificationAsScala: Option[SSESpecification] = Option(self.sseSpecification) // SSESpecification

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateTableRequestOps {

  implicit def toCreateTableRequestBuilderOps(v: CreateTableRequest.Builder): CreateTableRequestBuilderOps =
    new CreateTableRequestBuilderOps(v)

  implicit def toCreateTableRequestOps(v: CreateTableRequest): CreateTableRequestOps = new CreateTableRequestOps(v)

}

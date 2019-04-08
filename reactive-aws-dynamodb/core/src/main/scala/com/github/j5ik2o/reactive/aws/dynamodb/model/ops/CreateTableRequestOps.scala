// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class CreateTableRequestBuilderOps(val self: CreateTableRequest.Builder) extends AnyVal {

  final def attributeDefinitionsAsScala(value: Option[Seq[AttributeDefinition]]): CreateTableRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributeDefinitions(v.asJava)
    }
  }

  final def tableNameAsScala(value: Option[String]): CreateTableRequest.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  }

  final def keySchemaAsScala(value: Option[Seq[KeySchemaElement]]): CreateTableRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.keySchema(v.asJava)
    }
  }

  final def localSecondaryIndexesAsScala(value: Option[Seq[LocalSecondaryIndex]]): CreateTableRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.localSecondaryIndexes(v.asJava)
    }
  }

  final def globalSecondaryIndexesAsScala(value: Option[Seq[GlobalSecondaryIndex]]): CreateTableRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.globalSecondaryIndexes(v.asJava)
    }
  }

  final def billingModeAsScala(value: Option[BillingMode]): CreateTableRequest.Builder = {
    value.fold(self) { v =>
      self.billingMode(v)
    }
  }

  final def provisionedThroughputAsScala(value: Option[ProvisionedThroughput]): CreateTableRequest.Builder = {
    value.fold(self) { v =>
      self.provisionedThroughput(v)
    }
  }

  final def streamSpecificationAsScala(value: Option[StreamSpecification]): CreateTableRequest.Builder = {
    value.fold(self) { v =>
      self.streamSpecification(v)
    }
  }

  final def sseSpecificationAsScala(value: Option[SSESpecification]): CreateTableRequest.Builder = {
    value.fold(self) { v =>
      self.sseSpecification(v)
    }
  }

}

final class CreateTableRequestOps(val self: CreateTableRequest) extends AnyVal {

  final def attributeDefinitionsAsScala: Option[Seq[AttributeDefinition]] = Option(self.attributeDefinitions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def tableNameAsScala: Option[String] = Option(self.tableName)

  final def keySchemaAsScala: Option[Seq[KeySchemaElement]] = Option(self.keySchema).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def localSecondaryIndexesAsScala: Option[Seq[LocalSecondaryIndex]] = Option(self.localSecondaryIndexes).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala
  }

  final def globalSecondaryIndexesAsScala: Option[Seq[GlobalSecondaryIndex]] = Option(self.globalSecondaryIndexes).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala
  }

  final def billingModeAsScala: Option[BillingMode] = Option(self.billingMode)

  final def provisionedThroughputAsScala: Option[ProvisionedThroughput] = Option(self.provisionedThroughput)

  final def streamSpecificationAsScala: Option[StreamSpecification] = Option(self.streamSpecification)

  final def sseSpecificationAsScala: Option[SSESpecification] = Option(self.sseSpecification)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateTableRequestOps {

  implicit def toCreateTableRequestBuilderOps(v: CreateTableRequest.Builder): CreateTableRequestBuilderOps =
    new CreateTableRequestBuilderOps(v)

  implicit def toCreateTableRequestOps(v: CreateTableRequest): CreateTableRequestOps = new CreateTableRequestOps(v)

}

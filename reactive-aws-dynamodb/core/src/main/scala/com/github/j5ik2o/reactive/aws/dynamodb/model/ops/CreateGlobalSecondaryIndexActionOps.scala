// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class CreateGlobalSecondaryIndexActionBuilderOps(val self: CreateGlobalSecondaryIndexAction.Builder)
    extends AnyVal {

  final def withIndexNameAsScala(value: Option[String]): CreateGlobalSecondaryIndexAction.Builder = {
    value.fold(self) { v =>
      self.indexName(v)
    }
  } // String

  final def withKeySchemaAsScala(value: Option[Seq[KeySchemaElement]]): CreateGlobalSecondaryIndexAction.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.keySchema(v.asJava)
    } // Seq[KeySchemaElement]
  }

  final def withProjectionAsScala(value: Option[Projection]): CreateGlobalSecondaryIndexAction.Builder = {
    value.fold(self) { v =>
      self.projection(v)
    }
  } // Projection

  final def withProvisionedThroughputAsScala(
      value: Option[ProvisionedThroughput]
  ): CreateGlobalSecondaryIndexAction.Builder = {
    value.fold(self) { v =>
      self.provisionedThroughput(v)
    }
  } // ProvisionedThroughput

}

final class CreateGlobalSecondaryIndexActionOps(val self: CreateGlobalSecondaryIndexAction) extends AnyVal {

  final def indexNameAsScala: Option[String] = Option(self.indexName) // String

  final def keySchemaAsScala: Option[Seq[KeySchemaElement]] = Option(self.keySchema).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[KeySchemaElement]

  final def projectionAsScala: Option[Projection] = Option(self.projection) // Projection

  final def provisionedThroughputAsScala: Option[ProvisionedThroughput] =
    Option(self.provisionedThroughput) // ProvisionedThroughput

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateGlobalSecondaryIndexActionOps {

  implicit def toCreateGlobalSecondaryIndexActionBuilderOps(
      v: CreateGlobalSecondaryIndexAction.Builder
  ): CreateGlobalSecondaryIndexActionBuilderOps = new CreateGlobalSecondaryIndexActionBuilderOps(v)

  implicit def toCreateGlobalSecondaryIndexActionOps(
      v: CreateGlobalSecondaryIndexAction
  ): CreateGlobalSecondaryIndexActionOps = new CreateGlobalSecondaryIndexActionOps(v)

}

// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class CreateGlobalSecondaryIndexActionBuilderOps(val self: CreateGlobalSecondaryIndexAction.Builder)
    extends AnyVal {

  final def indexNameAsScala(value: Option[String]): CreateGlobalSecondaryIndexAction.Builder = {
    value.fold(self) { v =>
      self.indexName(v)
    }
  }

  final def keySchemaAsScala(value: Option[Seq[KeySchemaElement]]): CreateGlobalSecondaryIndexAction.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.keySchema(v.asJava)
    }
  }

  final def projectionAsScala(value: Option[Projection]): CreateGlobalSecondaryIndexAction.Builder = {
    value.fold(self) { v =>
      self.projection(v)
    }
  }

  final def provisionedThroughputAsScala(
      value: Option[ProvisionedThroughput]
  ): CreateGlobalSecondaryIndexAction.Builder = {
    value.fold(self) { v =>
      self.provisionedThroughput(v)
    }
  }

}

final class CreateGlobalSecondaryIndexActionOps(val self: CreateGlobalSecondaryIndexAction) extends AnyVal {

  final def indexNameAsScala: Option[String] = Option(self.indexName)

  final def keySchemaAsScala: Option[Seq[KeySchemaElement]] = Option(self.keySchema).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def projectionAsScala: Option[Projection] = Option(self.projection)

  final def provisionedThroughputAsScala: Option[ProvisionedThroughput] = Option(self.provisionedThroughput)

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

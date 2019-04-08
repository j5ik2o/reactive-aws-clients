// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class LocalSecondaryIndexInfoBuilderOps(val self: LocalSecondaryIndexInfo.Builder) extends AnyVal {

  final def indexNameAsScala(value: Option[String]): LocalSecondaryIndexInfo.Builder = {
    value.fold(self) { v =>
      self.indexName(v)
    }
  }

  final def keySchemaAsScala(value: Option[Seq[KeySchemaElement]]): LocalSecondaryIndexInfo.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.keySchema(v.asJava)
    }
  }

  final def projectionAsScala(value: Option[Projection]): LocalSecondaryIndexInfo.Builder = {
    value.fold(self) { v =>
      self.projection(v)
    }
  }

}

final class LocalSecondaryIndexInfoOps(val self: LocalSecondaryIndexInfo) extends AnyVal {

  final def indexNameAsScala: Option[String] = Option(self.indexName)

  final def keySchemaAsScala: Option[Seq[KeySchemaElement]] = Option(self.keySchema).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def projectionAsScala: Option[Projection] = Option(self.projection)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLocalSecondaryIndexInfoOps {

  implicit def toLocalSecondaryIndexInfoBuilderOps(
      v: LocalSecondaryIndexInfo.Builder
  ): LocalSecondaryIndexInfoBuilderOps = new LocalSecondaryIndexInfoBuilderOps(v)

  implicit def toLocalSecondaryIndexInfoOps(v: LocalSecondaryIndexInfo): LocalSecondaryIndexInfoOps =
    new LocalSecondaryIndexInfoOps(v)

}

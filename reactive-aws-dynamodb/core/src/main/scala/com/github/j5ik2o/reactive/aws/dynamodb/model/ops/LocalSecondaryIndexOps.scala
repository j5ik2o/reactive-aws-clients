// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class LocalSecondaryIndexBuilderOps(val self: LocalSecondaryIndex.Builder) extends AnyVal {

  final def withIndexNameAsScala(value: Option[String]): LocalSecondaryIndex.Builder = {
    value.fold(self) { v =>
      self.indexName(v)
    }
  } // String

  final def withKeySchemaAsScala(value: Option[Seq[KeySchemaElement]]): LocalSecondaryIndex.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.keySchema(v.asJava)
    } // Seq[KeySchemaElement]
  }

  final def withProjectionAsScala(value: Option[Projection]): LocalSecondaryIndex.Builder = {
    value.fold(self) { v =>
      self.projection(v)
    }
  } // Projection

}

final class LocalSecondaryIndexOps(val self: LocalSecondaryIndex) extends AnyVal {

  final def indexNameAsScala: Option[String] = Option(self.indexName) // String

  final def keySchemaAsScala: Option[Seq[KeySchemaElement]] = Option(self.keySchema).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[KeySchemaElement]

  final def projectionAsScala: Option[Projection] = Option(self.projection) // Projection

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLocalSecondaryIndexOps {

  implicit def toLocalSecondaryIndexBuilderOps(v: LocalSecondaryIndex.Builder): LocalSecondaryIndexBuilderOps =
    new LocalSecondaryIndexBuilderOps(v)

  implicit def toLocalSecondaryIndexOps(v: LocalSecondaryIndex): LocalSecondaryIndexOps = new LocalSecondaryIndexOps(v)

}

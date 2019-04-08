// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class GlobalSecondaryIndexInfoBuilderOps(val self: GlobalSecondaryIndexInfo.Builder) extends AnyVal {

  final def indexNameAsScala(value: Option[String]): GlobalSecondaryIndexInfo.Builder = {
    value.fold(self) { v =>
      self.indexName(v)
    }
  } // String

  final def keySchemaAsScala(value: Option[Seq[KeySchemaElement]]): GlobalSecondaryIndexInfo.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.keySchema(v.asJava)
    } // Seq[KeySchemaElement]
  }

  final def projectionAsScala(value: Option[Projection]): GlobalSecondaryIndexInfo.Builder = {
    value.fold(self) { v =>
      self.projection(v)
    }
  } // Projection

  final def provisionedThroughputAsScala(value: Option[ProvisionedThroughput]): GlobalSecondaryIndexInfo.Builder = {
    value.fold(self) { v =>
      self.provisionedThroughput(v)
    }
  } // ProvisionedThroughput

}

final class GlobalSecondaryIndexInfoOps(val self: GlobalSecondaryIndexInfo) extends AnyVal {

  final def indexNameAsScala: Option[String] = Option(self.indexName) // String

  final def keySchemaAsScala: Option[Seq[KeySchemaElement]] = Option(self.keySchema).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[KeySchemaElement]

  final def projectionAsScala: Option[Projection] = Option(self.projection) // Projection

  final def provisionedThroughputAsScala: Option[ProvisionedThroughput] =
    Option(self.provisionedThroughput) // ProvisionedThroughput

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGlobalSecondaryIndexInfoOps {

  implicit def toGlobalSecondaryIndexInfoBuilderOps(
      v: GlobalSecondaryIndexInfo.Builder
  ): GlobalSecondaryIndexInfoBuilderOps = new GlobalSecondaryIndexInfoBuilderOps(v)

  implicit def toGlobalSecondaryIndexInfoOps(v: GlobalSecondaryIndexInfo): GlobalSecondaryIndexInfoOps =
    new GlobalSecondaryIndexInfoOps(v)

}

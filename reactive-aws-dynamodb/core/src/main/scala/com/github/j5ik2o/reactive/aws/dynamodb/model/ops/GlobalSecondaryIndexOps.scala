// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class GlobalSecondaryIndexBuilderOps(val self: GlobalSecondaryIndex.Builder) extends AnyVal {

  final def indexNameAsScala(value: Option[String]): GlobalSecondaryIndex.Builder = {
    value.fold(self) { v =>
      self.indexName(v)
    }
  }

  final def keySchemaAsScala(value: Option[Seq[KeySchemaElement]]): GlobalSecondaryIndex.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.keySchema(v.asJava)
    }
  }

  final def projectionAsScala(value: Option[Projection]): GlobalSecondaryIndex.Builder = {
    value.fold(self) { v =>
      self.projection(v)
    }
  }

  final def provisionedThroughputAsScala(value: Option[ProvisionedThroughput]): GlobalSecondaryIndex.Builder = {
    value.fold(self) { v =>
      self.provisionedThroughput(v)
    }
  }

}

final class GlobalSecondaryIndexOps(val self: GlobalSecondaryIndex) extends AnyVal {

  final def indexNameAsScala: Option[String] = Option(self.indexName)

  final def keySchemaAsScala: Option[Seq[KeySchemaElement]] = Option(self.keySchema).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def projectionAsScala: Option[Projection] = Option(self.projection)

  final def provisionedThroughputAsScala: Option[ProvisionedThroughput] = Option(self.provisionedThroughput)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGlobalSecondaryIndexOps {

  implicit def toGlobalSecondaryIndexBuilderOps(v: GlobalSecondaryIndex.Builder): GlobalSecondaryIndexBuilderOps =
    new GlobalSecondaryIndexBuilderOps(v)

  implicit def toGlobalSecondaryIndexOps(v: GlobalSecondaryIndex): GlobalSecondaryIndexOps =
    new GlobalSecondaryIndexOps(v)

}

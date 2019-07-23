// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class GlobalSecondaryIndexBuilderOps(val self: GlobalSecondaryIndex.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala(value: Option[String]): GlobalSecondaryIndex.Builder = {
    value.fold(self) { v =>
      self.indexName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keySchemaAsScala(value: Option[Seq[KeySchemaElement]]): GlobalSecondaryIndex.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.keySchema(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectionAsScala(value: Option[Projection]): GlobalSecondaryIndex.Builder = {
    value.fold(self) { v =>
      self.projection(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedThroughputAsScala(value: Option[ProvisionedThroughput]): GlobalSecondaryIndex.Builder = {
    value.fold(self) { v =>
      self.provisionedThroughput(v)
    }
  }

}

final class GlobalSecondaryIndexOps(val self: GlobalSecondaryIndex) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala: Option[String] = Option(self.indexName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keySchemaAsScala: Option[Seq[KeySchemaElement]] = Option(self.keySchema).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectionAsScala: Option[Projection] = Option(self.projection)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedThroughputAsScala: Option[ProvisionedThroughput] = Option(self.provisionedThroughput)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGlobalSecondaryIndexOps {

  implicit def toGlobalSecondaryIndexBuilderOps(v: GlobalSecondaryIndex.Builder): GlobalSecondaryIndexBuilderOps =
    new GlobalSecondaryIndexBuilderOps(v)

  implicit def toGlobalSecondaryIndexOps(v: GlobalSecondaryIndex): GlobalSecondaryIndexOps =
    new GlobalSecondaryIndexOps(v)

}

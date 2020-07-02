// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class LocalSecondaryIndexBuilderOps(val self: LocalSecondaryIndex.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala(value: Option[String]): LocalSecondaryIndex.Builder = {
    value.fold(self) { v => self.indexName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keySchemaAsScala(value: Option[Seq[KeySchemaElement]]): LocalSecondaryIndex.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.keySchema(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectionAsScala(value: Option[Projection]): LocalSecondaryIndex.Builder = {
    value.fold(self) { v => self.projection(v) }
  }

}

final class LocalSecondaryIndexOps(val self: LocalSecondaryIndex) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala: Option[String] = Option(self.indexName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keySchemaAsScala: Option[Seq[KeySchemaElement]] =
    Option(self.keySchema).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectionAsScala: Option[Projection] = Option(self.projection)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLocalSecondaryIndexOps {

  implicit def toLocalSecondaryIndexBuilderOps(v: LocalSecondaryIndex.Builder): LocalSecondaryIndexBuilderOps =
    new LocalSecondaryIndexBuilderOps(v)

  implicit def toLocalSecondaryIndexOps(v: LocalSecondaryIndex): LocalSecondaryIndexOps = new LocalSecondaryIndexOps(v)

}

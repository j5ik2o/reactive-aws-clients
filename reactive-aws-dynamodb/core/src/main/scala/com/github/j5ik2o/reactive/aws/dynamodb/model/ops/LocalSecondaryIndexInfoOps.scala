// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class LocalSecondaryIndexInfoBuilderOps(val self: LocalSecondaryIndexInfo.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala(value: Option[String]): LocalSecondaryIndexInfo.Builder = {
    value.fold(self) { v => self.indexName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keySchemaAsScala(value: Option[Seq[KeySchemaElement]]): LocalSecondaryIndexInfo.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.keySchema(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectionAsScala(value: Option[Projection]): LocalSecondaryIndexInfo.Builder = {
    value.fold(self) { v => self.projection(v) }
  }

}

final class LocalSecondaryIndexInfoOps(val self: LocalSecondaryIndexInfo) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala: Option[String] = Option(self.indexName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keySchemaAsScala: Option[Seq[KeySchemaElement]] =
    Option(self.keySchema).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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

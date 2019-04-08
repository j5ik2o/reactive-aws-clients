// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class LocalSecondaryIndexDescriptionBuilderOps(val self: LocalSecondaryIndexDescription.Builder) extends AnyVal {

  final def indexNameAsScala(value: Option[String]): LocalSecondaryIndexDescription.Builder = {
    value.fold(self) { v =>
      self.indexName(v)
    }
  }

  final def keySchemaAsScala(value: Option[Seq[KeySchemaElement]]): LocalSecondaryIndexDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.keySchema(v.asJava)
    }
  }

  final def projectionAsScala(value: Option[Projection]): LocalSecondaryIndexDescription.Builder = {
    value.fold(self) { v =>
      self.projection(v)
    }
  }

  final def indexSizeBytesAsScala(value: Option[Long]): LocalSecondaryIndexDescription.Builder = {
    value.fold(self) { v =>
      self.indexSizeBytes(v)
    }
  }

  final def itemCountAsScala(value: Option[Long]): LocalSecondaryIndexDescription.Builder = {
    value.fold(self) { v =>
      self.itemCount(v)
    }
  }

  final def indexArnAsScala(value: Option[String]): LocalSecondaryIndexDescription.Builder = {
    value.fold(self) { v =>
      self.indexArn(v)
    }
  }

}

final class LocalSecondaryIndexDescriptionOps(val self: LocalSecondaryIndexDescription) extends AnyVal {

  final def indexNameAsScala: Option[String] = Option(self.indexName)

  final def keySchemaAsScala: Option[Seq[KeySchemaElement]] = Option(self.keySchema).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def projectionAsScala: Option[Projection] = Option(self.projection)

  final def indexSizeBytesAsScala: Option[Long] = Option(self.indexSizeBytes)

  final def itemCountAsScala: Option[Long] = Option(self.itemCount)

  final def indexArnAsScala: Option[String] = Option(self.indexArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLocalSecondaryIndexDescriptionOps {

  implicit def toLocalSecondaryIndexDescriptionBuilderOps(
      v: LocalSecondaryIndexDescription.Builder
  ): LocalSecondaryIndexDescriptionBuilderOps = new LocalSecondaryIndexDescriptionBuilderOps(v)

  implicit def toLocalSecondaryIndexDescriptionOps(
      v: LocalSecondaryIndexDescription
  ): LocalSecondaryIndexDescriptionOps = new LocalSecondaryIndexDescriptionOps(v)

}

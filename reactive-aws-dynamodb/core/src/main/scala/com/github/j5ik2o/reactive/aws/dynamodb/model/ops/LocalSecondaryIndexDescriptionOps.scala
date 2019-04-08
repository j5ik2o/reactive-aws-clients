// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class LocalSecondaryIndexDescriptionBuilderOps(val self: LocalSecondaryIndexDescription.Builder) extends AnyVal {

  final def indexNameAsScala(value: Option[String]): LocalSecondaryIndexDescription.Builder = {
    value.fold(self) { v =>
      self.indexName(v)
    }
  } // String

  final def keySchemaAsScala(value: Option[Seq[KeySchemaElement]]): LocalSecondaryIndexDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.keySchema(v.asJava)
    } // Seq[KeySchemaElement]
  }

  final def projectionAsScala(value: Option[Projection]): LocalSecondaryIndexDescription.Builder = {
    value.fold(self) { v =>
      self.projection(v)
    }
  } // Projection

  final def indexSizeBytesAsScala(value: Option[Long]): LocalSecondaryIndexDescription.Builder = {
    value.fold(self) { v =>
      self.indexSizeBytes(v)
    }
  } // Long

  final def itemCountAsScala(value: Option[Long]): LocalSecondaryIndexDescription.Builder = {
    value.fold(self) { v =>
      self.itemCount(v)
    }
  } // Long

  final def indexArnAsScala(value: Option[String]): LocalSecondaryIndexDescription.Builder = {
    value.fold(self) { v =>
      self.indexArn(v)
    }
  } // String

}

final class LocalSecondaryIndexDescriptionOps(val self: LocalSecondaryIndexDescription) extends AnyVal {

  final def indexNameAsScala: Option[String] = Option(self.indexName) // String

  final def keySchemaAsScala: Option[Seq[KeySchemaElement]] = Option(self.keySchema).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[KeySchemaElement]

  final def projectionAsScala: Option[Projection] = Option(self.projection) // Projection

  final def indexSizeBytesAsScala: Option[Long] = Option(self.indexSizeBytes) // Long

  final def itemCountAsScala: Option[Long] = Option(self.itemCount) // Long

  final def indexArnAsScala: Option[String] = Option(self.indexArn) // String

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

// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class GlobalSecondaryIndexDescriptionBuilderOps(val self: GlobalSecondaryIndexDescription.Builder)
    extends AnyVal {

  final def indexNameAsScala(value: Option[String]): GlobalSecondaryIndexDescription.Builder = {
    value.fold(self) { v =>
      self.indexName(v)
    }
  }

  final def keySchemaAsScala(value: Option[Seq[KeySchemaElement]]): GlobalSecondaryIndexDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.keySchema(v.asJava)
    }
  }

  final def projectionAsScala(value: Option[Projection]): GlobalSecondaryIndexDescription.Builder = {
    value.fold(self) { v =>
      self.projection(v)
    }
  }

  final def indexStatusAsScala(value: Option[IndexStatus]): GlobalSecondaryIndexDescription.Builder = {
    value.fold(self) { v =>
      self.indexStatus(v)
    }
  }

  final def backfillingAsScala(value: Option[Boolean]): GlobalSecondaryIndexDescription.Builder = {
    value.fold(self) { v =>
      self.backfilling(v)
    }
  }

  final def provisionedThroughputAsScala(
      value: Option[ProvisionedThroughputDescription]
  ): GlobalSecondaryIndexDescription.Builder = {
    value.fold(self) { v =>
      self.provisionedThroughput(v)
    }
  }

  final def indexSizeBytesAsScala(value: Option[Long]): GlobalSecondaryIndexDescription.Builder = {
    value.fold(self) { v =>
      self.indexSizeBytes(v)
    }
  }

  final def itemCountAsScala(value: Option[Long]): GlobalSecondaryIndexDescription.Builder = {
    value.fold(self) { v =>
      self.itemCount(v)
    }
  }

  final def indexArnAsScala(value: Option[String]): GlobalSecondaryIndexDescription.Builder = {
    value.fold(self) { v =>
      self.indexArn(v)
    }
  }

}

final class GlobalSecondaryIndexDescriptionOps(val self: GlobalSecondaryIndexDescription) extends AnyVal {

  final def indexNameAsScala: Option[String] = Option(self.indexName)

  final def keySchemaAsScala: Option[Seq[KeySchemaElement]] = Option(self.keySchema).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def projectionAsScala: Option[Projection] = Option(self.projection)

  final def indexStatusAsScala: Option[IndexStatus] = Option(self.indexStatus)

  final def backfillingAsScala: Option[Boolean] = Option(self.backfilling)

  final def provisionedThroughputAsScala: Option[ProvisionedThroughputDescription] = Option(self.provisionedThroughput)

  final def indexSizeBytesAsScala: Option[Long] = Option(self.indexSizeBytes)

  final def itemCountAsScala: Option[Long] = Option(self.itemCount)

  final def indexArnAsScala: Option[String] = Option(self.indexArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGlobalSecondaryIndexDescriptionOps {

  implicit def toGlobalSecondaryIndexDescriptionBuilderOps(
      v: GlobalSecondaryIndexDescription.Builder
  ): GlobalSecondaryIndexDescriptionBuilderOps = new GlobalSecondaryIndexDescriptionBuilderOps(v)

  implicit def toGlobalSecondaryIndexDescriptionOps(
      v: GlobalSecondaryIndexDescription
  ): GlobalSecondaryIndexDescriptionOps = new GlobalSecondaryIndexDescriptionOps(v)

}

// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class GlobalSecondaryIndexDescriptionBuilderOps(val self: GlobalSecondaryIndexDescription.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala(value: Option[String]): GlobalSecondaryIndexDescription.Builder = {
    value.fold(self) { v => self.indexName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keySchemaAsScala(value: Option[Seq[KeySchemaElement]]): GlobalSecondaryIndexDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.keySchema(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectionAsScala(value: Option[Projection]): GlobalSecondaryIndexDescription.Builder = {
    value.fold(self) { v => self.projection(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexStatusAsScala(value: Option[IndexStatus]): GlobalSecondaryIndexDescription.Builder = {
    value.fold(self) { v => self.indexStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backfillingAsScala(value: Option[Boolean]): GlobalSecondaryIndexDescription.Builder = {
    value.fold(self) { v => self.backfilling(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedThroughputAsScala(
      value: Option[ProvisionedThroughputDescription]
  ): GlobalSecondaryIndexDescription.Builder = {
    value.fold(self) { v => self.provisionedThroughput(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexSizeBytesAsScala(value: Option[Long]): GlobalSecondaryIndexDescription.Builder = {
    value.fold(self) { v => self.indexSizeBytes(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def itemCountAsScala(value: Option[Long]): GlobalSecondaryIndexDescription.Builder = {
    value.fold(self) { v => self.itemCount(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexArnAsScala(value: Option[String]): GlobalSecondaryIndexDescription.Builder = {
    value.fold(self) { v => self.indexArn(v) }
  }

}

final class GlobalSecondaryIndexDescriptionOps(val self: GlobalSecondaryIndexDescription) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala: Option[String] = Option(self.indexName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keySchemaAsScala: Option[Seq[KeySchemaElement]] =
    Option(self.keySchema).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectionAsScala: Option[Projection] = Option(self.projection)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexStatusAsScala: Option[IndexStatus] = Option(self.indexStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backfillingAsScala: Option[Boolean] = Option(self.backfilling)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedThroughputAsScala: Option[ProvisionedThroughputDescription] = Option(self.provisionedThroughput)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexSizeBytesAsScala: Option[Long] = Option(self.indexSizeBytes)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def itemCountAsScala: Option[Long] = Option(self.itemCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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

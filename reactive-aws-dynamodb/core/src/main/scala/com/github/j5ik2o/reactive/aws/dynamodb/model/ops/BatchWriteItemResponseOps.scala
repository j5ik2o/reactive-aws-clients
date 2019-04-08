// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class BatchWriteItemResponseBuilderOps(val self: BatchWriteItemResponse.Builder) extends AnyVal {

  final def unprocessedItemsAsScala(value: Option[Map[String, Seq[WriteRequest]]]): BatchWriteItemResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.unprocessedItems(v.mapValues(_.asJava).asJava)
    } // Map[String, Seq[WriteRequest]]
  }

  final def itemCollectionMetricsAsScala(
      value: Option[Map[String, Seq[ItemCollectionMetrics]]]
  ): BatchWriteItemResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.itemCollectionMetrics(v.mapValues(_.asJava).asJava)
    } // Map[String, Seq[ItemCollectionMetrics]]
  }

  final def consumedCapacityAsScala(value: Option[Seq[ConsumedCapacity]]): BatchWriteItemResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.consumedCapacity(v.asJava)
    } // Seq[ConsumedCapacity]
  }

}

final class BatchWriteItemResponseOps(val self: BatchWriteItemResponse) extends AnyVal {

  final def unprocessedItemsAsScala: Option[Map[String, Seq[WriteRequest]]] = Option(self.unprocessedItems).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap.mapValues(_.asScala)
  } // Map[String, Seq[WriteRequest]]

  final def itemCollectionMetricsAsScala: Option[Map[String, Seq[ItemCollectionMetrics]]] =
    Option(self.itemCollectionMetrics).map { v =>
      import scala.collection.JavaConverters._; v.asScala.toMap.mapValues(_.asScala)
    } // Map[String, Seq[ItemCollectionMetrics]]

  final def consumedCapacityAsScala: Option[Seq[ConsumedCapacity]] = Option(self.consumedCapacity).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[ConsumedCapacity]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBatchWriteItemResponseOps {

  implicit def toBatchWriteItemResponseBuilderOps(v: BatchWriteItemResponse.Builder): BatchWriteItemResponseBuilderOps =
    new BatchWriteItemResponseBuilderOps(v)

  implicit def toBatchWriteItemResponseOps(v: BatchWriteItemResponse): BatchWriteItemResponseOps =
    new BatchWriteItemResponseOps(v)

}

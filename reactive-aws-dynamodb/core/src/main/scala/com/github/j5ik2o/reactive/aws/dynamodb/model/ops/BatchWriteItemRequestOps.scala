// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class BatchWriteItemRequestBuilderOps(val self: BatchWriteItemRequest.Builder) extends AnyVal {

  final def requestItemsAsScala(value: Option[Map[String, Seq[WriteRequest]]]): BatchWriteItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.requestItems(v.mapValues(_.asJava).asJava)
    } // Map[String, Seq[WriteRequest]]
  }

  final def returnConsumedCapacityAsScala(value: Option[ReturnConsumedCapacity]): BatchWriteItemRequest.Builder = {
    value.fold(self) { v =>
      self.returnConsumedCapacity(v)
    }
  } // ReturnConsumedCapacity

  final def returnItemCollectionMetricsAsScala(
      value: Option[ReturnItemCollectionMetrics]
  ): BatchWriteItemRequest.Builder = {
    value.fold(self) { v =>
      self.returnItemCollectionMetrics(v)
    }
  } // ReturnItemCollectionMetrics

}

final class BatchWriteItemRequestOps(val self: BatchWriteItemRequest) extends AnyVal {

  final def requestItemsAsScala: Option[Map[String, Seq[WriteRequest]]] = Option(self.requestItems).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap.mapValues(_.asScala)
  } // Map[String, Seq[WriteRequest]]

  final def returnConsumedCapacityAsScala: Option[ReturnConsumedCapacity] =
    Option(self.returnConsumedCapacity) // ReturnConsumedCapacity

  final def returnItemCollectionMetricsAsScala: Option[ReturnItemCollectionMetrics] =
    Option(self.returnItemCollectionMetrics) // ReturnItemCollectionMetrics

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBatchWriteItemRequestOps {

  implicit def toBatchWriteItemRequestBuilderOps(v: BatchWriteItemRequest.Builder): BatchWriteItemRequestBuilderOps =
    new BatchWriteItemRequestBuilderOps(v)

  implicit def toBatchWriteItemRequestOps(v: BatchWriteItemRequest): BatchWriteItemRequestOps =
    new BatchWriteItemRequestOps(v)

}

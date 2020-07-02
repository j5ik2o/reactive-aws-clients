// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class BatchWriteItemRequestBuilderOps(val self: BatchWriteItemRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestItemsAsScala(value: Option[Map[String, Seq[WriteRequest]]]): BatchWriteItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._;
      self.requestItems(v.view.map { case (k, v) => (k, v.asJava) }.toMap.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnConsumedCapacityAsScala(value: Option[ReturnConsumedCapacity]): BatchWriteItemRequest.Builder = {
    value.fold(self) { v => self.returnConsumedCapacity(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnItemCollectionMetricsAsScala(
      value: Option[ReturnItemCollectionMetrics]
  ): BatchWriteItemRequest.Builder = {
    value.fold(self) { v => self.returnItemCollectionMetrics(v) }
  }

}

final class BatchWriteItemRequestOps(val self: BatchWriteItemRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestItemsAsScala: Option[Map[String, Seq[WriteRequest]]] =
    Option(self.requestItems).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._;
      v.asScala.toMap.view.map { case (k, v) => (k, v.asScala) }.toMap
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnConsumedCapacityAsScala: Option[ReturnConsumedCapacity] = Option(self.returnConsumedCapacity)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnItemCollectionMetricsAsScala: Option[ReturnItemCollectionMetrics] =
    Option(self.returnItemCollectionMetrics)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBatchWriteItemRequestOps {

  implicit def toBatchWriteItemRequestBuilderOps(v: BatchWriteItemRequest.Builder): BatchWriteItemRequestBuilderOps =
    new BatchWriteItemRequestBuilderOps(v)

  implicit def toBatchWriteItemRequestOps(v: BatchWriteItemRequest): BatchWriteItemRequestOps =
    new BatchWriteItemRequestOps(v)

}

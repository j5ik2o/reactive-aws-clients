// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class BatchGetItemRequestBuilderOps(val self: BatchGetItemRequest.Builder) extends AnyVal {

  final def requestItemsAsScala(value: Option[Map[String, KeysAndAttributes]]): BatchGetItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.requestItems(v.asJava)
    } // Map[String, KeysAndAttributes]
  }

  final def returnConsumedCapacityAsScala(value: Option[ReturnConsumedCapacity]): BatchGetItemRequest.Builder = {
    value.fold(self) { v =>
      self.returnConsumedCapacity(v)
    }
  } // ReturnConsumedCapacity

}

final class BatchGetItemRequestOps(val self: BatchGetItemRequest) extends AnyVal {

  final def requestItemsAsScala: Option[Map[String, KeysAndAttributes]] = Option(self.requestItems).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, KeysAndAttributes]

  final def returnConsumedCapacityAsScala: Option[ReturnConsumedCapacity] =
    Option(self.returnConsumedCapacity) // ReturnConsumedCapacity

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBatchGetItemRequestOps {

  implicit def toBatchGetItemRequestBuilderOps(v: BatchGetItemRequest.Builder): BatchGetItemRequestBuilderOps =
    new BatchGetItemRequestBuilderOps(v)

  implicit def toBatchGetItemRequestOps(v: BatchGetItemRequest): BatchGetItemRequestOps = new BatchGetItemRequestOps(v)

}

// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class BatchWriteItemResponseBuilderOps(val self: BatchWriteItemResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unprocessedItemsAsScala(value: Option[Map[String, Seq[WriteRequest]]]): BatchWriteItemResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._;
      self.unprocessedItems(v.view.map { case (k, v) => (k, v.asJava) }.toMap.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def itemCollectionMetricsAsScala(
      value: Option[Map[String, Seq[ItemCollectionMetrics]]]
  ): BatchWriteItemResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._;
      self.itemCollectionMetrics(v.view.map { case (k, v) => (k, v.asJava) }.toMap.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumedCapacityAsScala(value: Option[Seq[ConsumedCapacity]]): BatchWriteItemResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.consumedCapacity(v.asJava)
    }
  }

}

final class BatchWriteItemResponseOps(val self: BatchWriteItemResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unprocessedItemsAsScala: Option[Map[String, Seq[WriteRequest]]] = Option(self.unprocessedItems).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._;
    v.asScala.toMap.view.map { case (k, v) => (k, v.asScala) }.toMap
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def itemCollectionMetricsAsScala: Option[Map[String, Seq[ItemCollectionMetrics]]] =
    Option(self.itemCollectionMetrics).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._;
      v.asScala.toMap.view.map { case (k, v) => (k, v.asScala) }.toMap
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumedCapacityAsScala: Option[Seq[ConsumedCapacity]] = Option(self.consumedCapacity).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBatchWriteItemResponseOps {

  implicit def toBatchWriteItemResponseBuilderOps(v: BatchWriteItemResponse.Builder): BatchWriteItemResponseBuilderOps =
    new BatchWriteItemResponseBuilderOps(v)

  implicit def toBatchWriteItemResponseOps(v: BatchWriteItemResponse): BatchWriteItemResponseOps =
    new BatchWriteItemResponseOps(v)

}

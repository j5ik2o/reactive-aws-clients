// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class TransactWriteItemsResponseBuilderOps(val self: TransactWriteItemsResponse.Builder) extends AnyVal {

  final def consumedCapacityAsScala(value: Option[Seq[ConsumedCapacity]]): TransactWriteItemsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.consumedCapacity(v.asJava)
    }
  }

  final def itemCollectionMetricsAsScala(
      value: Option[Map[String, Seq[ItemCollectionMetrics]]]
  ): TransactWriteItemsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.itemCollectionMetrics(v.mapValues(_.asJava).asJava)
    }
  }

}

final class TransactWriteItemsResponseOps(val self: TransactWriteItemsResponse) extends AnyVal {

  final def consumedCapacityAsScala: Option[Seq[ConsumedCapacity]] = Option(self.consumedCapacity).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def itemCollectionMetricsAsScala: Option[Map[String, Seq[ItemCollectionMetrics]]] =
    Option(self.itemCollectionMetrics).map { v =>
      import scala.collection.JavaConverters._; v.asScala.toMap.mapValues(_.asScala)
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransactWriteItemsResponseOps {

  implicit def toTransactWriteItemsResponseBuilderOps(
      v: TransactWriteItemsResponse.Builder
  ): TransactWriteItemsResponseBuilderOps = new TransactWriteItemsResponseBuilderOps(v)

  implicit def toTransactWriteItemsResponseOps(v: TransactWriteItemsResponse): TransactWriteItemsResponseOps =
    new TransactWriteItemsResponseOps(v)

}

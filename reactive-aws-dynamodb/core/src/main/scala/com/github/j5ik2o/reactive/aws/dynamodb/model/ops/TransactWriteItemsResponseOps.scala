// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class TransactWriteItemsResponseBuilderOps(val self: TransactWriteItemsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumedCapacityAsScala(value: Option[Seq[ConsumedCapacity]]): TransactWriteItemsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.consumedCapacity(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def itemCollectionMetricsAsScala(
      value: Option[Map[String, Seq[ItemCollectionMetrics]]]
  ): TransactWriteItemsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._;
      self.itemCollectionMetrics(v.view.map { case (k, v) => (k, v.asJava) }.toMap.asJava)
    }
  }

}

final class TransactWriteItemsResponseOps(val self: TransactWriteItemsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumedCapacityAsScala: Option[Seq[ConsumedCapacity]] = Option(self.consumedCapacity).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def itemCollectionMetricsAsScala: Option[Map[String, Seq[ItemCollectionMetrics]]] =
    Option(self.itemCollectionMetrics).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._;
      v.asScala.toMap.view.map { case (k, v) => (k, v.asScala) }.toMap
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

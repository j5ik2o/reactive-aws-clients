// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class TransactWriteItemsRequestBuilderOps(val self: TransactWriteItemsRequest.Builder) extends AnyVal {

  final def withTransactItemsAsScala(value: Option[Seq[TransactWriteItem]]): TransactWriteItemsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.transactItems(v.asJava)
    } // Seq[TransactWriteItem]
  }

  final def withReturnConsumedCapacityAsScala(
      value: Option[ReturnConsumedCapacity]
  ): TransactWriteItemsRequest.Builder = {
    value.fold(self) { v =>
      self.returnConsumedCapacity(v)
    }
  } // String

  final def withReturnItemCollectionMetricsAsScala(
      value: Option[ReturnItemCollectionMetrics]
  ): TransactWriteItemsRequest.Builder = {
    value.fold(self) { v =>
      self.returnItemCollectionMetrics(v)
    }
  } // String

  final def withClientRequestTokenAsScala(value: Option[String]): TransactWriteItemsRequest.Builder = {
    value.fold(self) { v =>
      self.clientRequestToken(v)
    }
  } // String

}

final class TransactWriteItemsRequestOps(val self: TransactWriteItemsRequest) extends AnyVal {

  final def transactItemsAsScala: Option[Seq[TransactWriteItem]] = Option(self.transactItems).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[TransactWriteItem]

  final def returnConsumedCapacityAsScala: Option[ReturnConsumedCapacity] =
    Option(self.returnConsumedCapacity) // String

  final def returnItemCollectionMetricsAsScala: Option[ReturnItemCollectionMetrics] =
    Option(self.returnItemCollectionMetrics) // String

  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransactWriteItemsRequestOps {

  implicit def toTransactWriteItemsRequestBuilderOps(
      v: TransactWriteItemsRequest.Builder
  ): TransactWriteItemsRequestBuilderOps = new TransactWriteItemsRequestBuilderOps(v)

  implicit def toTransactWriteItemsRequestOps(v: TransactWriteItemsRequest): TransactWriteItemsRequestOps =
    new TransactWriteItemsRequestOps(v)

}

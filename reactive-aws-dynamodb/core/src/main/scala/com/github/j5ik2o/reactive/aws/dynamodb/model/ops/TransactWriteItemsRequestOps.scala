// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class TransactWriteItemsRequestBuilderOps(val self: TransactWriteItemsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transactItemsAsScala(value: Option[Seq[TransactWriteItem]]): TransactWriteItemsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.transactItems(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnConsumedCapacityAsScala(value: Option[ReturnConsumedCapacity]): TransactWriteItemsRequest.Builder = {
    value.fold(self) { v =>
      self.returnConsumedCapacity(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnItemCollectionMetricsAsScala(
      value: Option[ReturnItemCollectionMetrics]
  ): TransactWriteItemsRequest.Builder = {
    value.fold(self) { v =>
      self.returnItemCollectionMetrics(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala(value: Option[String]): TransactWriteItemsRequest.Builder = {
    value.fold(self) { v =>
      self.clientRequestToken(v)
    }
  }

}

final class TransactWriteItemsRequestOps(val self: TransactWriteItemsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transactItemsAsScala: Option[Seq[TransactWriteItem]] = Option(self.transactItems).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnConsumedCapacityAsScala: Option[ReturnConsumedCapacity] = Option(self.returnConsumedCapacity)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnItemCollectionMetricsAsScala: Option[ReturnItemCollectionMetrics] =
    Option(self.returnItemCollectionMetrics)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransactWriteItemsRequestOps {

  implicit def toTransactWriteItemsRequestBuilderOps(
      v: TransactWriteItemsRequest.Builder
  ): TransactWriteItemsRequestBuilderOps = new TransactWriteItemsRequestBuilderOps(v)

  implicit def toTransactWriteItemsRequestOps(v: TransactWriteItemsRequest): TransactWriteItemsRequestOps =
    new TransactWriteItemsRequestOps(v)

}

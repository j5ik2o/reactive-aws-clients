// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class TransactGetItemsResponseBuilderOps(val self: TransactGetItemsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumedCapacityAsScala(value: Option[Seq[ConsumedCapacity]]): TransactGetItemsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.consumedCapacity(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def responsesAsScala(value: Option[Seq[ItemResponse]]): TransactGetItemsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.responses(v.asJava)
    }
  }

}

final class TransactGetItemsResponseOps(val self: TransactGetItemsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumedCapacityAsScala: Option[Seq[ConsumedCapacity]] =
    Option(self.consumedCapacity).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def responsesAsScala: Option[Seq[ItemResponse]] =
    Option(self.responses).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransactGetItemsResponseOps {

  implicit def toTransactGetItemsResponseBuilderOps(
      v: TransactGetItemsResponse.Builder
  ): TransactGetItemsResponseBuilderOps = new TransactGetItemsResponseBuilderOps(v)

  implicit def toTransactGetItemsResponseOps(v: TransactGetItemsResponse): TransactGetItemsResponseOps =
    new TransactGetItemsResponseOps(v)

}

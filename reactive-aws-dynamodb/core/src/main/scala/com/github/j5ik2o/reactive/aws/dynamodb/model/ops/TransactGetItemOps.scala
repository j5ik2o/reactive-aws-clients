// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class TransactGetItemBuilderOps(val self: TransactGetItem.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def getAsScala(value: Option[Get]): TransactGetItem.Builder = {
    value.fold(self) { v =>
      self.get(v)
    }
  }

}

final class TransactGetItemOps(val self: TransactGetItem) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def getAsScala: Option[Get] = Option(self.get)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransactGetItemOps {

  implicit def toTransactGetItemBuilderOps(v: TransactGetItem.Builder): TransactGetItemBuilderOps =
    new TransactGetItemBuilderOps(v)

  implicit def toTransactGetItemOps(v: TransactGetItem): TransactGetItemOps = new TransactGetItemOps(v)

}

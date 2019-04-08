// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class TransactGetItemBuilderOps(val self: TransactGetItem.Builder) extends AnyVal {

  final def getAsScala(value: Option[Get]): TransactGetItem.Builder = {
    value.fold(self) { v =>
      self.get(v)
    }
  } // Get

}

final class TransactGetItemOps(val self: TransactGetItem) extends AnyVal {

  final def getAsScala: Option[Get] = Option(self.get) // Get

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransactGetItemOps {

  implicit def toTransactGetItemBuilderOps(v: TransactGetItem.Builder): TransactGetItemBuilderOps =
    new TransactGetItemBuilderOps(v)

  implicit def toTransactGetItemOps(v: TransactGetItem): TransactGetItemOps = new TransactGetItemOps(v)

}

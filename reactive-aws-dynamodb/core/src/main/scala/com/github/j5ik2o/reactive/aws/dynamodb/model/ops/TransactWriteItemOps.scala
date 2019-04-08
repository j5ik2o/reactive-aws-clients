// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class TransactWriteItemBuilderOps(val self: TransactWriteItem.Builder) extends AnyVal {

  final def conditionCheckAsScala(value: Option[ConditionCheck]): TransactWriteItem.Builder = {
    value.fold(self) { v =>
      self.conditionCheck(v)
    }
  }

  final def putAsScala(value: Option[Put]): TransactWriteItem.Builder = {
    value.fold(self) { v =>
      self.put(v)
    }
  }

  final def deleteAsScala(value: Option[Delete]): TransactWriteItem.Builder = {
    value.fold(self) { v =>
      self.delete(v)
    }
  }

  final def updateAsScala(value: Option[Update]): TransactWriteItem.Builder = {
    value.fold(self) { v =>
      self.update(v)
    }
  }

}

final class TransactWriteItemOps(val self: TransactWriteItem) extends AnyVal {

  final def conditionCheckAsScala: Option[ConditionCheck] = Option(self.conditionCheck)

  final def putAsScala: Option[Put] = Option(self.put)

  final def deleteAsScala: Option[Delete] = Option(self.delete)

  final def updateAsScala: Option[Update] = Option(self.update)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransactWriteItemOps {

  implicit def toTransactWriteItemBuilderOps(v: TransactWriteItem.Builder): TransactWriteItemBuilderOps =
    new TransactWriteItemBuilderOps(v)

  implicit def toTransactWriteItemOps(v: TransactWriteItem): TransactWriteItemOps = new TransactWriteItemOps(v)

}

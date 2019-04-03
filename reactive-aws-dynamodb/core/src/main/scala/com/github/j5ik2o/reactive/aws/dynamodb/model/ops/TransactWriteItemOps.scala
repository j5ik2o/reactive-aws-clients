// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class TransactWriteItemBuilderOps(val self: TransactWriteItem.Builder) extends AnyVal {

  final def withConditionCheckAsScala(value: Option[ConditionCheck]): TransactWriteItem.Builder = {
    value.fold(self) { v =>
      self.conditionCheck(v)
    }
  } // ConditionCheck

  final def withPutAsScala(value: Option[Put]): TransactWriteItem.Builder = {
    value.fold(self) { v =>
      self.put(v)
    }
  } // Put

  final def withDeleteAsScala(value: Option[Delete]): TransactWriteItem.Builder = {
    value.fold(self) { v =>
      self.delete(v)
    }
  } // Delete

  final def withUpdateAsScala(value: Option[Update]): TransactWriteItem.Builder = {
    value.fold(self) { v =>
      self.update(v)
    }
  } // Update

}

final class TransactWriteItemOps(val self: TransactWriteItem) extends AnyVal {

  final def conditionCheckAsScala: Option[ConditionCheck] = Option(self.conditionCheck) // ConditionCheck

  final def putAsScala: Option[Put] = Option(self.put) // Put

  final def deleteAsScala: Option[Delete] = Option(self.delete) // Delete

  final def updateAsScala: Option[Update] = Option(self.update) // Update

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransactWriteItemOps {

  implicit def toTransactWriteItemBuilderOps(v: TransactWriteItem.Builder): TransactWriteItemBuilderOps =
    new TransactWriteItemBuilderOps(v)

  implicit def toTransactWriteItemOps(v: TransactWriteItem): TransactWriteItemOps = new TransactWriteItemOps(v)

}

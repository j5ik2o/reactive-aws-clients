package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class TransactWriteItem(conditionCheck: Option[ConditionCheck] = None,
                                   put: Option[Put] = None,
                                   delete: Option[Delete] = None,
                                   update: Option[Update] = None) {
  def withConditionCheck(value: Option[ConditionCheck]): TransactWriteItem = copy(conditionCheck = value)
  def withPut(value: Option[Put]): TransactWriteItem                       = copy(put = value)
  def withDelete(value: Option[Delete]): TransactWriteItem                 = copy(delete = value)
  def withUpdate(value: Option[Update]): TransactWriteItem                 = copy(update = value)
}

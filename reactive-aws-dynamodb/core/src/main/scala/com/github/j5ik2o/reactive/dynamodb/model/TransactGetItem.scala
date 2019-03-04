package com.github.j5ik2o.reactive.dynamodb.model

final case class TransactGetItem(get: Option[Get] = None) {
  def withGet(value: Option[Get]): TransactGetItem = copy(get = value)
}

package com.github.j5ik2o.reactive.aws.dynamodb.model

import enumeratum._

import scala.collection.immutable

sealed trait OperationType extends EnumEntry

object OperationType extends Enum[OperationType] {
  override def values: immutable.IndexedSeq[OperationType] = findValues

  case object REMOVE extends OperationType
  case object INSERT extends OperationType
  case object MODIFY extends OperationType
}

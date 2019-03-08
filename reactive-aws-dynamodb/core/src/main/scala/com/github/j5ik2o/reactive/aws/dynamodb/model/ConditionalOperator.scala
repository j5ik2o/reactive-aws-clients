package com.github.j5ik2o.reactive.aws.dynamodb.model

import enumeratum._

import scala.collection.immutable

sealed trait ConditionalOperator extends EnumEntry

object ConditionalOperator extends Enum[ConditionalOperator] {
  override def values: immutable.IndexedSeq[ConditionalOperator] = findValues

  case object OR  extends ConditionalOperator
  case object AND extends ConditionalOperator
}

package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait ExpressionType extends EnumEntry

object ExpressionType extends Enum[ExpressionType] {
  override def values: immutable.IndexedSeq[ExpressionType] = findValues

  case object SQL extends ExpressionType
}

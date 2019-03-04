package com.github.j5ik2o.reactive.aws.dynamodb.model

import enumeratum._

import scala.collection.immutable

sealed trait ComparisonOperator extends EnumEntry

object ComparisonOperator extends Enum[ComparisonOperator] {

  override def values: immutable.IndexedSeq[ComparisonOperator] = findValues

  case object EQ           extends ComparisonOperator
  case object NE           extends ComparisonOperator
  case object IN           extends ComparisonOperator
  case object LE           extends ComparisonOperator
  case object LT           extends ComparisonOperator
  case object GE           extends ComparisonOperator
  case object GT           extends ComparisonOperator
  case object BETWEEN      extends ComparisonOperator
  case object NOT_NULL     extends ComparisonOperator
  case object NULL         extends ComparisonOperator
  case object CONTAINS     extends ComparisonOperator
  case object NOT_CONTAINS extends ComparisonOperator
  case object BEGINS_WITH  extends ComparisonOperator

}

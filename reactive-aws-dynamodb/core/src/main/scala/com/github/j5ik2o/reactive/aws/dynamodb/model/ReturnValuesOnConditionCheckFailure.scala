package com.github.j5ik2o.reactive.aws.dynamodb.model

import enumeratum._

import scala.collection.immutable

sealed trait ReturnValuesOnConditionCheckFailure extends EnumEntry

object ReturnValuesOnConditionCheckFailure extends Enum[ReturnValuesOnConditionCheckFailure] {
  override def values: immutable.IndexedSeq[ReturnValuesOnConditionCheckFailure] = findValues

  case object ALL_OLD extends ReturnValuesOnConditionCheckFailure
  case object NONE    extends ReturnValuesOnConditionCheckFailure
}

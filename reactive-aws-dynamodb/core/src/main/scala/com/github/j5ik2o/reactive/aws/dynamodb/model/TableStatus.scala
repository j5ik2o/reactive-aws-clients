package com.github.j5ik2o.reactive.aws.dynamodb.model

import enumeratum._

import scala.collection.immutable

sealed trait TableStatus extends EnumEntry

object TableStatus extends Enum[TableStatus] {

  override def values: immutable.IndexedSeq[TableStatus] = findValues

  case object CREATING extends TableStatus
  case object UPDATING extends TableStatus
  case object DELETING extends TableStatus
  case object ACTIVE   extends TableStatus

}

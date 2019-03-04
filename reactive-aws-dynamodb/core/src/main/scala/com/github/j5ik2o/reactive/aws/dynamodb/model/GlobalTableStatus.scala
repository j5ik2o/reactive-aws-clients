package com.github.j5ik2o.reactive.aws.dynamodb.model

import enumeratum._

import scala.collection.immutable

sealed trait GlobalTableStatus extends EnumEntry

object GlobalTableStatus extends Enum[GlobalTableStatus] {

  override def values: immutable.IndexedSeq[GlobalTableStatus] = findValues

  case object CREATING extends GlobalTableStatus
  case object ACTIVE   extends GlobalTableStatus
  case object DELETING extends GlobalTableStatus
  case object UPDATING extends GlobalTableStatus

}

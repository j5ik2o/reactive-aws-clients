package com.github.j5ik2o.reactive.aws.dynamodb.model

import enumeratum._

import scala.collection.immutable

sealed trait IndexStatus extends EnumEntry

object IndexStatus extends Enum[IndexStatus] {
  override def values: immutable.IndexedSeq[IndexStatus] = findValues

  case object CREATING extends IndexStatus
  case object UPDATING extends IndexStatus
  case object DELETING extends IndexStatus
  case object ACTIVE   extends IndexStatus

}

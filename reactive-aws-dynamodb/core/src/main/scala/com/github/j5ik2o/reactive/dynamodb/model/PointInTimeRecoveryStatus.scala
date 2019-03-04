package com.github.j5ik2o.reactive.dynamodb.model

import enumeratum._

import scala.collection.immutable

sealed trait PointInTimeRecoveryStatus extends EnumEntry

object PointInTimeRecoveryStatus extends Enum[PointInTimeRecoveryStatus] {

  override def values: immutable.IndexedSeq[PointInTimeRecoveryStatus] = findValues

  case object ENABLED  extends PointInTimeRecoveryStatus
  case object DISABLED extends PointInTimeRecoveryStatus

}

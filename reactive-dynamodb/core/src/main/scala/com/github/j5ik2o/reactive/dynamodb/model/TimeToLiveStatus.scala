package com.github.j5ik2o.reactive.dynamodb.model

import enumeratum._

import scala.collection.immutable

sealed trait TimeToLiveStatus extends EnumEntry

object TimeToLiveStatus extends Enum[TimeToLiveStatus] {

  override def values: immutable.IndexedSeq[TimeToLiveStatus] = findValues
  case object ENABLING  extends TimeToLiveStatus
  case object DISABLING extends TimeToLiveStatus
  case object ENABLED   extends TimeToLiveStatus
  case object DISABLED  extends TimeToLiveStatus

}

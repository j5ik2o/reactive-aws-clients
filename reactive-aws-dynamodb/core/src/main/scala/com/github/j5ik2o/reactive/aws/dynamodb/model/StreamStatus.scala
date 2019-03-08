package com.github.j5ik2o.reactive.aws.dynamodb.model

import enumeratum._

import scala.collection.immutable

sealed trait StreamStatus extends EnumEntry

object StreamStatus extends Enum[StreamStatus] {
  override def values: immutable.IndexedSeq[StreamStatus] = findValues

  case object DISABLED  extends StreamStatus
  case object ENABLED   extends StreamStatus
  case object DISABLING extends StreamStatus
  case object ENABLING  extends StreamStatus
}

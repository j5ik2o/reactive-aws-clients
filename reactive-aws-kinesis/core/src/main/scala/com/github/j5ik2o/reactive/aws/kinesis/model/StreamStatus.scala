package com.github.j5ik2o.reactive.aws.kinesis.model

import enumeratum._

import scala.collection.immutable

sealed trait StreamStatus extends EnumEntry

object StreamStatus extends Enum[StreamStatus] {
  override def values: immutable.IndexedSeq[StreamStatus] = findValues

  case object DELETING extends StreamStatus
  case object ACTIVE   extends StreamStatus
  case object UPDATING extends StreamStatus
  case object CREATING extends StreamStatus
}

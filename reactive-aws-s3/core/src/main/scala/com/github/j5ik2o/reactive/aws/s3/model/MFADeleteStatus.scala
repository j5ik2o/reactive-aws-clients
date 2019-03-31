package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait MFADeleteStatus extends EnumEntry

object MFADeleteStatus extends Enum[MFADeleteStatus] {
  override def values: immutable.IndexedSeq[MFADeleteStatus] = findValues

  case object DISABLED extends MFADeleteStatus
  case object ENABLED  extends MFADeleteStatus
}

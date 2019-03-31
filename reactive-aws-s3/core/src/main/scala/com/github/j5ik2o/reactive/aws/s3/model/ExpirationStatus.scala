package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait ExpirationStatus extends EnumEntry

object ExpirationStatus extends Enum[ExpirationStatus] {
  override def values: immutable.IndexedSeq[ExpirationStatus] = findValues

  case object DISABLED extends ExpirationStatus
  case object ENABLED  extends ExpirationStatus
}

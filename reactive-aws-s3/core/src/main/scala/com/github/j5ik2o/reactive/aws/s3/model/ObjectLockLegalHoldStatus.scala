package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait ObjectLockLegalHoldStatus extends EnumEntry

object ObjectLockLegalHoldStatus extends Enum[ObjectLockLegalHoldStatus] {
  override def values: immutable.IndexedSeq[ObjectLockLegalHoldStatus] = findValues

  case object OFF extends ObjectLockLegalHoldStatus
  case object ON  extends ObjectLockLegalHoldStatus
}

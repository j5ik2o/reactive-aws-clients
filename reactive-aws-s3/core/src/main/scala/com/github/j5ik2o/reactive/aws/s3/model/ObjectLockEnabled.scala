package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait ObjectLockEnabled extends EnumEntry

object ObjectLockEnabled extends Enum[ObjectLockEnabled] {
  override def values: immutable.IndexedSeq[ObjectLockEnabled] = findValues

  case object ENABLED extends ObjectLockEnabled
}

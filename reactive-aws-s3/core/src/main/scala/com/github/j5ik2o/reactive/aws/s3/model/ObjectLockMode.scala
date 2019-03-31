package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait ObjectLockMode extends EnumEntry

object ObjectLockMode extends Enum[ObjectLockMode] {
  override def values: immutable.IndexedSeq[ObjectLockMode] = findValues

  case object GOVERNANCE extends ObjectLockMode
  case object COMPLIANCE extends ObjectLockMode
}

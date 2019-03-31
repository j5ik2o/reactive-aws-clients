package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait ObjectLockRetentionMode extends EnumEntry

object ObjectLockRetentionMode extends Enum[ObjectLockRetentionMode] {
  override def values: immutable.IndexedSeq[ObjectLockRetentionMode] = findValues

  case object GOVERNANCE extends ObjectLockRetentionMode
  case object COMPLIANCE extends ObjectLockRetentionMode
}

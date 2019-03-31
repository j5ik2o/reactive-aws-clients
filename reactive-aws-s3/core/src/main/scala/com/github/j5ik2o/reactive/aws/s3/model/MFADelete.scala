package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait MFADelete extends EnumEntry

object MFADelete extends Enum[MFADelete] {
  override def values: immutable.IndexedSeq[MFADelete] = findValues

  case object DISABLED extends MFADelete
  case object ENABLED  extends MFADelete
}

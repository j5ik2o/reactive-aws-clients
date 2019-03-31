package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait Permission extends EnumEntry

object Permission extends Enum[Permission] {
  override def values: immutable.IndexedSeq[Permission] = findValues

  case object READ         extends Permission
  case object WRITE_ACP    extends Permission
  case object READ_ACP     extends Permission
  case object FULL_CONTROL extends Permission
  case object WRITE        extends Permission
}

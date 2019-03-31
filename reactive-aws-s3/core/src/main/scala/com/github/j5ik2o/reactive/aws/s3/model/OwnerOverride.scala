package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait OwnerOverride extends EnumEntry

object OwnerOverride extends Enum[OwnerOverride] {
  override def values: immutable.IndexedSeq[OwnerOverride] = findValues

  case object DESTINATION extends OwnerOverride
}

package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait Tier extends EnumEntry

object Tier extends Enum[Tier] {
  override def values: immutable.IndexedSeq[Tier] = findValues

  case object EXPEDITED extends Tier
  case object BULK      extends Tier
  case object STANDARD  extends Tier
}

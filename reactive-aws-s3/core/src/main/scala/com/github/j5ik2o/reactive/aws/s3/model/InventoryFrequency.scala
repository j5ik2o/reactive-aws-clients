package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait InventoryFrequency extends EnumEntry

object InventoryFrequency extends Enum[InventoryFrequency] {
  override def values: immutable.IndexedSeq[InventoryFrequency] = findValues

  case object WEEKLY extends InventoryFrequency
  case object DAILY  extends InventoryFrequency
}

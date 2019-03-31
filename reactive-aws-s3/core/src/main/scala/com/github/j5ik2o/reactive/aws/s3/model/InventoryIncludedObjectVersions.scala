package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait InventoryIncludedObjectVersions extends EnumEntry

object InventoryIncludedObjectVersions extends Enum[InventoryIncludedObjectVersions] {
  override def values: immutable.IndexedSeq[InventoryIncludedObjectVersions] = findValues

  case object ALL     extends InventoryIncludedObjectVersions
  case object CURRENT extends InventoryIncludedObjectVersions
}

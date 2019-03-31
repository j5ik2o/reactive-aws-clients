package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait InventoryFormat extends EnumEntry

object InventoryFormat extends Enum[InventoryFormat] {
  override def values: immutable.IndexedSeq[InventoryFormat] = findValues

  case object ORC     extends InventoryFormat
  case object PARQUET extends InventoryFormat
  case object CSV     extends InventoryFormat
}

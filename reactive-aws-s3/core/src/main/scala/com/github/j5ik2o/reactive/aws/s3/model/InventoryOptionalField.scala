package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait InventoryOptionalField extends EnumEntry

object InventoryOptionalField extends Enum[InventoryOptionalField] {
  override def values: immutable.IndexedSeq[InventoryOptionalField] = findValues

  case object OBJECT_LOCK_MODE              extends InventoryOptionalField
  case object REPLICATION_STATUS            extends InventoryOptionalField
  case object STORAGE_CLASS                 extends InventoryOptionalField
  case object OBJECT_LOCK_RETAIN_UNTIL_DATE extends InventoryOptionalField
  case object IS_MULTIPART_UPLOADED         extends InventoryOptionalField
  case object SIZE                          extends InventoryOptionalField
  case object ENCRYPTION_STATUS             extends InventoryOptionalField
  case object E_TAG                         extends InventoryOptionalField
  case object LAST_MODIFIED_DATE            extends InventoryOptionalField
  case object OBJECT_LOCK_LEGAL_HOLD_STATUS extends InventoryOptionalField
}

package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait StorageClass extends EnumEntry

object StorageClass extends Enum[StorageClass] {
  override def values: immutable.IndexedSeq[StorageClass] = findValues

  case object GLACIER             extends StorageClass
  case object INTELLIGENT_TIERING extends StorageClass
  case object ONEZONE_IA          extends StorageClass
  case object REDUCED_REDUNDANCY  extends StorageClass
  case object STANDARD_IA         extends StorageClass
  case object STANDARD            extends StorageClass
}

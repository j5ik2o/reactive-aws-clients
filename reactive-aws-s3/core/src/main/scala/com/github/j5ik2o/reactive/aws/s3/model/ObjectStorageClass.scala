package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait ObjectStorageClass extends EnumEntry

object ObjectStorageClass extends Enum[ObjectStorageClass] {
  override def values: immutable.IndexedSeq[ObjectStorageClass] = findValues

  case object GLACIER             extends ObjectStorageClass
  case object INTELLIGENT_TIERING extends ObjectStorageClass
  case object ONEZONE_IA          extends ObjectStorageClass
  case object REDUCED_REDUNDANCY  extends ObjectStorageClass
  case object STANDARD_IA         extends ObjectStorageClass
  case object STANDARD            extends ObjectStorageClass
}

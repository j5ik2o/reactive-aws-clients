package com.github.j5ik2o.reactive.aws.kinesis.model

import enumeratum._

import scala.collection.immutable

sealed trait EncryptionType extends EnumEntry

object EncryptionType extends Enum[EncryptionType] {

  override def values: immutable.IndexedSeq[EncryptionType] = findValues
  case object NONE extends EncryptionType
  case object KMS  extends EncryptionType

}

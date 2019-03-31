package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait EncodingType extends EnumEntry

object EncodingType extends Enum[EncodingType] {
  override def values: immutable.IndexedSeq[EncodingType] = findValues

  case object URL extends EncodingType
}

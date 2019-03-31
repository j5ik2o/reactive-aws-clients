package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait JSONType extends EnumEntry

object JSONType extends Enum[JSONType] {
  override def values: immutable.IndexedSeq[JSONType] = findValues

  case object DOCUMENT extends JSONType
  case object LINES    extends JSONType
}

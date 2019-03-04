package com.github.j5ik2o.reactive.dynamodb.model

import enumeratum._

import scala.collection.immutable

sealed trait SSEType extends EnumEntry

object SSEType extends Enum[SSEType] {
  override def values: immutable.IndexedSeq[SSEType] = findValues

  case object AES256 extends SSEType
  case object KMS    extends SSEType
}

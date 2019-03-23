package com.github.j5ik2o.reactive.aws.dynamodb.model

import enumeratum._

import scala.collection.immutable

sealed trait ScalarAttributeType extends EnumEntry

object ScalarAttributeType extends Enum[ScalarAttributeType] {
  override def values: immutable.IndexedSeq[ScalarAttributeType] = findValues

  case object B extends ScalarAttributeType
  case object S extends ScalarAttributeType
  case object N extends ScalarAttributeType
}

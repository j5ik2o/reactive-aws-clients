package com.github.j5ik2o.reactive.aws.dynamodb.model

import enumeratum._

import scala.collection.immutable

sealed trait AttributeType extends EnumEntry

object AttributeType extends Enum[AttributeType] {
  override def values: immutable.IndexedSeq[AttributeType] = findValues

  case object S extends AttributeType
  case object N extends AttributeType
  case object B extends AttributeType

}

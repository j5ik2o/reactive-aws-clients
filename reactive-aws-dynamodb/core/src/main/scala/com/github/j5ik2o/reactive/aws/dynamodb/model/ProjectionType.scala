package com.github.j5ik2o.reactive.aws.dynamodb.model

import enumeratum._

import scala.collection.immutable

sealed trait ProjectionType extends EnumEntry

object ProjectionType extends Enum[ProjectionType] {
  override def values: immutable.IndexedSeq[ProjectionType] = findValues

  case object ALL       extends ProjectionType
  case object INCLUDE   extends ProjectionType
  case object KEYS_ONLY extends ProjectionType
}

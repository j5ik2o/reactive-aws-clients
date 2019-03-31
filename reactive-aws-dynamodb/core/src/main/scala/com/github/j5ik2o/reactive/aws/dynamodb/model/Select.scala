package com.github.j5ik2o.reactive.aws.dynamodb.model

import enumeratum._

import scala.collection.immutable

sealed trait Select extends EnumEntry

object Select extends Enum[Select] {
  override def values: immutable.IndexedSeq[Select] = findValues

  case object ALL_PROJECTED_ATTRIBUTES extends Select
  case object COUNT                    extends Select
  case object ALL_ATTRIBUTES           extends Select
  case object SPECIFIC_ATTRIBUTES      extends Select
}

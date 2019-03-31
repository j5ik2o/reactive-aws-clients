package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait QuoteFields extends EnumEntry

object QuoteFields extends Enum[QuoteFields] {
  override def values: immutable.IndexedSeq[QuoteFields] = findValues

  case object ALWAYS   extends QuoteFields
  case object ASNEEDED extends QuoteFields
}

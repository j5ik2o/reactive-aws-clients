package com.github.j5ik2o.reactive.dynamodb.model

import enumeratum._

import scala.collection.immutable

sealed trait BillingMode extends EnumEntry

object BillingMode extends Enum[BillingMode] {
  override def values: immutable.IndexedSeq[BillingMode] = findValues

  case object PROVISIONED     extends BillingMode
  case object PAY_PER_REQUEST extends BillingMode

}

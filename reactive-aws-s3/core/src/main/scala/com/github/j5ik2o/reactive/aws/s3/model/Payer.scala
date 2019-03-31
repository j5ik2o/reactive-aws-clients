package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait Payer extends EnumEntry

object Payer extends Enum[Payer] {
  override def values: immutable.IndexedSeq[Payer] = findValues

  case object REQUESTER    extends Payer
  case object BUCKET_OWNER extends Payer
}

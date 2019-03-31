package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait Type extends EnumEntry

object Type extends Enum[Type] {
  override def values: immutable.IndexedSeq[Type] = findValues

  case object CANONICAL_USER           extends Type
  case object GROUP                    extends Type
  case object AMAZON_CUSTOMER_BY_EMAIL extends Type
}

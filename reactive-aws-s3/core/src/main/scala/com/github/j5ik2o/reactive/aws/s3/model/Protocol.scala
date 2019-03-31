package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait Protocol extends EnumEntry

object Protocol extends Enum[Protocol] {
  override def values: immutable.IndexedSeq[Protocol] = findValues

  case object HTTP  extends Protocol
  case object HTTPS extends Protocol
}

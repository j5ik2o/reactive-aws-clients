package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait RequestPayer extends EnumEntry

object RequestPayer extends Enum[RequestPayer] {
  override def values: immutable.IndexedSeq[RequestPayer] = findValues

  case object REQUESTER extends RequestPayer
}

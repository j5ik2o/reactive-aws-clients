package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait RequestCharged extends EnumEntry

object RequestCharged extends Enum[RequestCharged] {
  override def values: immutable.IndexedSeq[RequestCharged] = findValues

  case object REQUESTER extends RequestCharged
}

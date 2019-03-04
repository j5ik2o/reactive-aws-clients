package com.github.j5ik2o.reactive.aws.dynamodb.model

import enumeratum._

import scala.collection.immutable

sealed trait SSEStatus extends EnumEntry

object SSEStatus extends Enum[SSEStatus] {

  override def values: immutable.IndexedSeq[SSEStatus] = findValues

  case object ENABLING  extends SSEStatus
  case object ENABLED   extends SSEStatus
  case object DISABLING extends SSEStatus
  case object DISABLED  extends SSEStatus
  case object UPDATING  extends SSEStatus

}

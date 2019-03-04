package com.github.j5ik2o.reactive.aws.kinesis.model

import enumeratum._

import scala.collection.immutable

sealed trait ConsumerStatus extends EnumEntry

object ConsumerStatus extends Enum[ConsumerStatus] {

  override def values: immutable.IndexedSeq[ConsumerStatus] = findValues

  case object CREATING extends ConsumerStatus

  case object DELETING extends ConsumerStatus

  case object ACTIVE extends ConsumerStatus

}

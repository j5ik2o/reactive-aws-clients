package com.github.j5ik2o.reactive.aws.kinesis.model

import enumeratum._

import scala.collection.immutable

sealed trait MetricsName extends EnumEntry

object MetricsName extends Enum[MetricsName] {

  override def values: immutable.IndexedSeq[MetricsName] = findValues

  case object INCOMING_BYTES extends MetricsName

  case object INCOMING_RECORDS extends MetricsName

  case object OUTGOING_BYTES extends MetricsName

  case object OUTGOING_RECORDS extends MetricsName

  case object WRITE_PROVISIONED_THROUGHPUT_EXCEEDED extends MetricsName

  case object READ_PROVISIONED_THROUGHPUT_EXCEEDED extends MetricsName

  case object ITERATOR_AGE_MILLISECONDS extends MetricsName

  case object ALL extends MetricsName

}

package com.github.j5ik2o.reactive.aws.kinesis.model

import enumeratum._

import scala.collection.immutable

sealed trait ShardIteratorType extends EnumEntry

object ShardIteratorType extends Enum[ShardIteratorType] {

  override def values: immutable.IndexedSeq[ShardIteratorType] =
    findValues
  case object AT_SEQUENCE_NUMBER    extends ShardIteratorType
  case object AFTER_SEQUENCE_NUMBER extends ShardIteratorType
  case object TRIM_HORIZON          extends ShardIteratorType
  case object LATEST                extends ShardIteratorType
  case object AT_TIMESTAMP          extends ShardIteratorType

}

package com.github.j5ik2o.reactive.aws.kinesis.model

import enumeratum._

import scala.collection.immutable

sealed trait ScalingType extends EnumEntry

object ScalingType extends Enum[ScalingType] {
  override def values: immutable.IndexedSeq[ScalingType] = findValues

  case object UNIFORM_SCALING extends ScalingType
}

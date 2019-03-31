package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait BucketAccelerateStatus extends EnumEntry

object BucketAccelerateStatus extends Enum[BucketAccelerateStatus] {
  override def values: immutable.IndexedSeq[BucketAccelerateStatus] = findValues

  case object ENABLED   extends BucketAccelerateStatus
  case object SUSPENDED extends BucketAccelerateStatus
}

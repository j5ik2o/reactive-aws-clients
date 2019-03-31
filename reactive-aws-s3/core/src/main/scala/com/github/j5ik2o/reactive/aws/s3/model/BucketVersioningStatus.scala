package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait BucketVersioningStatus extends EnumEntry

object BucketVersioningStatus extends Enum[BucketVersioningStatus] {
  override def values: immutable.IndexedSeq[BucketVersioningStatus] = findValues

  case object ENABLED   extends BucketVersioningStatus
  case object SUSPENDED extends BucketVersioningStatus
}

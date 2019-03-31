package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait BucketCannedACL extends EnumEntry

object BucketCannedACL extends Enum[BucketCannedACL] {
  override def values: immutable.IndexedSeq[BucketCannedACL] = findValues

  case object PUBLIC_READ        extends BucketCannedACL
  case object AUTHENTICATED_READ extends BucketCannedACL
  case object PUBLIC_READ_WRITE  extends BucketCannedACL
  case object PRIVATE            extends BucketCannedACL
}

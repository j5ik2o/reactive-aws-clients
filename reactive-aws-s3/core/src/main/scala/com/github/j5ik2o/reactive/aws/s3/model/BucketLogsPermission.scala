package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait BucketLogsPermission extends EnumEntry

object BucketLogsPermission extends Enum[BucketLogsPermission] {
  override def values: immutable.IndexedSeq[BucketLogsPermission] = findValues

  case object READ         extends BucketLogsPermission
  case object FULL_CONTROL extends BucketLogsPermission
  case object WRITE        extends BucketLogsPermission
}

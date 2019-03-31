package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait DeleteMarkerReplicationStatus extends EnumEntry

object DeleteMarkerReplicationStatus extends Enum[DeleteMarkerReplicationStatus] {
  override def values: immutable.IndexedSeq[DeleteMarkerReplicationStatus] = findValues

  case object DISABLED extends DeleteMarkerReplicationStatus
  case object ENABLED  extends DeleteMarkerReplicationStatus
}

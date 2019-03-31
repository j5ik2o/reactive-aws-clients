package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait ReplicationStatus extends EnumEntry

object ReplicationStatus extends Enum[ReplicationStatus] {
  override def values: immutable.IndexedSeq[ReplicationStatus] = findValues

  case object REPLICA  extends ReplicationStatus
  case object COMPLETE extends ReplicationStatus
  case object PENDING  extends ReplicationStatus
  case object FAILED   extends ReplicationStatus
}

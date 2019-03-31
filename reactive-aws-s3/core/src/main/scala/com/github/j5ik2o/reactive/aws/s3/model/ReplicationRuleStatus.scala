package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait ReplicationRuleStatus extends EnumEntry

object ReplicationRuleStatus extends Enum[ReplicationRuleStatus] {
  override def values: immutable.IndexedSeq[ReplicationRuleStatus] = findValues

  case object DISABLED extends ReplicationRuleStatus
  case object ENABLED  extends ReplicationRuleStatus
}

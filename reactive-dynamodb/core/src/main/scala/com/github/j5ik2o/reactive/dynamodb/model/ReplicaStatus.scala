package com.github.j5ik2o.reactive.dynamodb.model

import enumeratum._

import scala.collection.immutable

sealed trait ReplicaStatus extends EnumEntry

object ReplicaStatus extends Enum[ReplicaStatus] {

  override def values: immutable.IndexedSeq[ReplicaStatus] = findValues
  case object CREATING extends ReplicaStatus
  case object UPDATING extends ReplicaStatus
  case object DELETING extends ReplicaStatus
  case object ACTIVE   extends ReplicaStatus

}

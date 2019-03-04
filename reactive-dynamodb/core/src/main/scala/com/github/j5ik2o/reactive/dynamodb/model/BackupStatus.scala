package com.github.j5ik2o.reactive.dynamodb.model

import enumeratum._

import scala.collection.immutable

sealed trait BackupStatus extends EnumEntry

object BackupStatus extends Enum[BackupStatus] {

  override def values: immutable.IndexedSeq[BackupStatus] = findValues

  case object CREATING  extends BackupStatus
  case object DELETED   extends BackupStatus
  case object AVAILABLE extends BackupStatus

}

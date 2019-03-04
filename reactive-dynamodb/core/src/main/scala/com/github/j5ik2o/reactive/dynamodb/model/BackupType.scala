package com.github.j5ik2o.reactive.dynamodb.model

import enumeratum._

import scala.collection.immutable

sealed trait BackupType extends EnumEntry

object BackupType extends Enum[BackupType] {

  override def values: immutable.IndexedSeq[BackupType] = findValues

  case object USER       extends BackupType
  case object SYSTEM     extends BackupType
  case object AWS_BACKUP extends BackupType

}

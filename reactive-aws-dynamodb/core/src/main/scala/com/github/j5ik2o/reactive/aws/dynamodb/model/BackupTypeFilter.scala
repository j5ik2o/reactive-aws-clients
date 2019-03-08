package com.github.j5ik2o.reactive.aws.dynamodb.model

import enumeratum._

import scala.collection.immutable

sealed trait BackupTypeFilter extends EnumEntry

object BackupTypeFilter extends Enum[BackupTypeFilter] {
  override def values: immutable.IndexedSeq[BackupTypeFilter] = findValues

  case object SYSTEM     extends BackupTypeFilter
  case object AWS_BACKUP extends BackupTypeFilter
  case object ALL        extends BackupTypeFilter
  case object USER       extends BackupTypeFilter
}

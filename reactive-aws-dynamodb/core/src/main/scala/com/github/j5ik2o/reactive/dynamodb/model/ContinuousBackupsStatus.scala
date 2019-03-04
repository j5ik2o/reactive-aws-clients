package com.github.j5ik2o.reactive.dynamodb.model
import enumeratum._

import scala.collection.immutable

sealed trait ContinuousBackupsStatus extends EnumEntry

object ContinuousBackupsStatus extends Enum[ContinuousBackupsStatus] {

  override def values: immutable.IndexedSeq[ContinuousBackupsStatus] = findValues
  case object ENABLED  extends ContinuousBackupsStatus
  case object DISABLED extends ContinuousBackupsStatus

}

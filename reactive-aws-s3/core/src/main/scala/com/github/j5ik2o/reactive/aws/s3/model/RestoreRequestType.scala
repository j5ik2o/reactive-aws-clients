package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait RestoreRequestType extends EnumEntry

object RestoreRequestType extends Enum[RestoreRequestType] {
  override def values: immutable.IndexedSeq[RestoreRequestType] = findValues

  case object SELECT extends RestoreRequestType
}

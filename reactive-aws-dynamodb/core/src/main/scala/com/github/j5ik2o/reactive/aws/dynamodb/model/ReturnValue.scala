package com.github.j5ik2o.reactive.aws.dynamodb.model

import enumeratum._

import scala.collection.immutable

sealed trait ReturnValue extends EnumEntry

object ReturnValue extends Enum[ReturnValue] {
  override def values: immutable.IndexedSeq[ReturnValue] = findValues

  case object UPDATED_OLD extends ReturnValue
  case object ALL_NEW     extends ReturnValue
  case object ALL_OLD     extends ReturnValue
  case object NONE        extends ReturnValue
  case object UPDATED_NEW extends ReturnValue
}

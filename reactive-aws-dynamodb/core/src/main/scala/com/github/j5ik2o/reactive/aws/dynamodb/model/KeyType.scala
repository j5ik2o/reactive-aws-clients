package com.github.j5ik2o.reactive.aws.dynamodb.model

import enumeratum._

import scala.collection.immutable

sealed trait KeyType extends EnumEntry

object KeyType extends Enum[KeyType] {
  override def values: immutable.IndexedSeq[KeyType] = findValues

  case object HASH  extends KeyType
  case object RANGE extends KeyType
}

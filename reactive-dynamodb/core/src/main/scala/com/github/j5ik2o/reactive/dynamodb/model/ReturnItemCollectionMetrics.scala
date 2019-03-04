package com.github.j5ik2o.reactive.dynamodb.model

import enumeratum._

import scala.collection.immutable

sealed trait ReturnItemCollectionMetrics extends EnumEntry

object ReturnItemCollectionMetrics extends Enum[ReturnItemCollectionMetrics] {
  override def values: immutable.IndexedSeq[ReturnItemCollectionMetrics] = findValues
  case object SIZE extends ReturnItemCollectionMetrics
  case object NONE extends ReturnItemCollectionMetrics
}

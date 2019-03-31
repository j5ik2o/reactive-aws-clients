package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait ObjectVersionStorageClass extends EnumEntry

object ObjectVersionStorageClass extends Enum[ObjectVersionStorageClass] {
  override def values: immutable.IndexedSeq[ObjectVersionStorageClass] = findValues

  case object STANDARD extends ObjectVersionStorageClass
}

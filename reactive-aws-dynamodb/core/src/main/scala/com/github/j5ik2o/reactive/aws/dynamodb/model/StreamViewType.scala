package com.github.j5ik2o.reactive.aws.dynamodb.model

import enumeratum._

import scala.collection.immutable

sealed trait StreamViewType extends EnumEntry

object StreamViewType extends Enum[StreamViewType] {

  override def values: immutable.IndexedSeq[StreamViewType] =
    findValues

  case object NEW_IMAGE          extends StreamViewType
  case object OLD_IMAGE          extends StreamViewType
  case object NEW_AND_OLD_IMAGES extends StreamViewType
  case object KEYS_ONLY          extends StreamViewType

}

package com.github.j5ik2o.reactive.aws.dynamodb.model

import enumeratum._

import scala.collection.immutable

sealed trait AttributeAction extends EnumEntry

object AttributeAction extends Enum[AttributeAction] {
  override def values: immutable.IndexedSeq[AttributeAction] = findValues

  case object ADD    extends AttributeAction
  case object DELETE extends AttributeAction
  case object PUT    extends AttributeAction
}

package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait FilterRuleName extends EnumEntry

object FilterRuleName extends Enum[FilterRuleName] {
  override def values: immutable.IndexedSeq[FilterRuleName] = findValues

  case object SUFFIX extends FilterRuleName
  case object PREFIX extends FilterRuleName
}

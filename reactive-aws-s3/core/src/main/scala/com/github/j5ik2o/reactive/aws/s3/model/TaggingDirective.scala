package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait TaggingDirective extends EnumEntry

object TaggingDirective extends Enum[TaggingDirective] {
  override def values: immutable.IndexedSeq[TaggingDirective] = findValues

  case object COPY    extends TaggingDirective
  case object REPLACE extends TaggingDirective
}

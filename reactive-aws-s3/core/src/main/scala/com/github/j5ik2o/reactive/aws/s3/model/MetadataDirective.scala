package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait MetadataDirective extends EnumEntry

object MetadataDirective extends Enum[MetadataDirective] {
  override def values: immutable.IndexedSeq[MetadataDirective] = findValues

  case object COPY    extends MetadataDirective
  case object REPLACE extends MetadataDirective
}

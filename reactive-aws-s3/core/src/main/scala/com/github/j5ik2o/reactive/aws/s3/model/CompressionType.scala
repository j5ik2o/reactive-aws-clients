package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait CompressionType extends EnumEntry

object CompressionType extends Enum[CompressionType] {
  override def values: immutable.IndexedSeq[CompressionType] = findValues

  case object GZIP  extends CompressionType
  case object NONE  extends CompressionType
  case object BZIP2 extends CompressionType
}

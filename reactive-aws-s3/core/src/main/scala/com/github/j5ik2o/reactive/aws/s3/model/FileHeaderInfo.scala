package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait FileHeaderInfo extends EnumEntry

object FileHeaderInfo extends Enum[FileHeaderInfo] {
  override def values: immutable.IndexedSeq[FileHeaderInfo] = findValues

  case object IGNORE extends FileHeaderInfo
  case object NONE   extends FileHeaderInfo
  case object USE    extends FileHeaderInfo
}

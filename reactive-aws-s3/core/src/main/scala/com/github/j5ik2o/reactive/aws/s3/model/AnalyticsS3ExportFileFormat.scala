package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait AnalyticsS3ExportFileFormat extends EnumEntry

object AnalyticsS3ExportFileFormat extends Enum[AnalyticsS3ExportFileFormat] {
  override def values: immutable.IndexedSeq[AnalyticsS3ExportFileFormat] = findValues

  case object CSV extends AnalyticsS3ExportFileFormat
}

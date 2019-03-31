package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait StorageClassAnalysisSchemaVersion extends EnumEntry

object StorageClassAnalysisSchemaVersion extends Enum[StorageClassAnalysisSchemaVersion] {
  override def values: immutable.IndexedSeq[StorageClassAnalysisSchemaVersion] = findValues

  case object V_1 extends StorageClassAnalysisSchemaVersion
}

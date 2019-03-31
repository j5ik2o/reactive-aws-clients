package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait Event extends EnumEntry

object Event extends Enum[Event] {
  override def values: immutable.IndexedSeq[Event] = findValues

  case object S3_OBJECT_CREATED_PUT                       extends Event
  case object S3_OBJECT_CREATED_COMPLETE_MULTIPART_UPLOAD extends Event
  case object S3_OBJECT_REMOVED_DELETE_MARKER_CREATED     extends Event
  case object S3_OBJECT_RESTORE_POST                      extends Event
  case object S3_OBJECT_CREATED_POST                      extends Event
  case object S3_REDUCED_REDUNDANCY_LOST_OBJECT           extends Event
  case object S3_OBJECT_CREATED                           extends Event
  case object S3_OBJECT_RESTORE_COMPLETED                 extends Event
  case object S3_OBJECT_CREATED_COPY                      extends Event
  case object S3_OBJECT_REMOVED_DELETE                    extends Event
  case object S3_OBJECT_REMOVED                           extends Event
}

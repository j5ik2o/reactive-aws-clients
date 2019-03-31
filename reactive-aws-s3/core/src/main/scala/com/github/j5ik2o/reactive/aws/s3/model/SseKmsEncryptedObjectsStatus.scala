package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait SseKmsEncryptedObjectsStatus extends EnumEntry

object SseKmsEncryptedObjectsStatus extends Enum[SseKmsEncryptedObjectsStatus] {
  override def values: immutable.IndexedSeq[SseKmsEncryptedObjectsStatus] = findValues

  case object DISABLED extends SseKmsEncryptedObjectsStatus
  case object ENABLED  extends SseKmsEncryptedObjectsStatus
}

package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait ObjectCannedACL extends EnumEntry

object ObjectCannedACL extends Enum[ObjectCannedACL] {
  override def values: immutable.IndexedSeq[ObjectCannedACL] = findValues

  case object PUBLIC_READ_WRITE         extends ObjectCannedACL
  case object AWS_EXEC_READ             extends ObjectCannedACL
  case object PUBLIC_READ               extends ObjectCannedACL
  case object AUTHENTICATED_READ        extends ObjectCannedACL
  case object BUCKET_OWNER_READ         extends ObjectCannedACL
  case object BUCKET_OWNER_FULL_CONTROL extends ObjectCannedACL
  case object PRIVATE                   extends ObjectCannedACL
}

package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait TransitionStorageClass extends EnumEntry

object TransitionStorageClass extends Enum[TransitionStorageClass] {
  override def values: immutable.IndexedSeq[TransitionStorageClass] = findValues

  case object GLACIER             extends TransitionStorageClass
  case object STANDARD_IA         extends TransitionStorageClass
  case object INTELLIGENT_TIERING extends TransitionStorageClass
  case object ONEZONE_IA          extends TransitionStorageClass
}

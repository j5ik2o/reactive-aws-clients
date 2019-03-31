package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait ServerSideEncryption extends EnumEntry

object ServerSideEncryption extends Enum[ServerSideEncryption] {
  override def values: immutable.IndexedSeq[ServerSideEncryption] = findValues

  case object AES256  extends ServerSideEncryption
  case object AWS_KMS extends ServerSideEncryption
}

package com.github.j5ik2o.reactive.aws.kinesis.model

final case class HashKeyRange(startingHashKey: Option[String] = None, endingHashKey: Option[String] = None) {

  def withStartingHashKey(value: Option[String]): HashKeyRange = copy(startingHashKey = value)
  def withEndingHashKey(value: Option[String]): HashKeyRange   = copy(endingHashKey = value)

}

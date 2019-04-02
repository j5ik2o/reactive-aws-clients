package com.github.j5ik2o.reactive.aws.kinesis.model

final case class HashKeyRange(
    startingHashKey: Option[String] = None, // String
    endingHashKey: Option[String] = None // String
) {
  def withStartingHashKey(value: Option[String]): HashKeyRange =
    copy(startingHashKey = value)
  def withEndingHashKey(value: Option[String]): HashKeyRange =
    copy(endingHashKey = value)
}

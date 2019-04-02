package com.github.j5ik2o.reactive.aws.kinesis.model

final case class ListStreamsRequest(
    limit: Option[Int] = None, // Int
    exclusiveStartStreamName: Option[String] = None // String
) {
  def withLimit(value: Option[Int]): ListStreamsRequest =
    copy(limit = value)
  def withExclusiveStartStreamName(value: Option[String]): ListStreamsRequest =
    copy(exclusiveStartStreamName = value)
}

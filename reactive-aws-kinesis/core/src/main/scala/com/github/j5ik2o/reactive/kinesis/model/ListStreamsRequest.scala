package com.github.j5ik2o.reactive.kinesis.model

final case class ListStreamsRequest(limit: Option[Int] = None, exclusiveStartStreamName: Option[String] = None) {

  def withLimit(value: Option[Int]): ListStreamsRequest                       = copy(limit = value)
  def withExclusiveStartStreamName(value: Option[String]): ListStreamsRequest = copy(exclusiveStartStreamName = value)

}

package com.github.j5ik2o.reactive.aws.kinesis.model

final case class GetRecordsRequest(shardIterator: Option[String] = None, limit: Option[Int] = None) {

  def withShardIterator(value: Option[String]): GetRecordsRequest = copy(shardIterator = value)
  def withLimit(value: Option[Int]): GetRecordsRequest            = copy(limit = value)

}

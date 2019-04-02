package com.github.j5ik2o.reactive.aws.kinesis.model

final case class GetRecordsRequest(
    shardIterator: Option[String] = None, // String
    limit: Option[Int] = None // Int
) {
  def withShardIterator(value: Option[String]): GetRecordsRequest =
    copy(shardIterator = value)
  def withLimit(value: Option[Int]): GetRecordsRequest =
    copy(limit = value)
}

package com.github.j5ik2o.reactive.aws.kinesis.model

final case class PutRecordsRequest(records: Option[Seq[PutRecordsRequestEntry]] = None,
                                   streamName: Option[String] = None) {}

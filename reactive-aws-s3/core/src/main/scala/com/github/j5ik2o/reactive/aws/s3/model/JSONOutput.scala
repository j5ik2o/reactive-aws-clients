package com.github.j5ik2o.reactive.aws.s3.model

final case class JSONOutput(
    recordDelimiter: Option[String] = None
) {
  def withRecordDelimiter(value: Option[String]): JSONOutput =
    copy(recordDelimiter = value)
}

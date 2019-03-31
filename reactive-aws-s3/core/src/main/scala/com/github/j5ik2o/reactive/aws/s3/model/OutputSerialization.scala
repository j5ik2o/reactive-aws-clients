package com.github.j5ik2o.reactive.aws.s3.model

final case class OutputSerialization(
    csv: Option[CSVOutput] = None,
    json: Option[JSONOutput] = None
) {
  def withCsv(value: Option[CSVOutput]): OutputSerialization =
    copy(csv = value)
  def withJson(value: Option[JSONOutput]): OutputSerialization =
    copy(json = value)
}

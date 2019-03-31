package com.github.j5ik2o.reactive.aws.s3.model

final case class CORSConfiguration(
    corsRules: Option[Seq[CORSRule]] = None
) {
  def withCorsRules(value: Option[Seq[CORSRule]]): CORSConfiguration =
    copy(corsRules = value)
}

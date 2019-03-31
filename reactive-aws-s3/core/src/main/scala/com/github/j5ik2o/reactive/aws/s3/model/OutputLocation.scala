package com.github.j5ik2o.reactive.aws.s3.model

final case class OutputLocation(
    s3: Option[S3Location] = None
) {
  def withS3(value: Option[S3Location]): OutputLocation =
    copy(s3 = value)
}

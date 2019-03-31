package com.github.j5ik2o.reactive.aws.s3.model

final case class S3KeyFilter(
    filterRules: Option[Seq[FilterRule]] = None
) {
  def withFilterRules(value: Option[Seq[FilterRule]]): S3KeyFilter =
    copy(filterRules = value)
}

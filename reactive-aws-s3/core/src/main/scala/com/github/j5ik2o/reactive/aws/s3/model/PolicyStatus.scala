package com.github.j5ik2o.reactive.aws.s3.model

final case class PolicyStatus(
    isPublic: Option[Boolean] = None
) {
  def withIsPublic(value: Option[Boolean]): PolicyStatus =
    copy(isPublic = value)
}

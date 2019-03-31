package com.github.j5ik2o.reactive.aws.s3.model

final case class AccelerateConfiguration(
    status: Option[BucketAccelerateStatus] = None
) {
  def withStatus(value: Option[BucketAccelerateStatus]): AccelerateConfiguration =
    copy(status = value)
}

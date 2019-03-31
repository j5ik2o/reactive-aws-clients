package com.github.j5ik2o.reactive.aws.s3.model

final case class BucketLoggingStatus(
    loggingEnabled: Option[LoggingEnabled] = None
) {
  def withLoggingEnabled(value: Option[LoggingEnabled]): BucketLoggingStatus =
    copy(loggingEnabled = value)
}

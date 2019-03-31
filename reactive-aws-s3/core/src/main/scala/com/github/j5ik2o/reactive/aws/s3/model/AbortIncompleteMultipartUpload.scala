package com.github.j5ik2o.reactive.aws.s3.model

final case class AbortIncompleteMultipartUpload(
    daysAfterInitiation: Option[Int] = None
) {
  def withDaysAfterInitiation(value: Option[Int]): AbortIncompleteMultipartUpload =
    copy(daysAfterInitiation = value)
}

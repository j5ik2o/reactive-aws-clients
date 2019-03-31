package com.github.j5ik2o.reactive.aws.s3.model

final case class NoncurrentVersionExpiration(
    noncurrentDays: Option[Int] = None
) {
  def withNoncurrentDays(value: Option[Int]): NoncurrentVersionExpiration =
    copy(noncurrentDays = value)
}

package com.github.j5ik2o.reactive.aws.s3.model

final case class LifecycleExpiration(
    date: Option[java.time.Instant] = None,
    days: Option[Int] = None,
    expiredObjectDeleteMarker: Option[Boolean] = None
) {
  def withDate(value: Option[java.time.Instant]): LifecycleExpiration =
    copy(date = value)
  def withDays(value: Option[Int]): LifecycleExpiration =
    copy(days = value)
  def withExpiredObjectDeleteMarker(value: Option[Boolean]): LifecycleExpiration =
    copy(expiredObjectDeleteMarker = value)
}

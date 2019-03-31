package com.github.j5ik2o.reactive.aws.s3.model

final case class DefaultRetention(
    mode: Option[ObjectLockRetentionMode] = None,
    days: Option[Int] = None,
    years: Option[Int] = None
) {
  def withMode(value: Option[ObjectLockRetentionMode]): DefaultRetention =
    copy(mode = value)
  def withDays(value: Option[Int]): DefaultRetention =
    copy(days = value)
  def withYears(value: Option[Int]): DefaultRetention =
    copy(years = value)
}

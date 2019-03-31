package com.github.j5ik2o.reactive.aws.s3.model

final case class Transition(
    date: Option[java.time.Instant] = None,
    days: Option[Int] = None,
    storageClass: Option[TransitionStorageClass] = None
) {
  def withDate(value: Option[java.time.Instant]): Transition =
    copy(date = value)
  def withDays(value: Option[Int]): Transition =
    copy(days = value)
  def withStorageClass(value: Option[TransitionStorageClass]): Transition =
    copy(storageClass = value)
}

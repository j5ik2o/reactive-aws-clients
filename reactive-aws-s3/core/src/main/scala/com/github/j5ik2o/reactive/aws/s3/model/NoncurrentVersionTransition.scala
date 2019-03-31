package com.github.j5ik2o.reactive.aws.s3.model

final case class NoncurrentVersionTransition(
    noncurrentDays: Option[Int] = None,
    storageClass: Option[TransitionStorageClass] = None
) {
  def withNoncurrentDays(value: Option[Int]): NoncurrentVersionTransition =
    copy(noncurrentDays = value)
  def withStorageClass(value: Option[TransitionStorageClass]): NoncurrentVersionTransition =
    copy(storageClass = value)
}

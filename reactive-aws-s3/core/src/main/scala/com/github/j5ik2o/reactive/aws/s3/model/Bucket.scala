package com.github.j5ik2o.reactive.aws.s3.model

final case class Bucket(
    name: Option[String] = None,
    creationDate: Option[java.time.Instant] = None
) {
  def withName(value: Option[String]): Bucket =
    copy(name = value)
  def withCreationDate(value: Option[java.time.Instant]): Bucket =
    copy(creationDate = value)
}

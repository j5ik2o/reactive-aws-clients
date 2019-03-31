package com.github.j5ik2o.reactive.aws.s3.model

final case class CompletedPart(
    eTag: Option[String] = None,
    partNumber: Option[Int] = None
) {
  def withETag(value: Option[String]): CompletedPart =
    copy(eTag = value)
  def withPartNumber(value: Option[Int]): CompletedPart =
    copy(partNumber = value)
}

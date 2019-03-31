package com.github.j5ik2o.reactive.aws.s3.model

final case class Tagging(
    tagSet: Option[Seq[Tag]] = None
) {
  def withTagSet(value: Option[Seq[Tag]]): Tagging =
    copy(tagSet = value)
}

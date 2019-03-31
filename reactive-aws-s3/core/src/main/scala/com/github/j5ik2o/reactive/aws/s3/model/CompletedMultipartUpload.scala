package com.github.j5ik2o.reactive.aws.s3.model

final case class CompletedMultipartUpload(
    parts: Option[Seq[CompletedPart]] = None
) {
  def withParts(value: Option[Seq[CompletedPart]]): CompletedMultipartUpload =
    copy(parts = value)
}

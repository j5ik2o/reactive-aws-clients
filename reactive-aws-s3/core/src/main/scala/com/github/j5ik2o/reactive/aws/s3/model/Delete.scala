package com.github.j5ik2o.reactive.aws.s3.model

final case class Delete(
    objects: Option[Seq[ObjectIdentifier]] = None,
    quiet: Option[Boolean] = None
) {
  def withObjects(value: Option[Seq[ObjectIdentifier]]): Delete =
    copy(objects = value)
  def withQuiet(value: Option[Boolean]): Delete =
    copy(quiet = value)
}

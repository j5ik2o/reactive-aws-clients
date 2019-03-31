package com.github.j5ik2o.reactive.aws.s3.model

final case class AccessControlTranslation(
    owner: Option[OwnerOverride] = None
) {
  def withOwner(value: Option[OwnerOverride]): AccessControlTranslation =
    copy(owner = value)
}

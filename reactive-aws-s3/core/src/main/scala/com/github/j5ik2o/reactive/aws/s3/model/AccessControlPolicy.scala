package com.github.j5ik2o.reactive.aws.s3.model

final case class AccessControlPolicy(
    grants: Option[Seq[Grant]] = None,
    owner: Option[Owner] = None
) {
  def withGrants(value: Option[Seq[Grant]]): AccessControlPolicy =
    copy(grants = value)
  def withOwner(value: Option[Owner]): AccessControlPolicy =
    copy(owner = value)
}

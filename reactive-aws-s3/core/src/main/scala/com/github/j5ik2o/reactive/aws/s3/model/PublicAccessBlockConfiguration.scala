package com.github.j5ik2o.reactive.aws.s3.model

final case class PublicAccessBlockConfiguration(
    blockPublicAcls: Option[Boolean] = None,
    ignorePublicAcls: Option[Boolean] = None,
    blockPublicPolicy: Option[Boolean] = None,
    restrictPublicBuckets: Option[Boolean] = None
) {
  def withBlockPublicAcls(value: Option[Boolean]): PublicAccessBlockConfiguration =
    copy(blockPublicAcls = value)
  def withIgnorePublicAcls(value: Option[Boolean]): PublicAccessBlockConfiguration =
    copy(ignorePublicAcls = value)
  def withBlockPublicPolicy(value: Option[Boolean]): PublicAccessBlockConfiguration =
    copy(blockPublicPolicy = value)
  def withRestrictPublicBuckets(value: Option[Boolean]): PublicAccessBlockConfiguration =
    copy(restrictPublicBuckets = value)
}

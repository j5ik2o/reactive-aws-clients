package com.github.j5ik2o.reactive.aws.s3.model

final case class GlacierJobParameters(
    tier: Option[Tier] = None
) {
  def withTier(value: Option[Tier]): GlacierJobParameters =
    copy(tier = value)
}

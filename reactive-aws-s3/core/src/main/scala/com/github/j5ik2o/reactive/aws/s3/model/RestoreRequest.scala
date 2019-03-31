package com.github.j5ik2o.reactive.aws.s3.model

final case class RestoreRequest(
    days: Option[Int] = None,
    glacierJobParameters: Option[GlacierJobParameters] = None,
    `type`: Option[RestoreRequestType] = None,
    tier: Option[Tier] = None,
    description: Option[String] = None,
    selectParameters: Option[SelectParameters] = None,
    outputLocation: Option[OutputLocation] = None
) {
  def withDays(value: Option[Int]): RestoreRequest =
    copy(days = value)
  def withGlacierJobParameters(value: Option[GlacierJobParameters]): RestoreRequest =
    copy(glacierJobParameters = value)
  def withType(value: Option[RestoreRequestType]): RestoreRequest =
    copy(`type` = value)
  def withTier(value: Option[Tier]): RestoreRequest =
    copy(tier = value)
  def withDescription(value: Option[String]): RestoreRequest =
    copy(description = value)
  def withSelectParameters(value: Option[SelectParameters]): RestoreRequest =
    copy(selectParameters = value)
  def withOutputLocation(value: Option[OutputLocation]): RestoreRequest =
    copy(outputLocation = value)
}

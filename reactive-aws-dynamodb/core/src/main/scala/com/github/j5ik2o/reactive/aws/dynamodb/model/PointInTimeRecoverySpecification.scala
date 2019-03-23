package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class PointInTimeRecoverySpecification(
    pointInTimeRecoveryEnabled: Option[Boolean] = None
) {
  def withPointInTimeRecoveryEnabled(value: Option[Boolean]): PointInTimeRecoverySpecification =
    copy(pointInTimeRecoveryEnabled = value)
}

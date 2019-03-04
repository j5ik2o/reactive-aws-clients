package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class UpdateContinuousBackupsRequest(
    tableName: Option[String] = None,
    pointInTimeRecoverySpecification: Option[PointInTimeRecoverySpecification] = None
) {
  def withTableName(value: Option[String]): UpdateContinuousBackupsRequest = copy(tableName = value)
  def withPointInTimeRecoverySpecification(
      value: Option[PointInTimeRecoverySpecification]
  ): UpdateContinuousBackupsRequest =
    copy(pointInTimeRecoverySpecification = value)
}

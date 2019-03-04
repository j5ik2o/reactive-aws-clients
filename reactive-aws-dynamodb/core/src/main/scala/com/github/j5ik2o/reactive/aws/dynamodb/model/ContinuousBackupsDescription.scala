package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class ContinuousBackupsDescription(continuousBackupsStatus: Option[ContinuousBackupsStatus] = None,
                                              pointInTimeRecoveryDescription: Option[PointInTimeRecoveryDescription] =
                                                None) {
  def withContinuousBackupsStatus(value: Option[ContinuousBackupsStatus]): ContinuousBackupsDescription =
    copy(continuousBackupsStatus = value)
  def withPointInTimeRecoveryDescription(value: Option[PointInTimeRecoveryDescription]): ContinuousBackupsDescription =
    copy(pointInTimeRecoveryDescription = value)
}

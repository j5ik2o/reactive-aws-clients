package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class BackupDescription(backupDetails: Option[BackupDetails] = None,
                                   sourceTableDetails: Option[SourceTableDetails] = None,
                                   sourceTableFeatureDetails: Option[SourceTableFeatureDetails] = None) {
  def withBackupDetails(value: Option[BackupDetails]): BackupDescription           = copy(backupDetails = value)
  def withSourceTableDetails(value: Option[SourceTableDetails]): BackupDescription = copy(sourceTableDetails = value)
  def withSourceTableFeatureDetails(value: Option[SourceTableFeatureDetails]): BackupDescription =
    copy(sourceTableFeatureDetails = value)
}

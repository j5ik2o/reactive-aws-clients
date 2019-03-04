package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class AutoScalingSettingsUpdate(minimumUnits: Option[Long] = None,
                                           maximumUnits: Option[Long] = None,
                                           autoScalingDisabled: Option[Boolean] = None,
                                           autoScalingRoleArn: Option[String] = None,
                                           scalingPolicyUpdate: Option[AutoScalingPolicyUpdate] = None) {
  def withMinimumUnits(value: Option[Long]): AutoScalingSettingsUpdate           = copy(minimumUnits = value)
  def withMaximumUnits(value: Option[Long]): AutoScalingSettingsUpdate           = copy(maximumUnits = value)
  def withAutoScalingDisabled(value: Option[Boolean]): AutoScalingSettingsUpdate = copy(autoScalingDisabled = value)
  def withAutoScalingRoleArn(value: Option[String]): AutoScalingSettingsUpdate   = copy(autoScalingRoleArn = value)
  def withScalingPolicyUpdate(value: Option[AutoScalingPolicyUpdate]): AutoScalingSettingsUpdate =
    copy(scalingPolicyUpdate = value)
}

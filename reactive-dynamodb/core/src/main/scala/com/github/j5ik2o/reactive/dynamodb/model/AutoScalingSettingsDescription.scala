package com.github.j5ik2o.reactive.dynamodb.model

final case class AutoScalingSettingsDescription(minimumUnits: Option[Long] = None,
                                                maximumUnits: Option[Long] = None,
                                                autoScalingDisabled: Option[Boolean] = None,
                                                autoScalingRoleArn: Option[String] = None,
                                                scalingPolicies: Option[Seq[AutoScalingPolicyDescription]] = None) {
  def withMinimumUnits(value: Option[Long]): AutoScalingSettingsDescription = copy(minimumUnits = value)
  def withMaximumUnits(value: Option[Long]): AutoScalingSettingsDescription = copy(maximumUnits = value)
  def withAutoScalingDisabled(value: Option[Boolean]): AutoScalingSettingsDescription =
    copy(autoScalingDisabled = value)
  def withAutoScalingRoleArn(value: Option[String]): AutoScalingSettingsDescription = copy(autoScalingRoleArn = value)
  def withScalingPolicies(value: Option[Seq[AutoScalingPolicyDescription]]): AutoScalingSettingsDescription =
    copy(scalingPolicies = value)
}

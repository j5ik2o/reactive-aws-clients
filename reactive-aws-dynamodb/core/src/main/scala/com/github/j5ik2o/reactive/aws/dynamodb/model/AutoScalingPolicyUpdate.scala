package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class AutoScalingPolicyUpdate(
    policyName: Option[String] = None,
    targetTrackingScalingPolicyConfiguration: Option[AutoScalingTargetTrackingScalingPolicyConfigurationUpdate] = None
) {
  def withPolicyName(value: Option[String]): AutoScalingPolicyUpdate = copy(policyName = value)
  def withTargetTrackingScalingPolicyConfiguration(
      value: Option[AutoScalingTargetTrackingScalingPolicyConfigurationUpdate]
  ): AutoScalingPolicyUpdate =
    copy(targetTrackingScalingPolicyConfiguration = value)
}

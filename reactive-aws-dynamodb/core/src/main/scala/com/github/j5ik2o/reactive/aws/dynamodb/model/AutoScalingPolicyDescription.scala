package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class AutoScalingPolicyDescription(
    policyName: Option[String] = None,
    targetTrackingScalingPolicyConfiguration: Option[AutoScalingTargetTrackingScalingPolicyConfigurationDescription] =
      None
) {
  def withPolicyName(value: Option[String]): AutoScalingPolicyDescription = copy(policyName = value)
  def withTargetTrackingScalingPolicyConfiguration(
      value: Option[AutoScalingTargetTrackingScalingPolicyConfigurationDescription]
  ): AutoScalingPolicyDescription =
    copy(targetTrackingScalingPolicyConfiguration = value)
}

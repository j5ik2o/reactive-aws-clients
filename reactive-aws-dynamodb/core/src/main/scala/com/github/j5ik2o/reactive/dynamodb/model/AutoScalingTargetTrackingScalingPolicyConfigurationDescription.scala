package com.github.j5ik2o.reactive.dynamodb.model

final case class AutoScalingTargetTrackingScalingPolicyConfigurationDescription(
    disableScaleIn: Option[Boolean] = None,
    scaleInCooldown: Option[Int] = None,
    scaleOutCooldown: Option[Int] = None,
    targetValue: Option[Double] = None
) {
  def withDisableScaleIn(value: Option[Boolean]): AutoScalingTargetTrackingScalingPolicyConfigurationDescription =
    copy(disableScaleIn = value)
  def withScaleInCooldown(value: Option[Int]): AutoScalingTargetTrackingScalingPolicyConfigurationDescription =
    copy(scaleInCooldown = value)
  def withScaleOutCooldown(value: Option[Int]): AutoScalingTargetTrackingScalingPolicyConfigurationDescription =
    copy(scaleOutCooldown = value)
  def withTargetValue(value: Option[Double]): AutoScalingTargetTrackingScalingPolicyConfigurationDescription =
    copy(targetValue = value)
}

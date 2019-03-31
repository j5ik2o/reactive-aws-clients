package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class AutoScalingTargetTrackingScalingPolicyConfigurationUpdate(
    disableScaleIn: Option[Boolean] = None,
    scaleInCooldown: Option[Int] = None,
    scaleOutCooldown: Option[Int] = None,
    targetValue: Option[Double] = None
) {
  def withDisableScaleIn(value: Option[Boolean]): AutoScalingTargetTrackingScalingPolicyConfigurationUpdate =
    copy(disableScaleIn = value)
  def withScaleInCooldown(value: Option[Int]): AutoScalingTargetTrackingScalingPolicyConfigurationUpdate =
    copy(scaleInCooldown = value)
  def withScaleOutCooldown(value: Option[Int]): AutoScalingTargetTrackingScalingPolicyConfigurationUpdate =
    copy(scaleOutCooldown = value)
  def withTargetValue(value: Option[Double]): AutoScalingTargetTrackingScalingPolicyConfigurationUpdate =
    copy(targetValue = value)
}

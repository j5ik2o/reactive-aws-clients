package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{
  AutoScalingTargetTrackingScalingPolicyConfigurationDescription => ScalaAutoScalingTargetTrackingScalingPolicyConfigurationDescription
}
import software.amazon.awssdk.services.dynamodb.model.{
  AutoScalingTargetTrackingScalingPolicyConfigurationDescription => JavaAutoScalingTargetTrackingScalingPolicyConfigurationDescription
}
object AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionOps {

  implicit class ScalaAutoScalingTargetTrackingScalingPolicyConfigurationDescriptionOps(
      val self: ScalaAutoScalingTargetTrackingScalingPolicyConfigurationDescription
  ) extends AnyVal {

    def toJava: JavaAutoScalingTargetTrackingScalingPolicyConfigurationDescription = {
      val result = JavaAutoScalingTargetTrackingScalingPolicyConfigurationDescription.builder()
      self.disableScaleIn.foreach(v => result.disableScaleIn(v))
      self.scaleInCooldown.foreach(v => result.scaleInCooldown(v))
      self.scaleOutCooldown.foreach(v => result.scaleOutCooldown(v))
      result.build()
    }

  }

  implicit class JavaAutoScalingTargetTrackingScalingPolicyConfigurationDescriptionOps(
      val self: JavaAutoScalingTargetTrackingScalingPolicyConfigurationDescription
  ) extends AnyVal {

    def toScala: ScalaAutoScalingTargetTrackingScalingPolicyConfigurationDescription = {
      ScalaAutoScalingTargetTrackingScalingPolicyConfigurationDescription()
        .withDisableScaleIn(Option(self.disableScaleIn))
        .withScaleInCooldown(Option(self.scaleInCooldown))
        .withScaleOutCooldown(Option(self.scaleOutCooldown))
    }

  }

}

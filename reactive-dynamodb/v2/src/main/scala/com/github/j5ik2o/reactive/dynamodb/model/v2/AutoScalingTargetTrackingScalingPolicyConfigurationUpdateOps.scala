package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{
  AutoScalingTargetTrackingScalingPolicyConfigurationUpdate => ScalaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate
}
import software.amazon.awssdk.services.dynamodb.model.{
  AutoScalingTargetTrackingScalingPolicyConfigurationUpdate => JavaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate
}
object AutoScalingTargetTrackingScalingPolicyConfigurationUpdateOps {

  implicit class ScalaAutoScalingTargetTrackingScalingPolicyConfigurationUpdateOps(
      val self: ScalaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate
  ) extends AnyVal {

    def toJava: JavaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate = {
      val result = JavaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate.builder()
      self.disableScaleIn.foreach(v => result.disableScaleIn(v))
      self.scaleInCooldown.foreach(v => result.scaleInCooldown(v))
      self.scaleOutCooldown.foreach(v => result.scaleOutCooldown(v))
      self.targetValue.foreach(v => result.targetValue(v))
      result.build()
    }

  }

  implicit class JavaAutoScalingTargetTrackingScalingPolicyConfigurationUpdateOps(
      val self: JavaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate
  ) extends AnyVal {

    def toScala: ScalaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate = {
      ScalaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate()
        .withDisableScaleIn(Option(self.disableScaleIn))
        .withScaleInCooldown(Option(self.scaleInCooldown))
        .withScaleOutCooldown(Option(self.scaleOutCooldown))
        .withTargetValue(Option(self.targetValue))
    }

  }

}

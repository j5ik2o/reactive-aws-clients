package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{
  AutoScalingTargetTrackingScalingPolicyConfigurationUpdate => JavaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate
}
import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  AutoScalingTargetTrackingScalingPolicyConfigurationUpdate => ScalaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate
}
object AutoScalingTargetTrackingScalingPolicyConfigurationUpdateOps {

  implicit class ScalaAutoScalingTargetTrackingScalingPolicyConfigurationUpdateOps(
      val self: ScalaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate
  ) extends AnyVal {

    def toJava: JavaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate = {
      val result = new JavaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate()
      self.disableScaleIn.foreach(v => result.setDisableScaleIn(v))
      self.scaleInCooldown.foreach(v => result.setScaleInCooldown(v))
      self.scaleOutCooldown.foreach(v => result.setScaleOutCooldown(v))
      self.targetValue.foreach(v => result.setTargetValue(v))
      result
    }

  }

  implicit class JavaAutoScalingTargetTrackingScalingPolicyConfigurationUpdateOps(
      val self: JavaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate
  ) extends AnyVal {

    def toScala: ScalaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate = {
      ScalaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate()
        .withDisableScaleIn(Option(self.getDisableScaleIn))
        .withScaleInCooldown(Option(self.getScaleInCooldown))
        .withScaleOutCooldown(Option(self.getScaleOutCooldown))
        .withTargetValue(Option(self.getTargetValue))
    }

  }

}

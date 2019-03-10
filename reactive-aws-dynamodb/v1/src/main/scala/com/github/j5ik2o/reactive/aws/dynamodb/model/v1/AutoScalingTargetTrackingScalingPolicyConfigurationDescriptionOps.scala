package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{
  AutoScalingTargetTrackingScalingPolicyConfigurationDescription => JavaAutoScalingTargetTrackingScalingPolicyConfigurationDescription
}
import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  AutoScalingTargetTrackingScalingPolicyConfigurationDescription => ScalaAutoScalingTargetTrackingScalingPolicyConfigurationDescription
}

object AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionOps {

  implicit class ScalaAutoScalingTargetTrackingScalingPolicyConfigurationDescriptionOps(
      val self: ScalaAutoScalingTargetTrackingScalingPolicyConfigurationDescription
  ) extends AnyVal {

    def toJava: JavaAutoScalingTargetTrackingScalingPolicyConfigurationDescription = {
      val result = new JavaAutoScalingTargetTrackingScalingPolicyConfigurationDescription()
      self.disableScaleIn.foreach(v => result.setDisableScaleIn(v))
      self.scaleInCooldown.foreach(v => result.setScaleInCooldown(v))
      self.scaleOutCooldown.foreach(v => result.setScaleOutCooldown(v))
      result
    }

  }

  implicit class JavaAutoScalingTargetTrackingScalingPolicyConfigurationDescriptionOps(
      val self: JavaAutoScalingTargetTrackingScalingPolicyConfigurationDescription
  ) extends AnyVal {

    def toScala: ScalaAutoScalingTargetTrackingScalingPolicyConfigurationDescription = {
      ScalaAutoScalingTargetTrackingScalingPolicyConfigurationDescription()
        .withDisableScaleIn(Option(self.getDisableScaleIn).map(_.booleanValue()))
        .withScaleInCooldown(Option(self.getScaleInCooldown))
        .withScaleOutCooldown(Option(self.getScaleOutCooldown))
    }

  }

}

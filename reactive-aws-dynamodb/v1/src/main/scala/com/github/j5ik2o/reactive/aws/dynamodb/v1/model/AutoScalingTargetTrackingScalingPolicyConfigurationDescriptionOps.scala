// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  AutoScalingTargetTrackingScalingPolicyConfigurationDescription => ScalaAutoScalingTargetTrackingScalingPolicyConfigurationDescription,
  _
}
import com.amazonaws.services.dynamodbv2.model.{
  AutoScalingTargetTrackingScalingPolicyConfigurationDescription => JavaAutoScalingTargetTrackingScalingPolicyConfigurationDescription
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionOps {

  implicit class ScalaAutoScalingTargetTrackingScalingPolicyConfigurationDescriptionOps(
      val self: ScalaAutoScalingTargetTrackingScalingPolicyConfigurationDescription
  ) extends AnyVal {

    def toJava: JavaAutoScalingTargetTrackingScalingPolicyConfigurationDescription = {
      val result = new JavaAutoScalingTargetTrackingScalingPolicyConfigurationDescription()
      self.disableScaleIn.map(_.booleanValue).foreach(v => result.withDisableScaleIn(v)) // Boolean
      self.scaleInCooldown.map(_.intValue).foreach(v => result.withScaleInCooldown(v))   // Int
      self.scaleOutCooldown.map(_.intValue).foreach(v => result.withScaleOutCooldown(v)) // Int
      self.targetValue.map(_.doubleValue).foreach(v => result.withTargetValue(v))        // Double

      result
    }

  }

  implicit class JavaAutoScalingTargetTrackingScalingPolicyConfigurationDescriptionOps(
      val self: JavaAutoScalingTargetTrackingScalingPolicyConfigurationDescription
  ) extends AnyVal {

    def toScala: ScalaAutoScalingTargetTrackingScalingPolicyConfigurationDescription = {
      ScalaAutoScalingTargetTrackingScalingPolicyConfigurationDescription()
        .withDisableScaleIn(Option(self.getDisableScaleIn).map(_.booleanValue)) // Boolean
        .withScaleInCooldown(Option(self.getScaleInCooldown).map(_.intValue)) // Int
        .withScaleOutCooldown(Option(self.getScaleOutCooldown).map(_.intValue)) // Int
        .withTargetValue(Option(self.getTargetValue).map(_.doubleValue)) // Double
    }

  }

}

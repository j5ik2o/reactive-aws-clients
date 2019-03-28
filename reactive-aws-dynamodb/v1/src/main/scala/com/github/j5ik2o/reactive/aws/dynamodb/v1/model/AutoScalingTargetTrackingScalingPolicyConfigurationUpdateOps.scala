// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  AutoScalingTargetTrackingScalingPolicyConfigurationUpdate => ScalaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate,
  _
}
import com.amazonaws.services.dynamodbv2.model.{
  AutoScalingTargetTrackingScalingPolicyConfigurationUpdate => JavaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AutoScalingTargetTrackingScalingPolicyConfigurationUpdateOps {

  implicit class ScalaAutoScalingTargetTrackingScalingPolicyConfigurationUpdateOps(
      val self: ScalaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate
  ) extends AnyVal {

    def toJava: JavaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate = {
      val result = new JavaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate()
      self.disableScaleIn.map(_.booleanValue).foreach(v => result.withDisableScaleIn(v)) // Boolean
      self.scaleInCooldown.map(_.intValue).foreach(v => result.withScaleInCooldown(v))   // Int
      self.scaleOutCooldown.map(_.intValue).foreach(v => result.withScaleOutCooldown(v)) // Int
      self.targetValue.map(_.doubleValue).foreach(v => result.withTargetValue(v))        // Double

      result
    }

  }

  implicit class JavaAutoScalingTargetTrackingScalingPolicyConfigurationUpdateOps(
      val self: JavaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate
  ) extends AnyVal {

    def toScala: ScalaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate = {
      ScalaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate()
        .withDisableScaleIn(Option(self.getDisableScaleIn).map(_.booleanValue)) // Boolean
        .withScaleInCooldown(Option(self.getScaleInCooldown).map(_.intValue)) // Int
        .withScaleOutCooldown(Option(self.getScaleOutCooldown).map(_.intValue)) // Int
        .withTargetValue(Option(self.getTargetValue).map(_.doubleValue)) // Double
    }

  }

}

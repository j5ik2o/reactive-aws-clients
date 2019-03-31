// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  AutoScalingTargetTrackingScalingPolicyConfigurationUpdate => ScalaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate,
  _
}
import software.amazon.awssdk.services.dynamodb.model.{
  AutoScalingTargetTrackingScalingPolicyConfigurationUpdate => JavaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AutoScalingTargetTrackingScalingPolicyConfigurationUpdateOps {

  implicit class ScalaAutoScalingTargetTrackingScalingPolicyConfigurationUpdateOps(
      val self: ScalaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate
  ) extends AnyVal {

    def toJava: JavaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate = {
      val result = JavaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate.builder()
      self.disableScaleIn.map(_.booleanValue).foreach(v => result.disableScaleIn(v)) // Boolean
      self.scaleInCooldown.map(_.intValue).foreach(v => result.scaleInCooldown(v))   // Int
      self.scaleOutCooldown.map(_.intValue).foreach(v => result.scaleOutCooldown(v)) // Int
      self.targetValue.map(_.doubleValue).foreach(v => result.targetValue(v))        // Double

      result.build()
    }

  }

  implicit class JavaAutoScalingTargetTrackingScalingPolicyConfigurationUpdateOps(
      val self: JavaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate
  ) extends AnyVal {

    def toScala: ScalaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate = {
      ScalaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate()
        .withDisableScaleIn(Option(self.disableScaleIn).map(_.booleanValue)) // Boolean
        .withScaleInCooldown(Option(self.scaleInCooldown).map(_.intValue)) // Int
        .withScaleOutCooldown(Option(self.scaleOutCooldown).map(_.intValue)) // Int
        .withTargetValue(Option(self.targetValue).map(_.doubleValue)) // Double
    }

  }

}

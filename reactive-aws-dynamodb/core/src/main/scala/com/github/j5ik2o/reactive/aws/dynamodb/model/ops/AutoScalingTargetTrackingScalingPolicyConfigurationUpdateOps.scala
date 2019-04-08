// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class AutoScalingTargetTrackingScalingPolicyConfigurationUpdateBuilderOps(
    val self: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate.Builder
) extends AnyVal {

  final def disableScaleInAsScala(
      value: Option[Boolean]
  ): AutoScalingTargetTrackingScalingPolicyConfigurationUpdate.Builder = {
    value.fold(self) { v =>
      self.disableScaleIn(v)
    }
  }

  final def scaleInCooldownAsScala(
      value: Option[Int]
  ): AutoScalingTargetTrackingScalingPolicyConfigurationUpdate.Builder = {
    value.fold(self) { v =>
      self.scaleInCooldown(v)
    }
  }

  final def scaleOutCooldownAsScala(
      value: Option[Int]
  ): AutoScalingTargetTrackingScalingPolicyConfigurationUpdate.Builder = {
    value.fold(self) { v =>
      self.scaleOutCooldown(v)
    }
  }

  final def targetValueAsScala(
      value: Option[Double]
  ): AutoScalingTargetTrackingScalingPolicyConfigurationUpdate.Builder = {
    value.fold(self) { v =>
      self.targetValue(v)
    }
  }

}

final class AutoScalingTargetTrackingScalingPolicyConfigurationUpdateOps(
    val self: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate
) extends AnyVal {

  final def disableScaleInAsScala: Option[Boolean] = Option(self.disableScaleIn)

  final def scaleInCooldownAsScala: Option[Int] = Option(self.scaleInCooldown)

  final def scaleOutCooldownAsScala: Option[Int] = Option(self.scaleOutCooldown)

  final def targetValueAsScala: Option[Double] = Option(self.targetValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAutoScalingTargetTrackingScalingPolicyConfigurationUpdateOps {

  implicit def toAutoScalingTargetTrackingScalingPolicyConfigurationUpdateBuilderOps(
      v: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate.Builder
  ): AutoScalingTargetTrackingScalingPolicyConfigurationUpdateBuilderOps =
    new AutoScalingTargetTrackingScalingPolicyConfigurationUpdateBuilderOps(v)

  implicit def toAutoScalingTargetTrackingScalingPolicyConfigurationUpdateOps(
      v: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate
  ): AutoScalingTargetTrackingScalingPolicyConfigurationUpdateOps =
    new AutoScalingTargetTrackingScalingPolicyConfigurationUpdateOps(v)

}

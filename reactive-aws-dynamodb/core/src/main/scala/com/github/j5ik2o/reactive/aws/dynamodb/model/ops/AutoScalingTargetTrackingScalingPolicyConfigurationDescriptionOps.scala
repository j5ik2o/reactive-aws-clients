// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionBuilderOps(
    val self: AutoScalingTargetTrackingScalingPolicyConfigurationDescription.Builder
) extends AnyVal {

  final def disableScaleInAsScala(
      value: Option[Boolean]
  ): AutoScalingTargetTrackingScalingPolicyConfigurationDescription.Builder = {
    value.fold(self) { v =>
      self.disableScaleIn(v)
    }
  }

  final def scaleInCooldownAsScala(
      value: Option[Int]
  ): AutoScalingTargetTrackingScalingPolicyConfigurationDescription.Builder = {
    value.fold(self) { v =>
      self.scaleInCooldown(v)
    }
  }

  final def scaleOutCooldownAsScala(
      value: Option[Int]
  ): AutoScalingTargetTrackingScalingPolicyConfigurationDescription.Builder = {
    value.fold(self) { v =>
      self.scaleOutCooldown(v)
    }
  }

  final def targetValueAsScala(
      value: Option[Double]
  ): AutoScalingTargetTrackingScalingPolicyConfigurationDescription.Builder = {
    value.fold(self) { v =>
      self.targetValue(v)
    }
  }

}

final class AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionOps(
    val self: AutoScalingTargetTrackingScalingPolicyConfigurationDescription
) extends AnyVal {

  final def disableScaleInAsScala: Option[Boolean] = Option(self.disableScaleIn)

  final def scaleInCooldownAsScala: Option[Int] = Option(self.scaleInCooldown)

  final def scaleOutCooldownAsScala: Option[Int] = Option(self.scaleOutCooldown)

  final def targetValueAsScala: Option[Double] = Option(self.targetValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAutoScalingTargetTrackingScalingPolicyConfigurationDescriptionOps {

  implicit def toAutoScalingTargetTrackingScalingPolicyConfigurationDescriptionBuilderOps(
      v: AutoScalingTargetTrackingScalingPolicyConfigurationDescription.Builder
  ): AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionBuilderOps =
    new AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionBuilderOps(v)

  implicit def toAutoScalingTargetTrackingScalingPolicyConfigurationDescriptionOps(
      v: AutoScalingTargetTrackingScalingPolicyConfigurationDescription
  ): AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionOps =
    new AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionOps(v)

}

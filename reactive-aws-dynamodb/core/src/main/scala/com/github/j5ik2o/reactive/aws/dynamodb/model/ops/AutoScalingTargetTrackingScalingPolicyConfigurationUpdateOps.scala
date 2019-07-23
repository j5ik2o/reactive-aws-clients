// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class AutoScalingTargetTrackingScalingPolicyConfigurationUpdateBuilderOps(
    val self: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def disableScaleInAsScala(
      value: Option[Boolean]
  ): AutoScalingTargetTrackingScalingPolicyConfigurationUpdate.Builder = {
    value.fold(self) { v =>
      self.disableScaleIn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scaleInCooldownAsScala(
      value: Option[Int]
  ): AutoScalingTargetTrackingScalingPolicyConfigurationUpdate.Builder = {
    value.fold(self) { v =>
      self.scaleInCooldown(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scaleOutCooldownAsScala(
      value: Option[Int]
  ): AutoScalingTargetTrackingScalingPolicyConfigurationUpdate.Builder = {
    value.fold(self) { v =>
      self.scaleOutCooldown(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def disableScaleInAsScala: Option[Boolean] = Option(self.disableScaleIn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scaleInCooldownAsScala: Option[Int] = Option(self.scaleInCooldown)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scaleOutCooldownAsScala: Option[Int] = Option(self.scaleOutCooldown)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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

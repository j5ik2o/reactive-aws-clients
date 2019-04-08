// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class AutoScalingPolicyDescriptionBuilderOps(val self: AutoScalingPolicyDescription.Builder) extends AnyVal {

  final def policyNameAsScala(value: Option[String]): AutoScalingPolicyDescription.Builder = {
    value.fold(self) { v =>
      self.policyName(v)
    }
  } // String

  final def targetTrackingScalingPolicyConfigurationAsScala(
      value: Option[AutoScalingTargetTrackingScalingPolicyConfigurationDescription]
  ): AutoScalingPolicyDescription.Builder = {
    value.fold(self) { v =>
      self.targetTrackingScalingPolicyConfiguration(v)
    }
  } // AutoScalingTargetTrackingScalingPolicyConfigurationDescription

}

final class AutoScalingPolicyDescriptionOps(val self: AutoScalingPolicyDescription) extends AnyVal {

  final def policyNameAsScala: Option[String] = Option(self.policyName) // String

  final def targetTrackingScalingPolicyConfigurationAsScala
    : Option[AutoScalingTargetTrackingScalingPolicyConfigurationDescription] =
    Option(self.targetTrackingScalingPolicyConfiguration) // AutoScalingTargetTrackingScalingPolicyConfigurationDescription

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAutoScalingPolicyDescriptionOps {

  implicit def toAutoScalingPolicyDescriptionBuilderOps(
      v: AutoScalingPolicyDescription.Builder
  ): AutoScalingPolicyDescriptionBuilderOps = new AutoScalingPolicyDescriptionBuilderOps(v)

  implicit def toAutoScalingPolicyDescriptionOps(v: AutoScalingPolicyDescription): AutoScalingPolicyDescriptionOps =
    new AutoScalingPolicyDescriptionOps(v)

}

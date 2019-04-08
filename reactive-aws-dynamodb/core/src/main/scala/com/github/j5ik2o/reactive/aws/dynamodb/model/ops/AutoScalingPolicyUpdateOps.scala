// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class AutoScalingPolicyUpdateBuilderOps(val self: AutoScalingPolicyUpdate.Builder) extends AnyVal {

  final def policyNameAsScala(value: Option[String]): AutoScalingPolicyUpdate.Builder = {
    value.fold(self) { v =>
      self.policyName(v)
    }
  }

  final def targetTrackingScalingPolicyConfigurationAsScala(
      value: Option[AutoScalingTargetTrackingScalingPolicyConfigurationUpdate]
  ): AutoScalingPolicyUpdate.Builder = {
    value.fold(self) { v =>
      self.targetTrackingScalingPolicyConfiguration(v)
    }
  }

}

final class AutoScalingPolicyUpdateOps(val self: AutoScalingPolicyUpdate) extends AnyVal {

  final def policyNameAsScala: Option[String] = Option(self.policyName)

  final def targetTrackingScalingPolicyConfigurationAsScala
    : Option[AutoScalingTargetTrackingScalingPolicyConfigurationUpdate] =
    Option(self.targetTrackingScalingPolicyConfiguration)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAutoScalingPolicyUpdateOps {

  implicit def toAutoScalingPolicyUpdateBuilderOps(
      v: AutoScalingPolicyUpdate.Builder
  ): AutoScalingPolicyUpdateBuilderOps = new AutoScalingPolicyUpdateBuilderOps(v)

  implicit def toAutoScalingPolicyUpdateOps(v: AutoScalingPolicyUpdate): AutoScalingPolicyUpdateOps =
    new AutoScalingPolicyUpdateOps(v)

}

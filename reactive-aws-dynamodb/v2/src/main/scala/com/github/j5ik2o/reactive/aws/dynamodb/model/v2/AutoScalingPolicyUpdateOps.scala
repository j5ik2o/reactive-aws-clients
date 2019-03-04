package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ AutoScalingPolicyUpdate => ScalaAutoScalingPolicyUpdate }
import software.amazon.awssdk.services.dynamodb.model.{ AutoScalingPolicyUpdate => JavaAutoScalingPolicyUpdate }

object AutoScalingPolicyUpdateOps {

  import AutoScalingTargetTrackingScalingPolicyConfigurationUpdateOps._

  implicit class ScalaAutoScalingPolicyUpdateOps(val self: ScalaAutoScalingPolicyUpdate) extends AnyVal {

    def toJava: JavaAutoScalingPolicyUpdate = {
      val result = JavaAutoScalingPolicyUpdate.builder()
      self.policyName.foreach(result.policyName)
      self.targetTrackingScalingPolicyConfiguration
        .map(_.toJava).foreach(result.targetTrackingScalingPolicyConfiguration)
      result.build()
    }

  }

  implicit class JavaAutoScalingPolicyUpdateOps(val self: JavaAutoScalingPolicyUpdate) extends AnyVal {

    def toScala: ScalaAutoScalingPolicyUpdate = {
      ScalaAutoScalingPolicyUpdate()
        .withPolicyName(Option(self.policyName))
        .withTargetTrackingScalingPolicyConfiguration(
          Option(self.targetTrackingScalingPolicyConfiguration).map(_.toScala)
        )
    }

  }
}

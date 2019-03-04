package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ AutoScalingPolicyUpdate => JavaAutoScalingPolicyUpdate }
import com.github.j5ik2o.reactive.dynamodb.model.{ AutoScalingPolicyUpdate => ScalaAutoScalingPolicyUpdate }

object AutoScalingPolicyUpdateOps {

  import AutoScalingTargetTrackingScalingPolicyConfigurationUpdateOps._

  implicit class ScalaAutoScalingPolicyUpdateOps(val self: ScalaAutoScalingPolicyUpdate) extends AnyVal {

    def toJava: JavaAutoScalingPolicyUpdate = {
      val result = new JavaAutoScalingPolicyUpdate()
      self.policyName.foreach(result.setPolicyName)
      self.targetTrackingScalingPolicyConfiguration
        .map(_.toJava).foreach(result.setTargetTrackingScalingPolicyConfiguration)
      result
    }

  }

  implicit class JavaAutoScalingPolicyUpdateOps(val self: JavaAutoScalingPolicyUpdate) extends AnyVal {

    def toScala: ScalaAutoScalingPolicyUpdate = {
      ScalaAutoScalingPolicyUpdate()
        .withPolicyName(Option(self.getPolicyName))
        .withTargetTrackingScalingPolicyConfiguration(
          Option(self.getTargetTrackingScalingPolicyConfiguration).map(_.toScala)
        )
    }

  }
}

package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ AutoScalingPolicyDescription => JavaAutoScalingPolicyDescription }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  AutoScalingPolicyDescription => ScalaAutoScalingPolicyDescription
}

object AutoScalingPolicyDescriptionOps {

  import AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionOps._

  implicit class ScalaAutoScalingPolicyDescriptionOps(val self: ScalaAutoScalingPolicyDescription) extends AnyVal {

    def toJava: JavaAutoScalingPolicyDescription = {
      val result = new JavaAutoScalingPolicyDescription()
      self.policyName.foreach(result.setPolicyName)
      self.targetTrackingScalingPolicyConfiguration
        .map(_.toJava).foreach(result.setTargetTrackingScalingPolicyConfiguration)
      result
    }

  }

  implicit class JavaAutoScalingPolicyDescriptionOps(val self: JavaAutoScalingPolicyDescription) extends AnyVal {

    def toScala: ScalaAutoScalingPolicyDescription = {
      ScalaAutoScalingPolicyDescription()
        .withPolicyName(Option(self.getPolicyName))
        .withTargetTrackingScalingPolicyConfiguration(
          Option(self.getTargetTrackingScalingPolicyConfiguration).map(_.toScala)
        )
    }

  }

}

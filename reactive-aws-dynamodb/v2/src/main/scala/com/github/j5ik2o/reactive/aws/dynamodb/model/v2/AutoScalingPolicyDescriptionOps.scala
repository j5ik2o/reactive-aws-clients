package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  AutoScalingPolicyDescription => ScalaAutoScalingPolicyDescription
}
import software.amazon.awssdk.services.dynamodb.model.{
  AutoScalingPolicyDescription => JavaAutoScalingPolicyDescription
}

object AutoScalingPolicyDescriptionOps {

  import AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionOps._

  implicit class ScalaAutoScalingPolicyDescriptionOps(val self: ScalaAutoScalingPolicyDescription) extends AnyVal {

    def toJava: JavaAutoScalingPolicyDescription = {
      val result = JavaAutoScalingPolicyDescription.builder()
      self.policyName.foreach(result.policyName)
      self.targetTrackingScalingPolicyConfiguration
        .map(_.toJava).foreach(result.targetTrackingScalingPolicyConfiguration)
      result.build()
    }

  }

  implicit class JavaAutoScalingPolicyDescriptionOps(val self: JavaAutoScalingPolicyDescription) extends AnyVal {

    def toScala: ScalaAutoScalingPolicyDescription = {
      ScalaAutoScalingPolicyDescription()
        .withPolicyName(Option(self.policyName))
        .withTargetTrackingScalingPolicyConfiguration(
          Option(self.targetTrackingScalingPolicyConfiguration).map(_.toScala)
        )
    }

  }

}

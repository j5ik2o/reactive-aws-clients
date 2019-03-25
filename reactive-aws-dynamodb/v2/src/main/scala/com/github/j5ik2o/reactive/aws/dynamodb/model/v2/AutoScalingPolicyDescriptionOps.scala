package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  AutoScalingPolicyDescription => ScalaAutoScalingPolicyDescription,
  _
}
import software.amazon.awssdk.services.dynamodb.model.{
  AutoScalingPolicyDescription => JavaAutoScalingPolicyDescription
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AutoScalingPolicyDescriptionOps {

  implicit class ScalaAutoScalingPolicyDescriptionOps(val self: ScalaAutoScalingPolicyDescription) extends AnyVal {

    def toJava: JavaAutoScalingPolicyDescription = {
      val result = JavaAutoScalingPolicyDescription.builder()
      self.policyName.filter(_.nonEmpty).foreach(v => result.policyName(v)) // String, case String
      self.targetTrackingScalingPolicyConfiguration.foreach { v =>
        import AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionOps._;
        result.targetTrackingScalingPolicyConfiguration(v.toJava)
      } // AutoScalingTargetTrackingScalingPolicyConfigurationDescription

      result.build()
    }

  }

  implicit class JavaAutoScalingPolicyDescriptionOps(val self: JavaAutoScalingPolicyDescription) extends AnyVal {

    def toScala: ScalaAutoScalingPolicyDescription = {
      ScalaAutoScalingPolicyDescription()
        .withPolicyName(Option(self.policyName)) // String
        .withTargetTrackingScalingPolicyConfiguration(Option(self.targetTrackingScalingPolicyConfiguration).map { v =>
          import AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionOps._; v.toScala
        }) // AutoScalingTargetTrackingScalingPolicyConfigurationDescription
    }

  }

}

// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  AutoScalingPolicyDescription => ScalaAutoScalingPolicyDescription,
  _
}
import com.amazonaws.services.dynamodbv2.model.{ AutoScalingPolicyDescription => JavaAutoScalingPolicyDescription }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AutoScalingPolicyDescriptionOps {

  implicit class ScalaAutoScalingPolicyDescriptionOps(val self: ScalaAutoScalingPolicyDescription) extends AnyVal {

    def toJava: JavaAutoScalingPolicyDescription = {
      val result = new JavaAutoScalingPolicyDescription()
      self.policyName.filter(_.nonEmpty).foreach(v => result.withPolicyName(v)) // String
      self.targetTrackingScalingPolicyConfiguration.foreach { v =>
        import AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionOps._;
        result.withTargetTrackingScalingPolicyConfiguration(v.toJava)
      } // AutoScalingTargetTrackingScalingPolicyConfigurationDescription

      result
    }

  }

  implicit class JavaAutoScalingPolicyDescriptionOps(val self: JavaAutoScalingPolicyDescription) extends AnyVal {

    def toScala: ScalaAutoScalingPolicyDescription = {
      ScalaAutoScalingPolicyDescription()
        .withPolicyName(Option(self.getPolicyName)) // String
        .withTargetTrackingScalingPolicyConfiguration(Option(self.getTargetTrackingScalingPolicyConfiguration).map {
          v =>
            import AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionOps._; v.toScala
        }) // AutoScalingTargetTrackingScalingPolicyConfigurationDescription
    }

  }

}

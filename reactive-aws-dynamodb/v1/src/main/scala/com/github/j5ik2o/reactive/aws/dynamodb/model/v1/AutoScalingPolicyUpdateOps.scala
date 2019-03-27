// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ AutoScalingPolicyUpdate => ScalaAutoScalingPolicyUpdate, _ }
import com.amazonaws.services.dynamodbv2.model.{ AutoScalingPolicyUpdate => JavaAutoScalingPolicyUpdate }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AutoScalingPolicyUpdateOps {

  implicit class ScalaAutoScalingPolicyUpdateOps(val self: ScalaAutoScalingPolicyUpdate) extends AnyVal {

    def toJava: JavaAutoScalingPolicyUpdate = {
      val result = new JavaAutoScalingPolicyUpdate()
      self.policyName.filter(_.nonEmpty).foreach(v => result.withPolicyName(v)) // String
      self.targetTrackingScalingPolicyConfiguration.foreach { v =>
        import AutoScalingTargetTrackingScalingPolicyConfigurationUpdateOps._;
        result.withTargetTrackingScalingPolicyConfiguration(v.toJava)
      } // AutoScalingTargetTrackingScalingPolicyConfigurationUpdate

      result
    }

  }

  implicit class JavaAutoScalingPolicyUpdateOps(val self: JavaAutoScalingPolicyUpdate) extends AnyVal {

    def toScala: ScalaAutoScalingPolicyUpdate = {
      ScalaAutoScalingPolicyUpdate()
        .withPolicyName(Option(self.getPolicyName)) // String
        .withTargetTrackingScalingPolicyConfiguration(Option(self.getTargetTrackingScalingPolicyConfiguration).map {
          v =>
            import AutoScalingTargetTrackingScalingPolicyConfigurationUpdateOps._; v.toScala
        }) // AutoScalingTargetTrackingScalingPolicyConfigurationUpdate
    }

  }

}

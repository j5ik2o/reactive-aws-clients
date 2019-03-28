// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ AutoScalingPolicyUpdate => ScalaAutoScalingPolicyUpdate, _ }
import software.amazon.awssdk.services.dynamodb.model.{ AutoScalingPolicyUpdate => JavaAutoScalingPolicyUpdate }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AutoScalingPolicyUpdateOps {

  implicit class ScalaAutoScalingPolicyUpdateOps(val self: ScalaAutoScalingPolicyUpdate) extends AnyVal {

    def toJava: JavaAutoScalingPolicyUpdate = {
      val result = JavaAutoScalingPolicyUpdate.builder()
      self.policyName.filter(_.nonEmpty).foreach(v => result.policyName(v)) // String
      self.targetTrackingScalingPolicyConfiguration.foreach { v =>
        import AutoScalingTargetTrackingScalingPolicyConfigurationUpdateOps._;
        result.targetTrackingScalingPolicyConfiguration(v.toJava)
      } // AutoScalingTargetTrackingScalingPolicyConfigurationUpdate

      result.build()
    }

  }

  implicit class JavaAutoScalingPolicyUpdateOps(val self: JavaAutoScalingPolicyUpdate) extends AnyVal {

    def toScala: ScalaAutoScalingPolicyUpdate = {
      ScalaAutoScalingPolicyUpdate()
        .withPolicyName(Option(self.policyName)) // String
        .withTargetTrackingScalingPolicyConfiguration(Option(self.targetTrackingScalingPolicyConfiguration).map { v =>
          import AutoScalingTargetTrackingScalingPolicyConfigurationUpdateOps._; v.toScala
        }) // AutoScalingTargetTrackingScalingPolicyConfigurationUpdate
    }

  }

}

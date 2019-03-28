// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ AutoScalingSettingsUpdate => ScalaAutoScalingSettingsUpdate, _ }
import software.amazon.awssdk.services.dynamodb.model.{ AutoScalingSettingsUpdate => JavaAutoScalingSettingsUpdate }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AutoScalingSettingsUpdateOps {

  implicit class ScalaAutoScalingSettingsUpdateOps(val self: ScalaAutoScalingSettingsUpdate) extends AnyVal {

    def toJava: JavaAutoScalingSettingsUpdate = {
      val result = JavaAutoScalingSettingsUpdate.builder()
      self.minimumUnits.map(_.longValue).foreach(v => result.minimumUnits(v))                  // Long
      self.maximumUnits.map(_.longValue).foreach(v => result.maximumUnits(v))                  // Long
      self.autoScalingDisabled.map(_.booleanValue).foreach(v => result.autoScalingDisabled(v)) // Boolean
      self.autoScalingRoleArn.filter(_.nonEmpty).foreach(v => result.autoScalingRoleArn(v))    // String
      self.scalingPolicyUpdate.foreach { v =>
        import AutoScalingPolicyUpdateOps._; result.scalingPolicyUpdate(v.toJava)
      } // AutoScalingPolicyUpdate

      result.build()
    }

  }

  implicit class JavaAutoScalingSettingsUpdateOps(val self: JavaAutoScalingSettingsUpdate) extends AnyVal {

    def toScala: ScalaAutoScalingSettingsUpdate = {
      ScalaAutoScalingSettingsUpdate()
        .withMinimumUnits(Option(self.minimumUnits).map(_.longValue)) // Long
        .withMaximumUnits(Option(self.maximumUnits).map(_.longValue)) // Long
        .withAutoScalingDisabled(Option(self.autoScalingDisabled).map(_.booleanValue)) // Boolean
        .withAutoScalingRoleArn(Option(self.autoScalingRoleArn)) // String
        .withScalingPolicyUpdate(Option(self.scalingPolicyUpdate).map { v =>
          import AutoScalingPolicyUpdateOps._; v.toScala
        }) // AutoScalingPolicyUpdate
    }

  }

}

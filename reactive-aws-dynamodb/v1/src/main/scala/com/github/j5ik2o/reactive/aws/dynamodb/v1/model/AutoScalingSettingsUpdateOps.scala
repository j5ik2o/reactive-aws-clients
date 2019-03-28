// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ AutoScalingSettingsUpdate => ScalaAutoScalingSettingsUpdate, _ }
import com.amazonaws.services.dynamodbv2.model.{ AutoScalingSettingsUpdate => JavaAutoScalingSettingsUpdate }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AutoScalingSettingsUpdateOps {

  implicit class ScalaAutoScalingSettingsUpdateOps(val self: ScalaAutoScalingSettingsUpdate) extends AnyVal {

    def toJava: JavaAutoScalingSettingsUpdate = {
      val result = new JavaAutoScalingSettingsUpdate()
      self.minimumUnits.map(_.longValue).foreach(v => result.withMinimumUnits(v))                  // Long
      self.maximumUnits.map(_.longValue).foreach(v => result.withMaximumUnits(v))                  // Long
      self.autoScalingDisabled.map(_.booleanValue).foreach(v => result.withAutoScalingDisabled(v)) // Boolean
      self.autoScalingRoleArn.filter(_.nonEmpty).foreach(v => result.withAutoScalingRoleArn(v))    // String
      self.scalingPolicyUpdate.foreach { v =>
        import AutoScalingPolicyUpdateOps._; result.withScalingPolicyUpdate(v.toJava)
      } // AutoScalingPolicyUpdate

      result
    }

  }

  implicit class JavaAutoScalingSettingsUpdateOps(val self: JavaAutoScalingSettingsUpdate) extends AnyVal {

    def toScala: ScalaAutoScalingSettingsUpdate = {
      ScalaAutoScalingSettingsUpdate()
        .withMinimumUnits(Option(self.getMinimumUnits).map(_.longValue)) // Long
        .withMaximumUnits(Option(self.getMaximumUnits).map(_.longValue)) // Long
        .withAutoScalingDisabled(Option(self.getAutoScalingDisabled).map(_.booleanValue)) // Boolean
        .withAutoScalingRoleArn(Option(self.getAutoScalingRoleArn)) // String
        .withScalingPolicyUpdate(Option(self.getScalingPolicyUpdate).map { v =>
          import AutoScalingPolicyUpdateOps._; v.toScala
        }) // AutoScalingPolicyUpdate
    }

  }

}

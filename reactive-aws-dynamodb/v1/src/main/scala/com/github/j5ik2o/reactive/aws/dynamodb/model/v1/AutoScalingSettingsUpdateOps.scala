package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ AutoScalingSettingsUpdate => JavaAutoScalingSettingsUpdate }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ AutoScalingSettingsUpdate => ScalaAutoScalingSettingsUpdate }

object AutoScalingSettingsUpdateOps {

  import AutoScalingPolicyUpdateOps._

  implicit class ScalaAutoScalingSettingsUpdateOps(val self: ScalaAutoScalingSettingsUpdate) extends AnyVal {

    def toJava: JavaAutoScalingSettingsUpdate = {
      val result = new JavaAutoScalingSettingsUpdate()
      self.minimumUnits.foreach(v => result.setMinimumUnits(v))
      self.maximumUnits.foreach(v => result.setMaximumUnits(v))
      self.autoScalingDisabled.foreach(v => result.setAutoScalingDisabled(v))
      self.autoScalingRoleArn.foreach(result.setAutoScalingRoleArn)
      self.scalingPolicyUpdate.map(_.toJava).foreach(result.setScalingPolicyUpdate)
      result
    }

  }

  implicit class JavaAutoScalingSettingsUpdateOps(val self: JavaAutoScalingSettingsUpdate) extends AnyVal {

    def toScala: ScalaAutoScalingSettingsUpdate = {
      ScalaAutoScalingSettingsUpdate()
        .withMinimumUnits(Option(self.getMinimumUnits))
        .withMaximumUnits(Option(self.getMaximumUnits))
        .withAutoScalingDisabled(Option(self.getAutoScalingDisabled))
        .withAutoScalingRoleArn(Option(self.getAutoScalingRoleArn))
        .withScalingPolicyUpdate(Option(self.getScalingPolicyUpdate).map(_.toScala))
    }

  }

}

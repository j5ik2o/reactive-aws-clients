package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ AutoScalingSettingsUpdate => ScalaAutoScalingSettingsUpdate }
import software.amazon.awssdk.services.dynamodb.model.{ AutoScalingSettingsUpdate => JavaAutoScalingSettingsUpdate }

object AutoScalingSettingsUpdateOps {

  import AutoScalingPolicyUpdateOps._

  implicit class ScalaAutoScalingSettingsUpdateOps(val self: ScalaAutoScalingSettingsUpdate) extends AnyVal {

    def toJava: JavaAutoScalingSettingsUpdate = {
      val result = JavaAutoScalingSettingsUpdate.builder()
      self.minimumUnits.foreach(v => result.minimumUnits(v))
      self.maximumUnits.foreach(v => result.maximumUnits(v))
      self.autoScalingDisabled.foreach(v => result.autoScalingDisabled(v))
      self.autoScalingRoleArn.foreach(result.autoScalingRoleArn)
      self.scalingPolicyUpdate.map(_.toJava).foreach(result.scalingPolicyUpdate)
      result.build()
    }

  }

  implicit class JavaAutoScalingSettingsUpdateOps(val self: JavaAutoScalingSettingsUpdate) extends AnyVal {

    def toScala: ScalaAutoScalingSettingsUpdate = {
      ScalaAutoScalingSettingsUpdate()
        .withMinimumUnits(Option(self.minimumUnits))
        .withMaximumUnits(Option(self.maximumUnits))
        .withAutoScalingDisabled(Option(self.autoScalingDisabled))
        .withAutoScalingRoleArn(Option(self.autoScalingRoleArn))
        .withScalingPolicyUpdate(Option(self.scalingPolicyUpdate).map(_.toScala))
    }

  }

}

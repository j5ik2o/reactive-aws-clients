package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{
  AutoScalingSettingsDescription => ScalaAutoScalingSettingsDescription
}
import software.amazon.awssdk.services.dynamodb.model.{
  AutoScalingSettingsDescription => JavaAutoScalingSettingsDescription
}

import scala.collection.JavaConverters._

object AutoScalingSettingsDescriptionOps {

  import AutoScalingPolicyDescriptionOps._

  implicit class ScalaAutoScalingSettingsDescriptionOps(val self: ScalaAutoScalingSettingsDescription) extends AnyVal {

    def toJava: JavaAutoScalingSettingsDescription = {
      val result = JavaAutoScalingSettingsDescription.builder()
      self.minimumUnits.foreach(v => result.minimumUnits(v))
      self.maximumUnits.foreach(v => result.maximumUnits(v))
      self.autoScalingDisabled.foreach(v => result.autoScalingDisabled(v))
      self.autoScalingRoleArn.foreach(result.autoScalingRoleArn)
      self.scalingPolicies.map(_.map(_.toJava).asJava).foreach(result.scalingPolicies)
      result.build()
    }

  }

  implicit class JavaAutoScalingSettingsDescriptionOps(val self: JavaAutoScalingSettingsDescription) extends AnyVal {

    def toScala: ScalaAutoScalingSettingsDescription = {
      ScalaAutoScalingSettingsDescription()
        .withMinimumUnits(Option(self.minimumUnits))
        .withMaximumUnits(Option(self.maximumUnits))
        .withAutoScalingDisabled(Option(self.autoScalingDisabled))
        .withAutoScalingRoleArn(Option(self.autoScalingRoleArn))
        .withScalingPolicies(Option(self.scalingPolicies).map(_.asScala.map(_.toScala)))
    }

  }

}

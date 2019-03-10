package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ AutoScalingSettingsDescription => JavaAutoScalingSettingsDescription }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  AutoScalingSettingsDescription => ScalaAutoScalingSettingsDescription
}

import scala.collection.JavaConverters._

object AutoScalingSettingsDescriptionOps {

  import AutoScalingPolicyDescriptionOps._

  implicit class ScalaAutoScalingSettingsDescriptionOps(val self: ScalaAutoScalingSettingsDescription) extends AnyVal {

    def toJava: JavaAutoScalingSettingsDescription = {
      val result = new JavaAutoScalingSettingsDescription()
      self.minimumUnits.foreach(v => result.setMinimumUnits(v))
      self.maximumUnits.foreach(v => result.setMaximumUnits(v))
      self.autoScalingDisabled.foreach(v => result.setAutoScalingDisabled(v))
      self.autoScalingRoleArn.foreach(result.setAutoScalingRoleArn)
      self.scalingPolicies.map(_.map(_.toJava).asJava).foreach(result.setScalingPolicies)
      result
    }

  }

  implicit class JavaAutoScalingSettingsDescriptionOps(val self: JavaAutoScalingSettingsDescription) extends AnyVal {

    def toScala: ScalaAutoScalingSettingsDescription = {
      ScalaAutoScalingSettingsDescription()
        .withMinimumUnits(Option(self.getMinimumUnits))
        .withMaximumUnits(Option(self.getMaximumUnits))
        .withAutoScalingDisabled(Option(self.getAutoScalingDisabled).map(_.booleanValue()))
        .withAutoScalingRoleArn(Option(self.getAutoScalingRoleArn))
        .withScalingPolicies(Option(self.getScalingPolicies).map(_.asScala.map(_.toScala)))
    }

  }

}

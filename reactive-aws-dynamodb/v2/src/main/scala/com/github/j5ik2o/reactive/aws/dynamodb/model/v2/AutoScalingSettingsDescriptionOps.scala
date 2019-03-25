package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  AutoScalingSettingsDescription => ScalaAutoScalingSettingsDescription,
  _
}
import software.amazon.awssdk.services.dynamodb.model.{
  AutoScalingSettingsDescription => JavaAutoScalingSettingsDescription
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AutoScalingSettingsDescriptionOps {

  implicit class ScalaAutoScalingSettingsDescriptionOps(val self: ScalaAutoScalingSettingsDescription) extends AnyVal {

    def toJava: JavaAutoScalingSettingsDescription = {
      val result = JavaAutoScalingSettingsDescription.builder()
      self.minimumUnits.map(_.longValue).foreach(v => result.minimumUnits(v))                  // Long
      self.maximumUnits.map(_.longValue).foreach(v => result.maximumUnits(v))                  // Long
      self.autoScalingDisabled.map(_.booleanValue).foreach(v => result.autoScalingDisabled(v)) // Boolean
      self.autoScalingRoleArn.filter(_.nonEmpty).foreach(v => result.autoScalingRoleArn(v))    // String
      self.scalingPolicies.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AutoScalingPolicyDescriptionOps._;
        result.scalingPolicies(v.map(_.toJava).asJava)
      } // Seq[AutoScalingPolicyDescription]

      result.build()
    }

  }

  implicit class JavaAutoScalingSettingsDescriptionOps(val self: JavaAutoScalingSettingsDescription) extends AnyVal {

    def toScala: ScalaAutoScalingSettingsDescription = {
      ScalaAutoScalingSettingsDescription()
        .withMinimumUnits(Option(self.minimumUnits).map(_.longValue)) // Long
        .withMaximumUnits(Option(self.maximumUnits).map(_.longValue)) // Long
        .withAutoScalingDisabled(Option(self.autoScalingDisabled).map(_.booleanValue)) // Boolean
        .withAutoScalingRoleArn(Option(self.autoScalingRoleArn)) // String
        .withScalingPolicies(Option(self.scalingPolicies).map { v =>
          import scala.collection.JavaConverters._, AutoScalingPolicyDescriptionOps._; v.asScala.map(_.toScala)
        }) // Seq[AutoScalingPolicyDescription]
    }

  }

}

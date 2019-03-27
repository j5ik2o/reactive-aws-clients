// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  AutoScalingSettingsDescription => ScalaAutoScalingSettingsDescription,
  _
}
import com.amazonaws.services.dynamodbv2.model.{ AutoScalingSettingsDescription => JavaAutoScalingSettingsDescription }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AutoScalingSettingsDescriptionOps {

  implicit class ScalaAutoScalingSettingsDescriptionOps(val self: ScalaAutoScalingSettingsDescription) extends AnyVal {

    def toJava: JavaAutoScalingSettingsDescription = {
      val result = new JavaAutoScalingSettingsDescription()
      self.minimumUnits.map(_.longValue).foreach(v => result.withMinimumUnits(v))                  // Long
      self.maximumUnits.map(_.longValue).foreach(v => result.withMaximumUnits(v))                  // Long
      self.autoScalingDisabled.map(_.booleanValue).foreach(v => result.withAutoScalingDisabled(v)) // Boolean
      self.autoScalingRoleArn.filter(_.nonEmpty).foreach(v => result.withAutoScalingRoleArn(v))    // String
      self.scalingPolicies.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AutoScalingPolicyDescriptionOps._;
        result.withScalingPolicies(v.map(_.toJava).asJava)
      } // Seq[AutoScalingPolicyDescription]

      result
    }

  }

  implicit class JavaAutoScalingSettingsDescriptionOps(val self: JavaAutoScalingSettingsDescription) extends AnyVal {

    def toScala: ScalaAutoScalingSettingsDescription = {
      ScalaAutoScalingSettingsDescription()
        .withMinimumUnits(Option(self.getMinimumUnits).map(_.longValue)) // Long
        .withMaximumUnits(Option(self.getMaximumUnits).map(_.longValue)) // Long
        .withAutoScalingDisabled(Option(self.getAutoScalingDisabled).map(_.booleanValue)) // Boolean
        .withAutoScalingRoleArn(Option(self.getAutoScalingRoleArn)) // String
        .withScalingPolicies(Option(self.getScalingPolicies).map { v =>
          import scala.collection.JavaConverters._, AutoScalingPolicyDescriptionOps._; v.asScala.map(_.toScala)
        }) // Seq[AutoScalingPolicyDescription]
    }

  }

}

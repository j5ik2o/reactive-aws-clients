// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class AutoScalingSettingsDescriptionBuilderOps(val self: AutoScalingSettingsDescription.Builder) extends AnyVal {

  final def minimumUnitsAsScala(value: Option[Long]): AutoScalingSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.minimumUnits(v)
    }
  }

  final def maximumUnitsAsScala(value: Option[Long]): AutoScalingSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.maximumUnits(v)
    }
  }

  final def autoScalingDisabledAsScala(value: Option[Boolean]): AutoScalingSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.autoScalingDisabled(v)
    }
  }

  final def autoScalingRoleArnAsScala(value: Option[String]): AutoScalingSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.autoScalingRoleArn(v)
    }
  }

  final def scalingPoliciesAsScala(
      value: Option[Seq[AutoScalingPolicyDescription]]
  ): AutoScalingSettingsDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.scalingPolicies(v.asJava)
    }
  }

}

final class AutoScalingSettingsDescriptionOps(val self: AutoScalingSettingsDescription) extends AnyVal {

  final def minimumUnitsAsScala: Option[Long] = Option(self.minimumUnits)

  final def maximumUnitsAsScala: Option[Long] = Option(self.maximumUnits)

  final def autoScalingDisabledAsScala: Option[Boolean] = Option(self.autoScalingDisabled)

  final def autoScalingRoleArnAsScala: Option[String] = Option(self.autoScalingRoleArn)

  final def scalingPoliciesAsScala: Option[Seq[AutoScalingPolicyDescription]] = Option(self.scalingPolicies).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAutoScalingSettingsDescriptionOps {

  implicit def toAutoScalingSettingsDescriptionBuilderOps(
      v: AutoScalingSettingsDescription.Builder
  ): AutoScalingSettingsDescriptionBuilderOps = new AutoScalingSettingsDescriptionBuilderOps(v)

  implicit def toAutoScalingSettingsDescriptionOps(
      v: AutoScalingSettingsDescription
  ): AutoScalingSettingsDescriptionOps = new AutoScalingSettingsDescriptionOps(v)

}

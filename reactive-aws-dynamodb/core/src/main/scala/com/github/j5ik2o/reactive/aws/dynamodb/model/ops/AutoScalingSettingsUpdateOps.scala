// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class AutoScalingSettingsUpdateBuilderOps(val self: AutoScalingSettingsUpdate.Builder) extends AnyVal {

  final def withMinimumUnitsAsScala(value: Option[Long]): AutoScalingSettingsUpdate.Builder = {
    value.fold(self) { v =>
      self.minimumUnits(v)
    }
  } // Long

  final def withMaximumUnitsAsScala(value: Option[Long]): AutoScalingSettingsUpdate.Builder = {
    value.fold(self) { v =>
      self.maximumUnits(v)
    }
  } // Long

  final def withAutoScalingDisabledAsScala(value: Option[Boolean]): AutoScalingSettingsUpdate.Builder = {
    value.fold(self) { v =>
      self.autoScalingDisabled(v)
    }
  } // Boolean

  final def withAutoScalingRoleArnAsScala(value: Option[String]): AutoScalingSettingsUpdate.Builder = {
    value.fold(self) { v =>
      self.autoScalingRoleArn(v)
    }
  } // String

  final def withScalingPolicyUpdateAsScala(
      value: Option[AutoScalingPolicyUpdate]
  ): AutoScalingSettingsUpdate.Builder = {
    value.fold(self) { v =>
      self.scalingPolicyUpdate(v)
    }
  } // AutoScalingPolicyUpdate

}

final class AutoScalingSettingsUpdateOps(val self: AutoScalingSettingsUpdate) extends AnyVal {

  final def minimumUnitsAsScala: Option[Long] = Option(self.minimumUnits) // Long

  final def maximumUnitsAsScala: Option[Long] = Option(self.maximumUnits) // Long

  final def autoScalingDisabledAsScala: Option[Boolean] = Option(self.autoScalingDisabled) // Boolean

  final def autoScalingRoleArnAsScala: Option[String] = Option(self.autoScalingRoleArn) // String

  final def scalingPolicyUpdateAsScala: Option[AutoScalingPolicyUpdate] =
    Option(self.scalingPolicyUpdate) // AutoScalingPolicyUpdate

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAutoScalingSettingsUpdateOps {

  implicit def toAutoScalingSettingsUpdateBuilderOps(
      v: AutoScalingSettingsUpdate.Builder
  ): AutoScalingSettingsUpdateBuilderOps = new AutoScalingSettingsUpdateBuilderOps(v)

  implicit def toAutoScalingSettingsUpdateOps(v: AutoScalingSettingsUpdate): AutoScalingSettingsUpdateOps =
    new AutoScalingSettingsUpdateOps(v)

}
